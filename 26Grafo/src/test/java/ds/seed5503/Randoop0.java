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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo1.existeAresta((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.existeAresta((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo5.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.listaAdjVazia(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 0, (int) (short) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo1.existeAresta((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        grafo1.prox = intArray16;
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta46 = grafo1.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        boolean boolean12 = grafo1.existeAresta((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta(0, (int) (byte) -1);
        boolean boolean8 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 0);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo(10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        boolean boolean14 = grafo1.existeAresta((int) '#', 0);
        boolean boolean17 = grafo1.existeAresta((int) '4', (int) (short) 10);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta46 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 0, (int) '4');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        grafo1.imprime();
        java.lang.Class<?> wildcardClass46 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = grafo5.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        grafo5.imprime();
        int[] intArray41 = grafo5.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta43 = grafo5.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        int[] intArray10 = null;
        grafo1.cab = intArray10;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo5.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo5.insereAresta((int) (byte) 100, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 0, 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        grafo1.insereAresta(0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo5.retiraAresta(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        grafo5.imprime();
        int[] intArray41 = grafo5.cab;
        java.lang.Class<?> wildcardClass42 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta(10, (int) ' ');
        ds.Grafo grafo26 = grafo22.grafoTransposto();
        int[] intArray27 = null;
        grafo26.cab = intArray27;
        int[] intArray29 = null;
        grafo26.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) ' ');
        grafo32.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo41 = new ds.Grafo(0);
        grafo41.imprime();
        int[] intArray47 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo41.prox = intArray47;
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        grafo41.prox = intArray56;
        grafo32.cab = intArray56;
        grafo26.prox = intArray56;
        grafo20.cab = intArray56;
        grafo5.peso = intArray56;
        int[] intArray63 = grafo5.peso;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        java.lang.Class<?> wildcardClass18 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        java.lang.Class<?> wildcardClass57 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        boolean boolean5 = grafo1.listaAdjVazia(97);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) 'a', (int) (byte) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo5.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) ' ');
        int int17 = grafo14.numVertices();
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        ds.Grafo grafo27 = new ds.Grafo(0);
        grafo27.imprime();
        int[] intArray33 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo27.prox = intArray33;
        grafo23.prox = intArray33;
        ds.Grafo grafo37 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta40 = grafo37.retiraAresta(10, (int) ' ');
        ds.Grafo grafo41 = grafo37.grafoTransposto();
        int[] intArray42 = null;
        grafo41.cab = intArray42;
        int[] intArray44 = null;
        grafo41.cab = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta(10, (int) ' ');
        grafo47.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        ds.Grafo grafo65 = new ds.Grafo(0);
        grafo65.imprime();
        int[] intArray71 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo65.prox = intArray71;
        grafo56.prox = intArray71;
        grafo47.cab = intArray71;
        grafo41.prox = intArray71;
        grafo23.prox = intArray71;
        grafo14.prox = intArray71;
        ds.Grafo grafo79 = new ds.Grafo(0);
        grafo79.imprime();
        int[] intArray85 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo79.prox = intArray85;
        grafo14.prox = intArray85;
        grafo1.prox = intArray85;
        java.lang.Class<?> wildcardClass89 = intArray85.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) ' ', (-1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = grafo1.existeAresta(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo5.cab = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo5.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 10, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) ' ');
        int int17 = grafo14.numVertices();
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        ds.Grafo grafo27 = new ds.Grafo(0);
        grafo27.imprime();
        int[] intArray33 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo27.prox = intArray33;
        grafo23.prox = intArray33;
        ds.Grafo grafo37 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta40 = grafo37.retiraAresta(10, (int) ' ');
        ds.Grafo grafo41 = grafo37.grafoTransposto();
        int[] intArray42 = null;
        grafo41.cab = intArray42;
        int[] intArray44 = null;
        grafo41.cab = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta(10, (int) ' ');
        grafo47.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        ds.Grafo grafo65 = new ds.Grafo(0);
        grafo65.imprime();
        int[] intArray71 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo65.prox = intArray71;
        grafo56.prox = intArray71;
        grafo47.cab = intArray71;
        grafo41.prox = intArray71;
        grafo23.prox = intArray71;
        grafo14.prox = intArray71;
        ds.Grafo grafo79 = new ds.Grafo(0);
        grafo79.imprime();
        int[] intArray85 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo79.prox = intArray85;
        grafo14.prox = intArray85;
        grafo1.prox = intArray85;
        java.lang.Class<?> wildcardClass89 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta(0, (int) (byte) 0);
        grafo5.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        grafo1.imprime();
        java.lang.Class<?> wildcardClass58 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta77 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo18.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        ds.Grafo grafo18 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta(10, (int) ' ');
        grafo18.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo27 = new ds.Grafo(0);
        grafo27.imprime();
        int[] intArray33 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo27.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo(0);
        grafo36.imprime();
        int[] intArray42 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo36.prox = intArray42;
        grafo27.prox = intArray42;
        grafo18.cab = intArray42;
        grafo1.prox = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta49 = grafo1.retiraAresta(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 32, -1, 32]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 10, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        int int46 = aresta45.v2();
        int int47 = aresta45.v2();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo48 = grafo47.grafoTransposto();
        java.lang.Class<?> wildcardClass49 = grafo48.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) 1, (-1));
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia((int) 'a');
        boolean boolean11 = grafo5.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        int[] intArray18 = grafo10.prox;
        int[] intArray19 = grafo10.prox;
        grafo5.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo5.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, -1, 32]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo5.retiraAresta((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        grafo1.imprime();
        int int46 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = new ds.Grafo(0);
        grafo13.imprime();
        grafo13.imprime();
        ds.Grafo grafo17 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta(10, (int) ' ');
        ds.Grafo grafo21 = grafo17.grafoTransposto();
        int[] intArray22 = null;
        grafo21.cab = intArray22;
        int[] intArray24 = null;
        grafo21.cab = intArray24;
        ds.Grafo grafo27 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta(10, (int) ' ');
        grafo27.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo36 = new ds.Grafo(0);
        grafo36.imprime();
        int[] intArray42 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo36.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo(0);
        grafo45.imprime();
        int[] intArray51 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo45.prox = intArray51;
        grafo36.prox = intArray51;
        grafo27.cab = intArray51;
        grafo21.prox = intArray51;
        grafo13.prox = intArray51;
        grafo1.cab = intArray51;
        java.lang.Class<?> wildcardClass58 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        boolean boolean62 = grafo5.listaAdjVazia((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo5.insereAresta((-1), 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray9 = new int[] { 100, (short) 10, '4' };
        grafo5.prox = intArray9;
        ds.Grafo grafo11 = grafo5.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo5.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        java.lang.Class<?> wildcardClass76 = intArray68.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        int int10 = grafo1.numVertices();
        ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, 100);
        boolean boolean15 = grafo1.existeAresta((int) (byte) 100, (-1));
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        grafo5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta42 = grafo5.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        ds.Grafo grafo8 = new ds.Grafo((int) '#');
        ds.Grafo grafo10 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(10, (int) ' ');
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        int[] intArray15 = null;
        grafo14.cab = intArray15;
        ds.Grafo grafo18 = new ds.Grafo(0);
        grafo18.imprime();
        int[] intArray24 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo18.prox = intArray24;
        grafo14.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray35 = null;
        grafo32.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        grafo38.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo47.prox = intArray62;
        grafo38.cab = intArray62;
        grafo32.prox = intArray62;
        grafo14.prox = intArray62;
        grafo8.cab = intArray62;
        boolean boolean71 = grafo8.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo73 = new ds.Grafo(0);
        grafo73.imprime();
        int[] intArray79 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo73.prox = intArray79;
        grafo8.peso = intArray79;
        grafo5.cab = intArray79;
        ds.Grafo.Aresta aresta85 = grafo5.retiraAresta(97, 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta85);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        boolean boolean11 = grafo1.existeAresta((int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        grafo1.imprime();
        ds.Grafo grafo46 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = grafo1.listaAdjVazia((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo46);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo8.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 0);
        boolean boolean10 = grafo1.existeAresta(0, (int) (byte) 100);
        grafo1.imprime();
        ds.Grafo grafo13 = new ds.Grafo(0);
        grafo13.imprime();
        int[] intArray19 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo13.prox = intArray19;
        int int21 = grafo13.numVertices();
        ds.Grafo grafo23 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta26 = grafo23.retiraAresta(10, (int) ' ');
        ds.Grafo grafo27 = grafo23.grafoTransposto();
        int[] intArray31 = new int[] { 100, (short) 10, '4' };
        grafo27.prox = intArray31;
        grafo13.prox = intArray31;
        grafo1.prox = intArray31;
        java.lang.Class<?> wildcardClass35 = intArray31.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo60.primeiroListaAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        int[] intArray16 = null;
        grafo15.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo(0);
        grafo19.imprime();
        int[] intArray25 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo19.prox = intArray25;
        grafo15.prox = intArray25;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        ds.Grafo grafo33 = grafo29.grafoTransposto();
        int[] intArray34 = null;
        grafo33.cab = intArray34;
        int[] intArray36 = null;
        grafo33.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta42 = grafo39.retiraAresta(10, (int) ' ');
        grafo39.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo48 = new ds.Grafo(0);
        grafo48.imprime();
        int[] intArray54 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo48.prox = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        grafo57.imprime();
        int[] intArray63 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo57.prox = intArray63;
        grafo48.prox = intArray63;
        grafo39.cab = intArray63;
        grafo33.prox = intArray63;
        grafo15.prox = intArray63;
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray77 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo70.cab = intArray77;
        grafo15.prox = intArray77;
        grafo8.prox = intArray77;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = grafo8.existeAresta((int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray9 = new int[] { 100, (short) 10, '4' };
        grafo5.prox = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo5.retiraAresta(0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 52]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo(0);
        grafo71.imprime();
        int[] intArray77 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo71.prox = intArray77;
        grafo62.prox = intArray77;
        grafo5.peso = intArray77;
        java.lang.Class<?> wildcardClass81 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) '#', (int) (short) 0);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        boolean boolean78 = grafo76.listaAdjVazia((int) ' ');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo19 = grafo5.grafoTransposto();
        grafo5.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta59 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        boolean boolean11 = grafo1.existeAresta((int) ' ', 100);
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        int[] intArray18 = null;
        grafo17.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo(0);
        grafo21.imprime();
        int[] intArray27 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo21.prox = intArray27;
        grafo17.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) ' ');
        int int34 = grafo31.numVertices();
        ds.Grafo.Aresta aresta37 = grafo31.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo38 = grafo31.grafoTransposto();
        ds.Grafo.Aresta aresta41 = grafo31.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        grafo43.imprime();
        ds.Grafo grafo47 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta(10, (int) ' ');
        ds.Grafo grafo51 = grafo47.grafoTransposto();
        int[] intArray52 = null;
        grafo51.cab = intArray52;
        int[] intArray54 = null;
        grafo51.cab = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta60 = grafo57.retiraAresta(10, (int) ' ');
        grafo57.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray81 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo75.prox = intArray81;
        grafo66.prox = intArray81;
        grafo57.cab = intArray81;
        grafo51.prox = intArray81;
        grafo43.prox = intArray81;
        grafo31.cab = intArray81;
        grafo17.cab = intArray81;
        grafo1.prox = intArray81;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        boolean boolean49 = grafo1.listaAdjVazia((int) '4');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo76.retiraAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo76);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        int[] intArray60 = grafo5.cab;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = grafo5.existeAresta(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray60);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        boolean boolean15 = grafo1.existeAresta((int) ' ', (int) (byte) -1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta19 = grafo1.retiraAresta(100, (int) (short) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        grafo1.imprime();
        ds.Grafo.Aresta aresta64 = grafo1.proxAdj((int) (byte) 0);
        int[] intArray65 = grafo1.cab;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 32, -1, 32]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo49 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta52 = grafo49.retiraAresta(10, (int) ' ');
        ds.Grafo grafo53 = grafo49.grafoTransposto();
        boolean boolean56 = grafo53.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        int[] intArray66 = grafo58.prox;
        int[] intArray67 = grafo58.prox;
        grafo53.prox = intArray67;
        grafo1.cab = intArray67;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo8.primeiroListaAdj(0);
        java.lang.Class<?> wildcardClass15 = grafo8.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        boolean boolean3 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        boolean boolean50 = grafo1.existeAresta(10, 97);
        grafo1.imprime();
        ds.Grafo grafo53 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, (int) ' ');
        ds.Grafo grafo57 = grafo53.grafoTransposto();
        int[] intArray58 = null;
        grafo57.cab = intArray58;
        ds.Grafo grafo61 = new ds.Grafo(0);
        grafo61.imprime();
        int[] intArray67 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo61.prox = intArray67;
        grafo57.prox = intArray67;
        grafo1.prox = intArray67;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray9 = new int[] { 100, (short) 10, '4' };
        grafo5.prox = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo5.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 52]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) 'a', (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 0, (int) (short) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo60.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        boolean boolean12 = grafo5.existeAresta((int) (byte) 0, 10);
        grafo5.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
        int int10 = grafo7.numVertices();
        ds.Grafo grafo12 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) ' ');
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        grafo16.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray37 = null;
        grafo34.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta(10, (int) ' ');
        grafo40.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        grafo49.prox = intArray64;
        grafo40.cab = intArray64;
        grafo34.prox = intArray64;
        grafo16.prox = intArray64;
        grafo7.prox = intArray64;
        grafo1.peso = intArray64;
        int[] intArray72 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta74 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass77 = grafo76.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        boolean boolean49 = grafo1.listaAdjVazia(97);
        ds.Grafo grafo51 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) ' ');
        ds.Grafo grafo55 = grafo51.grafoTransposto();
        grafo51.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean62 = grafo51.existeAresta((int) (short) 100, 100);
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta66 = grafo64.proxAdj((int) ' ');
        ds.Grafo grafo68 = new ds.Grafo(0);
        grafo68.imprime();
        int[] intArray74 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo68.prox = intArray74;
        int[] intArray76 = grafo68.prox;
        grafo64.peso = intArray76;
        grafo51.cab = intArray76;
        grafo1.prox = intArray76;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        boolean boolean64 = grafo1.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        grafo1.peso = intArray72;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta76 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, 100);
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo17 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta(10, (int) ' ');
        ds.Grafo grafo21 = grafo17.grafoTransposto();
        int[] intArray22 = null;
        grafo21.cab = intArray22;
        ds.Grafo grafo25 = new ds.Grafo(0);
        grafo25.imprime();
        int[] intArray31 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo25.prox = intArray31;
        grafo21.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) ' ');
        int int38 = grafo35.numVertices();
        ds.Grafo.Aresta aresta41 = grafo35.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo42 = grafo35.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo35.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        grafo47.imprime();
        ds.Grafo grafo51 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) ' ');
        ds.Grafo grafo55 = grafo51.grafoTransposto();
        int[] intArray56 = null;
        grafo55.cab = intArray56;
        int[] intArray58 = null;
        grafo55.cab = intArray58;
        ds.Grafo grafo61 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta64 = grafo61.retiraAresta(10, (int) ' ');
        grafo61.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray76 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo70.prox = intArray76;
        ds.Grafo grafo79 = new ds.Grafo(0);
        grafo79.imprime();
        int[] intArray85 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo79.prox = intArray85;
        grafo70.prox = intArray85;
        grafo61.cab = intArray85;
        grafo55.prox = intArray85;
        grafo47.prox = intArray85;
        grafo35.cab = intArray85;
        grafo21.cab = intArray85;
        grafo1.cab = intArray85;
        int[] intArray94 = grafo1.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 32, -1, 32]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta80 = grafo77.retiraAresta(10, (int) ' ');
        ds.Grafo grafo81 = grafo77.grafoTransposto();
        int[] intArray82 = null;
        grafo81.cab = intArray82;
        ds.Grafo grafo85 = new ds.Grafo(0);
        grafo85.imprime();
        int[] intArray91 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo85.prox = intArray91;
        grafo81.prox = intArray91;
        grafo1.prox = intArray91;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta97 = grafo1.retiraAresta((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 32, -1, 32]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (-1));
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        int int77 = grafo76.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (short) 1, (int) (byte) 10);
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 0, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) ' ');
        int int17 = grafo14.numVertices();
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo21 = grafo14.grafoTransposto();
        ds.Grafo grafo22 = grafo21.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo(0);
        grafo32.imprime();
        int[] intArray38 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo32.prox = intArray38;
        grafo28.prox = intArray38;
        ds.Grafo grafo42 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) ' ');
        ds.Grafo grafo46 = grafo42.grafoTransposto();
        int[] intArray47 = null;
        grafo46.cab = intArray47;
        int[] intArray49 = null;
        grafo46.cab = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta(10, (int) ' ');
        grafo52.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo61 = new ds.Grafo(0);
        grafo61.imprime();
        int[] intArray67 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo61.prox = intArray67;
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray76 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo70.prox = intArray76;
        grafo61.prox = intArray76;
        grafo52.cab = intArray76;
        grafo46.prox = intArray76;
        grafo28.prox = intArray76;
        ds.Grafo grafo83 = new ds.Grafo(0);
        grafo83.imprime();
        int[] intArray90 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo83.cab = intArray90;
        grafo28.prox = intArray90;
        grafo21.prox = intArray90;
        grafo1.prox = intArray90;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) '#');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        boolean boolean49 = grafo1.listaAdjVazia(97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        ds.Grafo grafo14 = new ds.Grafo(0);
        grafo14.imprime();
        int[] intArray20 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo14.prox = intArray20;
        grafo10.prox = intArray20;
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        int[] intArray31 = null;
        grafo28.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        grafo34.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int[] intArray49 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo43.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        grafo52.imprime();
        int[] intArray58 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo52.prox = intArray58;
        grafo43.prox = intArray58;
        grafo34.cab = intArray58;
        grafo28.prox = intArray58;
        grafo10.prox = intArray58;
        grafo1.prox = intArray58;
        ds.Grafo grafo66 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta69 = grafo66.retiraAresta(10, (int) ' ');
        ds.Grafo grafo70 = grafo66.grafoTransposto();
        ds.Grafo grafo72 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta75 = grafo72.retiraAresta(10, (int) ' ');
        ds.Grafo grafo76 = grafo72.grafoTransposto();
        boolean boolean79 = grafo76.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo81 = new ds.Grafo(0);
        grafo81.imprime();
        int[] intArray87 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo81.prox = intArray87;
        int[] intArray89 = grafo81.prox;
        int[] intArray90 = grafo81.prox;
        grafo76.prox = intArray90;
        grafo70.prox = intArray90;
        grafo1.peso = intArray90;
        int[] intArray94 = grafo1.prox;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(grafo70);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 32, -1, 32]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray9 = new int[] { 100, (short) 10, '4' };
        grafo5.prox = intArray9;
        java.lang.Class<?> wildcardClass11 = intArray9.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 52]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        ds.Grafo grafo14 = new ds.Grafo(0);
        grafo14.imprime();
        int[] intArray20 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo14.prox = intArray20;
        grafo10.prox = intArray20;
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        int[] intArray31 = null;
        grafo28.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        grafo34.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int[] intArray49 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo43.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        grafo52.imprime();
        int[] intArray58 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo52.prox = intArray58;
        grafo43.prox = intArray58;
        grafo34.cab = intArray58;
        grafo28.prox = intArray58;
        grafo10.prox = intArray58;
        grafo1.prox = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 32, -1, 32]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        boolean boolean12 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo1.listaAdjVazia((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        ds.Grafo grafo8 = new ds.Grafo((int) '#');
        ds.Grafo grafo10 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(10, (int) ' ');
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        int[] intArray15 = null;
        grafo14.cab = intArray15;
        ds.Grafo grafo18 = new ds.Grafo(0);
        grafo18.imprime();
        int[] intArray24 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo18.prox = intArray24;
        grafo14.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray35 = null;
        grafo32.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        grafo38.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo47.prox = intArray62;
        grafo38.cab = intArray62;
        grafo32.prox = intArray62;
        grafo14.prox = intArray62;
        grafo8.cab = intArray62;
        boolean boolean71 = grafo8.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo73 = new ds.Grafo(0);
        grafo73.imprime();
        int[] intArray79 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo73.prox = intArray79;
        grafo8.peso = intArray79;
        grafo5.cab = intArray79;
        // The following exception was thrown during execution in test generation
        try {
            grafo5.insereAresta(97, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 32, -1, 32]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        java.lang.Class<?> wildcardClass76 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        boolean boolean12 = grafo5.existeAresta((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo5.retiraAresta((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo48 = grafo47.grafoTransposto();
        int[] intArray49 = null;
        grafo48.peso = intArray49;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo48);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        boolean boolean58 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo8.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        int int17 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(10, (int) ' ');
        ds.Grafo grafo13 = grafo9.grafoTransposto();
        boolean boolean16 = grafo13.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo18 = new ds.Grafo(0);
        grafo18.imprime();
        int[] intArray24 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo18.prox = intArray24;
        int[] intArray26 = grafo18.prox;
        int[] intArray27 = grafo18.prox;
        grafo13.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.prox = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = grafo1.existeAresta((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 32, -1, 32]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo(0);
        grafo19.imprime();
        int[] intArray25 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo19.prox = intArray25;
        grafo10.prox = intArray25;
        grafo1.cab = intArray25;
        java.lang.Class<?> wildcardClass29 = intArray25.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        boolean boolean31 = grafo5.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 10, 52);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 100);
        boolean boolean14 = grafo1.existeAresta((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) ' ', (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
        int int10 = grafo7.numVertices();
        ds.Grafo grafo12 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) ' ');
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        grafo16.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray37 = null;
        grafo34.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta(10, (int) ' ');
        grafo40.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        grafo49.prox = intArray64;
        grafo40.cab = intArray64;
        grafo34.prox = intArray64;
        grafo16.prox = intArray64;
        grafo7.prox = intArray64;
        grafo1.peso = intArray64;
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) -1, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo5.cab = intArray17;
        int int20 = grafo5.numVertices();
        grafo5.insereAresta((int) (short) 0, 52, (int) (short) -1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 100, (int) (short) -1);
        grafo1.imprime();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        int int57 = grafo1.numVertices();
        int[] intArray58 = grafo1.prox;
        int[] intArray59 = grafo1.prox;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) ' ');
        int int22 = grafo19.numVertices();
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo26 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo19.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        grafo31.imprime();
        ds.Grafo grafo35 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta(10, (int) ' ');
        ds.Grafo grafo39 = grafo35.grafoTransposto();
        int[] intArray40 = null;
        grafo39.cab = intArray40;
        int[] intArray42 = null;
        grafo39.cab = intArray42;
        ds.Grafo grafo45 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) ' ');
        grafo45.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo54 = new ds.Grafo(0);
        grafo54.imprime();
        int[] intArray60 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo54.prox = intArray60;
        ds.Grafo grafo63 = new ds.Grafo(0);
        grafo63.imprime();
        int[] intArray69 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo63.prox = intArray69;
        grafo54.prox = intArray69;
        grafo45.cab = intArray69;
        grafo39.prox = intArray69;
        grafo31.prox = intArray69;
        grafo19.cab = intArray69;
        grafo5.cab = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta78 = grafo5.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 32, -1, 32]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) 'a', (int) (short) -1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 100, (int) (short) -1);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        grafo5.imprime();
        grafo5.imprime();
        int[] intArray32 = null;
        grafo5.cab = intArray32;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) ' ');
        int int15 = grafo12.numVertices();
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo12.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        grafo24.imprime();
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray35 = null;
        grafo32.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        grafo38.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo47.prox = intArray62;
        grafo38.cab = intArray62;
        grafo32.prox = intArray62;
        grafo24.prox = intArray62;
        grafo12.cab = intArray62;
        grafo1.peso = intArray62;
        int[] intArray70 = grafo1.prox;
        int int71 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) ' ');
        int int15 = grafo12.numVertices();
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo12.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        grafo24.imprime();
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray35 = null;
        grafo32.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        grafo38.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo47.prox = intArray62;
        grafo38.cab = intArray62;
        grafo32.prox = intArray62;
        grafo24.prox = intArray62;
        grafo12.cab = intArray62;
        grafo1.peso = intArray62;
        int[] intArray70 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo1.retiraAresta(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 32, -1, 32]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        int int9 = aresta8.v1();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = grafo1.existeAresta(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        grafo1.insereAresta(1, (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        ds.Grafo grafo60 = new ds.Grafo(0);
        grafo60.imprime();
        int[] intArray67 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo60.cab = intArray67;
        grafo5.prox = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta71 = grafo5.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 100, (int) (short) -1);
        boolean boolean10 = grafo1.existeAresta(52, 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) ' ');
        int int15 = grafo12.numVertices();
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo12.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        grafo24.imprime();
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray35 = null;
        grafo32.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        grafo38.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo47.prox = intArray62;
        grafo38.cab = intArray62;
        grafo32.prox = intArray62;
        grafo24.prox = intArray62;
        grafo12.cab = intArray62;
        grafo1.peso = intArray62;
        int int70 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        int int46 = aresta45.v2();
        int int47 = aresta45.v1();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        int int10 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo5.existeAresta((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 52, (int) 'a');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) '4', 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta80 = grafo77.retiraAresta(10, (int) ' ');
        ds.Grafo grafo81 = grafo77.grafoTransposto();
        int[] intArray82 = null;
        grafo81.cab = intArray82;
        ds.Grafo grafo85 = new ds.Grafo(0);
        grafo85.imprime();
        int[] intArray91 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo85.prox = intArray91;
        grafo81.prox = intArray91;
        grafo1.prox = intArray91;
        int[] intArray95 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 32, -1, 32]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta80 = grafo77.retiraAresta(10, (int) ' ');
        ds.Grafo grafo81 = grafo77.grafoTransposto();
        int[] intArray82 = null;
        grafo81.cab = intArray82;
        ds.Grafo grafo85 = new ds.Grafo(0);
        grafo85.imprime();
        int[] intArray91 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo85.prox = intArray91;
        grafo81.prox = intArray91;
        grafo1.prox = intArray91;
        int[] intArray95 = grafo1.prox;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 32, -1, 32]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = grafo5.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        int int57 = grafo1.numVertices();
        int[] intArray58 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta60 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[4, 1, -1, 32]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) 'a', (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) '#');
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        int[] intArray18 = null;
        grafo17.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo(0);
        grafo21.imprime();
        int[] intArray27 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo21.prox = intArray27;
        grafo17.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        ds.Grafo grafo35 = grafo31.grafoTransposto();
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray38 = null;
        grafo35.cab = intArray38;
        ds.Grafo grafo41 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) ' ');
        grafo41.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        ds.Grafo grafo59 = new ds.Grafo(0);
        grafo59.imprime();
        int[] intArray65 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo59.prox = intArray65;
        grafo50.prox = intArray65;
        grafo41.cab = intArray65;
        grafo35.prox = intArray65;
        grafo17.prox = intArray65;
        grafo11.cab = intArray65;
        grafo5.prox = intArray65;
        ds.Grafo grafo74 = new ds.Grafo(0);
        grafo74.imprime();
        int[] intArray81 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo74.cab = intArray81;
        grafo5.peso = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = grafo5.listaAdjVazia((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = grafo5.existeAresta((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        grafo60.imprime();
        ds.Grafo grafo63 = new ds.Grafo(0);
        grafo63.imprime();
        int[] intArray70 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo63.cab = intArray70;
        grafo60.peso = intArray70;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo8.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo5 = new ds.Grafo(0);
        grafo5.imprime();
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo5.prox = intArray11;
        int[] intArray13 = grafo5.prox;
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray82 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo75.cab = intArray82;
        grafo20.prox = intArray82;
        grafo1.peso = intArray82;
        int int86 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) -1, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 10, (int) (byte) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo3.cab = intArray39;
        grafo1.cab = intArray39;
        ds.Grafo grafo46 = grafo1.grafoTransposto();
        int int47 = grafo46.numVertices();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 100, 32);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        ds.Grafo grafo14 = new ds.Grafo(0);
        grafo14.imprime();
        int[] intArray20 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo14.prox = intArray20;
        grafo10.prox = intArray20;
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        int[] intArray31 = null;
        grafo28.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        grafo34.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int[] intArray49 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo43.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        grafo52.imprime();
        int[] intArray58 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo52.prox = intArray58;
        grafo43.prox = intArray58;
        grafo34.cab = intArray58;
        grafo28.prox = intArray58;
        grafo10.prox = intArray58;
        grafo1.prox = intArray58;
        ds.Grafo grafo66 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta69 = grafo66.retiraAresta(10, (int) ' ');
        grafo66.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray81 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo75.prox = intArray81;
        ds.Grafo grafo84 = new ds.Grafo(0);
        grafo84.imprime();
        int[] intArray90 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo84.prox = intArray90;
        grafo75.prox = intArray90;
        grafo66.cab = intArray90;
        grafo1.prox = intArray90;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 32, -1, 32]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        ds.Grafo grafo18 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta(10, (int) ' ');
        grafo18.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo27 = new ds.Grafo(0);
        grafo27.imprime();
        int[] intArray33 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo27.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo(0);
        grafo36.imprime();
        int[] intArray42 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo36.prox = intArray42;
        grafo27.prox = intArray42;
        grafo18.cab = intArray42;
        grafo1.prox = intArray42;
        int int47 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 100, 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo(0);
        grafo71.imprime();
        int[] intArray77 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo71.prox = intArray77;
        grafo62.prox = intArray77;
        grafo5.peso = intArray77;
        ds.Grafo grafo81 = grafo5.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo81);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo.Aresta aresta17 = grafo11.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo18 = grafo11.grafoTransposto();
        grafo18.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) ' ');
        int int27 = grafo24.numVertices();
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        ds.Grafo grafo33 = grafo29.grafoTransposto();
        int[] intArray34 = null;
        grafo33.cab = intArray34;
        ds.Grafo grafo37 = new ds.Grafo(0);
        grafo37.imprime();
        int[] intArray43 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo37.prox = intArray43;
        grafo33.prox = intArray43;
        ds.Grafo grafo47 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta(10, (int) ' ');
        ds.Grafo grafo51 = grafo47.grafoTransposto();
        int[] intArray52 = null;
        grafo51.cab = intArray52;
        int[] intArray54 = null;
        grafo51.cab = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta60 = grafo57.retiraAresta(10, (int) ' ');
        grafo57.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray81 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo75.prox = intArray81;
        grafo66.prox = intArray81;
        grafo57.cab = intArray81;
        grafo51.prox = intArray81;
        grafo33.prox = intArray81;
        grafo24.prox = intArray81;
        grafo18.cab = intArray81;
        grafo5.cab = intArray81;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta80 = grafo77.retiraAresta(10, (int) ' ');
        ds.Grafo grafo81 = grafo77.grafoTransposto();
        int[] intArray82 = null;
        grafo81.cab = intArray82;
        ds.Grafo grafo85 = new ds.Grafo(0);
        grafo85.imprime();
        int[] intArray91 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo85.prox = intArray91;
        grafo81.prox = intArray91;
        grafo1.prox = intArray91;
        int[] intArray95 = grafo1.cab;
        int[] intArray96 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = grafo1.existeAresta((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[100, 32, -1, 32]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 100, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 100, (int) (short) -1);
        ds.Grafo grafo9 = new ds.Grafo(0);
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo9.imprime();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) ' ');
        int int16 = grafo13.numVertices();
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta23 = grafo13.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo25 = new ds.Grafo(0);
        grafo25.imprime();
        grafo25.imprime();
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        ds.Grafo grafo33 = grafo29.grafoTransposto();
        int[] intArray34 = null;
        grafo33.cab = intArray34;
        int[] intArray36 = null;
        grafo33.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta42 = grafo39.retiraAresta(10, (int) ' ');
        grafo39.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo48 = new ds.Grafo(0);
        grafo48.imprime();
        int[] intArray54 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo48.prox = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        grafo57.imprime();
        int[] intArray63 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo57.prox = intArray63;
        grafo48.prox = intArray63;
        grafo39.cab = intArray63;
        grafo33.prox = intArray63;
        grafo25.prox = intArray63;
        grafo13.cab = intArray63;
        grafo9.cab = intArray63;
        grafo1.prox = intArray63;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (byte) 0, (int) ' ');
        ds.Grafo grafo53 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, (int) ' ');
        ds.Grafo grafo57 = grafo53.grafoTransposto();
        grafo53.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean64 = grafo53.existeAresta((int) (short) 100, 100);
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta68 = grafo66.proxAdj((int) ' ');
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray76 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo70.prox = intArray76;
        int[] intArray78 = grafo70.prox;
        grafo66.peso = intArray78;
        grafo53.cab = intArray78;
        grafo1.peso = intArray78;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta83 = grafo1.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(aresta68);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 32, -1, 32]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo5 = new ds.Grafo(0);
        grafo5.imprime();
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo5.prox = intArray11;
        int[] intArray13 = grafo5.prox;
        grafo1.peso = intArray13;
        boolean boolean17 = grafo1.existeAresta((int) (byte) 100, (int) ' ');
        int[] intArray18 = grafo1.peso;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 32, -1, 32]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        boolean boolean63 = grafo60.existeAresta(100, (int) (short) 100);
        ds.Grafo.Aresta aresta66 = grafo60.retiraAresta((int) '4', 97);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(aresta66);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) ' ');
        ds.Grafo grafo14 = new ds.Grafo(0);
        grafo14.imprime();
        int[] intArray20 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo14.prox = intArray20;
        int[] intArray22 = grafo14.prox;
        grafo10.peso = intArray22;
        grafo8.cab = intArray22;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 32, -1, 32]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) ' ', 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 10, (int) (byte) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta(10, (int) ' ');
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        int[] intArray19 = null;
        grafo18.cab = intArray19;
        int[] intArray21 = null;
        grafo18.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        grafo24.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo(0);
        grafo42.imprime();
        int[] intArray48 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo42.prox = intArray48;
        grafo33.prox = intArray48;
        grafo24.cab = intArray48;
        grafo18.prox = intArray48;
        grafo12.cab = intArray48;
        ds.Grafo.Aresta aresta56 = grafo12.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray65 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo58.cab = intArray65;
        grafo12.prox = intArray65;
        int int68 = grafo12.numVertices();
        int[] intArray69 = grafo12.cab;
        grafo5.cab = intArray69;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta56);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[4, 1, -1, 32]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) ' ');
        int int22 = grafo19.numVertices();
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo26 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo19.retiraAresta((int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        grafo31.imprime();
        ds.Grafo grafo35 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta(10, (int) ' ');
        ds.Grafo grafo39 = grafo35.grafoTransposto();
        int[] intArray40 = null;
        grafo39.cab = intArray40;
        int[] intArray42 = null;
        grafo39.cab = intArray42;
        ds.Grafo grafo45 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) ' ');
        grafo45.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo54 = new ds.Grafo(0);
        grafo54.imprime();
        int[] intArray60 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo54.prox = intArray60;
        ds.Grafo grafo63 = new ds.Grafo(0);
        grafo63.imprime();
        int[] intArray69 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo63.prox = intArray69;
        grafo54.prox = intArray69;
        grafo45.cab = intArray69;
        grafo39.prox = intArray69;
        grafo31.prox = intArray69;
        grafo19.cab = intArray69;
        grafo5.cab = intArray69;
        int int77 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo5.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo48 = grafo47.grafoTransposto();
        grafo48.imprime();
        grafo48.imprime();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo48);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        boolean boolean49 = grafo1.listaAdjVazia((int) '4');
        boolean boolean52 = grafo1.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo.Aresta aresta55 = grafo1.retiraAresta(35, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(aresta55);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 10, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        boolean boolean64 = grafo1.existeAresta(10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) ' ', 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo60.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        int[] intArray48 = null;
        grafo47.cab = intArray48;
        ds.Grafo grafo51 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) ' ');
        ds.Grafo grafo55 = grafo51.grafoTransposto();
        int[] intArray56 = null;
        grafo55.cab = intArray56;
        ds.Grafo grafo59 = new ds.Grafo(0);
        grafo59.imprime();
        int[] intArray65 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo59.prox = intArray65;
        grafo55.prox = intArray65;
        grafo47.cab = intArray65;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 32, -1, 32]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        ds.Grafo grafo14 = new ds.Grafo(0);
        grafo14.imprime();
        int[] intArray20 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo14.prox = intArray20;
        grafo10.prox = intArray20;
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        int[] intArray31 = null;
        grafo28.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        grafo34.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int[] intArray49 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo43.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        grafo52.imprime();
        int[] intArray58 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo52.prox = intArray58;
        grafo43.prox = intArray58;
        grafo34.cab = intArray58;
        grafo28.prox = intArray58;
        grafo10.prox = intArray58;
        grafo1.prox = intArray58;
        ds.Grafo grafo66 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta69 = grafo66.retiraAresta(10, (int) ' ');
        ds.Grafo grafo70 = grafo66.grafoTransposto();
        ds.Grafo grafo72 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta75 = grafo72.retiraAresta(10, (int) ' ');
        ds.Grafo grafo76 = grafo72.grafoTransposto();
        boolean boolean79 = grafo76.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo81 = new ds.Grafo(0);
        grafo81.imprime();
        int[] intArray87 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo81.prox = intArray87;
        int[] intArray89 = grafo81.prox;
        int[] intArray90 = grafo81.prox;
        grafo76.prox = intArray90;
        grafo70.prox = intArray90;
        grafo1.peso = intArray90;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = grafo1.existeAresta(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(grafo70);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 32, -1, 32]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo5.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) '#', 100, (int) '#');
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = grafo1.prox;
        boolean boolean12 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        int[] intArray16 = null;
        grafo15.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo(0);
        grafo19.imprime();
        int[] intArray25 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo19.prox = intArray25;
        grafo15.prox = intArray25;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        ds.Grafo grafo33 = grafo29.grafoTransposto();
        int[] intArray34 = null;
        grafo33.cab = intArray34;
        int[] intArray36 = null;
        grafo33.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta42 = grafo39.retiraAresta(10, (int) ' ');
        grafo39.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo48 = new ds.Grafo(0);
        grafo48.imprime();
        int[] intArray54 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo48.prox = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        grafo57.imprime();
        int[] intArray63 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo57.prox = intArray63;
        grafo48.prox = intArray63;
        grafo39.cab = intArray63;
        grafo33.prox = intArray63;
        grafo15.prox = intArray63;
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray77 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo70.cab = intArray77;
        grafo15.prox = intArray77;
        grafo8.prox = intArray77;
        int int81 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = grafo8.existeAresta((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (short) 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        ds.Grafo grafo7 = grafo5.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia((int) '#');
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray54 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo47.cab = intArray54;
        grafo1.prox = intArray54;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta59 = grafo1.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 32, -1, 32, 10]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 1, 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        ds.Grafo grafo59 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo5.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo59);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 0);
        boolean boolean10 = grafo1.existeAresta(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo5.cab = intArray17;
        int int20 = grafo5.numVertices();
        int[] intArray21 = grafo5.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 32, -1, 32]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, 52);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            grafo5.insereAresta((int) 'a', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        boolean boolean14 = grafo10.listaAdjVazia(1);
        int[] intArray19 = new int[] { ' ', 0, 100, 97 };
        grafo10.prox = intArray19;
        grafo1.prox = intArray19;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 0, 100, 97]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo1.prox = intArray39;
        grafo1.imprime();
        int int46 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta49 = grafo1.retiraAresta((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        int int46 = aresta45.v2();
        int int47 = aresta45.peso();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) 'a');
        grafo1.insereAresta(0, (int) (short) 1, (int) (short) -1);
        ds.Grafo grafo10 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(10, (int) ' ');
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean21 = grafo10.existeAresta((int) (short) 100, 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) ' ');
        ds.Grafo grafo27 = new ds.Grafo(0);
        grafo27.imprime();
        int[] intArray33 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo27.prox = intArray33;
        int[] intArray35 = grafo27.prox;
        grafo23.peso = intArray35;
        grafo10.cab = intArray35;
        grafo1.cab = intArray35;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 0, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        int[] intArray19 = new int[] { 100, (short) 10, '4' };
        grafo15.prox = intArray19;
        grafo1.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) '#');
        ds.Grafo grafo25 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta28 = grafo25.retiraAresta(10, (int) ' ');
        ds.Grafo grafo29 = grafo25.grafoTransposto();
        int[] intArray30 = null;
        grafo29.cab = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo29.prox = intArray39;
        ds.Grafo grafo43 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta46 = grafo43.retiraAresta(10, (int) ' ');
        ds.Grafo grafo47 = grafo43.grafoTransposto();
        int[] intArray48 = null;
        grafo47.cab = intArray48;
        int[] intArray50 = null;
        grafo47.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, (int) ' ');
        grafo53.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo(0);
        grafo71.imprime();
        int[] intArray77 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo71.prox = intArray77;
        grafo62.prox = intArray77;
        grafo53.cab = intArray77;
        grafo47.prox = intArray77;
        grafo29.prox = intArray77;
        grafo23.cab = intArray77;
        boolean boolean86 = grafo23.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo88 = new ds.Grafo(0);
        grafo88.imprime();
        int[] intArray94 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo88.prox = intArray94;
        grafo23.peso = intArray94;
        grafo1.peso = intArray94;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 52]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 32, -1, 32]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo19 = grafo5.grafoTransposto();
        boolean boolean22 = grafo19.existeAresta((int) (byte) 1, (-1));
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta63 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        grafo1.insereAresta((int) (byte) 10, (int) '4', 97);
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 1, 100);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.existeAresta(32, (int) (byte) 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        int int9 = aresta8.peso();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia((int) '#');
        boolean boolean15 = grafo1.existeAresta((int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(1, (int) (short) 100);
        boolean boolean47 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(0, 0);
        java.lang.Class<?> wildcardClass14 = grafo10.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta(10, (int) ' ');
        ds.Grafo grafo26 = grafo22.grafoTransposto();
        int[] intArray27 = null;
        grafo26.cab = intArray27;
        int[] intArray29 = null;
        grafo26.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) ' ');
        grafo32.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo41 = new ds.Grafo(0);
        grafo41.imprime();
        int[] intArray47 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo41.prox = intArray47;
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        grafo41.prox = intArray56;
        grafo32.cab = intArray56;
        grafo26.prox = intArray56;
        grafo20.cab = intArray56;
        grafo5.peso = intArray56;
        int[] intArray63 = grafo5.prox;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        grafo77.imprime();
        int[] intArray83 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo77.prox = intArray83;
        ds.Grafo grafo86 = new ds.Grafo(0);
        grafo86.imprime();
        int[] intArray92 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo86.prox = intArray92;
        grafo77.prox = intArray92;
        grafo1.prox = intArray92;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = grafo1.existeAresta((int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[100, 32, -1, 32]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 100, (int) (short) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo48 = grafo47.grafoTransposto();
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNull(aresta51);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        ds.Grafo grafo48 = grafo47.grafoTransposto();
        ds.Grafo.Aresta aresta51 = grafo47.retiraAresta((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNull(aresta51);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo19 = grafo18.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo20 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta(10, (int) ' ');
        ds.Grafo grafo24 = grafo20.grafoTransposto();
        int[] intArray25 = null;
        grafo24.cab = intArray25;
        int[] intArray27 = null;
        grafo24.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        grafo30.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo39 = new ds.Grafo(0);
        grafo39.imprime();
        int[] intArray45 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo39.prox = intArray45;
        ds.Grafo grafo48 = new ds.Grafo(0);
        grafo48.imprime();
        int[] intArray54 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo48.prox = intArray54;
        grafo39.prox = intArray54;
        grafo30.cab = intArray54;
        grafo24.prox = intArray54;
        grafo18.cab = intArray54;
        ds.Grafo.Aresta aresta62 = grafo18.retiraAresta(100, (-1));
        grafo18.imprime();
        ds.Grafo grafo64 = grafo18.grafoTransposto();
        grafo18.insereAresta((int) (byte) 1, (int) (byte) 0, (int) ' ');
        ds.Grafo grafo70 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta73 = grafo70.retiraAresta(10, (int) ' ');
        ds.Grafo grafo74 = grafo70.grafoTransposto();
        grafo70.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean81 = grafo70.existeAresta((int) (short) 100, 100);
        ds.Grafo grafo83 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta85 = grafo83.proxAdj((int) ' ');
        ds.Grafo grafo87 = new ds.Grafo(0);
        grafo87.imprime();
        int[] intArray93 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo87.prox = intArray93;
        int[] intArray95 = grafo87.prox;
        grafo83.peso = intArray95;
        grafo70.cab = intArray95;
        grafo18.peso = intArray95;
        grafo1.prox = intArray95;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, -1, 32]");
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNull(aresta73);
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(aresta85);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 32, -1, 32]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo5 = new ds.Grafo(0);
        grafo5.imprime();
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo5.prox = intArray11;
        int[] intArray13 = grafo5.prox;
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray82 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo75.cab = intArray82;
        grafo20.prox = intArray82;
        grafo1.peso = intArray82;
        java.lang.Class<?> wildcardClass86 = intArray82.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo grafo77 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta80 = grafo77.retiraAresta(10, (int) ' ');
        ds.Grafo grafo81 = grafo77.grafoTransposto();
        int[] intArray82 = null;
        grafo81.cab = intArray82;
        ds.Grafo grafo85 = new ds.Grafo(0);
        grafo85.imprime();
        int[] intArray91 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo85.prox = intArray91;
        grafo81.prox = intArray91;
        grafo1.prox = intArray91;
        java.lang.Class<?> wildcardClass95 = intArray91.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        int[] intArray19 = new int[] { 100, (short) 10, '4' };
        grafo15.prox = intArray19;
        grafo1.prox = intArray19;
        boolean boolean23 = grafo1.listaAdjVazia((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
        int int10 = grafo7.numVertices();
        ds.Grafo grafo12 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) ' ');
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        grafo16.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray37 = null;
        grafo34.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta(10, (int) ' ');
        grafo40.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        grafo49.prox = intArray64;
        grafo40.cab = intArray64;
        grafo34.prox = intArray64;
        grafo16.prox = intArray64;
        grafo7.prox = intArray64;
        grafo1.peso = intArray64;
        int int72 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        boolean boolean15 = grafo1.existeAresta((int) ' ', (int) (byte) -1);
        grafo1.imprime();
        ds.Grafo grafo18 = new ds.Grafo(97);
        ds.Grafo grafo20 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta(10, (int) ' ');
        ds.Grafo grafo24 = grafo20.grafoTransposto();
        grafo20.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) ' ');
        int int33 = grafo30.numVertices();
        ds.Grafo grafo35 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta(10, (int) ' ');
        ds.Grafo grafo39 = grafo35.grafoTransposto();
        int[] intArray40 = null;
        grafo39.cab = intArray40;
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int[] intArray49 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo43.prox = intArray49;
        grafo39.prox = intArray49;
        ds.Grafo grafo53 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, (int) ' ');
        ds.Grafo grafo57 = grafo53.grafoTransposto();
        int[] intArray58 = null;
        grafo57.cab = intArray58;
        int[] intArray60 = null;
        grafo57.cab = intArray60;
        ds.Grafo grafo63 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta66 = grafo63.retiraAresta(10, (int) ' ');
        grafo63.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo72 = new ds.Grafo(0);
        grafo72.imprime();
        int[] intArray78 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo72.prox = intArray78;
        ds.Grafo grafo81 = new ds.Grafo(0);
        grafo81.imprime();
        int[] intArray87 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo81.prox = intArray87;
        grafo72.prox = intArray87;
        grafo63.cab = intArray87;
        grafo57.prox = intArray87;
        grafo39.prox = intArray87;
        grafo30.prox = intArray87;
        grafo20.cab = intArray87;
        grafo18.cab = intArray87;
        grafo1.prox = intArray87;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 32, -1, 32]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        boolean boolean12 = grafo5.existeAresta((int) (byte) 0, 10);
        int[] intArray13 = grafo5.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 10, 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo19.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) 100, 1);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (-1), (int) (short) 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 0);
        boolean boolean10 = grafo1.existeAresta(0, (int) (byte) 100);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 1, (-1));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo48 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta(10, (int) ' ');
        ds.Grafo grafo52 = grafo48.grafoTransposto();
        int[] intArray53 = null;
        grafo52.cab = intArray53;
        ds.Grafo grafo56 = new ds.Grafo(0);
        grafo56.imprime();
        int[] intArray62 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo56.prox = intArray62;
        grafo52.prox = intArray62;
        grafo1.cab = intArray62;
        int[] intArray66 = grafo1.cab;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 32, -1, 32]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(10, (int) ' ');
        grafo11.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.imprime();
        int[] intArray35 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo29.prox = intArray35;
        grafo20.prox = intArray35;
        grafo11.cab = intArray35;
        grafo5.prox = intArray35;
        grafo5.imprime();
        int[] intArray41 = grafo5.cab;
        int[] intArray42 = grafo5.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray42);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        boolean boolean48 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        int int58 = grafo50.numVertices();
        ds.Grafo grafo60 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta63 = grafo60.retiraAresta(10, (int) ' ');
        ds.Grafo grafo64 = grafo60.grafoTransposto();
        int[] intArray68 = new int[] { 100, (short) 10, '4' };
        grafo64.prox = intArray68;
        grafo50.prox = intArray68;
        grafo1.peso = intArray68;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 10, 52]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo(0);
        grafo7.imprime();
        int[] intArray13 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo7.prox = intArray13;
        int[] intArray15 = grafo7.prox;
        grafo1.prox = intArray15;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta(0, (int) (byte) -1);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (short) 1);
        int int9 = grafo1.numVertices();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo.Aresta aresta17 = grafo11.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo18 = grafo11.grafoTransposto();
        grafo18.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) ' ');
        int int27 = grafo24.numVertices();
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        ds.Grafo grafo33 = grafo29.grafoTransposto();
        int[] intArray34 = null;
        grafo33.cab = intArray34;
        ds.Grafo grafo37 = new ds.Grafo(0);
        grafo37.imprime();
        int[] intArray43 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo37.prox = intArray43;
        grafo33.prox = intArray43;
        ds.Grafo grafo47 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta(10, (int) ' ');
        ds.Grafo grafo51 = grafo47.grafoTransposto();
        int[] intArray52 = null;
        grafo51.cab = intArray52;
        int[] intArray54 = null;
        grafo51.cab = intArray54;
        ds.Grafo grafo57 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta60 = grafo57.retiraAresta(10, (int) ' ');
        grafo57.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        ds.Grafo grafo75 = new ds.Grafo(0);
        grafo75.imprime();
        int[] intArray81 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo75.prox = intArray81;
        grafo66.prox = intArray81;
        grafo57.cab = intArray81;
        grafo51.prox = intArray81;
        grafo33.prox = intArray81;
        grafo24.prox = intArray81;
        grafo18.cab = intArray81;
        grafo1.prox = intArray81;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.insereAresta((int) '#', (int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo8.primeiroListaAdj(0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        int[] intArray74 = grafo20.prox;
        int[] intArray75 = grafo20.cab;
        grafo20.imprime();
        ds.Grafo grafo78 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta81 = grafo78.retiraAresta(10, (int) ' ');
        ds.Grafo grafo82 = grafo78.grafoTransposto();
        int[] intArray83 = null;
        grafo82.cab = intArray83;
        ds.Grafo grafo86 = new ds.Grafo(0);
        grafo86.imprime();
        int[] intArray92 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo86.prox = intArray92;
        grafo82.prox = intArray92;
        grafo20.prox = intArray92;
        grafo8.prox = intArray92;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(aresta81);
        org.junit.Assert.assertNotNull(grafo82);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[100, 32, -1, 32]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        int[] intArray48 = null;
        grafo47.cab = intArray48;
        ds.Grafo grafo50 = grafo47.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo50.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(grafo50);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        java.lang.Class<?> wildcardClass43 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        boolean boolean14 = grafo1.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        grafo1.insereAresta(1, (int) ' ', (int) (short) 100);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) ' ');
        int int18 = grafo15.numVertices();
        ds.Grafo grafo20 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta(10, (int) ' ');
        ds.Grafo grafo24 = grafo20.grafoTransposto();
        int[] intArray25 = null;
        grafo24.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo(0);
        grafo28.imprime();
        int[] intArray34 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo28.prox = intArray34;
        grafo24.prox = intArray34;
        ds.Grafo grafo38 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta(10, (int) ' ');
        ds.Grafo grafo42 = grafo38.grafoTransposto();
        int[] intArray43 = null;
        grafo42.cab = intArray43;
        int[] intArray45 = null;
        grafo42.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta(10, (int) ' ');
        grafo48.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo57 = new ds.Grafo(0);
        grafo57.imprime();
        int[] intArray63 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo57.prox = intArray63;
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        grafo57.prox = intArray72;
        grafo48.cab = intArray72;
        grafo42.prox = intArray72;
        grafo24.prox = intArray72;
        grafo15.prox = intArray72;
        grafo1.cab = intArray72;
        int[] intArray80 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 32, -1, 32]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        int int11 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo5.existeAresta((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray9 = new int[] { 100, (short) 10, '4' };
        grafo5.prox = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo5.existeAresta((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 52]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        boolean boolean12 = grafo1.existeAresta((int) (short) 0, (int) '4');
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        grafo5.insereAresta(35, 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = grafo5.existeAresta((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, 100);
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.imprime();
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
        int int10 = grafo7.numVertices();
        ds.Grafo grafo12 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) ' ');
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        grafo16.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray37 = null;
        grafo34.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta(10, (int) ' ');
        grafo40.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        grafo49.prox = intArray64;
        grafo40.cab = intArray64;
        grafo34.prox = intArray64;
        grafo16.prox = intArray64;
        grafo7.prox = intArray64;
        grafo1.peso = intArray64;
        int[] intArray72 = grafo1.peso;
        boolean boolean74 = grafo1.listaAdjVazia((int) (byte) 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta(10, (int) ' ');
        ds.Grafo grafo26 = grafo22.grafoTransposto();
        int[] intArray27 = null;
        grafo26.cab = intArray27;
        int[] intArray29 = null;
        grafo26.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) ' ');
        grafo32.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo41 = new ds.Grafo(0);
        grafo41.imprime();
        int[] intArray47 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo41.prox = intArray47;
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        grafo41.prox = intArray56;
        grafo32.cab = intArray56;
        grafo26.prox = intArray56;
        grafo20.cab = intArray56;
        grafo5.peso = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = grafo5.existeAresta((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) '#');
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        int[] intArray18 = null;
        grafo17.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo(0);
        grafo21.imprime();
        int[] intArray27 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo21.prox = intArray27;
        grafo17.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        ds.Grafo grafo35 = grafo31.grafoTransposto();
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray38 = null;
        grafo35.cab = intArray38;
        ds.Grafo grafo41 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) ' ');
        grafo41.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo50 = new ds.Grafo(0);
        grafo50.imprime();
        int[] intArray56 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo50.prox = intArray56;
        ds.Grafo grafo59 = new ds.Grafo(0);
        grafo59.imprime();
        int[] intArray65 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo59.prox = intArray65;
        grafo50.prox = intArray65;
        grafo41.cab = intArray65;
        grafo35.prox = intArray65;
        grafo17.prox = intArray65;
        grafo11.cab = intArray65;
        grafo5.prox = intArray65;
        int[] intArray73 = grafo5.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(intArray73);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        grafo1.imprime();
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        int[] intArray48 = null;
        grafo47.cab = intArray48;
        ds.Grafo grafo51 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) ' ');
        ds.Grafo grafo55 = grafo51.grafoTransposto();
        int[] intArray56 = null;
        grafo55.cab = intArray56;
        int[] intArray58 = null;
        grafo55.cab = intArray58;
        ds.Grafo grafo61 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta64 = grafo61.retiraAresta(10, (int) ' ');
        grafo61.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray76 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo70.prox = intArray76;
        ds.Grafo grafo79 = new ds.Grafo(0);
        grafo79.imprime();
        int[] intArray85 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo79.prox = intArray85;
        grafo70.prox = intArray85;
        grafo61.cab = intArray85;
        grafo55.prox = intArray85;
        grafo47.peso = intArray85;
        // The following exception was thrown during execution in test generation
        try {
            grafo47.insereAresta(52, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 32, -1, 32]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int[] intArray22 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        int[] intArray25 = grafo16.prox;
        grafo11.prox = intArray25;
        grafo5.prox = intArray25;
        boolean boolean29 = grafo5.listaAdjVazia((int) (short) 0);
        grafo5.insereAresta(35, 10, (int) 'a');
        int[] intArray34 = grafo5.prox;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 32, -1, 32]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        boolean boolean8 = grafo5.listaAdjVazia(35);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 1, 97);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        int[] intArray8 = null;
        grafo5.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo5.cab = intArray17;
        ds.Grafo.Aresta aresta22 = grafo5.retiraAresta((int) (short) 1, 52);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo6 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        grafo6.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo15 = grafo6.grafoTransposto();
        boolean boolean17 = grafo6.listaAdjVazia(0);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) ' ');
        int int22 = grafo19.numVertices();
        ds.Grafo grafo24 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta(10, (int) ' ');
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo(0);
        grafo32.imprime();
        int[] intArray38 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo32.prox = intArray38;
        grafo28.prox = intArray38;
        ds.Grafo grafo42 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) ' ');
        ds.Grafo grafo46 = grafo42.grafoTransposto();
        int[] intArray47 = null;
        grafo46.cab = intArray47;
        int[] intArray49 = null;
        grafo46.cab = intArray49;
        ds.Grafo grafo52 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta(10, (int) ' ');
        grafo52.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo61 = new ds.Grafo(0);
        grafo61.imprime();
        int[] intArray67 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo61.prox = intArray67;
        ds.Grafo grafo70 = new ds.Grafo(0);
        grafo70.imprime();
        int[] intArray76 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo70.prox = intArray76;
        grafo61.prox = intArray76;
        grafo52.cab = intArray76;
        grafo46.prox = intArray76;
        grafo28.prox = intArray76;
        grafo19.prox = intArray76;
        ds.Grafo grafo84 = new ds.Grafo(0);
        grafo84.imprime();
        int[] intArray90 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo84.prox = intArray90;
        grafo19.prox = intArray90;
        grafo6.prox = intArray90;
        ds.Grafo grafo94 = grafo6.grafoTransposto();
        int[] intArray95 = grafo6.prox;
        grafo1.cab = intArray95;
        int[] intArray97 = grafo1.cab;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo94);
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[100, 32, -1, 32]");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        int int9 = grafo1.numVertices();
        int int10 = grafo1.numVertices();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) ' ');
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray26 = null;
        grafo23.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta(10, (int) ' ');
        grafo29.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo38 = new ds.Grafo(0);
        grafo38.imprime();
        int[] intArray44 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo38.prox = intArray44;
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int[] intArray53 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo47.prox = intArray53;
        grafo38.prox = intArray53;
        grafo29.cab = intArray53;
        grafo23.prox = intArray53;
        grafo5.prox = intArray53;
        int[] intArray59 = grafo5.prox;
        ds.Grafo grafo60 = grafo5.grafoTransposto();
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo(0);
        grafo71.imprime();
        int[] intArray77 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo71.prox = intArray77;
        grafo62.prox = intArray77;
        grafo5.peso = intArray77;
        int[] intArray81 = grafo5.prox;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 32, -1, 32]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        boolean boolean64 = grafo1.existeAresta(10, (int) (byte) 1);
        ds.Grafo.Aresta aresta67 = grafo1.retiraAresta((int) '4', (int) (short) 1);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(aresta67);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        boolean boolean64 = grafo1.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        grafo1.peso = intArray72;
        ds.Grafo.Aresta aresta76 = grafo1.primeiroListaAdj(10);
        boolean boolean78 = grafo1.listaAdjVazia((int) (short) 100);
        java.lang.Class<?> wildcardClass79 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo1 = new ds.Grafo(100);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 0, (int) ' ', (int) (byte) 0);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 10);
        int[] intArray9 = null;
        grafo1.prox = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo11 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo5 = new ds.Grafo(0);
        grafo5.imprime();
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo5.prox = intArray11;
        int[] intArray13 = grafo5.prox;
        grafo1.peso = intArray13;
        boolean boolean17 = grafo1.existeAresta((int) (byte) 100, (int) ' ');
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray10 = null;
        grafo7.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) ' ');
        grafo13.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        grafo31.imprime();
        int[] intArray37 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo31.prox = intArray37;
        grafo22.prox = intArray37;
        grafo13.cab = intArray37;
        grafo7.prox = intArray37;
        grafo1.cab = intArray37;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, (-1));
        boolean boolean48 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        boolean boolean51 = grafo1.existeAresta(100, (int) 'a');
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo3.cab = intArray39;
        grafo1.cab = intArray39;
        ds.Grafo grafo46 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta49 = grafo46.retiraAresta(100, 32);
        boolean boolean52 = grafo46.existeAresta(35, 32);
        grafo46.imprime();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray7 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        grafo1.prox = intArray16;
        int int19 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        grafo1.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo10 = new ds.Grafo(0);
        grafo10.imprime();
        int[] intArray16 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo10.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo(0);
        grafo19.imprime();
        int[] intArray25 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo19.prox = intArray25;
        grafo10.prox = intArray25;
        grafo1.cab = intArray25;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo32 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) ' ');
        ds.Grafo grafo36 = grafo32.grafoTransposto();
        int[] intArray37 = null;
        grafo36.cab = intArray37;
        int[] intArray39 = null;
        grafo36.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) ' ');
        grafo42.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo51 = new ds.Grafo(0);
        grafo51.imprime();
        int[] intArray57 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo51.prox = intArray57;
        ds.Grafo grafo60 = new ds.Grafo(0);
        grafo60.imprime();
        int[] intArray66 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo60.prox = intArray66;
        grafo51.prox = intArray66;
        grafo42.cab = intArray66;
        grafo36.prox = intArray66;
        grafo30.cab = intArray66;
        grafo1.prox = intArray66;
        boolean boolean74 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 10, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray8 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) ' ');
        int int14 = grafo11.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        grafo20.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta(10, (int) ' ');
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray41 = null;
        grafo38.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta(10, (int) ' ');
        grafo44.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo53 = new ds.Grafo(0);
        grafo53.imprime();
        int[] intArray59 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo53.prox = intArray59;
        ds.Grafo grafo62 = new ds.Grafo(0);
        grafo62.imprime();
        int[] intArray68 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo62.prox = intArray68;
        grafo53.prox = intArray68;
        grafo44.cab = intArray68;
        grafo38.prox = intArray68;
        grafo20.prox = intArray68;
        grafo11.prox = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo76);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo(52);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(10, (int) ' ');
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo(0);
        grafo11.imprime();
        int[] intArray17 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo11.prox = intArray17;
        grafo7.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) ' ');
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray28 = null;
        grafo25.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta(10, (int) ' ');
        grafo31.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo40 = new ds.Grafo(0);
        grafo40.imprime();
        int[] intArray46 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        grafo40.prox = intArray55;
        grafo31.cab = intArray55;
        grafo25.prox = intArray55;
        grafo7.prox = intArray55;
        grafo1.cab = intArray55;
        boolean boolean64 = grafo1.existeAresta(10, (int) (byte) 1);
        ds.Grafo grafo66 = new ds.Grafo(0);
        grafo66.imprime();
        int[] intArray72 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo66.prox = intArray72;
        grafo1.peso = intArray72;
        ds.Grafo.Aresta aresta76 = grafo1.proxAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta76);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        boolean boolean9 = grafo5.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (short) 1, (int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 1, (-1));
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta(32, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        grafo1.insereAresta((int) (byte) 10, (int) '4', 97);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(10, (int) ' ');
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        int[] intArray21 = null;
        grafo20.cab = intArray21;
        int[] intArray23 = null;
        grafo20.cab = intArray23;
        ds.Grafo grafo26 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta(10, (int) ' ');
        grafo26.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo35 = new ds.Grafo(0);
        grafo35.imprime();
        int[] intArray41 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo35.prox = intArray41;
        ds.Grafo grafo44 = new ds.Grafo(0);
        grafo44.imprime();
        int[] intArray50 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo44.prox = intArray50;
        grafo35.prox = intArray50;
        grafo26.cab = intArray50;
        grafo20.prox = intArray50;
        grafo14.cab = intArray50;
        ds.Grafo.Aresta aresta58 = grafo14.retiraAresta(1, (int) (short) 100);
        ds.Grafo grafo60 = new ds.Grafo(0);
        grafo60.imprime();
        int[] intArray67 = new int[] { (short) 100, ' ', (-1), ' ', 10 };
        grafo60.cab = intArray67;
        grafo14.prox = intArray67;
        int int70 = grafo14.numVertices();
        int[] intArray71 = grafo14.cab;
        grafo1.peso = intArray71;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[4, 1, -1, 32]");
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 32, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[4, 1, -1, 32]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 0, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia(97);
        int[] intArray15 = null;
        grafo1.cab = intArray15;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo3.cab = intArray39;
        grafo1.cab = intArray39;
        ds.Grafo grafo46 = grafo1.grafoTransposto();
        int int47 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 0, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
        int int10 = grafo7.numVertices();
        ds.Grafo grafo12 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) ' ');
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int[] intArray26 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo20.prox = intArray26;
        grafo16.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) ' ');
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray37 = null;
        grafo34.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta(10, (int) ' ');
        grafo40.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo49 = new ds.Grafo(0);
        grafo49.imprime();
        int[] intArray55 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo(0);
        grafo58.imprime();
        int[] intArray64 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo58.prox = intArray64;
        grafo49.prox = intArray64;
        grafo40.cab = intArray64;
        grafo34.prox = intArray64;
        grafo16.prox = intArray64;
        grafo7.prox = intArray64;
        grafo1.peso = intArray64;
        int[] intArray72 = grafo1.peso;
        int[] intArray73 = grafo1.peso;
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 32, -1, 32]");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(10, (int) ' ');
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        int[] intArray12 = null;
        grafo9.cab = intArray12;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) ' ');
        grafo15.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo24 = new ds.Grafo(0);
        grafo24.imprime();
        int[] intArray30 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo(0);
        grafo33.imprime();
        int[] intArray39 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo33.prox = intArray39;
        grafo24.prox = intArray39;
        grafo15.cab = intArray39;
        grafo9.prox = intArray39;
        grafo3.cab = intArray39;
        grafo1.cab = intArray39;
        int int46 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 32, -1, 32]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 0, 35);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 1, 52);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 100);
        int int12 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) ' ');
        int int12 = grafo9.numVertices();
        ds.Grafo grafo14 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta(10, (int) ' ');
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        int[] intArray19 = null;
        grafo18.cab = intArray19;
        ds.Grafo grafo22 = new ds.Grafo(0);
        grafo22.imprime();
        int[] intArray28 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo22.prox = intArray28;
        grafo18.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) ' ');
        ds.Grafo grafo36 = grafo32.grafoTransposto();
        int[] intArray37 = null;
        grafo36.cab = intArray37;
        int[] intArray39 = null;
        grafo36.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) ' ');
        grafo42.insereAresta((int) (byte) 100, (int) (short) -1, (int) '4');
        ds.Grafo grafo51 = new ds.Grafo(0);
        grafo51.imprime();
        int[] intArray57 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo51.prox = intArray57;
        ds.Grafo grafo60 = new ds.Grafo(0);
        grafo60.imprime();
        int[] intArray66 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo60.prox = intArray66;
        grafo51.prox = intArray66;
        grafo42.cab = intArray66;
        grafo36.prox = intArray66;
        grafo18.prox = intArray66;
        grafo9.prox = intArray66;
        ds.Grafo grafo74 = new ds.Grafo(0);
        grafo74.imprime();
        int[] intArray80 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo74.prox = intArray80;
        grafo9.prox = intArray80;
        grafo1.prox = intArray80;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = grafo1.listaAdjVazia(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 32, -1, 32]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 32, -1, 32]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) ' ');
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo5.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo(0);
        grafo9.imprime();
        int[] intArray15 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo9.prox = intArray15;
        grafo5.prox = intArray15;
        ds.Grafo grafo18 = grafo5.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo22 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta(10, (int) ' ');
        ds.Grafo grafo26 = grafo22.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) ' ');
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        boolean boolean35 = grafo32.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo37 = new ds.Grafo(0);
        grafo37.imprime();
        int[] intArray43 = new int[] { (byte) 100, ' ', (short) -1, ' ' };
        grafo37.prox = intArray43;
        int[] intArray45 = grafo37.prox;
        int[] intArray46 = grafo37.prox;
        grafo32.prox = intArray46;
        grafo26.prox = intArray46;
        grafo20.prox = intArray46;
        grafo18.cab = intArray46;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 32, -1, 32]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 32, -1, 32]");
    }
}

