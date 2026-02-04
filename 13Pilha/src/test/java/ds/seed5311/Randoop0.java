package ds.seed5311;

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
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
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
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        pilha0.topo = '4';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        java.lang.Class<?> wildcardClass33 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray14 = null;
        pilha6.item = objArray14;
        java.lang.Class<?> wildcardClass16 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        int int20 = pilha18.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha6.empilha((java.lang.Object) pilha18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pilha9.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Object obj16 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        boolean boolean3 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        java.lang.Class<?> wildcardClass33 = objArray30.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Class<?> wildcardClass20 = pilha7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object[] objArray11 = pilha5.item;
        pilha0.item = objArray11;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 0.0d);
        int int17 = pilha13.topo;
        java.lang.Object obj18 = pilha13.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = (-1);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        int int19 = pilha13.topo;
        pilha13.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        pilha22.empilha((java.lang.Object) 0L);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray38 = null;
        pilha30.item = objArray38;
        java.lang.Object[] objArray40 = new java.lang.Object[] { pilha22, pilha30 };
        pilha13.item = objArray40;
        java.lang.Class<?> wildcardClass42 = pilha13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        java.lang.Class<?> wildcardClass24 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.topo = 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        pilha0.empilha((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pilha4.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = (short) 0;
        java.lang.Object[] objArray4 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        java.lang.Class<?> wildcardClass77 = pilha18.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        boolean boolean24 = pilha8.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha25.item = objArray39;
        pilha8.item = objArray39;
        pilha0.item = objArray39;
        boolean boolean43 = pilha0.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = (short) 10;
        java.lang.Object obj47 = pilha44.desempilha();
        boolean boolean48 = pilha44.vazia();
        int int49 = pilha44.topo;
        pilha0.empilha((java.lang.Object) int49);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.topo = '4';
        pilha3.topo = 10;
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object obj9 = pilha3.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 10;
        java.lang.Object[] objArray15 = pilha10.item;
        int int16 = pilha10.tamanho();
        java.lang.Object[] objArray17 = pilha10.item;
        pilha3.empilha((java.lang.Object) objArray17);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        java.lang.Object[] objArray23 = pilha19.item;
        pilha3.item = objArray23;
        pilha0.item = objArray23;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.topo = '4';
        pilha9.topo = 10;
        boolean boolean14 = pilha9.vazia();
        java.lang.Object[] objArray15 = pilha9.item;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object obj22 = pilha16.desempilha();
        int int23 = pilha16.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        java.lang.Object[] objArray29 = pilha24.item;
        pilha16.item = objArray29;
        pilha9.item = objArray29;
        pilha0.item = objArray29;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Class<?> wildcardClass39 = objArray36.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray27 = null;
        pilha19.item = objArray27;
        pilha19.topo = 100;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha19.item = objArray37;
        pilha0.empilha((java.lang.Object) objArray37);
        int int40 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        pilha0.topo = (byte) 100;
        int int31 = pilha0.topo;
        int int32 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        int int53 = pilha38.topo;
        int int54 = pilha38.topo;
        pilha38.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) '#');
        java.lang.Object obj60 = pilha57.desempilha();
        pilha57.empilha((java.lang.Object) 1);
        pilha57.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray65 = null;
        pilha57.item = objArray65;
        pilha57.topo = 100;
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.topo = '4';
        pilha69.topo = 10;
        java.lang.Object[] objArray74 = pilha69.item;
        java.lang.Object[] objArray75 = pilha69.item;
        pilha57.item = objArray75;
        pilha38.empilha((java.lang.Object) objArray75);
        pilha0.item = objArray75;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + '#' + "'", obj60, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha0.item = objArray20;
        java.lang.Object obj22 = pilha0.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha23.item = objArray37;
        int int39 = pilha23.tamanho();
        int int40 = pilha23.tamanho();
        pilha23.topo = 9;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) 1);
        int int49 = pilha43.topo;
        pilha43.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) '#');
        java.lang.Object obj55 = pilha52.desempilha();
        pilha52.empilha((java.lang.Object) 1);
        pilha52.empilha((java.lang.Object) 0L);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray68 = null;
        pilha60.item = objArray68;
        java.lang.Object[] objArray70 = new java.lang.Object[] { pilha52, pilha60 };
        pilha43.item = objArray70;
        ds.Pilha pilha72 = new ds.Pilha();
        java.lang.Object[] objArray73 = pilha72.item;
        int int74 = pilha72.topo;
        ds.Pilha pilha75 = new ds.Pilha();
        pilha75.empilha((java.lang.Object) '#');
        java.lang.Object obj78 = pilha75.desempilha();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha72.item = objArray79;
        pilha43.item = objArray79;
        pilha23.item = objArray79;
        pilha0.empilha((java.lang.Object) objArray79);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + '#' + "'", obj55, '#');
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + '#' + "'", obj78, '#');
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        int int38 = pilha8.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object obj45 = pilha39.desempilha();
        int int46 = pilha39.topo;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 10;
        java.lang.Object[] objArray52 = pilha47.item;
        pilha39.item = objArray52;
        // The following exception was thrown during execution in test generation
        try {
            pilha8.empilha((java.lang.Object) pilha39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray24 = pilha9.item;
        java.lang.Object[] objArray25 = pilha9.item;
        pilha9.topo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertNull(objArray25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        boolean boolean30 = pilha24.vazia();
        int int31 = pilha24.topo;
        java.lang.Object obj32 = pilha24.desempilha();
        int int33 = pilha24.topo;
        pilha0.empilha((java.lang.Object) pilha24);
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        int int37 = pilha35.topo;
        pilha35.topo = (short) 100;
        java.lang.Object obj40 = pilha35.desempilha();
        java.lang.Object obj41 = pilha35.desempilha();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) 0.0d);
        int int46 = pilha42.topo;
        java.lang.Object obj47 = pilha42.desempilha();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 0;
        pilha42.empilha((java.lang.Object) 0);
        pilha35.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) '#');
        java.lang.Object obj58 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) 1);
        pilha55.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray63 = null;
        pilha55.item = objArray63;
        pilha55.topo = 100;
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.topo = '4';
        pilha67.topo = 10;
        java.lang.Object[] objArray72 = pilha67.item;
        java.lang.Object[] objArray73 = pilha67.item;
        pilha55.item = objArray73;
        pilha35.item = objArray73;
        pilha24.item = objArray73;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        int int38 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        int int7 = pilha5.topo;
        pilha5.topo = (short) 100;
        java.lang.Object obj10 = pilha5.desempilha();
        java.lang.Object obj11 = pilha5.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) '#');
        java.lang.Object obj15 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) 1);
        pilha12.empilha((java.lang.Object) 0L);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha12.item = objArray26;
        int int28 = pilha12.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.topo = '4';
        pilha29.topo = 10;
        java.lang.Object[] objArray34 = pilha29.item;
        java.lang.Object obj35 = pilha29.desempilha();
        int int36 = pilha29.topo;
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        pilha29.item = objArray42;
        pilha12.item = objArray42;
        pilha5.item = objArray42;
        java.lang.Object obj46 = pilha5.desempilha();
        pilha0.empilha(obj46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        int int26 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass27 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        pilha0.topo = (byte) 100;
        int int31 = pilha0.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object obj38 = pilha32.desempilha();
        int int39 = pilha32.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        pilha32.item = objArray41;
        pilha0.item = objArray41;
        java.lang.Class<?> wildcardClass44 = objArray41.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        java.lang.Object obj38 = pilha0.desempilha();
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        int int27 = pilha18.topo;
        pilha18.topo = (byte) 1;
        int int30 = pilha18.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        int int8 = pilha0.tamanho();
        pilha0.topo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        int int14 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        int int23 = pilha19.tamanho();
        int int24 = pilha19.topo;
        java.lang.Object[] objArray25 = pilha19.item;
        pilha0.item = objArray25;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object obj12 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha0.item = objArray26;
        int int28 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean4 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object obj39 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int24 = pilha9.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pilha9.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.topo = '4';
        pilha77.topo = 10;
        java.lang.Object[] objArray82 = pilha77.item;
        int int83 = pilha77.tamanho();
        ds.Pilha pilha84 = new ds.Pilha();
        java.lang.Object[] objArray85 = pilha84.item;
        pilha77.item = objArray85;
        java.lang.Object obj87 = pilha77.desempilha();
        java.lang.Object[] objArray88 = pilha77.item;
        pilha18.item = objArray88;
        java.lang.Class<?> wildcardClass90 = objArray88.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        java.lang.Object[] objArray55 = null;
        pilha33.item = objArray55;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        boolean boolean24 = pilha18.vazia();
        int int25 = pilha18.topo;
        pilha18.topo = (byte) 1;
        java.lang.Object[] objArray28 = pilha18.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        pilha33.item = objArray42;
        pilha29.item = objArray42;
        pilha18.item = objArray42;
        pilha0.item = objArray42;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        java.lang.Object[] objArray22 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        java.lang.Object[] objArray19 = pilha15.item;
        pilha0.item = objArray19;
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        java.lang.Object obj35 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = obj35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Object obj30 = null;
        pilha0.empilha(obj30);
        boolean boolean32 = pilha0.vazia();
        int int33 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        java.lang.Object[] objArray25 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        int int51 = pilha45.tamanho();
        java.lang.Object[] objArray52 = pilha45.item;
        pilha38.empilha((java.lang.Object) objArray52);
        pilha0.item = objArray52;
        int int55 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 0;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha10.item = objArray21;
        pilha0.empilha((java.lang.Object) objArray21);
        java.lang.Class<?> wildcardClass24 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.topo;
        pilha0.topo = (byte) 10;
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha23.topo = 0;
        pilha23.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        int int35 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        java.lang.Object[] objArray49 = pilha20.item;
        pilha13.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Class<?> wildcardClass52 = objArray49.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 100;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.empilha((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha6.item = objArray20;
        boolean boolean22 = pilha6.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha23.item = objArray37;
        pilha6.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object obj41 = pilha0.desempilha();
        int int42 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass43 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 98 + "'", int42 == 98);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        pilha4.topo = 99;
        java.lang.Class<?> wildcardClass29 = pilha4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        pilha0.topo = 9;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray50 = pilha49.item;
        int int51 = pilha49.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) '#');
        java.lang.Object obj55 = pilha52.desempilha();
        java.lang.Object[] objArray56 = pilha52.item;
        pilha49.item = objArray56;
        pilha20.item = objArray56;
        pilha0.item = objArray56;
        java.lang.Class<?> wildcardClass60 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + '#' + "'", obj55, '#');
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha7.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha19.item = objArray28;
        pilha0.item = objArray28;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        int int33 = pilha31.topo;
        pilha31.topo = (short) 100;
        java.lang.Object obj36 = pilha31.desempilha();
        java.lang.Object obj37 = pilha31.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) 0.0d);
        int int42 = pilha38.topo;
        java.lang.Object obj43 = pilha38.desempilha();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 0;
        pilha38.empilha((java.lang.Object) 0);
        pilha31.empilha((java.lang.Object) pilha38);
        java.lang.Object obj51 = pilha31.desempilha();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        boolean boolean57 = pilha52.vazia();
        int int58 = pilha52.tamanho();
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.topo = '4';
        pilha59.topo = 10;
        java.lang.Object[] objArray64 = pilha59.item;
        java.lang.Object obj65 = pilha59.desempilha();
        int int66 = pilha59.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        pilha59.item = objArray68;
        pilha52.item = objArray68;
        pilha31.item = objArray68;
        pilha0.item = objArray68;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        int int24 = pilha22.topo;
        pilha22.topo = (short) 100;
        java.lang.Object obj27 = pilha22.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        pilha28.item = objArray42;
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object[] objArray59 = pilha53.item;
        pilha45.item = objArray59;
        pilha28.item = objArray59;
        pilha22.item = objArray59;
        pilha3.item = objArray59;
        java.lang.Class<?> wildcardClass64 = pilha3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray24 = pilha9.item;
        java.lang.Object[] objArray25 = pilha9.item;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray34 = null;
        pilha26.item = objArray34;
        pilha26.topo = 100;
        int int38 = pilha26.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object obj45 = pilha39.desempilha();
        int int46 = pilha39.topo;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 10;
        java.lang.Object[] objArray52 = pilha47.item;
        pilha39.item = objArray52;
        pilha26.item = objArray52;
        pilha9.item = objArray52;
        java.lang.Object[] objArray56 = pilha9.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.topo = '4';
        pilha3.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha3.item = objArray14;
        pilha0.item = objArray14;
        java.lang.Object[] objArray17 = pilha0.item;
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        int int8 = pilha5.topo;
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        int int12 = pilha10.topo;
        pilha10.topo = (short) 100;
        java.lang.Object obj15 = pilha10.desempilha();
        java.lang.Object obj16 = pilha10.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) 0.0d);
        int int21 = pilha17.topo;
        java.lang.Object obj22 = pilha17.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 0;
        pilha17.empilha((java.lang.Object) 0);
        pilha10.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object[] objArray44 = pilha38.item;
        pilha30.item = objArray44;
        boolean boolean46 = pilha30.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) 1);
        pilha47.empilha((java.lang.Object) 0L);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object[] objArray61 = pilha55.item;
        pilha47.item = objArray61;
        pilha30.item = objArray61;
        pilha10.item = objArray61;
        pilha0.empilha((java.lang.Object) objArray61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha0.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        java.lang.Object[] objArray38 = pilha31.item;
        pilha27.empilha((java.lang.Object) pilha31);
        pilha0.empilha((java.lang.Object) pilha27);
        java.lang.Object obj41 = pilha27.desempilha();
        pilha27.topo = 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object[] objArray11 = pilha5.item;
        pilha0.item = objArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        boolean boolean7 = pilha1.vazia();
        int int8 = pilha1.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        int int15 = pilha9.topo;
        pilha9.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray34 = null;
        pilha26.item = objArray34;
        java.lang.Object[] objArray36 = new java.lang.Object[] { pilha18, pilha26 };
        pilha9.item = objArray36;
        pilha1.item = objArray36;
        pilha0.item = objArray36;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        boolean boolean45 = pilha40.vazia();
        java.lang.Object[] objArray46 = pilha40.item;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 10;
        java.lang.Object[] objArray52 = pilha47.item;
        java.lang.Object obj53 = pilha47.desempilha();
        int int54 = pilha47.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        pilha47.item = objArray60;
        pilha40.item = objArray60;
        pilha40.topo = 'a';
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) 0.0d);
        int int69 = pilha65.topo;
        int int70 = pilha65.tamanho();
        java.lang.Object[] objArray71 = pilha65.item;
        pilha40.item = objArray71;
        pilha0.item = objArray71;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) 1);
        pilha2.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray10 = null;
        pilha2.item = objArray10;
        java.lang.Object[] objArray12 = pilha2.item;
        pilha0.empilha((java.lang.Object) objArray12);
        pilha0.topo = '4';
        java.lang.Object[] objArray16 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = pilha18.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object[] objArray16 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray43 = null;
        pilha35.item = objArray43;
        java.lang.Object[] objArray45 = new java.lang.Object[] { pilha27, pilha35 };
        pilha18.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        java.lang.Object[] objArray48 = pilha47.item;
        int int49 = pilha47.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        java.lang.Object[] objArray54 = pilha50.item;
        pilha47.item = objArray54;
        pilha18.item = objArray54;
        pilha0.item = objArray54;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = '4';
        pilha58.topo = 10;
        boolean boolean63 = pilha58.vazia();
        boolean boolean64 = pilha58.vazia();
        ds.Pilha pilha65 = new ds.Pilha();
        java.lang.Object[] objArray66 = pilha65.item;
        int int67 = pilha65.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) '#');
        java.lang.Object obj71 = pilha68.desempilha();
        java.lang.Object[] objArray72 = pilha68.item;
        pilha65.item = objArray72;
        pilha58.item = objArray72;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + '#' + "'", obj71, '#');
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = (-1);
        pilha0.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) 1);
        boolean boolean21 = pilha15.vazia();
        int int22 = pilha15.topo;
        int int23 = pilha15.topo;
        pilha15.topo = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        int int19 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        java.lang.Object[] objArray34 = pilha0.item;
        int int35 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        boolean boolean19 = pilha13.vazia();
        int int20 = pilha13.topo;
        pilha13.topo = (byte) 1;
        java.lang.Object[] objArray23 = pilha13.item;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        java.lang.Object[] objArray28 = pilha24.item;
        pilha13.item = objArray28;
        pilha0.item = objArray28;
        int int31 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        boolean boolean16 = pilha11.vazia();
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        int int51 = pilha45.tamanho();
        java.lang.Object[] objArray52 = pilha45.item;
        pilha38.empilha((java.lang.Object) objArray52);
        pilha0.item = objArray52;
        int int55 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 0.0d);
        int int13 = pilha9.topo;
        boolean boolean14 = pilha9.vazia();
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        pilha0.topo = 100;
        pilha0.topo = 0;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        int int27 = pilha21.topo;
        boolean boolean28 = pilha21.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 0.0d);
        int int33 = pilha29.topo;
        java.lang.Object obj34 = pilha29.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 0;
        pilha29.empilha((java.lang.Object) 0);
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        int int43 = pilha41.topo;
        pilha41.topo = (short) 100;
        java.lang.Object obj46 = pilha41.desempilha();
        java.lang.Object obj47 = pilha41.desempilha();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) '#');
        java.lang.Object obj51 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1);
        pilha48.empilha((java.lang.Object) 0L);
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        java.lang.Object[] objArray61 = pilha56.item;
        java.lang.Object[] objArray62 = pilha56.item;
        pilha48.item = objArray62;
        int int64 = pilha48.tamanho();
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.topo = '4';
        pilha65.topo = 10;
        java.lang.Object[] objArray70 = pilha65.item;
        java.lang.Object obj71 = pilha65.desempilha();
        int int72 = pilha65.topo;
        ds.Pilha pilha73 = new ds.Pilha();
        pilha73.topo = '4';
        pilha73.topo = 10;
        java.lang.Object[] objArray78 = pilha73.item;
        pilha65.item = objArray78;
        pilha48.item = objArray78;
        pilha41.item = objArray78;
        pilha29.item = objArray78;
        pilha21.item = objArray78;
        pilha0.item = objArray78;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 9 + "'", int72 == 9);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        boolean boolean26 = pilha0.vazia();
        boolean boolean27 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (-1L));
        java.lang.Object[] objArray30 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj20 = pilha0.desempilha();
        pilha0.topo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        int int20 = pilha14.topo;
        pilha14.topo = 99;
        int int23 = pilha14.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        java.lang.Object[] objArray17 = pilha0.item;
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj20 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        int int45 = pilha0.tamanho();
        int int46 = pilha0.tamanho();
        int int47 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray14 = null;
        pilha6.item = objArray14;
        java.lang.Class<?> wildcardClass16 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) pilha6);
        int int18 = pilha6.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        int int9 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = null;
        pilha0.item = objArray39;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        int int47 = pilha41.topo;
        int int48 = pilha41.tamanho();
        java.lang.Object obj49 = pilha41.desempilha();
        boolean boolean50 = pilha41.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) '#');
        java.lang.Object obj54 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) 1);
        pilha51.empilha((java.lang.Object) 0L);
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.topo = '4';
        pilha59.topo = 10;
        java.lang.Object[] objArray64 = pilha59.item;
        java.lang.Object[] objArray65 = pilha59.item;
        pilha51.item = objArray65;
        boolean boolean67 = pilha51.vazia();
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) '#');
        java.lang.Object obj71 = pilha68.desempilha();
        pilha68.empilha((java.lang.Object) 1);
        pilha68.empilha((java.lang.Object) 0L);
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.topo = '4';
        pilha76.topo = 10;
        java.lang.Object[] objArray81 = pilha76.item;
        java.lang.Object[] objArray82 = pilha76.item;
        pilha68.item = objArray82;
        pilha51.item = objArray82;
        pilha41.item = objArray82;
        pilha0.item = objArray82;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1 + "'", obj49, 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '#' + "'", obj54, '#');
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + '#' + "'", obj71, '#');
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        int int58 = pilha56.topo;
        pilha56.topo = (short) 100;
        java.lang.Object obj61 = pilha56.desempilha();
        java.lang.Object obj62 = pilha56.desempilha();
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) 0.0d);
        int int67 = pilha63.topo;
        java.lang.Object obj68 = pilha63.desempilha();
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.topo = '4';
        pilha69.topo = 0;
        pilha63.empilha((java.lang.Object) 0);
        pilha56.empilha((java.lang.Object) pilha63);
        int int76 = pilha56.topo;
        boolean boolean77 = pilha56.vazia();
        pilha4.empilha((java.lang.Object) pilha56);
        pilha56.empilha((java.lang.Object) 100.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 99 + "'", int76 == 99);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        int int58 = pilha56.topo;
        pilha56.topo = (short) 100;
        java.lang.Object obj61 = pilha56.desempilha();
        java.lang.Object obj62 = pilha56.desempilha();
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) 0.0d);
        int int67 = pilha63.topo;
        java.lang.Object obj68 = pilha63.desempilha();
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.topo = '4';
        pilha69.topo = 0;
        pilha63.empilha((java.lang.Object) 0);
        pilha56.empilha((java.lang.Object) pilha63);
        int int76 = pilha56.topo;
        boolean boolean77 = pilha56.vazia();
        pilha4.empilha((java.lang.Object) pilha56);
        int int79 = pilha56.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 99 + "'", int76 == 99);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 99 + "'", int79 == 99);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        pilha0.empilha((java.lang.Object) true);
        int int35 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        int int10 = pilha0.tamanho();
        pilha0.topo = (short) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        pilha0.topo = (-1);
        pilha0.topo = '4';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        pilha20.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha20.item = objArray38;
        pilha0.item = objArray38;
        java.lang.Object[] objArray41 = pilha0.item;
        java.lang.Object obj42 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        boolean boolean25 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        int int19 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        pilha0.topo = 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        int int35 = pilha0.topo;
        int int36 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        int int7 = pilha5.topo;
        pilha5.topo = (short) 100;
        java.lang.Object obj10 = pilha5.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1);
        pilha11.empilha((java.lang.Object) 0L);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        java.lang.Object[] objArray25 = pilha19.item;
        pilha11.item = objArray25;
        boolean boolean27 = pilha11.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        pilha28.item = objArray42;
        pilha11.item = objArray42;
        pilha5.item = objArray42;
        pilha0.item = objArray42;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 0.0d);
        int int26 = pilha22.topo;
        java.lang.Object obj27 = pilha22.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 0;
        pilha22.empilha((java.lang.Object) 0);
        pilha22.topo = (byte) 100;
        int int36 = pilha22.tamanho();
        pilha22.topo = 2;
        // The following exception was thrown during execution in test generation
        try {
            pilha3.empilha((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        java.lang.Object[] objArray45 = pilha0.item;
        boolean boolean46 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pilha4.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object obj12 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int15 = pilha0.tamanho();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Class<?> wildcardClass28 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        java.lang.Object[] objArray77 = null;
        pilha0.item = objArray77;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        boolean boolean36 = pilha20.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha37.item = objArray51;
        pilha20.item = objArray51;
        pilha0.item = objArray51;
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) '#');
        java.lang.Object obj58 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) 1);
        java.lang.Object obj61 = pilha55.desempilha();
        boolean boolean62 = pilha55.vazia();
        java.lang.Class<?> wildcardClass63 = pilha55.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass63);
        java.lang.Class<?> wildcardClass65 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 1 + "'", obj61, 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        int int29 = pilha0.tamanho();
        int int30 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        boolean boolean77 = pilha36.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        int int35 = pilha0.topo;
        java.lang.Object obj36 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        boolean boolean37 = pilha32.vazia();
        java.lang.Object[] objArray38 = pilha32.item;
        java.lang.Object[] objArray39 = pilha32.item;
        pilha28.empilha((java.lang.Object) pilha32);
        pilha28.topo = 97;
        pilha0.empilha((java.lang.Object) 97);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        pilha15.item = objArray24;
        pilha11.item = objArray24;
        pilha0.item = objArray24;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        int int30 = pilha28.topo;
        pilha28.topo = (short) 100;
        java.lang.Object obj33 = pilha28.desempilha();
        java.lang.Object obj34 = pilha28.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        int int51 = pilha35.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object obj58 = pilha52.desempilha();
        int int59 = pilha52.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        pilha52.item = objArray65;
        pilha35.item = objArray65;
        pilha28.item = objArray65;
        pilha0.item = objArray65;
        java.lang.Object obj70 = pilha0.desempilha();
        java.lang.Object[] objArray71 = pilha0.item;
        java.lang.Class<?> wildcardClass72 = objArray71.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.tamanho();
        java.lang.Object obj21 = pilha0.desempilha();
        boolean boolean22 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha38.item = objArray47;
        pilha0.item = objArray47;
        int int50 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha7.topo;
        java.lang.Object obj21 = pilha7.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha7.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        pilha0.topo = (-1);
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha0.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        java.lang.Object[] objArray38 = pilha31.item;
        pilha27.empilha((java.lang.Object) pilha31);
        pilha0.empilha((java.lang.Object) pilha27);
        java.lang.Object obj41 = pilha27.desempilha();
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) '#');
        java.lang.Object obj45 = pilha42.desempilha();
        pilha42.empilha((java.lang.Object) 1);
        boolean boolean48 = pilha42.vazia();
        int int49 = pilha42.topo;
        int int50 = pilha42.topo;
        pilha42.topo = (short) 1;
        pilha27.empilha((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        pilha4.topo = '4';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        java.lang.Object obj17 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        pilha10.topo = (byte) 0;
        pilha0.empilha((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        boolean boolean29 = pilha0.vazia();
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = null;
        pilha0.item = objArray39;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.empilha((java.lang.Object) 0.0d);
        int int45 = pilha41.topo;
        java.lang.Object obj46 = pilha41.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 0;
        pilha41.empilha((java.lang.Object) 0);
        ds.Pilha pilha53 = new ds.Pilha();
        java.lang.Object[] objArray54 = pilha53.item;
        int int55 = pilha53.topo;
        pilha53.topo = (short) 100;
        java.lang.Object obj58 = pilha53.desempilha();
        java.lang.Object obj59 = pilha53.desempilha();
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.topo = '4';
        pilha68.topo = 10;
        java.lang.Object[] objArray73 = pilha68.item;
        java.lang.Object[] objArray74 = pilha68.item;
        pilha60.item = objArray74;
        int int76 = pilha60.tamanho();
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.topo = '4';
        pilha77.topo = 10;
        java.lang.Object[] objArray82 = pilha77.item;
        java.lang.Object obj83 = pilha77.desempilha();
        int int84 = pilha77.topo;
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.topo = '4';
        pilha85.topo = 10;
        java.lang.Object[] objArray90 = pilha85.item;
        pilha77.item = objArray90;
        pilha60.item = objArray90;
        pilha53.item = objArray90;
        pilha41.item = objArray90;
        pilha0.item = objArray90;
        boolean boolean96 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        pilha0.topo = (byte) 100;
        int int31 = pilha0.topo;
        java.lang.Class<?> wildcardClass32 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        java.lang.Object obj12 = pilha6.desempilha();
        boolean boolean13 = pilha6.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) '#');
        java.lang.Object obj17 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1);
        pilha14.empilha((java.lang.Object) 0L);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        java.lang.Object[] objArray27 = pilha22.item;
        java.lang.Object[] objArray28 = pilha22.item;
        pilha14.item = objArray28;
        boolean boolean30 = pilha14.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        pilha31.empilha((java.lang.Object) 0L);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object[] objArray45 = pilha39.item;
        pilha31.item = objArray45;
        pilha14.item = objArray45;
        pilha6.item = objArray45;
        pilha0.item = objArray45;
        java.lang.Object obj50 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 97;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        java.lang.Object obj35 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        pilha18.topo = (short) 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        int int10 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        java.lang.Object[] objArray34 = pilha0.item;
        java.lang.Object[] objArray35 = pilha0.item;
        int int36 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        pilha0.topo = 52;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        boolean boolean23 = pilha18.vazia();
        pilha0.empilha((java.lang.Object) pilha18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        pilha3.topo = 52;
        int int24 = pilha3.topo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        boolean boolean24 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha0.item = objArray20;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 0.0d);
        int int26 = pilha22.topo;
        java.lang.Object obj27 = pilha22.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 0;
        pilha22.empilha((java.lang.Object) 0);
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray35 = pilha34.item;
        int int36 = pilha34.topo;
        pilha34.topo = (short) 100;
        java.lang.Object obj39 = pilha34.desempilha();
        java.lang.Object obj40 = pilha34.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        int int57 = pilha41.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = '4';
        pilha58.topo = 10;
        java.lang.Object[] objArray63 = pilha58.item;
        java.lang.Object obj64 = pilha58.desempilha();
        int int65 = pilha58.topo;
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        pilha58.item = objArray71;
        pilha41.item = objArray71;
        pilha34.item = objArray71;
        pilha22.item = objArray71;
        java.lang.Class<?> wildcardClass76 = objArray71.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass76);
        boolean boolean78 = pilha0.vazia();
        pilha0.topo = '4';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        boolean boolean16 = pilha4.vazia();
        pilha4.topo = 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 11);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) 0.0d);
        int int24 = pilha20.topo;
        java.lang.Object obj25 = pilha20.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 0;
        pilha20.empilha((java.lang.Object) 0);
        pilha20.topo = (byte) 100;
        pilha12.empilha((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        java.lang.Class<?> wildcardClass31 = pilha27.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        boolean boolean8 = pilha0.vazia();
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        pilha1.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray9 = null;
        pilha1.item = objArray9;
        java.lang.Object[] objArray11 = pilha1.item;
        int int12 = pilha1.topo;
        java.lang.Object[] objArray13 = pilha1.item;
        boolean boolean14 = pilha1.vazia();
        int int15 = pilha1.topo;
        pilha0.empilha((java.lang.Object) int15);
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.topo;
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 2 + "'", obj17, 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        int int23 = pilha8.topo;
        int int24 = pilha8.topo;
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray26 = pilha8.item;
        boolean boolean27 = pilha8.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        boolean boolean34 = pilha28.vazia();
        int int35 = pilha28.topo;
        pilha28.topo = (byte) 1;
        java.lang.Object[] objArray38 = pilha28.item;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        pilha39.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 10;
        java.lang.Object[] objArray52 = pilha47.item;
        pilha43.item = objArray52;
        pilha39.item = objArray52;
        pilha28.item = objArray52;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        int int58 = pilha56.topo;
        pilha56.topo = (short) 100;
        java.lang.Object obj61 = pilha56.desempilha();
        java.lang.Object obj62 = pilha56.desempilha();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) '#');
        java.lang.Object obj66 = pilha63.desempilha();
        pilha63.empilha((java.lang.Object) 1);
        pilha63.empilha((java.lang.Object) 0L);
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.topo = '4';
        pilha71.topo = 10;
        java.lang.Object[] objArray76 = pilha71.item;
        java.lang.Object[] objArray77 = pilha71.item;
        pilha63.item = objArray77;
        int int79 = pilha63.tamanho();
        ds.Pilha pilha80 = new ds.Pilha();
        pilha80.topo = '4';
        pilha80.topo = 10;
        java.lang.Object[] objArray85 = pilha80.item;
        java.lang.Object obj86 = pilha80.desempilha();
        int int87 = pilha80.topo;
        ds.Pilha pilha88 = new ds.Pilha();
        pilha88.topo = '4';
        pilha88.topo = 10;
        java.lang.Object[] objArray93 = pilha88.item;
        pilha80.item = objArray93;
        pilha63.item = objArray93;
        pilha56.item = objArray93;
        pilha28.item = objArray93;
        pilha8.item = objArray93;
        boolean boolean99 = pilha8.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 9 + "'", int87 == 9);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object obj79 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0d + "'", obj79, 100.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        boolean boolean30 = pilha24.vazia();
        int int31 = pilha24.topo;
        java.lang.Object obj32 = pilha24.desempilha();
        int int33 = pilha24.topo;
        pilha0.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray35 = pilha24.item;
        boolean boolean36 = pilha24.vazia();
        java.lang.Class<?> wildcardClass37 = pilha24.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        int int56 = pilha4.tamanho();
        java.lang.Object[] objArray57 = pilha4.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        pilha0.topo = 9;
        java.lang.Object obj20 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object obj42 = pilha36.desempilha();
        int int43 = pilha36.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha36.item = objArray49;
        pilha19.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        int int60 = pilha54.topo;
        int int61 = pilha54.tamanho();
        java.lang.Object obj62 = pilha54.desempilha();
        java.lang.Object[] objArray63 = pilha54.item;
        pilha0.item = objArray63;
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) '#');
        int int68 = pilha65.tamanho();
        java.lang.Object[] objArray69 = pilha65.item;
        pilha0.item = objArray69;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1 + "'", obj62, 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        boolean boolean18 = pilha0.vazia();
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        int int21 = pilha0.topo;
        int int22 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) '#');
        java.lang.Object obj24 = pilha21.desempilha();
        pilha21.empilha((java.lang.Object) 1);
        int int27 = pilha21.topo;
        pilha21.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        pilha38.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray46 = null;
        pilha38.item = objArray46;
        java.lang.Object[] objArray48 = new java.lang.Object[] { pilha30, pilha38 };
        pilha21.item = objArray48;
        java.lang.Object[] objArray50 = pilha21.item;
        int int51 = pilha21.tamanho();
        pilha21.topo = (byte) 1;
        java.lang.Object[] objArray54 = pilha21.item;
        pilha0.item = objArray54;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        pilha33.topo = 'a';
        boolean boolean57 = pilha33.vazia();
        int int58 = pilha33.topo;
        java.lang.Class<?> wildcardClass59 = pilha33.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        pilha0.topo = (-1);
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 10;
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
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        pilha0.topo = 0;
        int int11 = pilha0.topo;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        int int51 = pilha45.tamanho();
        java.lang.Object[] objArray52 = pilha45.item;
        pilha38.empilha((java.lang.Object) objArray52);
        pilha0.item = objArray52;
        java.lang.Object obj55 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        boolean boolean13 = pilha8.vazia();
        java.lang.Object[] objArray14 = pilha8.item;
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) 1);
        pilha16.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray24 = null;
        pilha16.item = objArray24;
        pilha16.topo = 100;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha16.item = objArray34;
        pilha8.item = objArray34;
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        boolean boolean46 = pilha41.vazia();
        java.lang.Object[] objArray47 = pilha41.item;
        java.lang.Object[] objArray48 = pilha41.item;
        pilha37.empilha((java.lang.Object) pilha41);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = '4';
        pilha50.topo = 10;
        java.lang.Object[] objArray55 = pilha50.item;
        java.lang.Object[] objArray56 = pilha50.item;
        pilha50.topo = 1;
        int int59 = pilha50.topo;
        int int60 = pilha50.tamanho();
        pilha41.empilha((java.lang.Object) int60);
        pilha8.empilha((java.lang.Object) pilha41);
        pilha41.topo = 'a';
        boolean boolean65 = pilha41.vazia();
        int int66 = pilha41.topo;
        pilha0.empilha((java.lang.Object) int66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        java.lang.Object[] objArray55 = pilha33.item;
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        java.lang.Object[] objArray61 = pilha56.item;
        java.lang.Object obj62 = pilha56.desempilha();
        int int63 = pilha56.topo;
        ds.Pilha pilha64 = new ds.Pilha();
        pilha64.topo = '4';
        pilha64.topo = 10;
        java.lang.Object[] objArray69 = pilha64.item;
        pilha56.item = objArray69;
        int int71 = pilha56.topo;
        int int72 = pilha56.topo;
        pilha56.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha75 = new ds.Pilha();
        pilha75.empilha((java.lang.Object) '#');
        java.lang.Object obj78 = pilha75.desempilha();
        pilha75.empilha((java.lang.Object) 1);
        pilha75.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray83 = null;
        pilha75.item = objArray83;
        pilha75.topo = 100;
        ds.Pilha pilha87 = new ds.Pilha();
        pilha87.topo = '4';
        pilha87.topo = 10;
        java.lang.Object[] objArray92 = pilha87.item;
        java.lang.Object[] objArray93 = pilha87.item;
        pilha75.item = objArray93;
        pilha56.empilha((java.lang.Object) objArray93);
        pilha33.item = objArray93;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 9 + "'", int72 == 9);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + '#' + "'", obj78, '#');
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        int int3 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        int int10 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        java.lang.Object[] objArray43 = pilha37.item;
        pilha29.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        int int51 = pilha45.tamanho();
        pilha29.empilha((java.lang.Object) int51);
        java.lang.Object[] objArray53 = pilha29.item;
        pilha0.empilha((java.lang.Object) objArray53);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha0.item = objArray26;
        java.lang.Object obj28 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object obj12 = pilha0.desempilha();
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        int int14 = pilha0.topo;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object obj42 = pilha36.desempilha();
        int int43 = pilha36.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha36.item = objArray49;
        pilha19.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        boolean boolean54 = pilha0.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray56 = pilha55.item;
        int int57 = pilha55.topo;
        pilha55.topo = (short) 100;
        java.lang.Object obj60 = pilha55.desempilha();
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) '#');
        java.lang.Object obj64 = pilha61.desempilha();
        pilha61.empilha((java.lang.Object) 1);
        pilha61.empilha((java.lang.Object) 0L);
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.topo = '4';
        pilha69.topo = 10;
        java.lang.Object[] objArray74 = pilha69.item;
        java.lang.Object[] objArray75 = pilha69.item;
        pilha61.item = objArray75;
        boolean boolean77 = pilha61.vazia();
        ds.Pilha pilha78 = new ds.Pilha();
        pilha78.empilha((java.lang.Object) '#');
        java.lang.Object obj81 = pilha78.desempilha();
        pilha78.empilha((java.lang.Object) 1);
        pilha78.empilha((java.lang.Object) 0L);
        ds.Pilha pilha86 = new ds.Pilha();
        pilha86.topo = '4';
        pilha86.topo = 10;
        java.lang.Object[] objArray91 = pilha86.item;
        java.lang.Object[] objArray92 = pilha86.item;
        pilha78.item = objArray92;
        pilha61.item = objArray92;
        pilha55.item = objArray92;
        java.lang.Object obj96 = pilha55.desempilha();
        pilha0.empilha((java.lang.Object) pilha55);
        java.lang.Object[] objArray98 = pilha55.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + '#' + "'", obj64, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + '#' + "'", obj81, '#');
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(objArray98);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) '#');
        java.lang.Object obj17 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1);
        boolean boolean20 = pilha14.vazia();
        int int21 = pilha14.topo;
        pilha14.topo = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        int int29 = pilha0.tamanho();
        java.lang.Object obj30 = pilha0.desempilha();
        boolean boolean31 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = null;
        pilha0.item = objArray11;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object obj42 = pilha36.desempilha();
        int int43 = pilha36.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha36.item = objArray49;
        pilha19.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        int int60 = pilha54.topo;
        int int61 = pilha54.tamanho();
        java.lang.Object obj62 = pilha54.desempilha();
        java.lang.Object[] objArray63 = pilha54.item;
        pilha0.item = objArray63;
        java.lang.Class<?> wildcardClass65 = objArray63.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1 + "'", obj62, 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        int int4 = pilha2.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        java.lang.Object[] objArray9 = pilha5.item;
        pilha2.item = objArray9;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1);
        pilha11.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray19 = null;
        pilha11.item = objArray19;
        java.lang.Object[] objArray21 = pilha11.item;
        int int22 = pilha11.topo;
        java.lang.Object[] objArray23 = pilha11.item;
        int int24 = pilha11.topo;
        pilha2.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray26 = pilha11.item;
        java.lang.Object[] objArray27 = pilha11.item;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray36 = null;
        pilha28.item = objArray36;
        pilha28.topo = 100;
        int int40 = pilha28.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        java.lang.Object[] objArray46 = pilha41.item;
        java.lang.Object obj47 = pilha41.desempilha();
        int int48 = pilha41.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        pilha41.item = objArray54;
        pilha28.item = objArray54;
        pilha11.item = objArray54;
        pilha0.item = objArray54;
        java.lang.Class<?> wildcardClass59 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = null;
        pilha0.empilha(obj8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        pilha8.item = objArray17;
        pilha4.item = objArray17;
        java.lang.Object[] objArray20 = pilha4.item;
        pilha0.item = objArray20;
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        int int31 = pilha25.tamanho();
        int int32 = pilha25.topo;
        int int33 = pilha25.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.topo = '4';
        pilha34.topo = 10;
        boolean boolean39 = pilha34.vazia();
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        int int42 = pilha34.topo;
        java.lang.Class<?> wildcardClass43 = pilha34.getClass();
        pilha25.empilha((java.lang.Object) wildcardClass43);
        pilha0.empilha((java.lang.Object) wildcardClass43);
        pilha0.topo = 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray9 = pilha0.item;
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        int int22 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.topo = '4';
        pilha1.topo = 10;
        java.lang.Object[] objArray6 = pilha1.item;
        pilha0.item = objArray6;
        int int8 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        java.lang.Object[] objArray16 = pilha4.item;
        java.lang.Class<?> wildcardClass17 = pilha4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object obj11 = pilha5.desempilha();
        int int12 = pilha5.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        pilha5.item = objArray18;
        pilha0.item = objArray18;
        java.lang.Object[] objArray21 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        pilha0.empilha((java.lang.Object) 3);
        int int22 = pilha0.topo;
        java.lang.Object[] objArray23 = pilha0.item;
        java.lang.Class<?> wildcardClass24 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        pilha0.topo = 52;
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha38.item = objArray47;
        pilha0.item = objArray47;
        boolean boolean50 = pilha0.vazia();
        pilha0.topo = (short) 10;
        java.lang.Object obj53 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        pilha0.topo = 9;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray50 = pilha49.item;
        int int51 = pilha49.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) '#');
        java.lang.Object obj55 = pilha52.desempilha();
        java.lang.Object[] objArray56 = pilha52.item;
        pilha49.item = objArray56;
        pilha20.item = objArray56;
        pilha0.item = objArray56;
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + '#' + "'", obj55, '#');
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object obj31 = pilha25.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        int int38 = pilha32.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha32.item = objArray40;
        java.lang.Object obj42 = pilha32.desempilha();
        java.lang.Object[] objArray43 = pilha32.item;
        pilha25.item = objArray43;
        pilha4.item = objArray43;
        java.lang.Class<?> wildcardClass46 = objArray43.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha3.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        pilha9.item = objArray23;
        pilha0.empilha((java.lang.Object) objArray23);
        boolean boolean26 = pilha0.vazia();
        java.lang.Object obj27 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) 0.0d);
        int int12 = pilha8.topo;
        java.lang.Object obj13 = pilha8.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 0;
        pilha8.empilha((java.lang.Object) 0);
        pilha8.topo = (byte) 100;
        java.lang.Object obj22 = pilha8.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha8.item = objArray27;
        pilha0.empilha((java.lang.Object) pilha8);
        pilha0.topo = ' ';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray14 = null;
        pilha6.item = objArray14;
        pilha6.topo = 100;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha6.item = objArray24;
        java.lang.Object[] objArray26 = pilha6.item;
        pilha0.item = objArray26;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        boolean boolean56 = pilha4.vazia();
        int int57 = pilha4.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 10;
        boolean boolean11 = pilha6.vazia();
        java.lang.Object[] objArray12 = pilha6.item;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha2.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha15.topo = 1;
        int int24 = pilha15.topo;
        int int25 = pilha15.tamanho();
        pilha6.empilha((java.lang.Object) int25);
        pilha6.topo = (byte) 1;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Class<?> wildcardClass31 = pilha29.getClass();
        pilha6.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object obj46 = pilha40.desempilha();
        int int47 = pilha40.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        pilha40.item = objArray53;
        pilha33.item = objArray53;
        java.lang.Object[] objArray56 = pilha33.item;
        pilha6.item = objArray56;
        pilha0.item = objArray56;
        int int59 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.topo = '4';
        pilha51.topo = 10;
        java.lang.Object[] objArray56 = pilha51.item;
        java.lang.Object obj57 = null;
        pilha51.empilha(obj57);
        java.lang.Class<?> wildcardClass59 = pilha51.getClass();
        pilha0.empilha((java.lang.Object) pilha51);
        int int61 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 100;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        boolean boolean77 = pilha18.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        boolean boolean30 = pilha24.vazia();
        int int31 = pilha24.topo;
        java.lang.Object obj32 = pilha24.desempilha();
        int int33 = pilha24.topo;
        pilha0.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray35 = pilha24.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 0.0d);
        int int40 = pilha36.topo;
        java.lang.Object obj41 = pilha36.desempilha();
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 0;
        pilha36.empilha((java.lang.Object) 0);
        pilha36.topo = (byte) 100;
        java.lang.Object obj50 = pilha36.desempilha();
        java.lang.Object[] objArray51 = pilha36.item;
        int int52 = pilha36.topo;
        java.lang.Object[] objArray53 = pilha36.item;
        pilha24.item = objArray53;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 99 + "'", int52 == 99);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        boolean boolean29 = pilha0.vazia();
        java.lang.Object[] objArray30 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        boolean boolean16 = pilha10.vazia();
        int int17 = pilha10.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray43 = null;
        pilha35.item = objArray43;
        java.lang.Object[] objArray45 = new java.lang.Object[] { pilha27, pilha35 };
        pilha18.item = objArray45;
        pilha10.item = objArray45;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        java.lang.Object obj54 = pilha48.desempilha();
        int int55 = pilha48.topo;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        pilha48.item = objArray57;
        pilha10.item = objArray57;
        pilha0.empilha((java.lang.Object) objArray57);
        int int61 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        int int25 = pilha0.tamanho();
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        pilha0.topo = 99;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        java.lang.Object obj55 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        pilha0.topo = 98;
        int int17 = pilha0.topo;
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        int int23 = pilha8.topo;
        int int24 = pilha8.topo;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.topo = '4';
        pilha30.topo = 10;
        boolean boolean35 = pilha30.vazia();
        java.lang.Object[] objArray36 = pilha30.item;
        java.lang.Object[] objArray37 = pilha30.item;
        pilha26.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray39 = pilha26.item;
        pilha8.item = objArray39;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        pilha0.topo = (byte) 100;
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(objArray15);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        boolean boolean14 = pilha0.vazia();
        int int15 = pilha0.topo;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        boolean boolean28 = pilha22.vazia();
        int int29 = pilha22.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        int int36 = pilha30.topo;
        pilha30.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) '#');
        java.lang.Object obj42 = pilha39.desempilha();
        pilha39.empilha((java.lang.Object) 1);
        pilha39.empilha((java.lang.Object) 0L);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) 1);
        pilha47.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray55 = null;
        pilha47.item = objArray55;
        java.lang.Object[] objArray57 = new java.lang.Object[] { pilha39, pilha47 };
        pilha30.item = objArray57;
        pilha22.item = objArray57;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        java.lang.Object obj66 = pilha60.desempilha();
        int int67 = pilha60.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray69 = pilha68.item;
        pilha60.item = objArray69;
        pilha22.item = objArray69;
        int int72 = pilha22.topo;
        java.lang.Class<?> wildcardClass73 = pilha22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha3.empilha((java.lang.Object) pilha22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + '#' + "'", obj42, '#');
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 9 + "'", int67 == 9);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        pilha9.topo = 100;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        pilha9.item = objArray27;
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        java.lang.Object[] objArray49 = pilha20.item;
        pilha13.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Object[] objArray52 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        boolean boolean10 = pilha0.vazia();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        pilha0.topo = 0;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        boolean boolean34 = pilha18.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        pilha18.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) 0.0d);
        int int27 = pilha23.topo;
        java.lang.Object obj28 = pilha23.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.topo = '4';
        pilha29.topo = 0;
        pilha23.empilha((java.lang.Object) 0);
        pilha23.topo = (byte) 100;
        java.lang.Object obj37 = pilha23.desempilha();
        java.lang.Object[] objArray38 = pilha23.item;
        pilha0.empilha((java.lang.Object) pilha23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 10;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) 1);
        pilha2.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray10 = null;
        pilha2.item = objArray10;
        java.lang.Object[] objArray12 = pilha2.item;
        pilha0.empilha((java.lang.Object) objArray12);
        pilha0.topo = '4';
        int int16 = pilha0.tamanho();
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.empilha((java.lang.Object) '#');
        java.lang.Object obj80 = pilha77.desempilha();
        pilha77.empilha((java.lang.Object) 1);
        int int83 = pilha77.topo;
        java.lang.Object[] objArray84 = pilha77.item;
        int int85 = pilha77.tamanho();
        boolean boolean86 = pilha77.vazia();
        int int87 = pilha77.tamanho();
        java.lang.Object[] objArray88 = pilha77.item;
        java.lang.Object[] objArray89 = pilha77.item;
        pilha0.item = objArray89;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + '#' + "'", obj80, '#');
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray43 = null;
        pilha35.item = objArray43;
        java.lang.Object[] objArray45 = new java.lang.Object[] { pilha27, pilha35 };
        pilha18.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        java.lang.Object[] objArray48 = pilha47.item;
        int int49 = pilha47.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        java.lang.Object[] objArray54 = pilha50.item;
        pilha47.item = objArray54;
        pilha18.item = objArray54;
        pilha0.item = objArray54;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.tamanho();
        pilha58.empilha((java.lang.Object) 0.0d);
        int int62 = pilha58.topo;
        java.lang.Object obj63 = pilha58.desempilha();
        int int64 = pilha58.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0.0d + "'", obj63, 0.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha20.item = objArray28;
        java.lang.Object obj30 = pilha20.desempilha();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        boolean boolean34 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        pilha0.empilha((java.lang.Object) true);
        int int35 = pilha0.tamanho();
        java.lang.Object[] objArray36 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        int int35 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        int int18 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        pilha0.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.empilha((java.lang.Object) '#');
        int int82 = pilha79.tamanho();
        java.lang.Object[] objArray83 = pilha79.item;
        pilha0.item = objArray83;
        boolean boolean85 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        boolean boolean3 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha19.item = objArray28;
        pilha0.item = objArray28;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        int int33 = pilha31.topo;
        java.lang.Object[] objArray34 = pilha31.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        pilha0.topo = 98;
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        java.lang.Object obj34 = pilha18.desempilha();
        java.lang.Object obj35 = pilha18.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 0.0d);
        int int40 = pilha36.topo;
        pilha36.topo = 1;
        pilha18.empilha((java.lang.Object) pilha36);
        int int44 = pilha18.tamanho();
        pilha0.empilha((java.lang.Object) pilha18);
        pilha18.topo = 52;
        java.lang.Object obj48 = pilha18.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = '4';
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.tamanho();
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = (short) 0;
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        int int18 = pilha0.tamanho();
        pilha0.topo = 2;
        java.lang.Object obj21 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        int int27 = pilha18.topo;
        int int28 = pilha18.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object obj31 = pilha25.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        int int38 = pilha32.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha32.item = objArray40;
        java.lang.Object obj42 = pilha32.desempilha();
        java.lang.Object[] objArray43 = pilha32.item;
        pilha25.item = objArray43;
        pilha4.item = objArray43;
        pilha4.topo = 98;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object obj22 = pilha0.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        boolean boolean28 = pilha23.vazia();
        java.lang.Object[] objArray29 = pilha23.item;
        pilha0.item = objArray29;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        pilha8.item = objArray17;
        pilha4.item = objArray17;
        java.lang.Object[] objArray20 = pilha4.item;
        pilha0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        boolean boolean15 = pilha4.vazia();
        pilha4.topo = (byte) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        pilha0.topo = 52;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object obj22 = pilha0.desempilha();
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        boolean boolean33 = pilha28.vazia();
        java.lang.Object[] objArray34 = pilha28.item;
        int int35 = pilha28.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        pilha36.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray44 = null;
        pilha36.item = objArray44;
        pilha36.topo = 100;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        java.lang.Object[] objArray54 = pilha48.item;
        pilha36.item = objArray54;
        pilha28.item = objArray54;
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) '#');
        java.lang.Object obj60 = pilha57.desempilha();
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.topo = '4';
        pilha61.topo = 10;
        boolean boolean66 = pilha61.vazia();
        java.lang.Object[] objArray67 = pilha61.item;
        java.lang.Object[] objArray68 = pilha61.item;
        pilha57.empilha((java.lang.Object) pilha61);
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.topo = '4';
        pilha70.topo = 10;
        java.lang.Object[] objArray75 = pilha70.item;
        java.lang.Object[] objArray76 = pilha70.item;
        pilha70.topo = 1;
        int int79 = pilha70.topo;
        int int80 = pilha70.tamanho();
        pilha61.empilha((java.lang.Object) int80);
        pilha28.empilha((java.lang.Object) pilha61);
        java.lang.Object[] objArray83 = pilha61.item;
        pilha0.empilha((java.lang.Object) objArray83);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + '#' + "'", obj60, '#');
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        int int19 = pilha0.tamanho();
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        int int77 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        int int10 = pilha0.tamanho();
        pilha0.topo = '4';
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        int int19 = pilha13.topo;
        int int20 = pilha13.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object obj27 = pilha21.desempilha();
        int int28 = pilha21.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.topo = '4';
        pilha29.topo = 10;
        java.lang.Object[] objArray34 = pilha29.item;
        pilha21.item = objArray34;
        int int36 = pilha21.topo;
        int int37 = pilha21.topo;
        pilha21.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray40 = pilha21.item;
        pilha13.item = objArray40;
        pilha0.item = objArray40;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        boolean boolean18 = pilha13.vazia();
        java.lang.Object[] objArray19 = pilha13.item;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object obj26 = pilha20.desempilha();
        int int27 = pilha20.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha20.item = objArray33;
        pilha13.item = objArray33;
        pilha13.topo = 'a';
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) 0.0d);
        int int42 = pilha38.topo;
        int int43 = pilha38.tamanho();
        java.lang.Object[] objArray44 = pilha38.item;
        pilha13.item = objArray44;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) 1);
        java.lang.Object obj52 = pilha46.desempilha();
        boolean boolean53 = pilha46.vazia();
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object[] objArray68 = pilha62.item;
        pilha54.item = objArray68;
        boolean boolean70 = pilha54.vazia();
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) '#');
        java.lang.Object obj74 = pilha71.desempilha();
        pilha71.empilha((java.lang.Object) 1);
        pilha71.empilha((java.lang.Object) 0L);
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.topo = '4';
        pilha79.topo = 10;
        java.lang.Object[] objArray84 = pilha79.item;
        java.lang.Object[] objArray85 = pilha79.item;
        pilha71.item = objArray85;
        pilha54.item = objArray85;
        pilha46.item = objArray85;
        pilha13.item = objArray85;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + '#' + "'", obj74, '#');
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        pilha0.topo = (-1);
        pilha0.topo = (short) 10;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha0.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        java.lang.Object[] objArray38 = pilha31.item;
        pilha27.empilha((java.lang.Object) pilha31);
        pilha0.empilha((java.lang.Object) pilha27);
        java.lang.Object obj41 = pilha27.desempilha();
        java.lang.Class<?> wildcardClass42 = pilha27.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        int int41 = pilha35.topo;
        int int42 = pilha35.tamanho();
        java.lang.Object obj43 = pilha35.desempilha();
        boolean boolean44 = pilha35.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object[] objArray59 = pilha53.item;
        pilha45.item = objArray59;
        boolean boolean61 = pilha45.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.topo = '4';
        pilha70.topo = 10;
        java.lang.Object[] objArray75 = pilha70.item;
        java.lang.Object[] objArray76 = pilha70.item;
        pilha62.item = objArray76;
        pilha45.item = objArray76;
        pilha35.item = objArray76;
        java.lang.Object[] objArray80 = pilha35.item;
        pilha0.item = objArray80;
        java.lang.Object obj82 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 1 + "'", obj43, 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        int int26 = pilha0.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        boolean boolean33 = pilha27.vazia();
        int int34 = pilha27.topo;
        pilha27.topo = (byte) 1;
        java.lang.Object[] objArray37 = pilha27.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        java.lang.Object[] objArray42 = pilha38.item;
        pilha27.item = objArray42;
        pilha0.item = objArray42;
        pilha0.topo = (short) -1;
        pilha0.topo = '4';
        java.lang.Class<?> wildcardClass49 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        int int9 = pilha0.topo;
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        pilha8.item = objArray17;
        int int19 = pilha8.tamanho();
        pilha8.topo = (-1);
        pilha8.topo = (short) 10;
        pilha0.empilha((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        pilha33.topo = 'a';
        java.lang.Object[] objArray57 = pilha33.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        int int13 = pilha11.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) '#');
        java.lang.Object obj17 = pilha14.desempilha();
        java.lang.Object[] objArray18 = pilha14.item;
        pilha11.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        java.lang.Object[] objArray30 = pilha20.item;
        int int31 = pilha20.topo;
        java.lang.Object[] objArray32 = pilha20.item;
        int int33 = pilha20.topo;
        pilha11.empilha((java.lang.Object) pilha20);
        java.lang.Object obj35 = pilha11.desempilha();
        int int36 = pilha11.topo;
        boolean boolean37 = pilha11.vazia();
        int int38 = pilha11.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        int int41 = pilha39.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) '#');
        java.lang.Object obj45 = pilha42.desempilha();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha39.item = objArray46;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) '#');
        java.lang.Object obj51 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1);
        pilha48.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray56 = null;
        pilha48.item = objArray56;
        java.lang.Object[] objArray58 = pilha48.item;
        int int59 = pilha48.topo;
        java.lang.Object[] objArray60 = pilha48.item;
        int int61 = pilha48.topo;
        pilha39.empilha((java.lang.Object) pilha48);
        int int63 = pilha48.tamanho();
        pilha11.empilha((java.lang.Object) pilha48);
        pilha48.topo = 97;
        pilha0.empilha((java.lang.Object) pilha48);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertNull(objArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        int int25 = pilha4.tamanho();
        int int26 = pilha4.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        int int9 = pilha0.topo;
        int int10 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        pilha0.item = objArray44;
        int int47 = pilha0.topo;
        java.lang.Object obj48 = pilha0.desempilha();
        pilha0.topo = 99;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        java.lang.Object[] objArray35 = pilha0.item;
        java.lang.Class<?> wildcardClass36 = objArray35.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int24 = pilha9.tamanho();
        java.lang.Class<?> wildcardClass25 = pilha9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        pilha0.topo = 3;
        int int36 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        pilha0.topo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) 1);
        pilha4.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray12 = null;
        pilha4.item = objArray12;
        pilha4.topo = 100;
        int int16 = pilha4.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha4.item = objArray30;
        pilha0.item = objArray30;
        int int34 = pilha0.topo;
        pilha0.topo = '4';
        java.lang.Object[] objArray37 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        boolean boolean12 = pilha0.vazia();
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        java.lang.Object[] objArray20 = pilha0.item;
        pilha0.topo = 'a';
        int int23 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        int int16 = pilha10.topo;
        java.lang.Object[] objArray17 = pilha10.item;
        int int18 = pilha10.tamanho();
        int int19 = pilha10.tamanho();
        pilha10.topo = (short) 100;
        pilha0.empilha((java.lang.Object) pilha10);
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha17.item = objArray26;
        pilha13.item = objArray26;
        pilha13.topo = (byte) -1;
        int int31 = pilha13.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha32.item = objArray41;
        pilha13.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        int int50 = pilha44.tamanho();
        int int51 = pilha44.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object obj58 = pilha52.desempilha();
        int int59 = pilha52.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        pilha52.item = objArray65;
        pilha44.item = objArray65;
        pilha13.item = objArray65;
        pilha0.empilha((java.lang.Object) pilha13);
        java.lang.Class<?> wildcardClass70 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        pilha20.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha20.item = objArray38;
        pilha0.item = objArray38;
        java.lang.Object[] objArray41 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha44.topo = (byte) -1;
        pilha44.topo = 0;
        java.lang.Object[] objArray54 = pilha44.item;
        pilha0.empilha((java.lang.Object) pilha44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        pilha13.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray21 = null;
        pilha13.item = objArray21;
        java.lang.Object[] objArray23 = pilha13.item;
        int int24 = pilha13.topo;
        java.lang.Object[] objArray25 = pilha13.item;
        int int26 = pilha13.topo;
        int int27 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int27);
        java.lang.Class<?> wildcardClass29 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        boolean boolean33 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        boolean boolean16 = pilha11.vazia();
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha7.empilha((java.lang.Object) pilha11);
        pilha0.empilha((java.lang.Object) pilha11);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object obj42 = pilha36.desempilha();
        int int43 = pilha36.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha36.item = objArray49;
        pilha19.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Object obj54 = null;
        pilha0.empilha(obj54);
        java.lang.Object[] objArray56 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        int int26 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        int int30 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray33 = pilha0.item;
        java.lang.Object[] objArray34 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        boolean boolean24 = pilha8.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha25.item = objArray39;
        pilha8.item = objArray39;
        pilha0.item = objArray39;
        boolean boolean43 = pilha0.vazia();
        int int44 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        int int25 = pilha4.tamanho();
        java.lang.Object[] objArray26 = pilha4.item;
        java.lang.Object[] objArray27 = pilha4.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        pilha33.topo = 'a';
        boolean boolean57 = pilha33.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        int int61 = pilha58.tamanho();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.topo = 10;
        pilha33.empilha((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + '#' + "'", obj62, '#');
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) 1);
        int int11 = pilha5.topo;
        int int12 = pilha5.tamanho();
        java.lang.Object obj13 = pilha5.desempilha();
        boolean boolean14 = pilha5.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) 1);
        pilha15.empilha((java.lang.Object) 0L);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha15.item = objArray29;
        boolean boolean31 = pilha15.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) 1);
        pilha32.empilha((java.lang.Object) 0L);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        pilha32.item = objArray46;
        pilha15.item = objArray46;
        pilha5.item = objArray46;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = (short) 10;
        java.lang.Object obj53 = pilha50.desempilha();
        boolean boolean54 = pilha50.vazia();
        pilha5.empilha((java.lang.Object) pilha50);
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        java.lang.Object[] objArray61 = pilha56.item;
        java.lang.Object[] objArray62 = pilha56.item;
        pilha56.topo = 0;
        int int65 = pilha56.tamanho();
        pilha50.empilha((java.lang.Object) pilha56);
        java.lang.Object[] objArray67 = pilha56.item;
        pilha0.item = objArray67;
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        int int8 = pilha6.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        java.lang.Object[] objArray13 = pilha9.item;
        pilha6.item = objArray13;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) 1);
        pilha15.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray23 = null;
        pilha15.item = objArray23;
        java.lang.Object[] objArray25 = pilha15.item;
        int int26 = pilha15.topo;
        java.lang.Object[] objArray27 = pilha15.item;
        int int28 = pilha15.topo;
        pilha6.empilha((java.lang.Object) pilha15);
        java.lang.Object obj30 = pilha6.desempilha();
        int int31 = pilha6.topo;
        boolean boolean32 = pilha6.vazia();
        java.lang.Object[] objArray33 = pilha6.item;
        java.lang.Object[] objArray34 = pilha6.item;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        int int38 = pilha35.tamanho();
        java.lang.Object[] objArray39 = pilha35.item;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        int int46 = pilha40.tamanho();
        java.lang.Object[] objArray47 = pilha40.item;
        pilha35.item = objArray47;
        pilha6.item = objArray47;
        pilha0.item = objArray47;
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray52 = pilha51.item;
        pilha51.topo = (short) 0;
        java.lang.Object[] objArray55 = pilha51.item;
        java.lang.Object[] objArray56 = pilha51.item;
        pilha0.empilha((java.lang.Object) objArray56);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha20.item = objArray28;
        java.lang.Object obj30 = pilha20.desempilha();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Object obj34 = pilha0.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        pilha0.item = objArray36;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha6.item = objArray20;
        java.lang.Object obj22 = pilha6.desempilha();
        java.lang.Object obj23 = pilha6.desempilha();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) 0.0d);
        int int28 = pilha24.topo;
        pilha24.topo = 1;
        pilha6.empilha((java.lang.Object) pilha24);
        java.lang.Object obj32 = pilha24.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.topo = '4';
        pilha34.topo = 10;
        java.lang.Object[] objArray39 = pilha34.item;
        pilha33.item = objArray39;
        pilha24.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) '#');
        java.lang.Object obj45 = pilha42.desempilha();
        pilha42.empilha((java.lang.Object) 1);
        pilha42.empilha((java.lang.Object) 0L);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = '4';
        pilha50.topo = 10;
        java.lang.Object[] objArray55 = pilha50.item;
        java.lang.Object[] objArray56 = pilha50.item;
        pilha42.item = objArray56;
        int int58 = pilha42.tamanho();
        pilha42.topo = (short) 100;
        pilha24.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        int int68 = pilha62.tamanho();
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray70 = pilha69.item;
        pilha62.item = objArray70;
        java.lang.Object obj72 = pilha62.desempilha();
        java.lang.Object[] objArray73 = pilha62.item;
        pilha24.empilha((java.lang.Object) objArray73);
        pilha0.item = objArray73;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        java.lang.Object[] objArray53 = pilha49.item;
        pilha46.item = objArray53;
        pilha17.item = objArray53;
        pilha0.item = objArray53;
        int int57 = pilha0.topo;
        pilha0.topo = 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object obj11 = pilha5.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        int int18 = pilha12.tamanho();
        java.lang.Object[] objArray19 = pilha12.item;
        pilha5.empilha((java.lang.Object) objArray19);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) '#');
        java.lang.Object obj24 = pilha21.desempilha();
        java.lang.Object[] objArray25 = pilha21.item;
        pilha5.item = objArray25;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) 0.0d);
        int int31 = pilha27.topo;
        java.lang.Object obj32 = pilha27.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 0;
        pilha27.empilha((java.lang.Object) 0);
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        int int41 = pilha39.topo;
        pilha39.topo = (short) 100;
        java.lang.Object obj44 = pilha39.desempilha();
        java.lang.Object obj45 = pilha39.desempilha();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) 1);
        pilha46.empilha((java.lang.Object) 0L);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.topo = '4';
        pilha54.topo = 10;
        java.lang.Object[] objArray59 = pilha54.item;
        java.lang.Object[] objArray60 = pilha54.item;
        pilha46.item = objArray60;
        int int62 = pilha46.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.topo = '4';
        pilha63.topo = 10;
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object obj69 = pilha63.desempilha();
        int int70 = pilha63.topo;
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.topo = '4';
        pilha71.topo = 10;
        java.lang.Object[] objArray76 = pilha71.item;
        pilha63.item = objArray76;
        pilha46.item = objArray76;
        pilha39.item = objArray76;
        pilha27.item = objArray76;
        java.lang.Class<?> wildcardClass81 = objArray76.getClass();
        pilha5.empilha((java.lang.Object) wildcardClass81);
        pilha0.empilha((java.lang.Object) wildcardClass81);
        java.lang.Object[] objArray84 = pilha0.item;
        int int85 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 11 + "'", int85 == 11);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) 1);
        pilha5.empilha((java.lang.Object) 0L);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha5.item = objArray19;
        java.lang.Object[] objArray21 = pilha5.item;
        java.lang.Object obj22 = pilha5.desempilha();
        java.lang.Object obj23 = pilha5.desempilha();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        int int30 = pilha24.topo;
        boolean boolean31 = pilha24.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) 0.0d);
        int int36 = pilha32.topo;
        java.lang.Object obj37 = pilha32.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 0;
        pilha32.empilha((java.lang.Object) 0);
        pilha32.topo = (byte) 100;
        java.lang.Object obj46 = pilha32.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        java.lang.Object[] objArray51 = pilha47.item;
        pilha32.item = objArray51;
        pilha24.empilha((java.lang.Object) pilha32);
        pilha32.topo = 99;
        pilha5.empilha((java.lang.Object) pilha32);
        pilha0.empilha((java.lang.Object) pilha5);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha19.item = objArray28;
        pilha0.item = objArray28;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        int int37 = pilha31.tamanho();
        int int38 = pilha31.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object obj45 = pilha39.desempilha();
        int int46 = pilha39.topo;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 10;
        java.lang.Object[] objArray52 = pilha47.item;
        pilha39.item = objArray52;
        pilha31.item = objArray52;
        pilha0.item = objArray52;
        java.lang.Object[] objArray56 = pilha0.item;
        java.lang.Object[] objArray57 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        java.lang.Object obj56 = pilha4.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        int int11 = pilha5.tamanho();
        java.lang.Object[] objArray12 = pilha5.item;
        pilha0.item = objArray12;
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        java.lang.Object obj18 = pilha0.desempilha();
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        pilha0.item = objArray44;
        int int47 = pilha0.topo;
        java.lang.Object obj48 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass49 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha7.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) 0.0d);
        int int23 = pilha19.topo;
        java.lang.Object obj24 = pilha19.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 0;
        pilha19.empilha((java.lang.Object) 0);
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        int int33 = pilha31.topo;
        pilha31.topo = (short) 100;
        java.lang.Object obj36 = pilha31.desempilha();
        java.lang.Object obj37 = pilha31.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        pilha38.empilha((java.lang.Object) 0L);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        java.lang.Object[] objArray52 = pilha46.item;
        pilha38.item = objArray52;
        int int54 = pilha38.tamanho();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object obj61 = pilha55.desempilha();
        int int62 = pilha55.topo;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.topo = '4';
        pilha63.topo = 10;
        java.lang.Object[] objArray68 = pilha63.item;
        pilha55.item = objArray68;
        pilha38.item = objArray68;
        pilha31.item = objArray68;
        pilha19.item = objArray68;
        boolean boolean73 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean73);
        pilha0.topo = 9;
        java.lang.Object obj77 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.topo;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = (short) 10;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha11.item = objArray20;
        pilha7.item = objArray20;
        pilha7.topo = (byte) -1;
        pilha4.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        int int28 = pilha26.topo;
        pilha26.topo = (short) 100;
        java.lang.Object obj31 = pilha26.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) 1);
        pilha32.empilha((java.lang.Object) 0L);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        pilha32.item = objArray46;
        boolean boolean48 = pilha32.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        pilha49.empilha((java.lang.Object) 1);
        pilha49.empilha((java.lang.Object) 0L);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.topo = '4';
        pilha57.topo = 10;
        java.lang.Object[] objArray62 = pilha57.item;
        java.lang.Object[] objArray63 = pilha57.item;
        pilha49.item = objArray63;
        pilha32.item = objArray63;
        pilha26.item = objArray63;
        pilha7.item = objArray63;
        pilha0.empilha((java.lang.Object) pilha7);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        int int14 = pilha10.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object obj21 = pilha15.desempilha();
        int int22 = pilha15.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha15.item = objArray28;
        pilha10.item = objArray28;
        pilha0.item = objArray28;
        int int32 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray27 = null;
        pilha19.item = objArray27;
        pilha19.topo = 100;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha19.item = objArray37;
        pilha0.empilha((java.lang.Object) objArray37);
        int int40 = pilha0.topo;
        int int41 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 11 + "'", int41 == 11);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        int int38 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) 1);
        pilha7.empilha((java.lang.Object) 0L);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha7.item = objArray21;
        int int23 = pilha7.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object obj30 = pilha24.desempilha();
        int int31 = pilha24.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        pilha24.item = objArray37;
        pilha7.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object obj41 = pilha0.desempilha();
        int int42 = pilha0.tamanho();
        java.lang.Object[] objArray43 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        pilha0.empilha((java.lang.Object) true);
        int int35 = pilha0.tamanho();
        boolean boolean36 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        pilha1.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray9 = null;
        pilha1.item = objArray9;
        java.lang.Object[] objArray11 = pilha1.item;
        int int12 = pilha1.topo;
        java.lang.Object[] objArray13 = pilha1.item;
        boolean boolean14 = pilha1.vazia();
        int int15 = pilha1.topo;
        pilha0.empilha((java.lang.Object) int15);
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        int int8 = pilha5.topo;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj10 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha7.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) 0.0d);
        int int23 = pilha19.topo;
        java.lang.Object obj24 = pilha19.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 0;
        pilha19.empilha((java.lang.Object) 0);
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        int int33 = pilha31.topo;
        pilha31.topo = (short) 100;
        java.lang.Object obj36 = pilha31.desempilha();
        java.lang.Object obj37 = pilha31.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        pilha38.empilha((java.lang.Object) 0L);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        java.lang.Object[] objArray52 = pilha46.item;
        pilha38.item = objArray52;
        int int54 = pilha38.tamanho();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object obj61 = pilha55.desempilha();
        int int62 = pilha55.topo;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.topo = '4';
        pilha63.topo = 10;
        java.lang.Object[] objArray68 = pilha63.item;
        pilha55.item = objArray68;
        pilha38.item = objArray68;
        pilha31.item = objArray68;
        pilha19.item = objArray68;
        boolean boolean73 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean73);
        java.lang.Class<?> wildcardClass75 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object obj39 = pilha33.desempilha();
        int int40 = pilha33.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha33.item = objArray42;
        int int44 = pilha33.tamanho();
        pilha0.empilha((java.lang.Object) int44);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha46.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha46);
        java.lang.Object[] objArray55 = pilha46.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = 97;
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        java.lang.Object[] objArray34 = pilha0.item;
        java.lang.Object obj35 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        pilha9.topo = (byte) 10;
        int int21 = pilha9.topo;
        pilha9.topo = (byte) 100;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        boolean boolean29 = pilha24.vazia();
        java.lang.Object[] objArray30 = pilha24.item;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object obj37 = pilha31.desempilha();
        int int38 = pilha31.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        pilha31.item = objArray44;
        pilha24.item = objArray44;
        pilha24.topo = 'a';
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        pilha49.empilha((java.lang.Object) 0.0d);
        int int53 = pilha49.topo;
        int int54 = pilha49.tamanho();
        java.lang.Object[] objArray55 = pilha49.item;
        pilha24.item = objArray55;
        int int57 = pilha24.topo;
        java.lang.Object[] objArray58 = pilha24.item;
        pilha9.item = objArray58;
        pilha0.item = objArray58;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        int int23 = pilha8.topo;
        int int24 = pilha8.topo;
        pilha0.empilha((java.lang.Object) pilha8);
        int int26 = pilha8.tamanho();
        int int27 = pilha8.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        int int19 = pilha12.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha12.item = objArray25;
        int int27 = pilha12.topo;
        int int28 = pilha12.topo;
        pilha12.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        pilha31.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray39 = null;
        pilha31.item = objArray39;
        pilha31.topo = 100;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha31.item = objArray49;
        pilha12.empilha((java.lang.Object) objArray49);
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = (byte) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object obj24 = pilha18.desempilha();
        int int25 = pilha18.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        pilha18.item = objArray31;
        int int33 = pilha18.topo;
        int int34 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 100.0d);
        pilha0.empilha((java.lang.Object) pilha18);
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        pilha36.empilha((java.lang.Object) 0L);
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        java.lang.Object[] objArray50 = pilha44.item;
        pilha36.item = objArray50;
        int int52 = pilha36.tamanho();
        pilha36.topo = (short) 100;
        pilha18.empilha((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass56 = pilha18.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        pilha1.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray9 = null;
        pilha1.item = objArray9;
        java.lang.Object[] objArray11 = pilha1.item;
        int int12 = pilha1.topo;
        java.lang.Object[] objArray13 = pilha1.item;
        boolean boolean14 = pilha1.vazia();
        int int15 = pilha1.topo;
        pilha0.empilha((java.lang.Object) int15);
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        pilha18.topo = (short) -1;
        int int26 = pilha18.tamanho();
        pilha0.empilha((java.lang.Object) int26);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 2 + "'", obj17, 2);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) 1);
        pilha7.empilha((java.lang.Object) 0L);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha7.item = objArray21;
        int int23 = pilha7.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object obj30 = pilha24.desempilha();
        int int31 = pilha24.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        pilha24.item = objArray37;
        pilha7.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object obj41 = pilha0.desempilha();
        int int42 = pilha0.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) 1);
        pilha43.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray51 = null;
        pilha43.item = objArray51;
        pilha43.topo = 100;
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object[] objArray61 = pilha55.item;
        pilha43.item = objArray61;
        java.lang.Object[] objArray63 = pilha43.item;
        pilha0.item = objArray63;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        int int8 = pilha5.topo;
        pilha0.empilha((java.lang.Object) pilha5);
        pilha5.topo = (-1);
        boolean boolean12 = pilha5.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        int int11 = pilha5.tamanho();
        java.lang.Object[] objArray12 = pilha5.item;
        pilha0.item = objArray12;
        pilha0.topo = 9;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object[] objArray18 = pilha0.item;
        pilha0.topo = 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        boolean boolean56 = pilha4.vazia();
        java.lang.Object obj57 = pilha4.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        int int55 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11 + "'", int55 == 11);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        pilha0.topo = 11;
        boolean boolean10 = pilha0.vazia();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        pilha13.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray21 = null;
        pilha13.item = objArray21;
        java.lang.Object[] objArray23 = pilha13.item;
        int int24 = pilha13.topo;
        java.lang.Object[] objArray25 = pilha13.item;
        int int26 = pilha13.topo;
        int int27 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int27);
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = (-1);
        java.lang.Object[] objArray27 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        pilha0.empilha((java.lang.Object) 3);
        int int22 = pilha0.topo;
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        boolean boolean16 = pilha4.vazia();
        boolean boolean17 = pilha4.vazia();
        int int18 = pilha4.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = pilha0.desempilha();
        int int19 = pilha0.topo;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        java.lang.Object[] objArray17 = pilha0.item;
        int int18 = pilha0.tamanho();
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        pilha15.item = objArray24;
        pilha11.item = objArray24;
        pilha0.item = objArray24;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        int int30 = pilha28.topo;
        pilha28.topo = (short) 100;
        java.lang.Object obj33 = pilha28.desempilha();
        java.lang.Object obj34 = pilha28.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        int int51 = pilha35.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object obj58 = pilha52.desempilha();
        int int59 = pilha52.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        pilha52.item = objArray65;
        pilha35.item = objArray65;
        pilha28.item = objArray65;
        pilha0.item = objArray65;
        boolean boolean70 = pilha0.vazia();
        java.lang.Object[] objArray71 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        java.lang.Object[] objArray49 = pilha20.item;
        pilha13.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Object obj52 = pilha0.desempilha();
        int int53 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        boolean boolean12 = pilha6.vazia();
        int int13 = pilha6.topo;
        pilha6.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        java.lang.Object obj46 = pilha17.desempilha();
        java.lang.Object obj47 = null;
        pilha17.empilha(obj47);
        boolean boolean49 = pilha17.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        java.lang.Object[] objArray52 = pilha50.item;
        pilha17.item = objArray52;
        pilha6.item = objArray52;
        boolean boolean55 = pilha6.vazia();
        pilha6.topo = '#';
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.topo;
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 0;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha10.item = objArray21;
        pilha0.empilha((java.lang.Object) objArray21);
        int int24 = pilha0.topo;
        java.lang.Object obj25 = pilha0.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        boolean boolean31 = pilha26.vazia();
        java.lang.Object[] objArray32 = pilha26.item;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object obj39 = pilha33.desempilha();
        int int40 = pilha33.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        java.lang.Object[] objArray46 = pilha41.item;
        pilha33.item = objArray46;
        pilha26.item = objArray46;
        pilha26.topo = 'a';
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        pilha51.empilha((java.lang.Object) 0.0d);
        int int55 = pilha51.topo;
        int int56 = pilha51.tamanho();
        java.lang.Object[] objArray57 = pilha51.item;
        pilha26.item = objArray57;
        pilha0.item = objArray57;
        java.lang.Class<?> wildcardClass60 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        pilha9.item = objArray18;
        pilha0.item = objArray18;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.topo;
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.topo;
        java.lang.Object[] objArray14 = pilha0.item;
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        boolean boolean16 = pilha10.vazia();
        int int17 = pilha10.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray43 = null;
        pilha35.item = objArray43;
        java.lang.Object[] objArray45 = new java.lang.Object[] { pilha27, pilha35 };
        pilha18.item = objArray45;
        pilha10.item = objArray45;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        java.lang.Object obj54 = pilha48.desempilha();
        int int55 = pilha48.topo;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        pilha48.item = objArray57;
        pilha10.item = objArray57;
        pilha0.empilha((java.lang.Object) objArray57);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        pilha61.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) '#');
        java.lang.Object obj68 = pilha65.desempilha();
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.topo = '4';
        pilha69.topo = 10;
        java.lang.Object[] objArray74 = pilha69.item;
        pilha65.item = objArray74;
        pilha61.item = objArray74;
        java.lang.Object[] objArray77 = pilha61.item;
        pilha61.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha61);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + '#' + "'", obj68, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        int int30 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        pilha0.topo = 10;
        pilha0.topo = 9;
        java.lang.Class<?> wildcardClass37 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        boolean boolean3 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha0.item = objArray20;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 0.0d);
        int int26 = pilha22.topo;
        java.lang.Object obj27 = pilha22.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 0;
        pilha22.empilha((java.lang.Object) 0);
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray35 = pilha34.item;
        int int36 = pilha34.topo;
        pilha34.topo = (short) 100;
        java.lang.Object obj39 = pilha34.desempilha();
        java.lang.Object obj40 = pilha34.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        int int57 = pilha41.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = '4';
        pilha58.topo = 10;
        java.lang.Object[] objArray63 = pilha58.item;
        java.lang.Object obj64 = pilha58.desempilha();
        int int65 = pilha58.topo;
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        pilha58.item = objArray71;
        pilha41.item = objArray71;
        pilha34.item = objArray71;
        pilha22.item = objArray71;
        java.lang.Class<?> wildcardClass76 = objArray71.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass76);
        int int78 = pilha0.tamanho();
        int int79 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 11 + "'", int78 == 11);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 11 + "'", int79 == 11);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        pilha9.topo = 100;
        boolean boolean21 = pilha9.vazia();
        pilha9.topo = (short) -1;
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1);
        pilha11.empilha((java.lang.Object) 0L);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        java.lang.Object[] objArray25 = pilha19.item;
        pilha11.item = objArray25;
        java.lang.Object obj27 = pilha11.desempilha();
        java.lang.Object obj28 = pilha11.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 0.0d);
        int int33 = pilha29.topo;
        pilha29.topo = 1;
        pilha11.empilha((java.lang.Object) pilha29);
        int int37 = pilha11.tamanho();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        boolean boolean44 = pilha38.vazia();
        int int45 = pilha38.topo;
        pilha38.topo = (byte) 1;
        java.lang.Object[] objArray48 = pilha38.item;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        java.lang.Object[] objArray53 = pilha49.item;
        pilha38.item = objArray53;
        pilha11.item = objArray53;
        pilha0.item = objArray53;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        pilha0.topo = (-1);
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) 0.0d);
        int int12 = pilha8.topo;
        java.lang.Object obj13 = pilha8.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 0;
        pilha8.empilha((java.lang.Object) 0);
        pilha8.topo = (byte) 100;
        java.lang.Object obj22 = pilha8.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha8.item = objArray27;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.topo = '4';
        pilha30.topo = 10;
        java.lang.Object[] objArray35 = pilha30.item;
        java.lang.Object obj36 = pilha30.desempilha();
        int int37 = pilha30.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        pilha30.item = objArray43;
        int int45 = pilha30.topo;
        int int46 = pilha30.topo;
        pilha30.empilha((java.lang.Object) 100.0d);
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass50 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        int int16 = pilha9.topo;
        int int17 = pilha9.topo;
        int int18 = pilha9.topo;
        boolean boolean19 = pilha9.vazia();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        int int24 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
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
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        pilha0.topo = 11;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        int int32 = pilha29.tamanho();
        java.lang.Object[] objArray33 = pilha29.item;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.topo = '4';
        pilha34.topo = 10;
        java.lang.Object[] objArray39 = pilha34.item;
        int int40 = pilha34.tamanho();
        java.lang.Object[] objArray41 = pilha34.item;
        pilha29.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) '#');
        java.lang.Object obj47 = pilha44.desempilha();
        pilha44.empilha((java.lang.Object) 1);
        boolean boolean50 = pilha44.vazia();
        int int51 = pilha44.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) '#');
        java.lang.Object obj55 = pilha52.desempilha();
        pilha52.empilha((java.lang.Object) 1);
        int int58 = pilha52.topo;
        pilha52.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) '#');
        java.lang.Object obj64 = pilha61.desempilha();
        pilha61.empilha((java.lang.Object) 1);
        pilha61.empilha((java.lang.Object) 0L);
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.empilha((java.lang.Object) '#');
        java.lang.Object obj72 = pilha69.desempilha();
        pilha69.empilha((java.lang.Object) 1);
        pilha69.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray77 = null;
        pilha69.item = objArray77;
        java.lang.Object[] objArray79 = new java.lang.Object[] { pilha61, pilha69 };
        pilha52.item = objArray79;
        pilha44.item = objArray79;
        pilha0.item = objArray79;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '#' + "'", obj47, '#');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + '#' + "'", obj55, '#');
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + '#' + "'", obj64, '#');
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + '#' + "'", obj72, '#');
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        int int13 = pilha11.topo;
        pilha11.topo = (short) 100;
        java.lang.Object obj16 = pilha11.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        boolean boolean33 = pilha17.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha34.item = objArray48;
        pilha17.item = objArray48;
        pilha11.item = objArray48;
        boolean boolean52 = pilha11.vazia();
        java.lang.Class<?> wildcardClass53 = pilha11.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        int int30 = pilha24.topo;
        boolean boolean31 = pilha24.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object obj38 = pilha32.desempilha();
        int int39 = pilha32.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        pilha32.item = objArray45;
        int int47 = pilha32.topo;
        int int48 = pilha32.topo;
        pilha24.empilha((java.lang.Object) pilha32);
        java.lang.Object[] objArray50 = pilha32.item;
        pilha0.item = objArray50;
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        int int54 = pilha52.topo;
        pilha52.topo = (short) 100;
        java.lang.Object obj57 = pilha52.desempilha();
        java.lang.Object obj58 = pilha52.desempilha();
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        pilha59.empilha((java.lang.Object) 0.0d);
        int int63 = pilha59.topo;
        java.lang.Object obj64 = pilha59.desempilha();
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.topo = '4';
        pilha65.topo = 0;
        pilha59.empilha((java.lang.Object) 0);
        pilha52.empilha((java.lang.Object) pilha59);
        int int72 = pilha52.topo;
        boolean boolean73 = pilha52.vazia();
        int int74 = pilha52.topo;
        ds.Pilha pilha75 = new ds.Pilha();
        pilha75.topo = '4';
        pilha75.topo = 10;
        java.lang.Object[] objArray80 = pilha75.item;
        java.lang.Object[] objArray81 = pilha75.item;
        pilha75.topo = 0;
        pilha75.topo = 0;
        pilha52.empilha((java.lang.Object) 0);
        ds.Pilha pilha87 = new ds.Pilha();
        pilha87.topo = '4';
        pilha87.topo = '#';
        java.lang.Object[] objArray92 = pilha87.item;
        pilha52.item = objArray92;
        pilha0.empilha((java.lang.Object) objArray92);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0.0d + "'", obj64, 0.0d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 99 + "'", int72 == 99);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 99 + "'", int74 == 99);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        pilha20.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha20.item = objArray38;
        pilha0.item = objArray38;
        java.lang.Object[] objArray41 = pilha0.item;
        java.lang.Object[] objArray42 = pilha0.item;
        int int43 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 99 + "'", int43 == 99);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (-1);
        int int19 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        pilha1.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray9 = null;
        pilha1.item = objArray9;
        java.lang.Object[] objArray11 = pilha1.item;
        int int12 = pilha1.topo;
        java.lang.Object[] objArray13 = pilha1.item;
        boolean boolean14 = pilha1.vazia();
        int int15 = pilha1.topo;
        pilha0.empilha((java.lang.Object) int15);
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = null;
        pilha0.empilha(obj18);
        int int20 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 2 + "'", obj17, 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        pilha0.topo = 10;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        int int27 = pilha18.topo;
        boolean boolean28 = pilha18.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        int int51 = pilha45.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha7.topo = (byte) 100;
        java.lang.Object obj21 = pilha7.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha7.item = objArray26;
        pilha0.item = objArray26;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        boolean boolean7 = pilha1.vazia();
        int int8 = pilha1.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        int int15 = pilha9.topo;
        pilha9.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray34 = null;
        pilha26.item = objArray34;
        java.lang.Object[] objArray36 = new java.lang.Object[] { pilha18, pilha26 };
        pilha9.item = objArray36;
        pilha1.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Class<?> wildcardClass40 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) 1);
        pilha2.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray10 = null;
        pilha2.item = objArray10;
        pilha2.topo = 100;
        int int14 = pilha2.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object obj21 = pilha15.desempilha();
        int int22 = pilha15.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha15.item = objArray28;
        pilha2.item = objArray28;
        pilha2.topo = (byte) 100;
        pilha0.empilha((java.lang.Object) pilha2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 10;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        int int9 = pilha7.topo;
        pilha7.topo = (short) 100;
        java.lang.Object obj12 = pilha7.desempilha();
        int int13 = pilha7.topo;
        java.lang.Object obj14 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj16 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
    }
}

