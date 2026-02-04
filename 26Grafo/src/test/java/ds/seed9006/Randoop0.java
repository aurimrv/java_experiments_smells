package ds.seed9006;

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
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
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
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo4 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo1.existeAresta((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo1.existeAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        int int25 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        int int25 = grafo1.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int int28 = grafo27.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo27.prox = intArray42;
        grafo1.prox = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = grafo1.listaAdjVazia((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo14.cab = intArray34;
        grafo1.peso = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        boolean boolean24 = grafo20.existeAresta((int) (byte) 0, (int) (short) -1);
        int int25 = grafo20.numVertices();
        int int26 = grafo20.numVertices();
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int int29 = grafo28.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        grafo31.imprime();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = null;
        grafo34.prox = intArray35;
        int[] intArray43 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo34.peso = intArray43;
        grafo31.cab = intArray43;
        grafo28.prox = intArray43;
        grafo20.prox = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) '#', 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        int[] intArray38 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo1.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        int int33 = grafo30.numVertices();
        int int34 = grafo30.numVertices();
        boolean boolean36 = grafo30.listaAdjVazia(32);
        boolean boolean39 = grafo30.existeAresta(0, 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int int42 = grafo41.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        grafo44.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = null;
        grafo47.prox = intArray48;
        int[] intArray56 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo47.peso = intArray56;
        grafo44.cab = intArray56;
        grafo41.prox = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo41.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.cab = intArray73;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = grafo1.existeAresta(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.existeAresta((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta41 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo37 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass38 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo30.prox = intArray35;
        int[] intArray37 = grafo30.prox;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        boolean boolean43 = grafo39.existeAresta((int) (byte) 0, (int) (short) -1);
        int int44 = grafo39.numVertices();
        int int45 = grafo39.numVertices();
        ds.Grafo grafo46 = grafo39.grafoTransposto();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo48.prox = intArray53;
        int[] intArray55 = grafo48.prox;
        grafo39.peso = intArray55;
        grafo30.cab = intArray55;
        grafo1.cab = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo1.retiraAresta((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10, 1, 0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass30 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        java.lang.Class<?> wildcardClass37 = intArray33.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo38 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int int11 = grafo10.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = null;
        grafo16.prox = intArray17;
        int[] intArray25 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo16.peso = intArray25;
        grafo13.cab = intArray25;
        grafo10.prox = intArray25;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo10.cab = intArray42;
        grafo1.peso = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo1.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        int int33 = grafo30.numVertices();
        int int34 = grafo30.numVertices();
        boolean boolean36 = grafo30.listaAdjVazia(32);
        boolean boolean39 = grafo30.existeAresta(0, 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int int42 = grafo41.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        grafo44.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = null;
        grafo47.prox = intArray48;
        int[] intArray56 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo47.peso = intArray56;
        grafo44.cab = intArray56;
        grafo41.prox = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo41.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.cab = intArray73;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta80 = grafo1.proxAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo(32);
        grafo1.imprime();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo8.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        int int33 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta35 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo9 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) '4', 0);
        java.lang.Class<?> wildcardClass13 = aresta12.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        int int24 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo20.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        boolean boolean34 = grafo30.existeAresta((int) (byte) 0, (int) (short) -1);
        int int35 = grafo30.numVertices();
        int int36 = grafo30.numVertices();
        ds.Grafo grafo37 = grafo30.grafoTransposto();
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo39.prox = intArray44;
        int[] intArray46 = grafo39.prox;
        grafo37.peso = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo49.prox = intArray54;
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 10);
        grafo57.imprime();
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        int[] intArray61 = null;
        grafo60.prox = intArray61;
        int[] intArray69 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo60.peso = intArray69;
        grafo57.cab = intArray69;
        grafo49.cab = intArray69;
        grafo37.peso = intArray69;
        grafo1.prox = intArray69;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        boolean boolean42 = grafo1.existeAresta((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        int[] intArray10 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo13 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 0, (int) (short) -1);
        int int13 = grafo8.numVertices();
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo17.prox = intArray22;
        int[] intArray24 = grafo17.prox;
        grafo15.peso = intArray24;
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        grafo35.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = null;
        grafo38.prox = intArray39;
        int[] intArray47 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo38.peso = intArray47;
        grafo35.cab = intArray47;
        grafo27.cab = intArray47;
        grafo15.peso = intArray47;
        grafo1.prox = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = grafo1.existeAresta((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.existeAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta30 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        grafo1.imprime();
        int[] intArray22 = null;
        grafo1.peso = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        grafo25.imprime();
        boolean boolean29 = grafo25.existeAresta((int) (byte) 0, (int) (short) -1);
        int int30 = grafo25.numVertices();
        int int31 = grafo25.numVertices();
        ds.Grafo grafo32 = grafo25.grafoTransposto();
        ds.Grafo grafo33 = grafo32.grafoTransposto();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo35.prox = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray47 = null;
        grafo46.prox = intArray47;
        int[] intArray55 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo46.peso = intArray55;
        grafo43.cab = intArray55;
        grafo35.cab = intArray55;
        grafo33.prox = intArray55;
        grafo1.prox = intArray55;
        int[] intArray61 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        int int29 = grafo1.numVertices();
        int int30 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = grafo1.existeAresta(32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        int int33 = grafo30.numVertices();
        int int34 = grafo30.numVertices();
        boolean boolean36 = grafo30.listaAdjVazia(32);
        boolean boolean39 = grafo30.existeAresta(0, 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int int42 = grafo41.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        grafo44.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = null;
        grafo47.prox = intArray48;
        int[] intArray56 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo47.peso = intArray56;
        grafo44.cab = intArray56;
        grafo41.prox = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo41.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.cab = intArray73;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = grafo1.existeAresta((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        grafo29.imprime();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = null;
        grafo32.prox = intArray33;
        int[] intArray41 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo32.peso = intArray41;
        grafo29.cab = intArray41;
        grafo9.cab = intArray41;
        int int45 = grafo9.numVertices();
        int[] intArray46 = grafo9.cab;
        grafo1.prox = intArray46;
        java.lang.Class<?> wildcardClass48 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo3.prox = intArray8;
        int[] intArray10 = grafo3.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo12.peso = intArray28;
        grafo3.cab = intArray28;
        int int31 = grafo3.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo33.prox = intArray38;
        int[] intArray40 = grafo33.prox;
        grafo3.prox = intArray40;
        grafo1.peso = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (short) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo(10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        grafo21.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = null;
        grafo45.prox = intArray46;
        int[] intArray54 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo45.peso = intArray54;
        grafo42.cab = intArray54;
        grafo34.cab = intArray54;
        grafo21.peso = intArray54;
        grafo1.prox = intArray54;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        int[] intArray66 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo61.prox = intArray66;
        int[] intArray68 = grafo61.prox;
        grafo1.cab = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = grafo1.existeAresta(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 10, 1, 0]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        int int25 = grafo1.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int int28 = grafo27.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo27.prox = intArray42;
        grafo1.prox = intArray42;
        int[] intArray47 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        boolean boolean43 = grafo39.existeAresta((int) (byte) 0, (int) (short) -1);
        int int44 = grafo39.numVertices();
        int int45 = grafo39.numVertices();
        ds.Grafo grafo46 = grafo39.grafoTransposto();
        grafo39.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int[] intArray57 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo52.prox = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        grafo60.imprime();
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = null;
        grafo63.prox = intArray64;
        int[] intArray72 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo63.peso = intArray72;
        grafo60.cab = intArray72;
        grafo52.cab = intArray72;
        grafo39.peso = intArray72;
        grafo1.peso = intArray72;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo21 = grafo20.grafoTransposto();
        boolean boolean24 = grafo20.existeAresta((int) (byte) 1, 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        int[] intArray36 = grafo9.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta39 = grafo9.retiraAresta((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) '#', 32);
        grafo1.imprime();
        ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta((int) (byte) 10, (int) '#', 32);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int int8 = grafo7.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = null;
        grafo13.prox = intArray14;
        int[] intArray22 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo13.peso = intArray22;
        grafo10.cab = intArray22;
        grafo7.prox = intArray22;
        grafo1.cab = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo1.primeiroListaAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        grafo25.imprime();
        boolean boolean29 = grafo25.existeAresta((int) (byte) 0, (int) (short) -1);
        int int30 = grafo25.numVertices();
        int int31 = grafo25.numVertices();
        ds.Grafo grafo32 = grafo25.grafoTransposto();
        ds.Grafo grafo33 = grafo32.grafoTransposto();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo35.prox = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray47 = null;
        grafo46.prox = intArray47;
        int[] intArray55 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo46.peso = intArray55;
        grafo43.cab = intArray55;
        grafo35.cab = intArray55;
        grafo33.prox = intArray55;
        grafo1.prox = intArray55;
        java.lang.Class<?> wildcardClass61 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        grafo1.imprime();
        int[] intArray22 = null;
        grafo1.peso = intArray22;
        boolean boolean25 = grafo1.listaAdjVazia(10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo40 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta43 = grafo40.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo40);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo40 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass41 = grafo40.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        int int22 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.retiraAresta(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        int[] intArray10 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo1.peso = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.insereAresta(100, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(10, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 10, (int) '4');
        int int13 = grafo8.numVertices();
        ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj((int) (short) 0);
        grafo8.insereAresta((int) ' ', (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        int[] intArray20 = grafo9.prox;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = null;
        grafo27.prox = intArray28;
        int[] intArray36 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo27.peso = intArray36;
        grafo24.cab = intArray36;
        grafo22.peso = intArray36;
        grafo9.cab = intArray36;
        grafo7.prox = intArray36;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        boolean boolean47 = grafo43.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        grafo49.imprime();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = null;
        grafo52.prox = intArray53;
        int[] intArray61 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo52.peso = intArray61;
        grafo49.cab = intArray61;
        grafo43.peso = intArray61;
        grafo7.cab = intArray61;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        boolean boolean22 = grafo1.existeAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta25 = grafo1.retiraAresta(1, 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 10, (int) '4');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        boolean boolean13 = grafo9.existeAresta((int) (byte) 0, (int) (short) -1);
        int int14 = grafo9.numVertices();
        int int15 = grafo9.numVertices();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo22.cab = intArray42;
        grafo9.peso = intArray42;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo48.prox = intArray53;
        int int55 = grafo48.numVertices();
        int[] intArray56 = grafo48.prox;
        grafo9.prox = intArray56;
        grafo1.prox = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta60 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10, 1, 0]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        int int21 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) '4', (int) (byte) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        boolean boolean75 = grafo1.existeAresta((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        boolean boolean9 = grafo5.existeAresta((int) (byte) 0, (int) (short) -1);
        int int10 = grafo5.numVertices();
        int int11 = grafo5.numVertices();
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        int[] intArray21 = grafo14.prox;
        grafo12.peso = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo24.prox = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo24.cab = intArray44;
        grafo12.peso = intArray44;
        grafo1.prox = intArray44;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        int int24 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta30 = grafo1.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int int8 = grafo1.numVertices();
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo23.prox = intArray28;
        int[] intArray30 = grafo23.prox;
        grafo1.cab = intArray30;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 10, 1, 0]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo8.numVertices();
        int int10 = grafo8.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray2 = null;
        grafo1.prox = intArray2;
        int[] intArray10 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo8.numVertices();
        ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) ' ', (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.imprime();
        java.lang.Class<?> wildcardClass10 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        grafo1.imprime();
        int[] intArray22 = null;
        grafo1.peso = intArray22;
        ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        grafo21.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = null;
        grafo45.prox = intArray46;
        int[] intArray54 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo45.peso = intArray54;
        grafo42.cab = intArray54;
        grafo34.cab = intArray54;
        grafo21.peso = intArray54;
        grafo1.prox = intArray54;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        boolean boolean65 = grafo61.existeAresta((int) (byte) 0, (int) (short) -1);
        int int66 = grafo61.numVertices();
        int int67 = grafo61.numVertices();
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        int int70 = grafo69.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        grafo72.imprime();
        ds.Grafo grafo75 = new ds.Grafo((int) (byte) 10);
        int[] intArray76 = null;
        grafo75.prox = intArray76;
        int[] intArray84 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo75.peso = intArray84;
        grafo72.cab = intArray84;
        grafo69.prox = intArray84;
        grafo61.prox = intArray84;
        grafo1.peso = intArray84;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[10, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo6.existeAresta((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta30 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        grafo17.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = null;
        grafo20.prox = intArray21;
        int[] intArray29 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo20.peso = intArray29;
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta34 = grafo17.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        boolean boolean40 = grafo36.existeAresta((int) (byte) 0, (int) (short) -1);
        int int41 = grafo36.numVertices();
        int int42 = grafo36.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int int45 = grafo44.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        grafo47.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = null;
        grafo50.prox = intArray51;
        int[] intArray59 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo50.peso = intArray59;
        grafo47.cab = intArray59;
        grafo44.prox = intArray59;
        grafo36.prox = intArray59;
        grafo17.prox = intArray59;
        grafo1.peso = intArray59;
        java.lang.Class<?> wildcardClass66 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        int int22 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo1.existeAresta((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        java.lang.Class<?> wildcardClass11 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        int int40 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        grafo17.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = null;
        grafo20.prox = intArray21;
        int[] intArray29 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo20.peso = intArray29;
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta34 = grafo17.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        boolean boolean40 = grafo36.existeAresta((int) (byte) 0, (int) (short) -1);
        int int41 = grafo36.numVertices();
        int int42 = grafo36.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int int45 = grafo44.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        grafo47.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = null;
        grafo50.prox = intArray51;
        int[] intArray59 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo50.peso = intArray59;
        grafo47.cab = intArray59;
        grafo44.prox = intArray59;
        grafo36.prox = intArray59;
        grafo17.prox = intArray59;
        grafo1.peso = intArray59;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        int int73 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (int) (short) -1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo40 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo1.primeiroListaAdj((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNull(aresta42);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        java.lang.Class<?> wildcardClass36 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo30.prox = intArray35;
        int[] intArray37 = grafo30.prox;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        boolean boolean43 = grafo39.existeAresta((int) (byte) 0, (int) (short) -1);
        int int44 = grafo39.numVertices();
        int int45 = grafo39.numVertices();
        ds.Grafo grafo46 = grafo39.grafoTransposto();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo48.prox = intArray53;
        int[] intArray55 = grafo48.prox;
        grafo39.peso = intArray55;
        grafo30.cab = intArray55;
        grafo1.cab = intArray55;
        int int59 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo1.retiraAresta((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        boolean boolean75 = grafo1.existeAresta((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        boolean boolean10 = grafo6.existeAresta((int) (byte) 0, (int) (short) -1);
        int int11 = grafo6.numVertices();
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        grafo6.insereAresta(0, 100, (int) (byte) 0);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        boolean boolean24 = grafo20.existeAresta((int) (byte) 0, (int) (short) -1);
        int int25 = grafo20.numVertices();
        int int26 = grafo20.numVertices();
        ds.Grafo grafo27 = grafo20.grafoTransposto();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo29.prox = intArray34;
        int[] intArray36 = grafo29.prox;
        grafo20.peso = intArray36;
        grafo18.prox = intArray36;
        int int39 = grafo18.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        grafo41.imprime();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = null;
        grafo44.prox = intArray45;
        int[] intArray53 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo44.peso = intArray53;
        grafo41.cab = intArray53;
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        grafo59.imprime();
        ds.Grafo grafo62 = new ds.Grafo((int) (byte) 10);
        int[] intArray63 = null;
        grafo62.prox = intArray63;
        int[] intArray71 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo62.peso = intArray71;
        grafo59.cab = intArray71;
        grafo57.peso = intArray71;
        grafo41.cab = intArray71;
        grafo18.prox = intArray71;
        grafo6.prox = intArray71;
        grafo1.prox = intArray71;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '4', (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo21 = grafo20.grafoTransposto();
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo23.prox = intArray28;
        int[] intArray30 = grafo23.prox;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        boolean boolean36 = grafo32.existeAresta((int) (byte) 0, (int) (short) -1);
        int int37 = grafo32.numVertices();
        int int38 = grafo32.numVertices();
        ds.Grafo grafo39 = grafo32.grafoTransposto();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo41.prox = intArray46;
        int[] intArray48 = grafo41.prox;
        grafo32.peso = intArray48;
        grafo23.cab = intArray48;
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int[] intArray57 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo52.prox = intArray57;
        int[] intArray59 = grafo52.prox;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        boolean boolean65 = grafo61.existeAresta((int) (byte) 0, (int) (short) -1);
        int int66 = grafo61.numVertices();
        int int67 = grafo61.numVertices();
        ds.Grafo grafo68 = grafo61.grafoTransposto();
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 10);
        int[] intArray75 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo70.prox = intArray75;
        int[] intArray77 = grafo70.prox;
        grafo61.peso = intArray77;
        grafo52.cab = intArray77;
        grafo23.cab = intArray77;
        grafo20.peso = intArray77;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(grafo68);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[97, 10, 1, 0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        boolean boolean24 = grafo20.existeAresta((int) (byte) 0, (int) (short) -1);
        int int25 = grafo20.numVertices();
        int int26 = grafo20.numVertices();
        ds.Grafo grafo27 = grafo20.grafoTransposto();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo29.prox = intArray34;
        int[] intArray36 = grafo29.prox;
        grafo20.peso = intArray36;
        int[] intArray38 = grafo20.peso;
        grafo1.prox = intArray38;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo2.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        boolean boolean13 = grafo9.existeAresta((int) (byte) 0, (int) (short) -1);
        int int14 = grafo9.numVertices();
        int int15 = grafo9.numVertices();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo22.cab = intArray42;
        grafo9.peso = intArray42;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo48.prox = intArray53;
        int int55 = grafo48.numVertices();
        int[] intArray56 = grafo48.prox;
        grafo9.prox = intArray56;
        grafo1.prox = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10, 1, 0]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        int int25 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass26 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        int int19 = grafo8.numVertices();
        ds.Grafo grafo20 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        int int7 = grafo5.numVertices();
        int int8 = grafo5.numVertices();
        boolean boolean10 = grafo5.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo19.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = null;
        grafo42.prox = intArray43;
        int[] intArray51 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo42.peso = intArray51;
        grafo39.cab = intArray51;
        grafo31.cab = intArray51;
        grafo19.peso = intArray51;
        grafo5.prox = intArray51;
        grafo1.cab = intArray51;
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int int8 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int int11 = grafo10.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = null;
        grafo16.prox = intArray17;
        int[] intArray25 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo16.peso = intArray25;
        grafo13.cab = intArray25;
        grafo10.prox = intArray25;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo10.cab = intArray42;
        grafo1.peso = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta49 = grafo1.retiraAresta(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int int12 = grafo11.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        grafo14.imprime();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int[] intArray18 = null;
        grafo17.prox = intArray18;
        int[] intArray26 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo17.peso = intArray26;
        grafo14.cab = intArray26;
        grafo11.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        grafo31.imprime();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = null;
        grafo34.prox = intArray35;
        int[] intArray43 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo34.peso = intArray43;
        grafo31.cab = intArray43;
        grafo11.cab = intArray43;
        int int47 = grafo11.numVertices();
        int[] intArray48 = grafo11.cab;
        grafo8.cab = intArray48;
        ds.Grafo grafo50 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo50);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 10, (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo40 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo3 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        int int10 = grafo8.numVertices();
        int int11 = grafo8.numVertices();
        int int12 = grafo8.numVertices();
        boolean boolean14 = grafo8.listaAdjVazia(32);
        boolean boolean17 = grafo8.existeAresta(0, 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int int20 = grafo19.numVertices();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo19.prox = intArray34;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = null;
        grafo42.prox = intArray43;
        int[] intArray51 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo42.peso = intArray51;
        grafo39.cab = intArray51;
        grafo19.cab = intArray51;
        grafo8.peso = intArray51;
        grafo3.peso = intArray51;
        grafo1.cab = intArray51;
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) '#', 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 10, (int) 'a');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) '#');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo(0);
        grafo8.insereAresta((int) (byte) 10, (int) '#', 32);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int int15 = grafo14.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        grafo17.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = null;
        grafo20.prox = intArray21;
        int[] intArray29 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo20.peso = intArray29;
        grafo17.cab = intArray29;
        grafo14.prox = intArray29;
        grafo8.cab = intArray29;
        grafo1.cab = intArray29;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        boolean boolean8 = grafo1.existeAresta((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        grafo1.imprime();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        boolean boolean13 = grafo1.existeAresta(1, (int) (byte) 100);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        boolean boolean19 = grafo15.existeAresta((int) (byte) 0, (int) (short) -1);
        int int20 = grafo15.numVertices();
        int int21 = grafo15.numVertices();
        ds.Grafo grafo22 = grafo15.grafoTransposto();
        grafo15.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo28.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = null;
        grafo39.prox = intArray40;
        int[] intArray48 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo39.peso = intArray48;
        grafo36.cab = intArray48;
        grafo28.cab = intArray48;
        grafo15.peso = intArray48;
        boolean boolean55 = grafo15.existeAresta(0, (int) 'a');
        int[] intArray56 = grafo15.peso;
        grafo1.cab = intArray56;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        boolean boolean13 = grafo1.existeAresta((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        int int22 = grafo1.numVertices();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        boolean boolean28 = grafo24.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo24.peso = intArray42;
        grafo1.cab = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean10 = grafo7.listaAdjVazia((int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) 'a', (int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 0, (int) ' ');
        boolean boolean16 = grafo1.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 100, 10);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(35, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int int31 = grafo30.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        grafo33.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = null;
        grafo36.prox = intArray37;
        int[] intArray45 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo36.peso = intArray45;
        grafo33.cab = intArray45;
        grafo30.prox = intArray45;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        int int55 = grafo50.numVertices();
        int int56 = grafo50.numVertices();
        ds.Grafo grafo57 = grafo50.grafoTransposto();
        grafo50.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray68 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo63.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        grafo71.imprime();
        ds.Grafo grafo74 = new ds.Grafo((int) (byte) 10);
        int[] intArray75 = null;
        grafo74.prox = intArray75;
        int[] intArray83 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo74.peso = intArray83;
        grafo71.cab = intArray83;
        grafo63.cab = intArray83;
        grafo50.peso = intArray83;
        grafo30.prox = intArray83;
        grafo1.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.primeiroListaAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        boolean boolean38 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = null;
        grafo6.prox = intArray7;
        int[] intArray15 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo6.peso = intArray15;
        grafo3.cab = intArray15;
        ds.Grafo.Aresta aresta20 = grafo3.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        boolean boolean26 = grafo22.existeAresta((int) (byte) 0, (int) (short) -1);
        int int27 = grafo22.numVertices();
        int int28 = grafo22.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int int31 = grafo30.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        grafo33.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = null;
        grafo36.prox = intArray37;
        int[] intArray45 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo36.peso = intArray45;
        grafo33.cab = intArray45;
        grafo30.prox = intArray45;
        grafo22.prox = intArray45;
        grafo3.prox = intArray45;
        grafo1.peso = intArray45;
        ds.Grafo.Aresta aresta53 = grafo1.proxAdj(35);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta53);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo40 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta42 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo40);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo7.prox = intArray12;
        int[] intArray14 = grafo7.prox;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        grafo16.imprime();
        boolean boolean20 = grafo16.existeAresta((int) (byte) 0, (int) (short) -1);
        int int21 = grafo16.numVertices();
        int int22 = grafo16.numVertices();
        ds.Grafo grafo23 = grafo16.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray30 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo25.prox = intArray30;
        int[] intArray32 = grafo25.prox;
        grafo16.peso = intArray32;
        grafo7.cab = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        int int38 = grafo36.numVertices();
        int int39 = grafo36.numVertices();
        int int40 = grafo36.numVertices();
        boolean boolean42 = grafo36.listaAdjVazia(32);
        boolean boolean45 = grafo36.existeAresta(0, 0);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int int48 = grafo47.numVertices();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = null;
        grafo53.prox = intArray54;
        int[] intArray62 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo53.peso = intArray62;
        grafo50.cab = intArray62;
        grafo47.prox = intArray62;
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 10);
        grafo67.imprime();
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 10);
        int[] intArray71 = null;
        grafo70.prox = intArray71;
        int[] intArray79 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo70.peso = intArray79;
        grafo67.cab = intArray79;
        grafo47.cab = intArray79;
        grafo36.peso = intArray79;
        grafo7.peso = intArray79;
        int[] intArray85 = grafo7.peso;
        grafo1.peso = intArray85;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        int[] intArray21 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean13 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        java.lang.Class<?> wildcardClass73 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta(100, (int) (byte) 0, 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        ds.Grafo grafo19 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) '#', 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        int int29 = grafo1.numVertices();
        int int30 = grafo1.numVertices();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo32.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        grafo40.imprime();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = null;
        grafo43.prox = intArray44;
        int[] intArray52 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo43.peso = intArray52;
        grafo40.cab = intArray52;
        grafo32.cab = intArray52;
        int int56 = grafo32.numVertices();
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int int59 = grafo58.numVertices();
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo58.prox = intArray73;
        grafo32.prox = intArray73;
        grafo1.peso = intArray73;
        ds.Grafo grafo80 = new ds.Grafo((int) (byte) 10);
        grafo80.imprime();
        boolean boolean84 = grafo80.existeAresta((int) (byte) 0, (int) (short) -1);
        int int85 = grafo80.numVertices();
        int int86 = grafo80.numVertices();
        ds.Grafo grafo87 = grafo80.grafoTransposto();
        ds.Grafo grafo89 = new ds.Grafo((int) (byte) 10);
        int[] intArray94 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo89.prox = intArray94;
        int[] intArray96 = grafo89.prox;
        grafo80.peso = intArray96;
        grafo1.peso = intArray96;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertNotNull(grafo87);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[97, 10, 1, 0]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        grafo1.imprime();
        boolean boolean51 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta42 = grafo1.retiraAresta(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        grafo17.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = null;
        grafo20.prox = intArray21;
        int[] intArray29 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo20.peso = intArray29;
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta34 = grafo17.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        boolean boolean40 = grafo36.existeAresta((int) (byte) 0, (int) (short) -1);
        int int41 = grafo36.numVertices();
        int int42 = grafo36.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int int45 = grafo44.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        grafo47.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = null;
        grafo50.prox = intArray51;
        int[] intArray59 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo50.peso = intArray59;
        grafo47.cab = intArray59;
        grafo44.prox = intArray59;
        grafo36.prox = intArray59;
        grafo17.prox = intArray59;
        grafo1.peso = intArray59;
        int[] intArray66 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo14.cab = intArray34;
        grafo1.peso = intArray34;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo40.prox = intArray45;
        int int47 = grafo40.numVertices();
        int[] intArray48 = grafo40.prox;
        grafo1.prox = intArray48;
        int[] intArray50 = grafo1.peso;
        int int51 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int int31 = grafo30.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        grafo33.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = null;
        grafo36.prox = intArray37;
        int[] intArray45 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo36.peso = intArray45;
        grafo33.cab = intArray45;
        grafo30.prox = intArray45;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        int int55 = grafo50.numVertices();
        int int56 = grafo50.numVertices();
        ds.Grafo grafo57 = grafo50.grafoTransposto();
        grafo50.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray68 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo63.prox = intArray68;
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        grafo71.imprime();
        ds.Grafo grafo74 = new ds.Grafo((int) (byte) 10);
        int[] intArray75 = null;
        grafo74.prox = intArray75;
        int[] intArray83 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo74.peso = intArray83;
        grafo71.cab = intArray83;
        grafo63.cab = intArray83;
        grafo50.peso = intArray83;
        grafo30.prox = intArray83;
        grafo1.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo14.cab = intArray34;
        grafo1.peso = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 100, (int) (short) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo3.prox = intArray8;
        int[] intArray10 = grafo3.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo12.peso = intArray28;
        grafo3.cab = intArray28;
        int int31 = grafo3.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo33.prox = intArray38;
        int[] intArray40 = grafo33.prox;
        grafo3.prox = intArray40;
        grafo1.peso = intArray40;
        ds.Grafo.Aresta aresta44 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
        org.junit.Assert.assertNull(aresta44);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo1.prox = intArray18;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        int int24 = grafo1.numVertices();
        int int25 = grafo1.numVertices();
        ds.Grafo grafo27 = new ds.Grafo(100);
        int[] intArray29 = new int[] { ' ' };
        grafo27.cab = intArray29;
        grafo1.prox = intArray29;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        int int11 = aresta3.v1();
        int int12 = aresta3.v2();
        int int13 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
        int[] intArray7 = null;
        grafo1.peso = intArray7;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        int[] intArray36 = grafo9.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) 'a', (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(35, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) ' ', 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        grafo1.imprime();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) ' ', (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int int11 = grafo10.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = null;
        grafo16.prox = intArray17;
        int[] intArray25 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo16.peso = intArray25;
        grafo13.cab = intArray25;
        grafo10.prox = intArray25;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        boolean boolean34 = grafo30.existeAresta((int) (byte) 0, (int) (short) -1);
        int int35 = grafo30.numVertices();
        int int36 = grafo30.numVertices();
        ds.Grafo grafo37 = grafo30.grafoTransposto();
        grafo30.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo43.prox = intArray48;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        grafo51.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = null;
        grafo54.prox = intArray55;
        int[] intArray63 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo54.peso = intArray63;
        grafo51.cab = intArray63;
        grafo43.cab = intArray63;
        grafo30.peso = intArray63;
        grafo10.prox = intArray63;
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 10);
        grafo70.imprime();
        boolean boolean74 = grafo70.existeAresta((int) (byte) 0, (int) (short) -1);
        int int75 = grafo70.numVertices();
        int int76 = grafo70.numVertices();
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 10);
        int int79 = grafo78.numVertices();
        ds.Grafo grafo81 = new ds.Grafo((int) (byte) 10);
        grafo81.imprime();
        ds.Grafo grafo84 = new ds.Grafo((int) (byte) 10);
        int[] intArray85 = null;
        grafo84.prox = intArray85;
        int[] intArray93 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo84.peso = intArray93;
        grafo81.cab = intArray93;
        grafo78.prox = intArray93;
        grafo70.prox = intArray93;
        grafo10.peso = intArray93;
        grafo8.prox = intArray93;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        int[] intArray36 = grafo9.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        boolean boolean75 = grafo1.existeAresta(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        int int29 = grafo1.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo1.prox = intArray38;
        int[] intArray40 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int int35 = grafo34.numVertices();
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        grafo37.imprime();
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = null;
        grafo40.prox = intArray41;
        int[] intArray49 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo40.peso = intArray49;
        grafo37.cab = intArray49;
        grafo34.prox = intArray49;
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        grafo54.imprime();
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 10);
        int[] intArray58 = null;
        grafo57.prox = intArray58;
        int[] intArray66 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo57.peso = intArray66;
        grafo54.cab = intArray66;
        grafo34.cab = intArray66;
        int int70 = grafo34.numVertices();
        int[] intArray71 = grafo34.cab;
        grafo1.peso = intArray71;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int int10 = grafo9.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.prox = intArray24;
        int int29 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        grafo21.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = null;
        grafo45.prox = intArray46;
        int[] intArray54 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo45.peso = intArray54;
        grafo42.cab = intArray54;
        grafo34.cab = intArray54;
        grafo21.peso = intArray54;
        grafo1.prox = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = grafo1.existeAresta(35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo17.peso = intArray31;
        grafo1.cab = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta37 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo8.existeAresta((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean9 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        int[] intArray20 = grafo9.prox;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = null;
        grafo27.prox = intArray28;
        int[] intArray36 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo27.peso = intArray36;
        grafo24.cab = intArray36;
        grafo22.peso = intArray36;
        grafo9.cab = intArray36;
        grafo7.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = grafo7.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean9 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        int int14 = grafo11.numVertices();
        boolean boolean16 = grafo11.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        int[] intArray34 = grafo27.prox;
        grafo25.peso = intArray34;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo37.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        grafo45.imprime();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray49 = null;
        grafo48.prox = intArray49;
        int[] intArray57 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo48.peso = intArray57;
        grafo45.cab = intArray57;
        grafo37.cab = intArray57;
        grafo25.peso = intArray57;
        grafo11.prox = intArray57;
        grafo1.prox = intArray57;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo.Aresta aresta50 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta52 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo10.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean9 = grafo1.existeAresta(32, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean11 = grafo7.existeAresta((int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (int) (short) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 1, 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int[] intArray37 = null;
        grafo1.prox = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta41 = grafo1.retiraAresta((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.insereAresta(0, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 10, (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 0);
        int int27 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo1.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        boolean boolean42 = grafo1.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray49 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo44.prox = intArray49;
        int[] intArray51 = grafo44.prox;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        int int54 = grafo53.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo53.prox = intArray68;
        ds.Grafo grafo73 = new ds.Grafo((int) (byte) 10);
        grafo73.imprime();
        ds.Grafo grafo76 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = null;
        grafo76.prox = intArray77;
        int[] intArray85 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo76.peso = intArray85;
        grafo73.cab = intArray85;
        grafo53.cab = intArray85;
        grafo44.peso = intArray85;
        grafo1.peso = intArray85;
        int[] intArray91 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        int[] intArray36 = grafo9.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo9.proxAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        boolean boolean26 = grafo22.existeAresta((int) (byte) 0, (int) (short) -1);
        int int27 = grafo22.numVertices();
        int int28 = grafo22.numVertices();
        ds.Grafo grafo29 = grafo22.grafoTransposto();
        grafo22.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo35.prox = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray47 = null;
        grafo46.prox = intArray47;
        int[] intArray55 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo46.peso = intArray55;
        grafo43.cab = intArray55;
        grafo35.cab = intArray55;
        grafo22.peso = intArray55;
        grafo1.prox = intArray55;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = null;
        grafo11.prox = intArray12;
        int[] intArray20 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo11.peso = intArray20;
        grafo8.cab = intArray20;
        ds.Grafo.Aresta aresta25 = grafo8.retiraAresta((int) (byte) 0, 1);
        grafo8.imprime();
        ds.Grafo grafo27 = grafo8.grafoTransposto();
        int[] intArray28 = grafo8.cab;
        grafo1.cab = intArray28;
        boolean boolean32 = grafo1.existeAresta((int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        java.lang.Class<?> wildcardClass9 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) 'a', (int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 0, (int) ' ');
        int int15 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 1, 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo20.prox = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        grafo28.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = null;
        grafo31.prox = intArray32;
        int[] intArray40 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo31.peso = intArray40;
        grafo28.cab = intArray40;
        grafo20.cab = intArray40;
        grafo8.peso = intArray40;
        boolean boolean47 = grafo8.existeAresta(100, (int) '#');
        ds.Grafo.Aresta aresta50 = grafo8.retiraAresta((int) (byte) 0, (-1));
        int int51 = grafo8.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = grafo9.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta24);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        int int7 = grafo5.numVertices();
        int int8 = grafo5.numVertices();
        int int9 = grafo5.numVertices();
        boolean boolean11 = grafo5.listaAdjVazia(32);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo13.peso = intArray31;
        grafo5.peso = intArray31;
        grafo1.prox = intArray31;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo38.prox = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        grafo46.imprime();
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray50 = null;
        grafo49.prox = intArray50;
        int[] intArray58 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo49.peso = intArray58;
        grafo46.cab = intArray58;
        grafo38.cab = intArray58;
        int int62 = grafo38.numVertices();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int int65 = grafo64.numVertices();
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 10);
        grafo67.imprime();
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 10);
        int[] intArray71 = null;
        grafo70.prox = intArray71;
        int[] intArray79 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo70.peso = intArray79;
        grafo67.cab = intArray79;
        grafo64.prox = intArray79;
        grafo38.prox = intArray79;
        grafo1.cab = intArray79;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo1.cab = intArray21;
        int int25 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 1, (int) (short) 0);
        int int10 = aresta9.v1();
        int int11 = aresta9.v1();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo3 = new ds.Grafo(100);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = null;
        grafo8.prox = intArray9;
        int[] intArray17 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo8.peso = intArray17;
        grafo5.cab = intArray17;
        ds.Grafo.Aresta aresta22 = grafo5.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        boolean boolean28 = grafo24.existeAresta((int) (byte) 0, (int) (short) -1);
        int int29 = grafo24.numVertices();
        int int30 = grafo24.numVertices();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        grafo35.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = null;
        grafo38.prox = intArray39;
        int[] intArray47 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo38.peso = intArray47;
        grafo35.cab = intArray47;
        grafo32.prox = intArray47;
        grafo24.prox = intArray47;
        grafo5.prox = intArray47;
        grafo3.peso = intArray47;
        grafo1.cab = intArray47;
        int[] intArray55 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 0, (int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo23.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        grafo31.imprime();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = null;
        grafo34.prox = intArray35;
        int[] intArray43 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo34.peso = intArray43;
        grafo31.cab = intArray43;
        grafo23.cab = intArray43;
        grafo10.peso = intArray43;
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo49.prox = intArray54;
        int int56 = grafo49.numVertices();
        int[] intArray57 = grafo49.prox;
        grafo10.prox = intArray57;
        int[] intArray59 = grafo10.peso;
        grafo1.cab = intArray59;
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(10, (int) (short) -1, 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 0, (int) (short) -1);
        int int13 = grafo8.numVertices();
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        grafo8.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        grafo29.imprime();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = null;
        grafo32.prox = intArray33;
        int[] intArray41 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo32.peso = intArray41;
        grafo29.cab = intArray41;
        grafo21.cab = intArray41;
        grafo8.peso = intArray41;
        boolean boolean48 = grafo8.existeAresta(0, (int) 'a');
        int[] intArray49 = grafo8.peso;
        grafo1.peso = intArray49;
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        grafo52.imprime();
        int int54 = grafo52.numVertices();
        int int55 = grafo52.numVertices();
        boolean boolean57 = grafo52.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo59.prox = intArray64;
        int[] intArray66 = grafo59.prox;
        grafo52.prox = intArray66;
        grafo1.prox = intArray66;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta70 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.listaAdjVazia(0);
        boolean boolean36 = grafo1.listaAdjVazia(100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(35, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 10, (int) '4');
        int int13 = grafo8.numVertices();
        ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj((int) (short) 0);
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        boolean boolean37 = grafo34.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = null;
        grafo42.prox = intArray43;
        int[] intArray51 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo42.peso = intArray51;
        grafo39.cab = intArray51;
        grafo34.prox = intArray51;
        grafo1.peso = intArray51;
        int int56 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta58 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 1, (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 100, 10);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        int int33 = grafo30.numVertices();
        int int34 = grafo30.numVertices();
        boolean boolean36 = grafo30.listaAdjVazia(32);
        boolean boolean39 = grafo30.existeAresta(0, 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int int42 = grafo41.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        grafo44.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = null;
        grafo47.prox = intArray48;
        int[] intArray56 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo47.peso = intArray56;
        grafo44.cab = intArray56;
        grafo41.prox = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo41.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.cab = intArray73;
        int[] intArray79 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 10, 1, 0]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.imprime();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        int int12 = grafo11.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray18 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo13.prox = intArray18;
        int[] intArray20 = grafo13.prox;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        boolean boolean26 = grafo22.existeAresta((int) (byte) 0, (int) (short) -1);
        int int27 = grafo22.numVertices();
        int int28 = grafo22.numVertices();
        ds.Grafo grafo29 = grafo22.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        int[] intArray38 = grafo31.prox;
        grafo22.peso = intArray38;
        grafo13.cab = intArray38;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        int int44 = grafo42.numVertices();
        int int45 = grafo42.numVertices();
        int int46 = grafo42.numVertices();
        boolean boolean48 = grafo42.listaAdjVazia(32);
        boolean boolean51 = grafo42.existeAresta(0, 0);
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        int int54 = grafo53.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo53.prox = intArray68;
        ds.Grafo grafo73 = new ds.Grafo((int) (byte) 10);
        grafo73.imprime();
        ds.Grafo grafo76 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = null;
        grafo76.prox = intArray77;
        int[] intArray85 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo76.peso = intArray85;
        grafo73.cab = intArray85;
        grafo53.cab = intArray85;
        grafo42.peso = intArray85;
        grafo13.peso = intArray85;
        grafo9.cab = intArray85;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 100, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        int[] intArray19 = grafo1.peso;
        grafo1.imprime();
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (-1));
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        int int22 = grafo1.numVertices();
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(aresta24);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo(100);
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean14 = grafo10.existeAresta(1, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo16.prox = intArray21;
        int[] intArray23 = grafo16.prox;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        grafo25.imprime();
        boolean boolean29 = grafo25.existeAresta((int) (byte) 0, (int) (short) -1);
        int int30 = grafo25.numVertices();
        int int31 = grafo25.numVertices();
        ds.Grafo grafo32 = grafo25.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        int[] intArray41 = grafo34.prox;
        grafo25.peso = intArray41;
        grafo16.cab = intArray41;
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        grafo45.imprime();
        int int47 = grafo45.numVertices();
        int int48 = grafo45.numVertices();
        int int49 = grafo45.numVertices();
        boolean boolean51 = grafo45.listaAdjVazia(32);
        boolean boolean54 = grafo45.existeAresta(0, 0);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int int57 = grafo56.numVertices();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        grafo59.imprime();
        ds.Grafo grafo62 = new ds.Grafo((int) (byte) 10);
        int[] intArray63 = null;
        grafo62.prox = intArray63;
        int[] intArray71 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo62.peso = intArray71;
        grafo59.cab = intArray71;
        grafo56.prox = intArray71;
        ds.Grafo grafo76 = new ds.Grafo((int) (byte) 10);
        grafo76.imprime();
        ds.Grafo grafo79 = new ds.Grafo((int) (byte) 10);
        int[] intArray80 = null;
        grafo79.prox = intArray80;
        int[] intArray88 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo79.peso = intArray88;
        grafo76.cab = intArray88;
        grafo56.cab = intArray88;
        grafo45.peso = intArray88;
        grafo16.cab = intArray88;
        grafo10.cab = intArray88;
        grafo1.cab = intArray88;
        ds.Grafo.Aresta aresta98 = grafo1.retiraAresta(1, 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta98);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) 'a', (int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 0, (int) ' ');
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        grafo16.imprime();
        int int18 = grafo16.numVertices();
        int int19 = grafo16.numVertices();
        int int20 = grafo16.numVertices();
        boolean boolean22 = grafo16.listaAdjVazia(32);
        boolean boolean25 = grafo16.existeAresta(0, 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int int28 = grafo27.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo27.prox = intArray42;
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        grafo47.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = null;
        grafo50.prox = intArray51;
        int[] intArray59 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo50.peso = intArray59;
        grafo47.cab = intArray59;
        grafo27.cab = intArray59;
        grafo16.peso = intArray59;
        ds.Grafo grafo65 = new ds.Grafo((int) (byte) 10);
        grafo65.imprime();
        boolean boolean69 = grafo65.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        grafo71.imprime();
        ds.Grafo grafo74 = new ds.Grafo((int) (byte) 10);
        int[] intArray75 = null;
        grafo74.prox = intArray75;
        int[] intArray83 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo74.peso = intArray83;
        grafo71.cab = intArray83;
        grafo65.peso = intArray83;
        grafo16.peso = intArray83;
        grafo1.prox = intArray83;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean10 = grafo7.listaAdjVazia((int) ' ');
        grafo7.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        int int19 = grafo8.numVertices();
        grafo8.imprime();
        ds.Grafo.Aresta aresta22 = grafo8.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 100, (int) (short) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo(100);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = null;
        grafo27.prox = intArray28;
        int[] intArray36 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo27.peso = intArray36;
        grafo24.cab = intArray36;
        ds.Grafo.Aresta aresta41 = grafo24.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        boolean boolean47 = grafo43.existeAresta((int) (byte) 0, (int) (short) -1);
        int int48 = grafo43.numVertices();
        int int49 = grafo43.numVertices();
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        int int52 = grafo51.numVertices();
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        grafo54.imprime();
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 10);
        int[] intArray58 = null;
        grafo57.prox = intArray58;
        int[] intArray66 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo57.peso = intArray66;
        grafo54.cab = intArray66;
        grafo51.prox = intArray66;
        grafo43.prox = intArray66;
        grafo24.prox = intArray66;
        grafo22.peso = intArray66;
        grafo20.prox = intArray66;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        grafo21.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = null;
        grafo45.prox = intArray46;
        int[] intArray54 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo45.peso = intArray54;
        grafo42.cab = intArray54;
        grafo34.cab = intArray54;
        grafo21.peso = intArray54;
        grafo1.prox = intArray54;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        boolean boolean65 = grafo61.existeAresta((int) (byte) 0, (int) (short) -1);
        int int66 = grafo61.numVertices();
        int int67 = grafo61.numVertices();
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        int int70 = grafo69.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        grafo72.imprime();
        ds.Grafo grafo75 = new ds.Grafo((int) (byte) 10);
        int[] intArray76 = null;
        grafo75.prox = intArray76;
        int[] intArray84 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo75.peso = intArray84;
        grafo72.cab = intArray84;
        grafo69.prox = intArray84;
        grafo61.prox = intArray84;
        grafo1.peso = intArray84;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta92 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 1);
        int int9 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        int int5 = aresta4.v2();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.listaAdjVazia(0);
        boolean boolean36 = grafo1.listaAdjVazia(100);
        boolean boolean38 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        int[] intArray34 = grafo27.prox;
        grafo25.peso = intArray34;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo37.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        grafo45.imprime();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray49 = null;
        grafo48.prox = intArray49;
        int[] intArray57 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo48.peso = intArray57;
        grafo45.cab = intArray57;
        grafo37.cab = intArray57;
        grafo25.peso = intArray57;
        grafo1.peso = intArray57;
        boolean boolean64 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean10 = grafo7.listaAdjVazia((int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        grafo11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean9 = grafo1.existeAresta(32, (int) (short) -1);
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) '4');
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 10, (int) '4');
        int int13 = grafo8.numVertices();
        ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta17 = grafo8.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int int7 = grafo6.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray13 = null;
        grafo12.prox = intArray13;
        int[] intArray21 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo12.peso = intArray21;
        grafo9.cab = intArray21;
        grafo6.prox = intArray21;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        grafo26.imprime();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray30 = null;
        grafo29.prox = intArray30;
        int[] intArray38 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo29.peso = intArray38;
        grafo26.cab = intArray38;
        grafo6.cab = intArray38;
        grafo1.cab = intArray38;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        boolean boolean13 = grafo9.existeAresta((int) (byte) 0, (int) (short) -1);
        int int14 = grafo9.numVertices();
        int int15 = grafo9.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int int18 = grafo17.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = null;
        grafo23.prox = intArray24;
        int[] intArray32 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo23.peso = intArray32;
        grafo20.cab = intArray32;
        grafo17.prox = intArray32;
        grafo9.prox = intArray32;
        int int37 = grafo9.numVertices();
        int int38 = grafo9.numVertices();
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo40.prox = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        grafo48.imprime();
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        int[] intArray52 = null;
        grafo51.prox = intArray52;
        int[] intArray60 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo51.peso = intArray60;
        grafo48.cab = intArray60;
        grafo40.cab = intArray60;
        int int64 = grafo40.numVertices();
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int int67 = grafo66.numVertices();
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        grafo69.imprime();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = null;
        grafo72.prox = intArray73;
        int[] intArray81 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo72.peso = intArray81;
        grafo69.cab = intArray81;
        grafo66.prox = intArray81;
        grafo40.prox = intArray81;
        grafo9.peso = intArray81;
        grafo1.cab = intArray81;
        ds.Grafo grafo88 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo88);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int int27 = grafo26.numVertices();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        grafo29.imprime();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = null;
        grafo32.prox = intArray33;
        int[] intArray41 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo32.peso = intArray41;
        grafo29.cab = intArray41;
        grafo26.prox = intArray41;
        grafo18.prox = intArray41;
        grafo16.peso = intArray41;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo3 = new ds.Grafo(100);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = null;
        grafo8.prox = intArray9;
        int[] intArray17 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo8.peso = intArray17;
        grafo5.cab = intArray17;
        ds.Grafo.Aresta aresta22 = grafo5.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        boolean boolean28 = grafo24.existeAresta((int) (byte) 0, (int) (short) -1);
        int int29 = grafo24.numVertices();
        int int30 = grafo24.numVertices();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        grafo35.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = null;
        grafo38.prox = intArray39;
        int[] intArray47 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo38.peso = intArray47;
        grafo35.cab = intArray47;
        grafo32.prox = intArray47;
        grafo24.prox = intArray47;
        grafo5.prox = intArray47;
        grafo3.peso = intArray47;
        grafo1.cab = intArray47;
        boolean boolean56 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 1, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) -1, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) '4', 0);
        int int13 = aresta12.v2();
        int int14 = aresta12.peso();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo20 = new ds.Grafo(100);
        int[] intArray22 = new int[] { ' ' };
        grafo20.cab = intArray22;
        grafo1.cab = intArray22;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) ' ', 32, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo(0);
        boolean boolean8 = grafo6.listaAdjVazia(0);
        int int9 = grafo6.numVertices();
        boolean boolean12 = grafo6.existeAresta((int) ' ', (int) (short) 100);
        grafo6.imprime();
        ds.Grafo.Aresta aresta16 = grafo6.retiraAresta(0, (int) (byte) 100);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo26 = grafo25.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo28.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        grafo36.imprime();
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = null;
        grafo39.prox = intArray40;
        int[] intArray48 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo39.peso = intArray48;
        grafo36.cab = intArray48;
        grafo28.cab = intArray48;
        grafo26.prox = intArray48;
        int[] intArray53 = grafo26.prox;
        grafo6.cab = intArray53;
        grafo1.peso = intArray53;
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        boolean boolean6 = grafo3.existeAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = null;
        grafo13.prox = intArray14;
        int[] intArray22 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo13.peso = intArray22;
        grafo10.cab = intArray22;
        ds.Grafo.Aresta aresta27 = grafo10.retiraAresta((int) (byte) 0, 1);
        grafo10.imprime();
        ds.Grafo grafo29 = grafo10.grafoTransposto();
        int[] intArray30 = grafo10.cab;
        grafo3.cab = intArray30;
        grafo1.prox = intArray30;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(32);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        grafo1.imprime();
        int[] intArray22 = null;
        grafo1.peso = intArray22;
        boolean boolean25 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean5 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) 'a', 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) ' ', (int) (short) 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo3.prox = intArray8;
        int[] intArray10 = grafo3.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo12.peso = intArray28;
        grafo3.cab = intArray28;
        int int31 = grafo3.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo33.prox = intArray38;
        int[] intArray40 = grafo33.prox;
        grafo3.prox = intArray40;
        grafo1.peso = intArray40;
        java.lang.Class<?> wildcardClass43 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '#', (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean9 = grafo1.existeAresta(32, (int) (short) -1);
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) '4');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 0, (int) (short) -1);
        int int13 = grafo8.numVertices();
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo17.prox = intArray22;
        int[] intArray24 = grafo17.prox;
        grafo15.peso = intArray24;
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        grafo35.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = null;
        grafo38.prox = intArray39;
        int[] intArray47 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo38.peso = intArray47;
        grafo35.cab = intArray47;
        grafo27.cab = intArray47;
        grafo15.peso = intArray47;
        grafo1.prox = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta55 = grafo1.retiraAresta(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        grafo1.insereAresta((int) (byte) 100, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo12.peso = intArray28;
        grafo10.prox = intArray28;
        int int31 = grafo10.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        grafo33.imprime();
        boolean boolean37 = grafo33.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = null;
        grafo42.prox = intArray43;
        int[] intArray51 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo42.peso = intArray51;
        grafo39.cab = intArray51;
        grafo33.peso = intArray51;
        grafo10.cab = intArray51;
        grafo8.cab = intArray51;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo30.prox = intArray35;
        int[] intArray37 = grafo30.prox;
        grafo21.peso = intArray37;
        grafo12.cab = intArray37;
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        grafo41.imprime();
        int int43 = grafo41.numVertices();
        int int44 = grafo41.numVertices();
        int int45 = grafo41.numVertices();
        boolean boolean47 = grafo41.listaAdjVazia(32);
        boolean boolean50 = grafo41.existeAresta(0, 0);
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int int53 = grafo52.numVertices();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        grafo55.imprime();
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray59 = null;
        grafo58.prox = intArray59;
        int[] intArray67 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo58.peso = intArray67;
        grafo55.cab = intArray67;
        grafo52.prox = intArray67;
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        grafo72.imprime();
        ds.Grafo grafo75 = new ds.Grafo((int) (byte) 10);
        int[] intArray76 = null;
        grafo75.prox = intArray76;
        int[] intArray84 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo75.peso = intArray84;
        grafo72.cab = intArray84;
        grafo52.cab = intArray84;
        grafo41.peso = intArray84;
        grafo12.peso = intArray84;
        int[] intArray90 = grafo12.cab;
        grafo1.cab = intArray90;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta93 = grafo1.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[97, 10, 1, 0]");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = null;
        grafo11.prox = intArray12;
        int[] intArray20 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo11.peso = intArray20;
        grafo8.cab = intArray20;
        ds.Grafo.Aresta aresta25 = grafo8.retiraAresta((int) (byte) 0, 1);
        grafo8.imprime();
        ds.Grafo grafo27 = grafo8.grafoTransposto();
        int[] intArray28 = grafo8.cab;
        grafo1.cab = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo1.existeAresta((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo(1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        boolean boolean25 = grafo21.existeAresta((int) (byte) 0, (int) (short) -1);
        int int26 = grafo21.numVertices();
        int int27 = grafo21.numVertices();
        ds.Grafo grafo28 = grafo21.grafoTransposto();
        grafo21.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo34.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        grafo42.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = null;
        grafo45.prox = intArray46;
        int[] intArray54 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo45.peso = intArray54;
        grafo42.cab = intArray54;
        grafo34.cab = intArray54;
        grafo21.peso = intArray54;
        grafo1.prox = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo1.retiraAresta(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo14.cab = intArray34;
        grafo1.peso = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo39 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) '#', (int) (short) 10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, (int) (short) 100);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        boolean boolean6 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 1, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 0, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 10, (int) '4');
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo8.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = null;
        grafo6.prox = intArray7;
        int[] intArray15 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo6.peso = intArray15;
        grafo3.cab = intArray15;
        ds.Grafo.Aresta aresta20 = grafo3.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        boolean boolean26 = grafo22.existeAresta((int) (byte) 0, (int) (short) -1);
        int int27 = grafo22.numVertices();
        int int28 = grafo22.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int int31 = grafo30.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        grafo33.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = null;
        grafo36.prox = intArray37;
        int[] intArray45 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo36.peso = intArray45;
        grafo33.cab = intArray45;
        grafo30.prox = intArray45;
        grafo22.prox = intArray45;
        grafo3.prox = intArray45;
        grafo1.peso = intArray45;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        grafo53.imprime();
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray57 = null;
        grafo56.prox = intArray57;
        int[] intArray65 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo56.peso = intArray65;
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta70 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo11 = new ds.Grafo(0);
        boolean boolean13 = grafo11.listaAdjVazia(0);
        int int14 = grafo11.numVertices();
        boolean boolean17 = grafo11.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        boolean boolean23 = grafo19.existeAresta((int) (byte) 0, (int) (short) -1);
        int int24 = grafo19.numVertices();
        int int25 = grafo19.numVertices();
        ds.Grafo grafo26 = grafo19.grafoTransposto();
        grafo19.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo32.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        grafo40.imprime();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = null;
        grafo43.prox = intArray44;
        int[] intArray52 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo43.peso = intArray52;
        grafo40.cab = intArray52;
        grafo32.cab = intArray52;
        grafo19.peso = intArray52;
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray63 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo58.prox = intArray63;
        int int65 = grafo58.numVertices();
        int[] intArray66 = grafo58.prox;
        grafo19.prox = intArray66;
        grafo11.prox = intArray66;
        grafo6.peso = intArray66;
        ds.Grafo.Aresta aresta72 = grafo6.retiraAresta(1, 35);
        ds.Grafo grafo73 = grafo6.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertNotNull(grafo73);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo11.prox = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = null;
        grafo22.prox = intArray23;
        int[] intArray31 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo22.peso = intArray31;
        grafo19.cab = intArray31;
        grafo11.cab = intArray31;
        grafo9.prox = intArray31;
        int[] intArray36 = grafo9.prox;
        int int37 = grafo9.numVertices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo14.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        grafo22.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = null;
        grafo25.prox = intArray26;
        int[] intArray34 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo25.peso = intArray34;
        grafo22.cab = intArray34;
        grafo14.cab = intArray34;
        grafo1.peso = intArray34;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo40.prox = intArray45;
        int int47 = grafo40.numVertices();
        int[] intArray48 = grafo40.prox;
        grafo1.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10, 1, 0]");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        int int7 = grafo5.numVertices();
        int int8 = grafo5.numVertices();
        boolean boolean10 = grafo5.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        boolean boolean16 = grafo12.existeAresta((int) (byte) 0, (int) (short) -1);
        int int17 = grafo12.numVertices();
        int int18 = grafo12.numVertices();
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        int[] intArray28 = grafo21.prox;
        grafo19.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo31.prox = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        grafo39.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = null;
        grafo42.prox = intArray43;
        int[] intArray51 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo42.peso = intArray51;
        grafo39.cab = intArray51;
        grafo31.cab = intArray51;
        grafo19.peso = intArray51;
        grafo5.prox = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo59.prox = intArray64;
        int[] intArray66 = grafo59.prox;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        grafo68.imprime();
        boolean boolean72 = grafo68.existeAresta((int) (byte) 0, (int) (short) -1);
        int int73 = grafo68.numVertices();
        int int74 = grafo68.numVertices();
        ds.Grafo grafo75 = grafo68.grafoTransposto();
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 10);
        int[] intArray82 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo77.prox = intArray82;
        int[] intArray84 = grafo77.prox;
        grafo68.peso = intArray84;
        grafo59.cab = intArray84;
        int int87 = grafo59.numVertices();
        ds.Grafo grafo89 = new ds.Grafo((int) (byte) 10);
        int[] intArray94 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo89.prox = intArray94;
        int[] intArray96 = grafo89.prox;
        grafo59.prox = intArray96;
        grafo1.cab = intArray96;
        int[] intArray99 = grafo1.cab;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
        org.junit.Assert.assertNotNull(grafo75);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray99), "[97, 10, 1, 0]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        boolean boolean54 = grafo50.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        grafo56.imprime();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray60 = null;
        grafo59.prox = intArray60;
        int[] intArray68 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo59.peso = intArray68;
        grafo56.cab = intArray68;
        grafo50.peso = intArray68;
        grafo1.peso = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta74 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, 100);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo1.peso = intArray17;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '#', (int) (short) -1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo3.numVertices();
        int int9 = grafo3.numVertices();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo12.prox = intArray17;
        int[] intArray19 = grafo12.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        int int22 = grafo1.numVertices();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        boolean boolean28 = grafo24.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo24.peso = intArray42;
        grafo1.cab = intArray42;
        int[] intArray47 = null;
        grafo1.peso = intArray47;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 1, (-1));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (byte) 100, (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass19 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        int int8 = grafo6.numVertices();
        int int9 = grafo6.numVertices();
        int int10 = grafo6.numVertices();
        boolean boolean12 = grafo6.listaAdjVazia(32);
        boolean boolean15 = grafo6.existeAresta(0, 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int int18 = grafo17.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = null;
        grafo23.prox = intArray24;
        int[] intArray32 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo23.peso = intArray32;
        grafo20.cab = intArray32;
        grafo17.prox = intArray32;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        grafo37.imprime();
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = null;
        grafo40.prox = intArray41;
        int[] intArray49 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo40.peso = intArray49;
        grafo37.cab = intArray49;
        grafo17.cab = intArray49;
        grafo6.peso = intArray49;
        grafo1.peso = intArray49;
        int int55 = grafo1.numVertices();
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 10);
        grafo57.imprime();
        boolean boolean61 = grafo57.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        grafo63.imprime();
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray67 = null;
        grafo66.prox = intArray67;
        int[] intArray75 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo66.peso = intArray75;
        grafo63.cab = intArray75;
        grafo57.peso = intArray75;
        grafo1.peso = intArray75;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) '#', 32);
        ds.Grafo grafo23 = new ds.Grafo(100);
        int int24 = grafo23.numVertices();
        grafo23.insereAresta(10, (int) (short) -1, 0);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        boolean boolean34 = grafo30.existeAresta((int) (byte) 0, (int) (short) -1);
        int int35 = grafo30.numVertices();
        int int36 = grafo30.numVertices();
        ds.Grafo grafo37 = grafo30.grafoTransposto();
        grafo30.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo43.prox = intArray48;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        grafo51.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = null;
        grafo54.prox = intArray55;
        int[] intArray63 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo54.peso = intArray63;
        grafo51.cab = intArray63;
        grafo43.cab = intArray63;
        grafo30.peso = intArray63;
        boolean boolean70 = grafo30.existeAresta(0, (int) 'a');
        int[] intArray71 = grafo30.peso;
        grafo23.peso = intArray71;
        grafo1.prox = intArray71;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        grafo7.imprime();
        boolean boolean11 = grafo7.existeAresta((int) (byte) 0, (int) (short) -1);
        int int12 = grafo7.numVertices();
        int int13 = grafo7.numVertices();
        ds.Grafo grafo14 = grafo7.grafoTransposto();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo16.prox = intArray21;
        int[] intArray23 = grafo16.prox;
        grafo14.peso = intArray23;
        int int25 = grafo14.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        grafo27.imprime();
        boolean boolean31 = grafo27.existeAresta((int) (byte) 0, (int) (short) -1);
        int int32 = grafo27.numVertices();
        ds.Grafo grafo33 = grafo27.grafoTransposto();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        int[] intArray46 = grafo35.prox;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        grafo50.imprime();
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = null;
        grafo53.prox = intArray54;
        int[] intArray62 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo53.peso = intArray62;
        grafo50.cab = intArray62;
        grafo48.peso = intArray62;
        grafo35.cab = intArray62;
        grafo33.prox = intArray62;
        grafo14.prox = intArray62;
        grafo1.prox = intArray62;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(10, (int) (short) -1, 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 0, (int) (short) -1);
        int int13 = grafo8.numVertices();
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        grafo8.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo21.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        grafo29.imprime();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = null;
        grafo32.prox = intArray33;
        int[] intArray41 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo32.peso = intArray41;
        grafo29.cab = intArray41;
        grafo21.cab = intArray41;
        grafo8.peso = intArray41;
        boolean boolean48 = grafo8.existeAresta(0, (int) 'a');
        int[] intArray49 = grafo8.peso;
        grafo1.peso = intArray49;
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        grafo52.imprime();
        int int54 = grafo52.numVertices();
        int int55 = grafo52.numVertices();
        boolean boolean57 = grafo52.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo59.prox = intArray64;
        int[] intArray66 = grafo59.prox;
        grafo52.prox = intArray66;
        grafo1.prox = intArray66;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo9.prox = intArray14;
        int[] intArray16 = grafo9.prox;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        int[] intArray34 = grafo27.prox;
        grafo18.peso = intArray34;
        grafo9.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        grafo38.imprime();
        int int40 = grafo38.numVertices();
        int int41 = grafo38.numVertices();
        int int42 = grafo38.numVertices();
        boolean boolean44 = grafo38.listaAdjVazia(32);
        boolean boolean47 = grafo38.existeAresta(0, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int int50 = grafo49.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        grafo52.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray56 = null;
        grafo55.prox = intArray56;
        int[] intArray64 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo55.peso = intArray64;
        grafo52.cab = intArray64;
        grafo49.prox = intArray64;
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        grafo69.imprime();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = null;
        grafo72.prox = intArray73;
        int[] intArray81 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo72.peso = intArray81;
        grafo69.cab = intArray81;
        grafo49.cab = intArray81;
        grafo38.peso = intArray81;
        grafo9.cab = intArray81;
        grafo1.prox = intArray81;
        int[] intArray88 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta90 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 0, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, 32);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) -1, (int) 'a');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo9.prox = intArray14;
        int[] intArray16 = grafo9.prox;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        int[] intArray34 = grafo27.prox;
        grafo18.peso = intArray34;
        grafo9.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        grafo38.imprime();
        int int40 = grafo38.numVertices();
        int int41 = grafo38.numVertices();
        int int42 = grafo38.numVertices();
        boolean boolean44 = grafo38.listaAdjVazia(32);
        boolean boolean47 = grafo38.existeAresta(0, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int int50 = grafo49.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        grafo52.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray56 = null;
        grafo55.prox = intArray56;
        int[] intArray64 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo55.peso = intArray64;
        grafo52.cab = intArray64;
        grafo49.prox = intArray64;
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        grafo69.imprime();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = null;
        grafo72.prox = intArray73;
        int[] intArray81 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo72.peso = intArray81;
        grafo69.cab = intArray81;
        grafo49.cab = intArray81;
        grafo38.peso = intArray81;
        grafo9.cab = intArray81;
        grafo1.prox = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[10, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        int int19 = grafo8.numVertices();
        grafo8.imprime();
        ds.Grafo grafo21 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo10.prox = intArray15;
        int[] intArray17 = grafo10.prox;
        grafo8.peso = intArray17;
        int int19 = grafo8.numVertices();
        grafo8.imprime();
        ds.Grafo.Aresta aresta23 = grafo8.retiraAresta((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 1, (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.existeAresta((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 100, 10);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(35, (int) (short) 10);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = null;
        grafo21.prox = intArray22;
        int[] intArray30 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo21.peso = intArray30;
        grafo18.cab = intArray30;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        grafo34.imprime();
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = null;
        grafo37.prox = intArray38;
        int[] intArray46 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo37.peso = intArray46;
        grafo34.cab = intArray46;
        ds.Grafo.Aresta aresta51 = grafo34.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        grafo53.imprime();
        boolean boolean57 = grafo53.existeAresta((int) (byte) 0, (int) (short) -1);
        int int58 = grafo53.numVertices();
        int int59 = grafo53.numVertices();
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        int int62 = grafo61.numVertices();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        grafo64.imprime();
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 10);
        int[] intArray68 = null;
        grafo67.prox = intArray68;
        int[] intArray76 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo67.peso = intArray76;
        grafo64.cab = intArray76;
        grafo61.prox = intArray76;
        grafo53.prox = intArray76;
        grafo34.prox = intArray76;
        grafo18.peso = intArray76;
        grafo16.peso = intArray76;
        grafo1.peso = intArray76;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        grafo1.imprime();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, (int) (byte) 100);
        boolean boolean14 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        grafo9.imprime();
        boolean boolean13 = grafo9.existeAresta((int) (byte) 0, (int) (short) -1);
        int int14 = grafo9.numVertices();
        int int15 = grafo9.numVertices();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo22.cab = intArray42;
        grafo9.peso = intArray42;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo48.prox = intArray53;
        int int55 = grafo48.numVertices();
        int[] intArray56 = grafo48.prox;
        grafo9.prox = intArray56;
        grafo1.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo60.prox = intArray65;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        grafo68.imprime();
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = null;
        grafo71.prox = intArray72;
        int[] intArray80 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo71.peso = intArray80;
        grafo68.cab = intArray80;
        grafo60.cab = intArray80;
        grafo1.peso = intArray80;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        grafo21.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = null;
        grafo24.prox = intArray25;
        int[] intArray33 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo24.peso = intArray33;
        grafo21.cab = intArray33;
        grafo1.cab = intArray33;
        int int37 = grafo1.numVertices();
        int[] intArray38 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int) (short) 0);
        int int13 = grafo10.numVertices();
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo3 = new ds.Grafo(100);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = null;
        grafo8.prox = intArray9;
        int[] intArray17 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo8.peso = intArray17;
        grafo5.cab = intArray17;
        ds.Grafo.Aresta aresta22 = grafo5.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        grafo24.imprime();
        boolean boolean28 = grafo24.existeAresta((int) (byte) 0, (int) (short) -1);
        int int29 = grafo24.numVertices();
        int int30 = grafo24.numVertices();
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        grafo35.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = null;
        grafo38.prox = intArray39;
        int[] intArray47 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo38.peso = intArray47;
        grafo35.cab = intArray47;
        grafo32.prox = intArray47;
        grafo24.prox = intArray47;
        grafo5.prox = intArray47;
        grafo3.peso = intArray47;
        grafo1.cab = intArray47;
        grafo1.imprime();
        ds.Grafo.Aresta aresta57 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta57);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.existeAresta((int) (byte) 10, (int) '4');
        grafo8.imprime();
        ds.Grafo grafo15 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        grafo20.imprime();
        int int22 = grafo20.numVertices();
        int int23 = grafo20.numVertices();
        int int24 = grafo20.numVertices();
        boolean boolean26 = grafo20.listaAdjVazia(32);
        boolean boolean29 = grafo20.existeAresta(0, 0);
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int int32 = grafo31.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        grafo34.imprime();
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = null;
        grafo37.prox = intArray38;
        int[] intArray46 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo37.peso = intArray46;
        grafo34.cab = intArray46;
        grafo31.prox = intArray46;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        grafo51.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = null;
        grafo54.prox = intArray55;
        int[] intArray63 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo54.peso = intArray63;
        grafo51.cab = intArray63;
        grafo31.cab = intArray63;
        grafo20.peso = intArray63;
        grafo15.peso = intArray63;
        grafo8.cab = intArray63;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        boolean boolean42 = grafo1.existeAresta((int) '4', (int) ' ');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 100, 10);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(35, (int) (short) 10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, (-1));
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        boolean boolean10 = grafo7.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        grafo12.imprime();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = null;
        grafo15.prox = intArray16;
        int[] intArray24 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo15.peso = intArray24;
        grafo12.cab = intArray24;
        grafo7.prox = intArray24;
        boolean boolean29 = grafo7.listaAdjVazia(0);
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        grafo31.imprime();
        boolean boolean35 = grafo31.existeAresta((int) (byte) 0, (int) (short) -1);
        int int36 = grafo31.numVertices();
        int int37 = grafo31.numVertices();
        ds.Grafo grafo38 = grafo31.grafoTransposto();
        ds.Grafo grafo39 = grafo38.grafoTransposto();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo41.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        grafo49.imprime();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = null;
        grafo52.prox = intArray53;
        int[] intArray61 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo52.peso = intArray61;
        grafo49.cab = intArray61;
        grafo41.cab = intArray61;
        grafo39.prox = intArray61;
        grafo7.prox = intArray61;
        grafo1.prox = intArray61;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        boolean boolean20 = grafo1.listaAdjVazia(100);
        grafo1.imprime();
        int[] intArray22 = null;
        grafo1.peso = intArray22;
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        grafo24.imprime();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo4.prox = intArray9;
        int[] intArray11 = grafo4.prox;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, (int) (short) -1);
        int int18 = grafo13.numVertices();
        int int19 = grafo13.numVertices();
        ds.Grafo grafo20 = grafo13.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        grafo13.peso = intArray29;
        grafo4.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.listaAdjVazia(0);
        boolean boolean36 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 10, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
        int int4 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) ' ', 35);
        grafo1.imprime();
        int[] intArray8 = null;
        grafo1.prox = intArray8;
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta((int) (short) -1, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean10 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo.Aresta aresta50 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean53 = grafo1.existeAresta((int) '4', 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray5 = null;
        grafo4.prox = intArray5;
        int[] intArray13 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo4.peso = intArray13;
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 0, 1);
        grafo1.imprime();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo22.prox = intArray27;
        int[] intArray29 = grafo22.prox;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        grafo31.imprime();
        boolean boolean35 = grafo31.existeAresta((int) (byte) 0, (int) (short) -1);
        int int36 = grafo31.numVertices();
        int int37 = grafo31.numVertices();
        ds.Grafo grafo38 = grafo31.grafoTransposto();
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo40.prox = intArray45;
        int[] intArray47 = grafo40.prox;
        grafo31.peso = intArray47;
        grafo22.cab = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        int[] intArray56 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo51.prox = intArray56;
        int[] intArray58 = grafo51.prox;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        grafo60.imprime();
        boolean boolean64 = grafo60.existeAresta((int) (byte) 0, (int) (short) -1);
        int int65 = grafo60.numVertices();
        int int66 = grafo60.numVertices();
        ds.Grafo grafo67 = grafo60.grafoTransposto();
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo69.prox = intArray74;
        int[] intArray76 = grafo69.prox;
        grafo60.peso = intArray76;
        grafo51.cab = intArray76;
        grafo22.cab = intArray76;
        grafo1.cab = intArray76;
        int[] intArray81 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[97, 10, 1, 0]");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo9.prox = intArray14;
        int[] intArray16 = grafo9.prox;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        grafo18.imprime();
        boolean boolean22 = grafo18.existeAresta((int) (byte) 0, (int) (short) -1);
        int int23 = grafo18.numVertices();
        int int24 = grafo18.numVertices();
        ds.Grafo grafo25 = grafo18.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo27.prox = intArray32;
        int[] intArray34 = grafo27.prox;
        grafo18.peso = intArray34;
        grafo9.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        grafo38.imprime();
        int int40 = grafo38.numVertices();
        int int41 = grafo38.numVertices();
        int int42 = grafo38.numVertices();
        boolean boolean44 = grafo38.listaAdjVazia(32);
        boolean boolean47 = grafo38.existeAresta(0, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int int50 = grafo49.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        grafo52.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray56 = null;
        grafo55.prox = intArray56;
        int[] intArray64 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo55.peso = intArray64;
        grafo52.cab = intArray64;
        grafo49.prox = intArray64;
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        grafo69.imprime();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = null;
        grafo72.prox = intArray73;
        int[] intArray81 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo72.peso = intArray81;
        grafo69.cab = intArray81;
        grafo49.cab = intArray81;
        grafo38.peso = intArray81;
        grafo9.cab = intArray81;
        grafo1.prox = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta90 = grafo1.retiraAresta((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        grafo4.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = null;
        grafo7.prox = intArray8;
        int[] intArray16 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo7.peso = intArray16;
        grafo4.cab = intArray16;
        grafo1.prox = intArray16;
        int int20 = grafo1.numVertices();
        int int21 = grafo1.numVertices();
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        grafo25.imprime();
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo28.prox = intArray33;
        int[] intArray35 = grafo28.prox;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        grafo37.imprime();
        boolean boolean41 = grafo37.existeAresta((int) (byte) 0, (int) (short) -1);
        int int42 = grafo37.numVertices();
        int int43 = grafo37.numVertices();
        ds.Grafo grafo44 = grafo37.grafoTransposto();
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo46.prox = intArray51;
        int[] intArray53 = grafo46.prox;
        grafo37.peso = intArray53;
        grafo28.cab = intArray53;
        grafo25.peso = intArray53;
        grafo1.prox = intArray53;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10, 1, 0]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        grafo6.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = null;
        grafo9.prox = intArray10;
        int[] intArray18 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo9.peso = intArray18;
        grafo6.cab = intArray18;
        grafo3.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        grafo23.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = null;
        grafo26.prox = intArray27;
        int[] intArray35 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo26.peso = intArray35;
        grafo23.cab = intArray35;
        grafo3.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo40 = grafo1.grafoTransposto();
        boolean boolean43 = grafo40.existeAresta((int) (byte) 0, (int) 'a');
        grafo40.insereAresta((int) (short) 1, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray8 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo3.prox = intArray8;
        int[] intArray10 = grafo3.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int int13 = grafo12.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        grafo15.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = null;
        grafo18.prox = intArray19;
        int[] intArray27 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo18.peso = intArray27;
        grafo15.cab = intArray27;
        grafo12.prox = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = null;
        grafo35.prox = intArray36;
        int[] intArray44 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo35.peso = intArray44;
        grafo32.cab = intArray44;
        grafo12.cab = intArray44;
        grafo3.peso = intArray44;
        grafo1.cab = intArray44;
        int[] intArray50 = grafo1.cab;
        boolean boolean52 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta54 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(aresta54);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = aresta3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo1.prox = intArray6;
        int[] intArray8 = grafo1.prox;
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta((int) (byte) 0, (int) (short) -1);
        int int15 = grafo10.numVertices();
        int int16 = grafo10.numVertices();
        ds.Grafo grafo17 = grafo10.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo19.prox = intArray24;
        int[] intArray26 = grafo19.prox;
        grafo10.peso = intArray26;
        grafo1.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        int int33 = grafo30.numVertices();
        int int34 = grafo30.numVertices();
        boolean boolean36 = grafo30.listaAdjVazia(32);
        boolean boolean39 = grafo30.existeAresta(0, 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        int int42 = grafo41.numVertices();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        grafo44.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = null;
        grafo47.prox = intArray48;
        int[] intArray56 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo47.peso = intArray56;
        grafo44.cab = intArray56;
        grafo41.prox = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        grafo61.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray65 = null;
        grafo64.prox = intArray65;
        int[] intArray73 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo64.peso = intArray73;
        grafo61.cab = intArray73;
        grafo41.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.peso = intArray73;
        int[] intArray79 = grafo1.cab;
        int[] intArray80 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo(35);
        ds.Grafo grafo11 = new ds.Grafo(100);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = null;
        grafo16.prox = intArray17;
        int[] intArray25 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo16.peso = intArray25;
        grafo13.cab = intArray25;
        ds.Grafo.Aresta aresta30 = grafo13.retiraAresta((int) (byte) 0, 1);
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        grafo32.imprime();
        boolean boolean36 = grafo32.existeAresta((int) (byte) 0, (int) (short) -1);
        int int37 = grafo32.numVertices();
        int int38 = grafo32.numVertices();
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int int41 = grafo40.numVertices();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        grafo43.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray47 = null;
        grafo46.prox = intArray47;
        int[] intArray55 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo46.peso = intArray55;
        grafo43.cab = intArray55;
        grafo40.prox = intArray55;
        grafo32.prox = intArray55;
        grafo13.prox = intArray55;
        grafo11.peso = intArray55;
        grafo9.cab = intArray55;
        grafo7.peso = intArray55;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, -1, 32, 1, 100, -1]");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int int11 = grafo10.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = null;
        grafo16.prox = intArray17;
        int[] intArray25 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo16.peso = intArray25;
        grafo13.cab = intArray25;
        grafo10.prox = intArray25;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        grafo30.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = null;
        grafo33.prox = intArray34;
        int[] intArray42 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo33.peso = intArray42;
        grafo30.cab = intArray42;
        grafo10.cab = intArray42;
        int int46 = grafo10.numVertices();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        grafo48.imprime();
        boolean boolean52 = grafo48.existeAresta((int) (byte) 0, (int) (short) -1);
        int int53 = grafo48.numVertices();
        int int54 = grafo48.numVertices();
        ds.Grafo grafo55 = grafo48.grafoTransposto();
        grafo48.insereAresta((int) (byte) 100, 1, (int) (byte) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        int[] intArray66 = new int[] { 'a', (byte) 10, (byte) 1, 0 };
        grafo61.prox = intArray66;
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        grafo69.imprime();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = null;
        grafo72.prox = intArray73;
        int[] intArray81 = new int[] { (-1), (short) -1, ' ', 1, (short) 100, (short) -1 };
        grafo72.peso = intArray81;
        grafo69.cab = intArray81;
        grafo61.cab = intArray81;
        grafo48.peso = intArray81;
        grafo10.peso = intArray81;
        grafo8.peso = intArray81;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1, 32, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, -1, 32, 1, 100, -1]");
    }
}

