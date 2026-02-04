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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo3.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        java.lang.Class<?> wildcardClass14 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        java.lang.Class<?> wildcardClass14 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo24 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', (int) '4');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        int[] intArray12 = new int[] {};
        grafo3.prox = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo3.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        int int7 = aresta6.peso();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta15 = grafo3.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo3.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(1);
        int[] intArray14 = new int[] {};
        grafo5.prox = intArray14;
        grafo1.peso = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo3.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (short) 100, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo grafo15 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        int int14 = grafo13.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo15.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        int[] intArray35 = new int[] {};
        grafo26.prox = intArray35;
        grafo15.prox = intArray35;
        grafo3.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo3.primeiroListaAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo15.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        int[] intArray35 = new int[] {};
        grafo26.prox = intArray35;
        grafo15.prox = intArray35;
        grafo3.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 1);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        int[] intArray12 = new int[] {};
        grafo3.prox = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo3.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        int[] intArray21 = new int[] { '#', 'a' };
        grafo16.prox = intArray21;
        grafo12.peso = intArray21;
        grafo3.cab = intArray21;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, 97]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        grafo3.insereAresta((int) (short) 10, (int) (short) 100, 0);
        boolean boolean21 = grafo3.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo grafo31 = grafo1.grafoTransposto();
        boolean boolean34 = grafo1.existeAresta(97, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        int[] intArray27 = null;
        grafo26.cab = intArray27;
        int[] intArray32 = new int[] { (byte) 10, '4', 97 };
        grafo26.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) 'a');
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray41 = new int[] { (byte) 10, '4', 97 };
        grafo35.prox = intArray41;
        int[] intArray43 = grafo35.prox;
        grafo26.peso = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.retiraAresta((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 52, 97]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int[] intArray24 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo3.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = grafo3.existeAresta(10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(1);
        int[] intArray14 = new int[] {};
        grafo5.prox = intArray14;
        grafo1.peso = intArray14;
        int int17 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo3.retiraAresta((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo3.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int[] intArray16 = null;
        grafo15.cab = intArray16;
        int[] intArray21 = new int[] { (byte) 10, '4', 97 };
        grafo15.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        int[] intArray35 = new int[] {};
        grafo26.prox = intArray35;
        grafo15.prox = intArray35;
        int int38 = grafo15.numVertices();
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int[] intArray50 = null;
        grafo49.cab = intArray50;
        int[] intArray55 = new int[] { (byte) 10, '4', 97 };
        grafo49.prox = intArray55;
        int[] intArray57 = grafo49.prox;
        grafo40.peso = intArray57;
        grafo15.prox = intArray57;
        grafo3.cab = intArray57;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo3.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 52, 97]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        int[] intArray39 = grafo3.prox;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35, 97]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.insereAresta((int) ' ', 1, (int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo12.existeAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        grafo2.insereAresta((int) (byte) 10, 52, 32);
        boolean boolean11 = grafo2.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        java.lang.Class<?> wildcardClass6 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo25 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        int[] intArray16 = new int[] { (byte) 10, '4', 97 };
        grafo10.prox = intArray16;
        int[] intArray18 = grafo10.prox;
        grafo1.peso = intArray18;
        java.lang.Class<?> wildcardClass20 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass10 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo3.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) '4');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 10, (int) (short) 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        boolean boolean9 = grafo3.existeAresta((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo(0);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        int[] intArray30 = grafo3.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo3.retiraAresta((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int[] intArray6 = new int[] { '#', 'a' };
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 97]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) '#', (int) ' ');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 1, (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) '4', 35, (int) ' ');
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(1, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 0, (int) 'a');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) '4');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo15.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        int[] intArray35 = new int[] {};
        grafo26.prox = intArray35;
        grafo15.prox = intArray35;
        grafo3.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo39 = grafo3.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 0, 35);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo3.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        int int7 = aresta6.v1();
        int int8 = aresta6.v2();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.existeAresta((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo(100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta15 = grafo3.primeiroListaAdj((int) '4');
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        int[] intArray22 = new int[] { '#', 'a' };
        grafo17.prox = intArray22;
        grafo3.prox = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo25 = grafo3.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 97]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(1);
        boolean boolean15 = grafo5.listaAdjVazia((int) 'a');
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        int[] intArray18 = null;
        grafo17.cab = intArray18;
        int[] intArray23 = new int[] { (byte) 10, '4', 97 };
        grafo17.prox = intArray23;
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        int int27 = grafo26.numVertices();
        ds.Grafo grafo28 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta34 = grafo28.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta36 = grafo28.primeiroListaAdj(1);
        int[] intArray37 = new int[] {};
        grafo28.prox = intArray37;
        grafo17.prox = intArray37;
        int int40 = grafo17.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int[] intArray43 = null;
        grafo42.cab = intArray43;
        int[] intArray48 = new int[] { (byte) 10, '4', 97 };
        grafo42.prox = intArray48;
        ds.Grafo grafo51 = new ds.Grafo((int) 'a');
        int[] intArray52 = null;
        grafo51.cab = intArray52;
        int[] intArray57 = new int[] { (byte) 10, '4', 97 };
        grafo51.prox = intArray57;
        int[] intArray59 = grafo51.prox;
        grafo42.peso = intArray59;
        grafo17.prox = intArray59;
        grafo5.cab = intArray59;
        grafo1.prox = intArray59;
        int[] intArray64 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[10, 52, 97]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        int[] intArray27 = null;
        grafo26.cab = intArray27;
        int[] intArray32 = new int[] { (byte) 10, '4', 97 };
        grafo26.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) 'a');
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray41 = new int[] { (byte) 10, '4', 97 };
        grafo35.prox = intArray41;
        int[] intArray43 = grafo35.prox;
        grafo26.peso = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.retiraAresta(97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 52, 97]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo24.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo33 = new ds.Grafo((int) 'a');
        int int34 = grafo33.numVertices();
        ds.Grafo grafo35 = grafo33.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta41 = grafo35.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta43 = grafo35.primeiroListaAdj(1);
        int[] intArray44 = new int[] {};
        grafo35.prox = intArray44;
        grafo24.prox = intArray44;
        grafo12.prox = intArray44;
        grafo1.peso = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = grafo1.existeAresta((int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = aresta17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta14 = grafo3.retiraAresta(0, (int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo3.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo3.retiraAresta((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        java.lang.Class<?> wildcardClass30 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        int[] intArray25 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        boolean boolean10 = grafo8.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int[] intArray24 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        grafo2.insereAresta((int) (byte) 10, 52, 32);
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        boolean boolean22 = grafo12.listaAdjVazia((int) 'a');
        grafo12.imprime();
        ds.Grafo.Aresta aresta26 = grafo12.retiraAresta(10, 0);
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        int int29 = grafo28.numVertices();
        ds.Grafo grafo30 = grafo28.grafoTransposto();
        grafo28.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) 'a');
        int int34 = grafo33.numVertices();
        ds.Grafo grafo35 = grafo33.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta41 = grafo35.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta43 = grafo35.primeiroListaAdj(1);
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        ds.Grafo grafo47 = new ds.Grafo((int) 'a');
        int int48 = grafo47.numVertices();
        ds.Grafo grafo49 = grafo47.grafoTransposto();
        ds.Grafo.Aresta aresta52 = grafo49.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta55 = grafo49.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta57 = grafo49.primeiroListaAdj(1);
        int[] intArray58 = new int[] {};
        grafo49.prox = intArray58;
        grafo45.peso = intArray58;
        grafo35.prox = intArray58;
        ds.Grafo grafo63 = new ds.Grafo((int) 'a');
        int int64 = grafo63.numVertices();
        ds.Grafo grafo65 = grafo63.grafoTransposto();
        int[] intArray68 = new int[] { '#', 'a' };
        grafo63.prox = intArray68;
        grafo35.prox = intArray68;
        grafo28.cab = intArray68;
        grafo12.peso = intArray68;
        grafo2.cab = intArray68;
        ds.Grafo.Aresta aresta76 = grafo2.retiraAresta((int) (short) 0, 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNotNull(aresta52);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[35, 97]");
        org.junit.Assert.assertNull(aresta76);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        java.lang.Class<?> wildcardClass64 = intArray60.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int int66 = grafo65.numVertices();
        ds.Grafo grafo67 = grafo65.grafoTransposto();
        ds.Grafo grafo69 = new ds.Grafo((int) 'a');
        int int70 = grafo69.numVertices();
        ds.Grafo grafo71 = grafo69.grafoTransposto();
        int[] intArray74 = new int[] { '#', 'a' };
        grafo69.prox = intArray74;
        grafo65.peso = intArray74;
        grafo3.cab = intArray74;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = grafo3.existeAresta(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(grafo71);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[35, 97]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 52, 97]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 0, 35);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo7.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int[] intArray14 = null;
        grafo13.cab = intArray14;
        int[] intArray19 = new int[] { (byte) 10, '4', 97 };
        grafo13.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta30 = grafo24.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta32 = grafo24.primeiroListaAdj(1);
        int[] intArray33 = new int[] {};
        grafo24.prox = intArray33;
        grafo13.prox = intArray33;
        grafo7.peso = intArray33;
        ds.Grafo grafo37 = grafo7.grafoTransposto();
        boolean boolean40 = grafo7.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int[] intArray43 = null;
        grafo42.cab = intArray43;
        int[] intArray48 = new int[] { (byte) 10, '4', 97 };
        grafo42.prox = intArray48;
        int[] intArray50 = grafo42.prox;
        grafo7.peso = intArray50;
        grafo1.peso = intArray50;
        ds.Grafo grafo54 = new ds.Grafo((int) 'a');
        int int55 = grafo54.numVertices();
        ds.Grafo grafo56 = grafo54.grafoTransposto();
        ds.Grafo.Aresta aresta59 = grafo56.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta62 = grafo56.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta64 = grafo56.primeiroListaAdj(1);
        boolean boolean66 = grafo56.listaAdjVazia((int) 'a');
        grafo56.imprime();
        ds.Grafo grafo69 = new ds.Grafo((int) 'a');
        int[] intArray70 = null;
        grafo69.cab = intArray70;
        int[] intArray75 = new int[] { (byte) 10, '4', 97 };
        grafo69.prox = intArray75;
        ds.Grafo grafo78 = new ds.Grafo((int) 'a');
        int int79 = grafo78.numVertices();
        ds.Grafo grafo80 = grafo78.grafoTransposto();
        ds.Grafo.Aresta aresta83 = grafo80.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta86 = grafo80.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta88 = grafo80.primeiroListaAdj(1);
        int[] intArray89 = new int[] {};
        grafo80.prox = intArray89;
        grafo69.prox = intArray89;
        grafo56.cab = intArray89;
        grafo1.peso = intArray89;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(aresta59);
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertNotNull(grafo80);
        org.junit.Assert.assertNotNull(aresta83);
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNull(aresta88);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta(100, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 32, 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta65 = grafo3.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo5.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        int[] intArray12 = null;
        grafo11.cab = intArray12;
        int[] intArray17 = new int[] { (byte) 10, '4', 97 };
        grafo11.prox = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        int int21 = grafo20.numVertices();
        ds.Grafo grafo22 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta30 = grafo22.primeiroListaAdj(1);
        int[] intArray31 = new int[] {};
        grafo22.prox = intArray31;
        grafo11.prox = intArray31;
        grafo5.peso = intArray31;
        grafo1.cab = intArray31;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 97, (int) '4');
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (-1), (int) (byte) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        int[] intArray22 = grafo1.peso;
        boolean boolean24 = grafo1.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        int int21 = grafo20.numVertices();
        ds.Grafo grafo22 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta30 = grafo22.primeiroListaAdj(1);
        ds.Grafo grafo32 = new ds.Grafo((int) 'a');
        int int33 = grafo32.numVertices();
        ds.Grafo grafo34 = grafo32.grafoTransposto();
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo34.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo43 = new ds.Grafo((int) 'a');
        int int44 = grafo43.numVertices();
        ds.Grafo grafo45 = grafo43.grafoTransposto();
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta51 = grafo45.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta53 = grafo45.primeiroListaAdj(1);
        int[] intArray54 = new int[] {};
        grafo45.prox = intArray54;
        grafo34.prox = intArray54;
        grafo22.prox = intArray54;
        grafo3.peso = intArray54;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(aresta48);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.insereAresta((int) ' ', 1, (int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo(35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo1.numVertices();
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) 0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9097");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        int int10 = aresta3.v1();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo2.primeiroListaAdj(0);
        grafo2.insereAresta(32, 32, (int) 'a');
        int int11 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        int[] intArray7 = null;
        grafo6.cab = intArray7;
        int[] intArray12 = new int[] { (byte) 10, '4', 97 };
        grafo6.prox = intArray12;
        int[] intArray14 = grafo6.prox;
        grafo1.cab = intArray14;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 52, 97]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        grafo3.insereAresta(10, 0, 100);
        ds.Grafo grafo18 = new ds.Grafo((int) 'a');
        int int19 = grafo18.numVertices();
        ds.Grafo grafo20 = grafo18.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        int[] intArray27 = new int[] { '#', 'a' };
        grafo22.prox = intArray27;
        grafo18.peso = intArray27;
        grafo3.prox = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = grafo3.existeAresta(1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 97]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        grafo2.insereAresta((int) (byte) 10, 52, 32);
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo10.peso = intArray23;
        grafo2.peso = intArray23;
        ds.Grafo.Aresta aresta28 = grafo2.proxAdj(32);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNull(aresta28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        grafo3.imprime();
        int[] intArray8 = new int[] { 52 };
        grafo3.prox = intArray8;
        int int10 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        grafo3.imprime();
        int[] intArray8 = new int[] { 52 };
        grafo3.prox = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta(32, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(97, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        boolean boolean23 = grafo1.listaAdjVazia((int) '#');
        int[] intArray24 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.existeAresta((int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        int[] intArray16 = new int[] { (byte) 10, '4', 97 };
        grafo10.prox = intArray16;
        int[] intArray18 = grafo10.prox;
        grafo1.peso = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) 'a');
        int int22 = grafo21.numVertices();
        grafo21.imprime();
        grafo21.imprime();
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int[] intArray28 = null;
        grafo27.cab = intArray28;
        int[] intArray33 = new int[] { (byte) 10, '4', 97 };
        grafo27.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        int[] intArray37 = null;
        grafo36.cab = intArray37;
        int[] intArray42 = new int[] { (byte) 10, '4', 97 };
        grafo36.prox = intArray42;
        int[] intArray44 = grafo36.prox;
        grafo27.peso = intArray44;
        grafo21.prox = intArray44;
        grafo1.prox = intArray44;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj(52);
        boolean boolean53 = grafo49.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo55 = new ds.Grafo((int) 'a');
        int[] intArray56 = null;
        grafo55.cab = intArray56;
        int[] intArray61 = new int[] { (byte) 10, '4', 97 };
        grafo55.prox = intArray61;
        ds.Grafo grafo64 = new ds.Grafo((int) 'a');
        int int65 = grafo64.numVertices();
        ds.Grafo grafo66 = grafo64.grafoTransposto();
        ds.Grafo.Aresta aresta69 = grafo66.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta72 = grafo66.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta74 = grafo66.primeiroListaAdj(1);
        int[] intArray75 = new int[] {};
        grafo66.prox = intArray75;
        grafo55.prox = intArray75;
        grafo49.peso = intArray75;
        grafo1.prox = intArray75;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 52, 97]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNotNull(grafo66);
        org.junit.Assert.assertNotNull(aresta69);
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertNull(aresta74);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        grafo1.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) 'a');
        int int34 = grafo33.numVertices();
        ds.Grafo grafo35 = grafo33.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta41 = grafo35.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta43 = grafo35.primeiroListaAdj(1);
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        ds.Grafo grafo47 = new ds.Grafo((int) 'a');
        int int48 = grafo47.numVertices();
        ds.Grafo grafo49 = grafo47.grafoTransposto();
        ds.Grafo.Aresta aresta52 = grafo49.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta55 = grafo49.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta57 = grafo49.primeiroListaAdj(1);
        int[] intArray58 = new int[] {};
        grafo49.prox = intArray58;
        grafo45.peso = intArray58;
        grafo35.prox = intArray58;
        grafo1.peso = intArray58;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNotNull(aresta52);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean20 = grafo3.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta30 = grafo24.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta32 = grafo24.primeiroListaAdj(1);
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        int int37 = grafo36.numVertices();
        ds.Grafo grafo38 = grafo36.grafoTransposto();
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta44 = grafo38.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta46 = grafo38.primeiroListaAdj(1);
        int[] intArray47 = new int[] {};
        grafo38.prox = intArray47;
        grafo34.peso = intArray47;
        grafo24.prox = intArray47;
        ds.Grafo grafo52 = new ds.Grafo((int) 'a');
        int int53 = grafo52.numVertices();
        ds.Grafo grafo54 = grafo52.grafoTransposto();
        int[] intArray57 = new int[] { '#', 'a' };
        grafo52.prox = intArray57;
        grafo24.prox = intArray57;
        grafo3.prox = intArray57;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(aresta41);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[35, 97]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) -1, 52);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int[] intArray24 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) ' ', 52);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo12.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo21 = new ds.Grafo((int) 'a');
        int int22 = grafo21.numVertices();
        ds.Grafo grafo23 = grafo21.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo23.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta29 = grafo23.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta31 = grafo23.primeiroListaAdj(1);
        int[] intArray32 = new int[] {};
        grafo23.prox = intArray32;
        grafo12.prox = intArray32;
        grafo5.prox = intArray32;
        grafo1.cab = intArray32;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(aresta26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 52, (int) (short) 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 100, 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean20 = grafo3.existeAresta(52, (int) (byte) 0);
        boolean boolean22 = grafo3.listaAdjVazia(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        int[] intArray22 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean6 = grafo1.existeAresta((int) '4', 100);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        boolean boolean25 = grafo1.existeAresta(97, 1);
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int int28 = grafo27.numVertices();
        ds.Grafo grafo29 = grafo27.grafoTransposto();
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta35 = grafo29.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta37 = grafo29.primeiroListaAdj(1);
        boolean boolean39 = grafo29.listaAdjVazia((int) 'a');
        grafo29.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int int43 = grafo42.numVertices();
        ds.Grafo grafo44 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta50 = grafo44.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta52 = grafo44.primeiroListaAdj(1);
        ds.Grafo grafo54 = new ds.Grafo((int) ' ');
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        int int57 = grafo56.numVertices();
        ds.Grafo grafo58 = grafo56.grafoTransposto();
        ds.Grafo.Aresta aresta61 = grafo58.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta64 = grafo58.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta66 = grafo58.primeiroListaAdj(1);
        int[] intArray67 = new int[] {};
        grafo58.prox = intArray67;
        grafo54.peso = intArray67;
        grafo44.prox = intArray67;
        ds.Grafo grafo72 = new ds.Grafo((int) 'a');
        int int73 = grafo72.numVertices();
        ds.Grafo grafo74 = grafo72.grafoTransposto();
        int[] intArray77 = new int[] { '#', 'a' };
        grafo72.prox = intArray77;
        grafo44.prox = intArray77;
        grafo29.cab = intArray77;
        grafo1.prox = intArray77;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo82 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, 97]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        int[] intArray22 = new int[] { (byte) 10, '4', 97 };
        grafo16.prox = intArray22;
        int[] intArray24 = grafo16.prox;
        grafo7.peso = intArray24;
        grafo1.prox = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 52, 97]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        grafo3.imprime();
        int[] intArray8 = new int[] { 52 };
        grafo3.prox = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo3.listaAdjVazia((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo1.numVertices();
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta23 = grafo15.primeiroListaAdj(1);
        ds.Grafo grafo24 = grafo15.grafoTransposto();
        ds.Grafo grafo25 = grafo24.grafoTransposto();
        grafo25.imprime();
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        int int29 = grafo28.numVertices();
        ds.Grafo grafo30 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta36 = grafo30.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta38 = grafo30.primeiroListaAdj(1);
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int int43 = grafo42.numVertices();
        ds.Grafo grafo44 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta50 = grafo44.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta52 = grafo44.primeiroListaAdj(1);
        int[] intArray53 = new int[] {};
        grafo44.prox = intArray53;
        grafo40.peso = intArray53;
        grafo30.prox = intArray53;
        ds.Grafo grafo58 = new ds.Grafo((int) 'a');
        int int59 = grafo58.numVertices();
        ds.Grafo grafo60 = grafo58.grafoTransposto();
        int[] intArray63 = new int[] { '#', 'a' };
        grafo58.prox = intArray63;
        grafo30.prox = intArray63;
        grafo25.cab = intArray63;
        grafo1.prox = intArray63;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta33);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35, 97]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta14 = grafo3.retiraAresta(0, (int) (short) 100);
        int[] intArray15 = null;
        grafo3.peso = intArray15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        int int31 = grafo30.numVertices();
        ds.Grafo grafo32 = grafo30.grafoTransposto();
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta38 = grafo32.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj(1);
        int[] intArray41 = new int[] {};
        grafo32.prox = intArray41;
        grafo28.peso = intArray41;
        grafo18.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) 'a');
        int int47 = grafo46.numVertices();
        ds.Grafo grafo48 = grafo46.grafoTransposto();
        int[] intArray51 = new int[] { '#', 'a' };
        grafo46.prox = intArray51;
        grafo18.prox = intArray51;
        grafo13.cab = intArray51;
        boolean boolean56 = grafo13.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta58 = grafo13.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, 97]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        boolean boolean16 = grafo13.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(1);
        boolean boolean15 = grafo5.listaAdjVazia((int) 'a');
        grafo5.imprime();
        grafo5.imprime();
        ds.Grafo.Aresta aresta19 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo20 = grafo5.grafoTransposto();
        boolean boolean22 = grafo5.listaAdjVazia(52);
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int[] intArray25 = null;
        grafo24.cab = intArray25;
        int[] intArray30 = new int[] { (byte) 10, '4', 97 };
        grafo24.prox = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) 'a');
        int int34 = grafo33.numVertices();
        ds.Grafo grafo35 = grafo33.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta41 = grafo35.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta43 = grafo35.primeiroListaAdj(1);
        int[] intArray44 = new int[] {};
        grafo35.prox = intArray44;
        grafo24.prox = intArray44;
        int int47 = grafo24.numVertices();
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int[] intArray50 = null;
        grafo49.cab = intArray50;
        int[] intArray55 = new int[] { (byte) 10, '4', 97 };
        grafo49.prox = intArray55;
        ds.Grafo grafo58 = new ds.Grafo((int) 'a');
        int[] intArray59 = null;
        grafo58.cab = intArray59;
        int[] intArray64 = new int[] { (byte) 10, '4', 97 };
        grafo58.prox = intArray64;
        int[] intArray66 = grafo58.prox;
        grafo49.peso = intArray66;
        grafo24.prox = intArray66;
        grafo5.peso = intArray66;
        grafo1.peso = intArray66;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[10, 52, 97]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        grafo13.insereAresta(32, 35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(1);
        int[] intArray14 = new int[] {};
        grafo5.prox = intArray14;
        grafo1.peso = intArray14;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        ds.Grafo grafo19 = new ds.Grafo((int) 'a');
        int int20 = grafo19.numVertices();
        ds.Grafo grafo21 = grafo19.grafoTransposto();
        grafo19.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        ds.Grafo grafo36 = new ds.Grafo((int) ' ');
        ds.Grafo grafo38 = new ds.Grafo((int) 'a');
        int int39 = grafo38.numVertices();
        ds.Grafo grafo40 = grafo38.grafoTransposto();
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta46 = grafo40.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta48 = grafo40.primeiroListaAdj(1);
        int[] intArray49 = new int[] {};
        grafo40.prox = intArray49;
        grafo36.peso = intArray49;
        grafo26.prox = intArray49;
        ds.Grafo grafo54 = new ds.Grafo((int) 'a');
        int int55 = grafo54.numVertices();
        ds.Grafo grafo56 = grafo54.grafoTransposto();
        int[] intArray59 = new int[] { '#', 'a' };
        grafo54.prox = intArray59;
        grafo26.prox = intArray59;
        grafo19.cab = intArray59;
        grafo3.peso = intArray59;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta65 = grafo3.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(aresta43);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, 97]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        boolean boolean16 = grafo13.existeAresta((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean8 = grafo1.listaAdjVazia(0);
        grafo1.insereAresta(1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 35, 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        int int21 = grafo20.numVertices();
        ds.Grafo grafo22 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo22.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta32 = grafo22.retiraAresta(0, 1);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int int35 = grafo34.numVertices();
        ds.Grafo grafo36 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo36.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta46 = grafo36.retiraAresta(0, 1);
        ds.Grafo grafo48 = new ds.Grafo((int) 'a');
        int int49 = grafo48.numVertices();
        ds.Grafo grafo50 = grafo48.grafoTransposto();
        int[] intArray53 = new int[] { '#', 'a' };
        grafo48.prox = intArray53;
        grafo36.peso = intArray53;
        grafo22.peso = intArray53;
        grafo3.cab = intArray53;
        ds.Grafo grafo59 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta61 = grafo59.proxAdj(52);
        boolean boolean63 = grafo59.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int[] intArray66 = null;
        grafo65.cab = intArray66;
        int[] intArray71 = new int[] { (byte) 10, '4', 97 };
        grafo65.prox = intArray71;
        ds.Grafo grafo74 = new ds.Grafo((int) 'a');
        int int75 = grafo74.numVertices();
        ds.Grafo grafo76 = grafo74.grafoTransposto();
        ds.Grafo.Aresta aresta79 = grafo76.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta82 = grafo76.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta84 = grafo76.primeiroListaAdj(1);
        int[] intArray85 = new int[] {};
        grafo76.prox = intArray85;
        grafo65.prox = intArray85;
        grafo59.peso = intArray85;
        grafo3.peso = intArray85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, 97]");
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertNotNull(aresta79);
        org.junit.Assert.assertNull(aresta82);
        org.junit.Assert.assertNull(aresta84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        int int7 = grafo6.numVertices();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo8.retiraAresta((int) (short) 0, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo8.peso = intArray27;
        boolean boolean31 = grafo8.listaAdjVazia((int) '4');
        ds.Grafo grafo33 = new ds.Grafo((int) 'a');
        ds.Grafo grafo34 = grafo33.grafoTransposto();
        ds.Grafo.Aresta aresta37 = grafo33.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo39 = new ds.Grafo((int) 'a');
        int[] intArray40 = null;
        grafo39.cab = intArray40;
        int[] intArray45 = new int[] { (byte) 10, '4', 97 };
        grafo39.prox = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) 'a');
        int int49 = grafo48.numVertices();
        ds.Grafo grafo50 = grafo48.grafoTransposto();
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta58 = grafo50.primeiroListaAdj(1);
        int[] intArray59 = new int[] {};
        grafo50.prox = intArray59;
        grafo39.prox = intArray59;
        grafo33.peso = intArray59;
        ds.Grafo grafo63 = grafo33.grafoTransposto();
        boolean boolean66 = grafo33.existeAresta(97, (int) (short) 1);
        boolean boolean68 = grafo33.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo70 = new ds.Grafo((int) 'a');
        int[] intArray71 = null;
        grafo70.cab = intArray71;
        boolean boolean75 = grafo70.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo77 = new ds.Grafo((int) 'a');
        int int78 = grafo77.numVertices();
        ds.Grafo grafo79 = grafo77.grafoTransposto();
        ds.Grafo.Aresta aresta82 = grafo79.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta85 = grafo79.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta87 = grafo79.primeiroListaAdj(1);
        int[] intArray88 = new int[] {};
        grafo79.prox = intArray88;
        grafo70.peso = intArray88;
        int[] intArray91 = grafo70.peso;
        grafo33.prox = intArray91;
        grafo8.cab = intArray91;
        grafo1.peso = intArray91;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(grafo63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(grafo79);
        org.junit.Assert.assertNotNull(aresta82);
        org.junit.Assert.assertNull(aresta85);
        org.junit.Assert.assertNull(aresta87);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 32, 35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean6 = grafo1.existeAresta((int) '4', 100);
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo3.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo3.listaAdjVazia(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        int int21 = grafo20.numVertices();
        ds.Grafo grafo22 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo22.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta32 = grafo22.retiraAresta(0, 1);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int int35 = grafo34.numVertices();
        ds.Grafo grafo36 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo36.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta46 = grafo36.retiraAresta(0, 1);
        ds.Grafo grafo48 = new ds.Grafo((int) 'a');
        int int49 = grafo48.numVertices();
        ds.Grafo grafo50 = grafo48.grafoTransposto();
        int[] intArray53 = new int[] { '#', 'a' };
        grafo48.prox = intArray53;
        grafo36.peso = intArray53;
        grafo22.peso = intArray53;
        grafo3.cab = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta60 = grafo3.retiraAresta((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, 97]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        boolean boolean25 = grafo1.existeAresta(97, 1);
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int int28 = grafo27.numVertices();
        ds.Grafo grafo29 = grafo27.grafoTransposto();
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta35 = grafo29.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta37 = grafo29.primeiroListaAdj(1);
        boolean boolean39 = grafo29.listaAdjVazia((int) 'a');
        grafo29.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int int43 = grafo42.numVertices();
        ds.Grafo grafo44 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta50 = grafo44.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta52 = grafo44.primeiroListaAdj(1);
        ds.Grafo grafo54 = new ds.Grafo((int) ' ');
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        int int57 = grafo56.numVertices();
        ds.Grafo grafo58 = grafo56.grafoTransposto();
        ds.Grafo.Aresta aresta61 = grafo58.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta64 = grafo58.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta66 = grafo58.primeiroListaAdj(1);
        int[] intArray67 = new int[] {};
        grafo58.prox = intArray67;
        grafo54.peso = intArray67;
        grafo44.prox = intArray67;
        ds.Grafo grafo72 = new ds.Grafo((int) 'a');
        int int73 = grafo72.numVertices();
        ds.Grafo grafo74 = grafo72.grafoTransposto();
        int[] intArray77 = new int[] { '#', 'a' };
        grafo72.prox = intArray77;
        grafo44.prox = intArray77;
        grafo29.cab = intArray77;
        grafo1.prox = intArray77;
        java.lang.Class<?> wildcardClass82 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, 97]");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        int int6 = grafo5.numVertices();
        ds.Grafo grafo7 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo7.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta17 = grafo7.retiraAresta(0, 1);
        ds.Grafo grafo19 = new ds.Grafo((int) 'a');
        int int20 = grafo19.numVertices();
        grafo19.imprime();
        grafo19.imprime();
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        ds.Grafo grafo26 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo25.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int[] intArray32 = null;
        grafo31.cab = intArray32;
        int[] intArray37 = new int[] { (byte) 10, '4', 97 };
        grafo31.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int int41 = grafo40.numVertices();
        ds.Grafo grafo42 = grafo40.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta48 = grafo42.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta50 = grafo42.primeiroListaAdj(1);
        int[] intArray51 = new int[] {};
        grafo42.prox = intArray51;
        grafo31.prox = intArray51;
        grafo25.peso = intArray51;
        ds.Grafo grafo55 = grafo25.grafoTransposto();
        boolean boolean58 = grafo25.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        int[] intArray61 = null;
        grafo60.cab = intArray61;
        int[] intArray66 = new int[] { (byte) 10, '4', 97 };
        grafo60.prox = intArray66;
        int[] intArray68 = grafo60.prox;
        grafo25.peso = intArray68;
        grafo19.peso = intArray68;
        grafo7.cab = intArray68;
        grafo3.peso = intArray68;
        ds.Grafo grafo74 = new ds.Grafo((int) 'a');
        int[] intArray75 = null;
        grafo74.cab = intArray75;
        int[] intArray80 = new int[] { (byte) 10, '4', 97 };
        grafo74.prox = intArray80;
        ds.Grafo grafo83 = new ds.Grafo((int) 'a');
        int int84 = grafo83.numVertices();
        ds.Grafo grafo85 = grafo83.grafoTransposto();
        ds.Grafo.Aresta aresta88 = grafo85.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta91 = grafo85.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta93 = grafo85.primeiroListaAdj(1);
        int[] intArray94 = new int[] {};
        grafo85.prox = intArray94;
        grafo74.prox = intArray94;
        int[] intArray97 = grafo74.prox;
        grafo3.peso = intArray97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertNotNull(grafo85);
        org.junit.Assert.assertNotNull(aresta88);
        org.junit.Assert.assertNull(aresta91);
        org.junit.Assert.assertNull(aresta93);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo grafo31 = grafo1.grafoTransposto();
        boolean boolean34 = grafo1.existeAresta(97, (int) (short) 1);
        boolean boolean36 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo grafo31 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj(0);
        ds.Grafo grafo35 = new ds.Grafo((int) 'a');
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray41 = new int[] { (byte) 10, '4', 97 };
        grafo35.prox = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) 'a');
        int int45 = grafo44.numVertices();
        ds.Grafo grafo46 = grafo44.grafoTransposto();
        ds.Grafo.Aresta aresta49 = grafo46.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta52 = grafo46.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta54 = grafo46.primeiroListaAdj(1);
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        int int57 = grafo56.numVertices();
        ds.Grafo grafo58 = grafo56.grafoTransposto();
        ds.Grafo.Aresta aresta61 = grafo58.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo58.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo67 = new ds.Grafo((int) 'a');
        int int68 = grafo67.numVertices();
        ds.Grafo grafo69 = grafo67.grafoTransposto();
        ds.Grafo.Aresta aresta72 = grafo69.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta75 = grafo69.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta77 = grafo69.primeiroListaAdj(1);
        int[] intArray78 = new int[] {};
        grafo69.prox = intArray78;
        grafo58.prox = intArray78;
        grafo46.prox = intArray78;
        grafo35.peso = intArray78;
        grafo31.peso = intArray78;
        java.lang.Class<?> wildcardClass84 = grafo31.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(aresta49);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(grafo69);
        org.junit.Assert.assertNotNull(aresta72);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNull(aresta77);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo grafo31 = grafo1.grafoTransposto();
        boolean boolean34 = grafo1.existeAresta(97, (int) (short) 1);
        boolean boolean36 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        int int7 = grafo6.numVertices();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo8.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj(1);
        boolean boolean18 = grafo8.listaAdjVazia((int) 'a');
        grafo8.imprime();
        grafo8.imprime();
        ds.Grafo.Aresta aresta22 = grafo8.primeiroListaAdj(0);
        ds.Grafo grafo23 = grafo8.grafoTransposto();
        boolean boolean25 = grafo8.listaAdjVazia(52);
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int[] intArray28 = null;
        grafo27.cab = intArray28;
        int[] intArray33 = new int[] { (byte) 10, '4', 97 };
        grafo27.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        int int37 = grafo36.numVertices();
        ds.Grafo grafo38 = grafo36.grafoTransposto();
        ds.Grafo.Aresta aresta41 = grafo38.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta44 = grafo38.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta46 = grafo38.primeiroListaAdj(1);
        int[] intArray47 = new int[] {};
        grafo38.prox = intArray47;
        grafo27.prox = intArray47;
        int int50 = grafo27.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) 'a');
        int[] intArray53 = null;
        grafo52.cab = intArray53;
        int[] intArray58 = new int[] { (byte) 10, '4', 97 };
        grafo52.prox = intArray58;
        ds.Grafo grafo61 = new ds.Grafo((int) 'a');
        int[] intArray62 = null;
        grafo61.cab = intArray62;
        int[] intArray67 = new int[] { (byte) 10, '4', 97 };
        grafo61.prox = intArray67;
        int[] intArray69 = grafo61.prox;
        grafo52.peso = intArray69;
        grafo27.prox = intArray69;
        grafo8.peso = intArray69;
        grafo1.prox = intArray69;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(aresta41);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[10, 52, 97]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 35, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta22 = grafo3.retiraAresta(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        grafo1.insereAresta((int) (byte) 100, (int) (byte) 100, 1);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        boolean boolean15 = grafo3.existeAresta((int) (short) 100, 0);
        boolean boolean17 = grafo3.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (byte) 10);
        grafo3.insereAresta((int) (byte) 1, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean19 = grafo3.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (short) 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9097");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (short) 0);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        int[] intArray10 = new int[] { 35, (byte) 100, (byte) 100, 1, ' ' };
        grafo1.prox = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        int[] intArray18 = new int[] { '#', 'a' };
        grafo13.prox = intArray18;
        grafo1.peso = intArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 100, 100, 1, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 97]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo8.numVertices();
        boolean boolean12 = grafo8.existeAresta(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int) (byte) 1);
        boolean boolean17 = grafo3.existeAresta((int) (short) 1, (int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) 'a');
        ds.Grafo grafo20 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta23 = grafo19.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo24 = grafo19.grafoTransposto();
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        int int27 = grafo26.numVertices();
        ds.Grafo grafo28 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta34 = grafo28.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta36 = grafo28.primeiroListaAdj(1);
        ds.Grafo grafo38 = new ds.Grafo((int) ' ');
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int int41 = grafo40.numVertices();
        ds.Grafo grafo42 = grafo40.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta48 = grafo42.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta50 = grafo42.primeiroListaAdj(1);
        int[] intArray51 = new int[] {};
        grafo42.prox = intArray51;
        grafo38.peso = intArray51;
        grafo28.prox = intArray51;
        grafo24.peso = intArray51;
        grafo3.prox = intArray51;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        int[] intArray10 = new int[] { 35, (byte) 100, (byte) 100, 1, ' ' };
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo12 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 100, 100, 1, 32]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        int[] intArray22 = new int[] { (byte) 10, '4', 97 };
        grafo16.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int int26 = grafo25.numVertices();
        ds.Grafo grafo27 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta33 = grafo27.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta35 = grafo27.primeiroListaAdj(1);
        int[] intArray36 = new int[] {};
        grafo27.prox = intArray36;
        grafo16.prox = intArray36;
        grafo3.cab = intArray36;
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        int int42 = grafo41.numVertices();
        ds.Grafo grafo43 = grafo41.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo43.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta49 = grafo43.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta51 = grafo43.primeiroListaAdj(1);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        ds.Grafo grafo55 = new ds.Grafo((int) 'a');
        int int56 = grafo55.numVertices();
        ds.Grafo grafo57 = grafo55.grafoTransposto();
        ds.Grafo.Aresta aresta60 = grafo57.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta63 = grafo57.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta65 = grafo57.primeiroListaAdj(1);
        int[] intArray66 = new int[] {};
        grafo57.prox = intArray66;
        grafo53.peso = intArray66;
        grafo43.prox = intArray66;
        grafo3.peso = intArray66;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo3.retiraAresta((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(aresta46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(aresta60);
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '4', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 35, 35);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int int66 = grafo65.numVertices();
        ds.Grafo grafo67 = grafo65.grafoTransposto();
        ds.Grafo.Aresta aresta70 = grafo67.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta73 = grafo67.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta75 = grafo67.primeiroListaAdj(1);
        boolean boolean77 = grafo67.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta79 = grafo67.primeiroListaAdj((int) '4');
        ds.Grafo grafo81 = new ds.Grafo((int) 'a');
        int int82 = grafo81.numVertices();
        ds.Grafo grafo83 = grafo81.grafoTransposto();
        int[] intArray86 = new int[] { '#', 'a' };
        grafo81.prox = intArray86;
        grafo67.prox = intArray86;
        grafo3.cab = intArray86;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNull(aresta73);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(aresta79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
        org.junit.Assert.assertNotNull(grafo83);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[35, 97]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        int int24 = grafo23.numVertices();
        grafo23.imprime();
        grafo23.imprime();
        ds.Grafo grafo27 = grafo23.grafoTransposto();
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        int[] intArray30 = null;
        grafo29.cab = intArray30;
        int[] intArray35 = new int[] { (byte) 10, '4', 97 };
        grafo29.prox = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) 'a');
        int[] intArray39 = null;
        grafo38.cab = intArray39;
        int[] intArray44 = new int[] { (byte) 10, '4', 97 };
        grafo38.prox = intArray44;
        int[] intArray46 = grafo38.prox;
        grafo29.peso = intArray46;
        grafo23.prox = intArray46;
        grafo1.prox = intArray46;
        int[] intArray50 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertNull(intArray50);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean20 = grafo3.existeAresta(52, (int) (byte) 0);
        grafo3.imprime();
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        boolean boolean28 = grafo23.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        int int31 = grafo30.numVertices();
        ds.Grafo grafo32 = grafo30.grafoTransposto();
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta38 = grafo32.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj(1);
        int[] intArray41 = new int[] {};
        grafo32.prox = intArray41;
        grafo23.peso = intArray41;
        ds.Grafo grafo44 = grafo23.grafoTransposto();
        boolean boolean46 = grafo23.listaAdjVazia(97);
        ds.Grafo grafo48 = new ds.Grafo((int) 'a');
        ds.Grafo grafo49 = grafo48.grafoTransposto();
        ds.Grafo.Aresta aresta52 = grafo48.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo54 = new ds.Grafo((int) 'a');
        int[] intArray55 = null;
        grafo54.cab = intArray55;
        int[] intArray60 = new int[] { (byte) 10, '4', 97 };
        grafo54.prox = intArray60;
        ds.Grafo grafo63 = new ds.Grafo((int) 'a');
        int int64 = grafo63.numVertices();
        ds.Grafo grafo65 = grafo63.grafoTransposto();
        ds.Grafo.Aresta aresta68 = grafo65.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta71 = grafo65.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta73 = grafo65.primeiroListaAdj(1);
        int[] intArray74 = new int[] {};
        grafo65.prox = intArray74;
        grafo54.prox = intArray74;
        grafo48.peso = intArray74;
        ds.Grafo grafo78 = grafo48.grafoTransposto();
        boolean boolean81 = grafo48.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo83 = new ds.Grafo((int) 'a');
        int[] intArray84 = null;
        grafo83.cab = intArray84;
        int[] intArray89 = new int[] { (byte) 10, '4', 97 };
        grafo83.prox = intArray89;
        int[] intArray91 = grafo83.prox;
        grafo48.peso = intArray91;
        grafo23.prox = intArray91;
        grafo3.cab = intArray91;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNotNull(aresta68);
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNull(aresta73);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[10, 52, 97]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        java.lang.Class<?> wildcardClass9 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        int[] intArray22 = grafo1.peso;
        int[] intArray23 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        int int7 = aresta6.v1();
        int int8 = aresta6.v1();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        int int12 = grafo11.numVertices();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta21 = grafo13.primeiroListaAdj(1);
        int[] intArray22 = new int[] {};
        grafo13.prox = intArray22;
        grafo3.peso = intArray22;
        boolean boolean26 = grafo3.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) '4', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        grafo1.imprime();
        ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray25 = grafo1.peso;
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int int28 = grafo27.numVertices();
        ds.Grafo grafo29 = grafo27.grafoTransposto();
        ds.Grafo.Aresta aresta32 = grafo29.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta35 = grafo29.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta37 = grafo29.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta40 = grafo29.retiraAresta(0, (int) (short) 100);
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int int43 = grafo42.numVertices();
        ds.Grafo grafo44 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta50 = grafo44.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta52 = grafo44.primeiroListaAdj(1);
        ds.Grafo grafo54 = new ds.Grafo((int) 'a');
        int int55 = grafo54.numVertices();
        ds.Grafo grafo56 = grafo54.grafoTransposto();
        ds.Grafo.Aresta aresta59 = grafo56.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo56.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int int66 = grafo65.numVertices();
        ds.Grafo grafo67 = grafo65.grafoTransposto();
        ds.Grafo.Aresta aresta70 = grafo67.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta73 = grafo67.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta75 = grafo67.primeiroListaAdj(1);
        int[] intArray76 = new int[] {};
        grafo67.prox = intArray76;
        grafo56.prox = intArray76;
        grafo44.prox = intArray76;
        grafo29.cab = intArray76;
        grafo1.cab = intArray76;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(aresta59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNull(aresta73);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.imprime();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        int int21 = grafo20.numVertices();
        ds.Grafo grafo22 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo22.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta32 = grafo22.retiraAresta(0, 1);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int int35 = grafo34.numVertices();
        ds.Grafo grafo36 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo36.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta46 = grafo36.retiraAresta(0, 1);
        ds.Grafo grafo48 = new ds.Grafo((int) 'a');
        int int49 = grafo48.numVertices();
        ds.Grafo grafo50 = grafo48.grafoTransposto();
        int[] intArray53 = new int[] { '#', 'a' };
        grafo48.prox = intArray53;
        grafo36.peso = intArray53;
        grafo22.peso = intArray53;
        grafo3.cab = intArray53;
        ds.Grafo grafo58 = grafo3.grafoTransposto();
        int int59 = grafo58.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, 97]");
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta65 = grafo3.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        grafo1.insereAresta(100, 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo3.retiraAresta((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        int int31 = grafo30.numVertices();
        ds.Grafo grafo32 = grafo30.grafoTransposto();
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta38 = grafo32.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj(1);
        int[] intArray41 = new int[] {};
        grafo32.prox = intArray41;
        grafo28.peso = intArray41;
        grafo18.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) 'a');
        int int47 = grafo46.numVertices();
        ds.Grafo grafo48 = grafo46.grafoTransposto();
        int[] intArray51 = new int[] { '#', 'a' };
        grafo46.prox = intArray51;
        grafo18.prox = intArray51;
        grafo13.cab = intArray51;
        java.lang.Class<?> wildcardClass55 = intArray51.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, 97]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta14 = grafo3.retiraAresta(0, (int) (short) 100);
        ds.Grafo grafo15 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo3.proxAdj(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo10.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        int[] intArray22 = new int[] { (byte) 10, '4', 97 };
        grafo16.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int int26 = grafo25.numVertices();
        ds.Grafo grafo27 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta33 = grafo27.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta35 = grafo27.primeiroListaAdj(1);
        int[] intArray36 = new int[] {};
        grafo27.prox = intArray36;
        grafo16.prox = intArray36;
        grafo10.peso = intArray36;
        ds.Grafo grafo40 = grafo10.grafoTransposto();
        boolean boolean43 = grafo10.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        int[] intArray46 = null;
        grafo45.cab = intArray46;
        int[] intArray51 = new int[] { (byte) 10, '4', 97 };
        grafo45.prox = intArray51;
        int[] intArray53 = grafo45.prox;
        grafo10.peso = intArray53;
        grafo8.prox = intArray53;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[10, 52, 97]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo6.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int[] intArray13 = null;
        grafo12.cab = intArray13;
        int[] intArray18 = new int[] { (byte) 10, '4', 97 };
        grafo12.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) 'a');
        int int22 = grafo21.numVertices();
        ds.Grafo grafo23 = grafo21.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo23.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta29 = grafo23.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta31 = grafo23.primeiroListaAdj(1);
        int[] intArray32 = new int[] {};
        grafo23.prox = intArray32;
        grafo12.prox = intArray32;
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(aresta26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        int int7 = grafo6.numVertices();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo8.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta27 = grafo19.primeiroListaAdj(1);
        int[] intArray28 = new int[] {};
        grafo19.prox = intArray28;
        grafo8.prox = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int int66 = grafo65.numVertices();
        ds.Grafo grafo67 = grafo65.grafoTransposto();
        ds.Grafo grafo69 = new ds.Grafo((int) 'a');
        int int70 = grafo69.numVertices();
        ds.Grafo grafo71 = grafo69.grafoTransposto();
        int[] intArray74 = new int[] { '#', 'a' };
        grafo69.prox = intArray74;
        grafo65.peso = intArray74;
        grafo3.cab = intArray74;
        int int78 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(grafo71);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[35, 97]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo.Aresta aresta33 = grafo1.retiraAresta(10, (int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNull(aresta33);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        int int12 = grafo11.numVertices();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta21 = grafo13.primeiroListaAdj(1);
        int[] intArray22 = new int[] {};
        grafo13.prox = intArray22;
        grafo3.peso = intArray22;
        boolean boolean26 = grafo3.listaAdjVazia((int) '4');
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        ds.Grafo grafo29 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta32 = grafo28.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray40 = new int[] { (byte) 10, '4', 97 };
        grafo34.prox = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) 'a');
        int int44 = grafo43.numVertices();
        ds.Grafo grafo45 = grafo43.grafoTransposto();
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta51 = grafo45.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta53 = grafo45.primeiroListaAdj(1);
        int[] intArray54 = new int[] {};
        grafo45.prox = intArray54;
        grafo34.prox = intArray54;
        grafo28.peso = intArray54;
        ds.Grafo grafo58 = grafo28.grafoTransposto();
        boolean boolean61 = grafo28.existeAresta(97, (int) (short) 1);
        boolean boolean63 = grafo28.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo65 = new ds.Grafo((int) 'a');
        int[] intArray66 = null;
        grafo65.cab = intArray66;
        boolean boolean70 = grafo65.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo72 = new ds.Grafo((int) 'a');
        int int73 = grafo72.numVertices();
        ds.Grafo grafo74 = grafo72.grafoTransposto();
        ds.Grafo.Aresta aresta77 = grafo74.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta80 = grafo74.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta82 = grafo74.primeiroListaAdj(1);
        int[] intArray83 = new int[] {};
        grafo74.prox = intArray83;
        grafo65.peso = intArray83;
        int[] intArray86 = grafo65.peso;
        grafo28.prox = intArray86;
        grafo3.cab = intArray86;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo3.retiraAresta((int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(aresta48);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNull(aresta80);
        org.junit.Assert.assertNull(aresta82);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        int int15 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.insereAresta((int) ' ', 1, (int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo15.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) 'a');
        int int25 = grafo24.numVertices();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj(1);
        int[] intArray35 = new int[] {};
        grafo26.prox = intArray35;
        grafo15.prox = intArray35;
        grafo3.prox = intArray35;
        int int39 = grafo3.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        int[] intArray9 = grafo1.prox;
        int[] intArray10 = null;
        grafo1.peso = intArray10;
        int int12 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo3.retiraAresta(0, 1);
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        int[] intArray20 = new int[] { '#', 'a' };
        grafo15.prox = intArray20;
        grafo3.peso = intArray20;
        grafo3.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        ds.Grafo grafo30 = grafo29.grafoTransposto();
        ds.Grafo.Aresta aresta33 = grafo29.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo35 = new ds.Grafo((int) 'a');
        int[] intArray36 = null;
        grafo35.cab = intArray36;
        int[] intArray41 = new int[] { (byte) 10, '4', 97 };
        grafo35.prox = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) 'a');
        int int45 = grafo44.numVertices();
        ds.Grafo grafo46 = grafo44.grafoTransposto();
        ds.Grafo.Aresta aresta49 = grafo46.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta52 = grafo46.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta54 = grafo46.primeiroListaAdj(1);
        int[] intArray55 = new int[] {};
        grafo46.prox = intArray55;
        grafo35.prox = intArray55;
        grafo29.peso = intArray55;
        grafo25.cab = intArray55;
        grafo3.cab = intArray55;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 97]");
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(aresta49);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo1.numVertices();
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) '4');
        ds.Grafo grafo7 = new ds.Grafo(32);
        ds.Grafo grafo9 = new ds.Grafo((int) 'a');
        int[] intArray10 = null;
        grafo9.cab = intArray10;
        boolean boolean14 = grafo9.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo9.peso = intArray27;
        ds.Grafo grafo30 = grafo9.grafoTransposto();
        boolean boolean32 = grafo9.listaAdjVazia(97);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo34.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo34.peso = intArray60;
        ds.Grafo grafo64 = grafo34.grafoTransposto();
        boolean boolean67 = grafo34.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo69 = new ds.Grafo((int) 'a');
        int[] intArray70 = null;
        grafo69.cab = intArray70;
        int[] intArray75 = new int[] { (byte) 10, '4', 97 };
        grafo69.prox = intArray75;
        int[] intArray77 = grafo69.prox;
        grafo34.peso = intArray77;
        grafo9.prox = intArray77;
        grafo7.prox = intArray77;
        grafo1.cab = intArray77;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[10, 52, 97]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(52);
        boolean boolean7 = grafo1.listaAdjVazia(97);
        boolean boolean10 = grafo1.existeAresta(0, (int) (short) 100);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 35, (int) (short) 100);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int[] intArray24 = grafo1.prox;
        int int25 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int[] intArray17 = null;
        grafo16.cab = intArray17;
        int[] intArray22 = new int[] { (byte) 10, '4', 97 };
        grafo16.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int int26 = grafo25.numVertices();
        ds.Grafo grafo27 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta33 = grafo27.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta35 = grafo27.primeiroListaAdj(1);
        int[] intArray36 = new int[] {};
        grafo27.prox = intArray36;
        grafo16.prox = intArray36;
        grafo3.cab = intArray36;
        ds.Grafo grafo40 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(grafo40);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int int24 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo1.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean19 = grafo3.listaAdjVazia(0);
        grafo3.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta30 = grafo24.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta32 = grafo24.primeiroListaAdj(1);
        boolean boolean34 = grafo24.listaAdjVazia((int) 'a');
        grafo24.imprime();
        ds.Grafo grafo37 = new ds.Grafo((int) 'a');
        int[] intArray38 = null;
        grafo37.cab = intArray38;
        int[] intArray43 = new int[] { (byte) 10, '4', 97 };
        grafo37.prox = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) 'a');
        int int47 = grafo46.numVertices();
        ds.Grafo grafo48 = grafo46.grafoTransposto();
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta56 = grafo48.primeiroListaAdj(1);
        int[] intArray57 = new int[] {};
        grafo48.prox = intArray57;
        grafo37.prox = intArray57;
        grafo24.cab = intArray57;
        ds.Grafo grafo62 = new ds.Grafo((int) 'a');
        int int63 = grafo62.numVertices();
        ds.Grafo grafo64 = grafo62.grafoTransposto();
        ds.Grafo.Aresta aresta67 = grafo64.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta70 = grafo64.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta72 = grafo64.primeiroListaAdj(1);
        ds.Grafo grafo74 = new ds.Grafo((int) ' ');
        ds.Grafo grafo76 = new ds.Grafo((int) 'a');
        int int77 = grafo76.numVertices();
        ds.Grafo grafo78 = grafo76.grafoTransposto();
        ds.Grafo.Aresta aresta81 = grafo78.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta84 = grafo78.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta86 = grafo78.primeiroListaAdj(1);
        int[] intArray87 = new int[] {};
        grafo78.prox = intArray87;
        grafo74.peso = intArray87;
        grafo64.prox = intArray87;
        grafo24.peso = intArray87;
        grafo3.cab = intArray87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(aresta67);
        org.junit.Assert.assertNull(aresta70);
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(aresta81);
        org.junit.Assert.assertNull(aresta84);
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, (int) (short) -1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        grafo3.imprime();
        int[] intArray8 = new int[] { 52 };
        grafo3.prox = intArray8;
        int[] intArray10 = grafo3.prox;
        ds.Grafo.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[52]");
        org.junit.Assert.assertNotNull(aresta12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 10, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        boolean boolean20 = grafo3.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int[] intArray8 = null;
        grafo7.cab = intArray8;
        int[] intArray13 = new int[] { (byte) 10, '4', 97 };
        grafo7.prox = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo7.prox = intArray27;
        grafo1.peso = intArray27;
        ds.Grafo grafo31 = grafo1.grafoTransposto();
        boolean boolean34 = grafo1.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj(52);
        boolean boolean40 = grafo36.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int[] intArray43 = null;
        grafo42.cab = intArray43;
        int[] intArray48 = new int[] { (byte) 10, '4', 97 };
        grafo42.prox = intArray48;
        ds.Grafo grafo51 = new ds.Grafo((int) 'a');
        int int52 = grafo51.numVertices();
        ds.Grafo grafo53 = grafo51.grafoTransposto();
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta59 = grafo53.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta61 = grafo53.primeiroListaAdj(1);
        int[] intArray62 = new int[] {};
        grafo53.prox = intArray62;
        grafo42.prox = intArray62;
        grafo36.peso = intArray62;
        grafo1.peso = intArray62;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNotNull(aresta56);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int) (byte) 1);
        boolean boolean17 = grafo3.existeAresta((int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) 0, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9097");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta24 = grafo22.primeiroListaAdj(0);
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        int int29 = grafo28.numVertices();
        ds.Grafo grafo30 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta36 = grafo30.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta38 = grafo30.primeiroListaAdj(1);
        boolean boolean40 = grafo30.listaAdjVazia((int) 'a');
        grafo30.imprime();
        ds.Grafo grafo43 = new ds.Grafo((int) 'a');
        int[] intArray44 = null;
        grafo43.cab = intArray44;
        int[] intArray49 = new int[] { (byte) 10, '4', 97 };
        grafo43.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo((int) 'a');
        int int53 = grafo52.numVertices();
        ds.Grafo grafo54 = grafo52.grafoTransposto();
        ds.Grafo.Aresta aresta57 = grafo54.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta60 = grafo54.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta62 = grafo54.primeiroListaAdj(1);
        int[] intArray63 = new int[] {};
        grafo54.prox = intArray63;
        grafo43.prox = intArray63;
        grafo30.cab = intArray63;
        ds.Grafo grafo68 = new ds.Grafo((int) 'a');
        int int69 = grafo68.numVertices();
        ds.Grafo grafo70 = grafo68.grafoTransposto();
        ds.Grafo.Aresta aresta73 = grafo70.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta76 = grafo70.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta78 = grafo70.primeiroListaAdj(1);
        ds.Grafo grafo80 = new ds.Grafo((int) ' ');
        ds.Grafo grafo82 = new ds.Grafo((int) 'a');
        int int83 = grafo82.numVertices();
        ds.Grafo grafo84 = grafo82.grafoTransposto();
        ds.Grafo.Aresta aresta87 = grafo84.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta90 = grafo84.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta92 = grafo84.primeiroListaAdj(1);
        int[] intArray93 = new int[] {};
        grafo84.prox = intArray93;
        grafo80.peso = intArray93;
        grafo70.prox = intArray93;
        grafo30.peso = intArray93;
        grafo26.prox = intArray93;
        grafo22.cab = intArray93;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta33);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta57);
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertNotNull(grafo70);
        org.junit.Assert.assertNotNull(aresta73);
        org.junit.Assert.assertNull(aresta76);
        org.junit.Assert.assertNull(aresta78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertNotNull(grafo84);
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNull(aresta90);
        org.junit.Assert.assertNull(aresta92);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo1.numVertices();
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta23 = grafo15.primeiroListaAdj(1);
        ds.Grafo grafo24 = grafo15.grafoTransposto();
        ds.Grafo grafo25 = grafo24.grafoTransposto();
        grafo25.imprime();
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        int int29 = grafo28.numVertices();
        ds.Grafo grafo30 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta36 = grafo30.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta38 = grafo30.primeiroListaAdj(1);
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int int43 = grafo42.numVertices();
        ds.Grafo grafo44 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta50 = grafo44.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta52 = grafo44.primeiroListaAdj(1);
        int[] intArray53 = new int[] {};
        grafo44.prox = intArray53;
        grafo40.peso = intArray53;
        grafo30.prox = intArray53;
        ds.Grafo grafo58 = new ds.Grafo((int) 'a');
        int int59 = grafo58.numVertices();
        ds.Grafo grafo60 = grafo58.grafoTransposto();
        int[] intArray63 = new int[] { '#', 'a' };
        grafo58.prox = intArray63;
        grafo30.prox = intArray63;
        grafo25.cab = intArray63;
        grafo1.prox = intArray63;
        int int68 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta33);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35, 97]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 1);
        grafo6.insereAresta((int) (byte) 10, 52, 32);
        ds.Grafo grafo14 = new ds.Grafo((int) 'a');
        int int15 = grafo14.numVertices();
        ds.Grafo grafo16 = grafo14.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta22 = grafo16.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta24 = grafo16.primeiroListaAdj(1);
        boolean boolean26 = grafo16.listaAdjVazia((int) 'a');
        grafo16.imprime();
        ds.Grafo.Aresta aresta30 = grafo16.retiraAresta(10, 0);
        ds.Grafo grafo32 = new ds.Grafo((int) 'a');
        int int33 = grafo32.numVertices();
        ds.Grafo grafo34 = grafo32.grafoTransposto();
        grafo32.imprime();
        ds.Grafo grafo37 = new ds.Grafo((int) 'a');
        int int38 = grafo37.numVertices();
        ds.Grafo grafo39 = grafo37.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo39.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta45 = grafo39.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta47 = grafo39.primeiroListaAdj(1);
        ds.Grafo grafo49 = new ds.Grafo((int) ' ');
        ds.Grafo grafo51 = new ds.Grafo((int) 'a');
        int int52 = grafo51.numVertices();
        ds.Grafo grafo53 = grafo51.grafoTransposto();
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta59 = grafo53.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta61 = grafo53.primeiroListaAdj(1);
        int[] intArray62 = new int[] {};
        grafo53.prox = intArray62;
        grafo49.peso = intArray62;
        grafo39.prox = intArray62;
        ds.Grafo grafo67 = new ds.Grafo((int) 'a');
        int int68 = grafo67.numVertices();
        ds.Grafo grafo69 = grafo67.grafoTransposto();
        int[] intArray72 = new int[] { '#', 'a' };
        grafo67.prox = intArray72;
        grafo39.prox = intArray72;
        grafo32.cab = intArray72;
        grafo16.peso = intArray72;
        grafo6.cab = intArray72;
        grafo1.prox = intArray72;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(aresta42);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNotNull(aresta56);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(grafo69);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35, 97]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo9 = new ds.Grafo(52);
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        int int12 = grafo11.numVertices();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta21 = grafo13.primeiroListaAdj(1);
        boolean boolean23 = grafo13.listaAdjVazia((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int[] intArray26 = null;
        grafo25.cab = intArray26;
        int[] intArray31 = new int[] { (byte) 10, '4', 97 };
        grafo25.prox = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int int35 = grafo34.numVertices();
        ds.Grafo grafo36 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta42 = grafo36.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta44 = grafo36.primeiroListaAdj(1);
        int[] intArray45 = new int[] {};
        grafo36.prox = intArray45;
        grafo25.prox = intArray45;
        int int48 = grafo25.numVertices();
        ds.Grafo grafo50 = new ds.Grafo((int) 'a');
        int[] intArray51 = null;
        grafo50.cab = intArray51;
        int[] intArray56 = new int[] { (byte) 10, '4', 97 };
        grafo50.prox = intArray56;
        ds.Grafo grafo59 = new ds.Grafo((int) 'a');
        int[] intArray60 = null;
        grafo59.cab = intArray60;
        int[] intArray65 = new int[] { (byte) 10, '4', 97 };
        grafo59.prox = intArray65;
        int[] intArray67 = grafo59.prox;
        grafo50.peso = intArray67;
        grafo25.prox = intArray67;
        grafo13.cab = intArray67;
        grafo9.prox = intArray67;
        grafo1.peso = intArray67;
        int[] intArray73 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[10, 52, 97]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo18 = grafo3.grafoTransposto();
        boolean boolean20 = grafo3.listaAdjVazia(52);
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int[] intArray23 = null;
        grafo22.cab = intArray23;
        int[] intArray28 = new int[] { (byte) 10, '4', 97 };
        grafo22.prox = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        ds.Grafo.Aresta aresta36 = grafo33.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta39 = grafo33.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta41 = grafo33.primeiroListaAdj(1);
        int[] intArray42 = new int[] {};
        grafo33.prox = intArray42;
        grafo22.prox = intArray42;
        int int45 = grafo22.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) 'a');
        int[] intArray48 = null;
        grafo47.cab = intArray48;
        int[] intArray53 = new int[] { (byte) 10, '4', 97 };
        grafo47.prox = intArray53;
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        int[] intArray57 = null;
        grafo56.cab = intArray57;
        int[] intArray62 = new int[] { (byte) 10, '4', 97 };
        grafo56.prox = intArray62;
        int[] intArray64 = grafo56.prox;
        grafo47.peso = intArray64;
        grafo22.prox = intArray64;
        grafo3.peso = intArray64;
        java.lang.Class<?> wildcardClass68 = intArray64.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(aresta36);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.insereAresta((int) ' ', 1, (int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int[] intArray14 = null;
        grafo13.cab = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = grafo17.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo17.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        int[] intArray24 = null;
        grafo23.cab = intArray24;
        int[] intArray29 = new int[] { (byte) 10, '4', 97 };
        grafo23.prox = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) 'a');
        int int33 = grafo32.numVertices();
        ds.Grafo grafo34 = grafo32.grafoTransposto();
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta40 = grafo34.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta42 = grafo34.primeiroListaAdj(1);
        int[] intArray43 = new int[] {};
        grafo34.prox = intArray43;
        grafo23.prox = intArray43;
        grafo17.peso = intArray43;
        grafo13.cab = intArray43;
        grafo1.prox = intArray43;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 0, 10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean19 = grafo3.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) -1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo7.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        int[] intArray14 = null;
        grafo13.cab = intArray14;
        int[] intArray19 = new int[] { (byte) 10, '4', 97 };
        grafo13.prox = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        int int23 = grafo22.numVertices();
        ds.Grafo grafo24 = grafo22.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta30 = grafo24.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta32 = grafo24.primeiroListaAdj(1);
        int[] intArray33 = new int[] {};
        grafo24.prox = intArray33;
        grafo13.prox = intArray33;
        grafo7.peso = intArray33;
        ds.Grafo grafo37 = grafo7.grafoTransposto();
        boolean boolean40 = grafo7.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo42 = new ds.Grafo((int) 'a');
        int[] intArray43 = null;
        grafo42.cab = intArray43;
        int[] intArray48 = new int[] { (byte) 10, '4', 97 };
        grafo42.prox = intArray48;
        int[] intArray50 = grafo42.prox;
        grafo7.peso = intArray50;
        grafo1.peso = intArray50;
        ds.Grafo.Aresta aresta54 = grafo1.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 52, 97]");
        org.junit.Assert.assertNull(aresta54);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(52);
        boolean boolean7 = grafo1.listaAdjVazia(97);
        int[] intArray8 = grafo1.cab;
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int) (byte) 1);
        boolean boolean17 = grafo3.existeAresta((int) (short) 1, (int) (short) 0);
        boolean boolean19 = grafo3.listaAdjVazia(0);
        int int20 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = grafo3.existeAresta((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int[] intArray11 = null;
        grafo10.cab = intArray11;
        int[] intArray16 = new int[] { (byte) 10, '4', 97 };
        grafo10.prox = intArray16;
        int[] intArray18 = grafo10.prox;
        grafo1.peso = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) 'a');
        int int22 = grafo21.numVertices();
        grafo21.imprime();
        grafo21.imprime();
        ds.Grafo grafo25 = grafo21.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) 'a');
        int[] intArray28 = null;
        grafo27.cab = intArray28;
        int[] intArray33 = new int[] { (byte) 10, '4', 97 };
        grafo27.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        int[] intArray37 = null;
        grafo36.cab = intArray37;
        int[] intArray42 = new int[] { (byte) 10, '4', 97 };
        grafo36.prox = intArray42;
        int[] intArray44 = grafo36.prox;
        grafo27.peso = intArray44;
        grafo21.prox = intArray44;
        grafo1.prox = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta50 = grafo1.retiraAresta((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 52, 97]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo3.retiraAresta(0, 1);
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        int[] intArray20 = new int[] { '#', 'a' };
        grafo15.prox = intArray20;
        grafo3.peso = intArray20;
        grafo3.imprime();
        int int24 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 97]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        int[] intArray7 = new int[] { (byte) 10, '4', 97 };
        grafo1.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo1.prox = intArray21;
        int[] intArray24 = grafo1.prox;
        int[] intArray25 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo12 = grafo3.grafoTransposto();
        boolean boolean15 = grafo3.existeAresta((int) (short) 100, 0);
        ds.Grafo.Aresta aresta17 = grafo3.proxAdj(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 0, (-1));
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.imprime();
        int int10 = grafo8.numVertices();
        int int11 = grafo8.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        ds.Grafo.Aresta aresta20 = grafo3.retiraAresta((int) ' ', (int) (byte) 0);
        int int21 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo6.peso = intArray19;
        grafo1.cab = intArray19;
        java.lang.Class<?> wildcardClass23 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) '#', (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo(97);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int int4 = grafo3.numVertices();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo5.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo5.retiraAresta(0, 1);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        int[] intArray22 = new int[] { '#', 'a' };
        grafo17.prox = intArray22;
        grafo5.peso = intArray22;
        grafo1.cab = intArray22;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 97]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        int int6 = grafo5.numVertices();
        ds.Grafo grafo7 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo7.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta17 = grafo7.retiraAresta(0, 1);
        ds.Grafo grafo19 = new ds.Grafo((int) 'a');
        int int20 = grafo19.numVertices();
        grafo19.imprime();
        grafo19.imprime();
        ds.Grafo grafo23 = grafo19.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        ds.Grafo grafo26 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo25.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int[] intArray32 = null;
        grafo31.cab = intArray32;
        int[] intArray37 = new int[] { (byte) 10, '4', 97 };
        grafo31.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int int41 = grafo40.numVertices();
        ds.Grafo grafo42 = grafo40.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta48 = grafo42.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta50 = grafo42.primeiroListaAdj(1);
        int[] intArray51 = new int[] {};
        grafo42.prox = intArray51;
        grafo31.prox = intArray51;
        grafo25.peso = intArray51;
        ds.Grafo grafo55 = grafo25.grafoTransposto();
        boolean boolean58 = grafo25.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        int[] intArray61 = null;
        grafo60.cab = intArray61;
        int[] intArray66 = new int[] { (byte) 10, '4', 97 };
        grafo60.prox = intArray66;
        int[] intArray68 = grafo60.prox;
        grafo25.peso = intArray68;
        grafo19.peso = intArray68;
        grafo7.cab = intArray68;
        grafo3.peso = intArray68;
        ds.Grafo grafo74 = new ds.Grafo((int) 'a');
        int int75 = grafo74.numVertices();
        ds.Grafo grafo76 = grafo74.grafoTransposto();
        ds.Grafo.Aresta aresta79 = grafo76.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo76.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta86 = grafo76.retiraAresta(0, 1);
        ds.Grafo grafo88 = new ds.Grafo((int) 'a');
        int int89 = grafo88.numVertices();
        ds.Grafo grafo90 = grafo88.grafoTransposto();
        int[] intArray93 = new int[] { '#', 'a' };
        grafo88.prox = intArray93;
        grafo76.peso = intArray93;
        grafo3.cab = intArray93;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertNotNull(aresta79);
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 97 + "'", int89 == 97);
        org.junit.Assert.assertNotNull(grafo90);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[35, 97]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 0, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.insereAresta((int) ' ', 1, (int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(52, (int) (short) 1);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 100, 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        int int31 = grafo30.numVertices();
        ds.Grafo grafo32 = grafo30.grafoTransposto();
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta38 = grafo32.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj(1);
        int[] intArray41 = new int[] {};
        grafo32.prox = intArray41;
        grafo28.peso = intArray41;
        grafo18.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) 'a');
        int int47 = grafo46.numVertices();
        ds.Grafo grafo48 = grafo46.grafoTransposto();
        int[] intArray51 = new int[] { '#', 'a' };
        grafo46.prox = intArray51;
        grafo18.prox = intArray51;
        grafo3.cab = intArray51;
        boolean boolean56 = grafo3.listaAdjVazia((int) (short) 1);
        int int57 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, 97]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (byte) 1);
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo2.primeiroListaAdj(0);
        grafo2.insereAresta(32, 32, (int) 'a');
        boolean boolean12 = grafo2.listaAdjVazia(32);
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        int int17 = grafo16.numVertices();
        ds.Grafo grafo18 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta26 = grafo18.primeiroListaAdj(1);
        int[] intArray27 = new int[] {};
        grafo18.prox = intArray27;
        grafo14.peso = intArray27;
        grafo2.peso = intArray27;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        int[] intArray4 = null;
        grafo3.cab = intArray4;
        boolean boolean8 = grafo3.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo10 = new ds.Grafo((int) 'a');
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj(1);
        int[] intArray21 = new int[] {};
        grafo12.prox = intArray21;
        grafo3.peso = intArray21;
        ds.Grafo grafo24 = grafo3.grafoTransposto();
        boolean boolean26 = grafo3.listaAdjVazia(97);
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        ds.Grafo grafo29 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta32 = grafo28.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        int[] intArray35 = null;
        grafo34.cab = intArray35;
        int[] intArray40 = new int[] { (byte) 10, '4', 97 };
        grafo34.prox = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) 'a');
        int int44 = grafo43.numVertices();
        ds.Grafo grafo45 = grafo43.grafoTransposto();
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta51 = grafo45.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta53 = grafo45.primeiroListaAdj(1);
        int[] intArray54 = new int[] {};
        grafo45.prox = intArray54;
        grafo34.prox = intArray54;
        grafo28.peso = intArray54;
        ds.Grafo grafo58 = grafo28.grafoTransposto();
        boolean boolean61 = grafo28.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo63 = new ds.Grafo((int) 'a');
        int[] intArray64 = null;
        grafo63.cab = intArray64;
        int[] intArray69 = new int[] { (byte) 10, '4', 97 };
        grafo63.prox = intArray69;
        int[] intArray71 = grafo63.prox;
        grafo28.peso = intArray71;
        grafo3.prox = intArray71;
        grafo1.prox = intArray71;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta76 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(aresta48);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[10, 52, 97]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.insereAresta((int) (short) 10, (int) (short) 1, (int) (byte) 0);
        grafo1.insereAresta(97, (int) 'a', (int) ' ');
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj(0);
        boolean boolean20 = grafo3.existeAresta(52, (int) (byte) 0);
        grafo3.imprime();
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        int int24 = grafo23.numVertices();
        grafo23.imprime();
        grafo23.imprime();
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        int[] intArray29 = null;
        grafo28.cab = intArray29;
        int[] intArray34 = new int[] { (byte) 10, '4', 97 };
        grafo28.prox = intArray34;
        int[] intArray36 = grafo28.prox;
        grafo23.cab = intArray36;
        grafo3.prox = intArray36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 52, 97]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 0, (int) (byte) 1);
        int int26 = grafo22.numVertices();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        int int16 = grafo15.numVertices();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta25 = grafo17.primeiroListaAdj(1);
        int[] intArray26 = new int[] {};
        grafo17.prox = intArray26;
        grafo13.peso = intArray26;
        grafo3.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) 'a');
        int int32 = grafo31.numVertices();
        ds.Grafo grafo33 = grafo31.grafoTransposto();
        int[] intArray36 = new int[] { '#', 'a' };
        grafo31.prox = intArray36;
        grafo3.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo3.peso = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) -1, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        boolean boolean24 = grafo1.listaAdjVazia(97);
        ds.Grafo grafo26 = new ds.Grafo((int) 'a');
        ds.Grafo grafo27 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta30 = grafo26.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) 'a');
        int[] intArray33 = null;
        grafo32.cab = intArray33;
        int[] intArray38 = new int[] { (byte) 10, '4', 97 };
        grafo32.prox = intArray38;
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        int int42 = grafo41.numVertices();
        ds.Grafo grafo43 = grafo41.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo43.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta49 = grafo43.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta51 = grafo43.primeiroListaAdj(1);
        int[] intArray52 = new int[] {};
        grafo43.prox = intArray52;
        grafo32.prox = intArray52;
        grafo26.peso = intArray52;
        ds.Grafo grafo56 = grafo26.grafoTransposto();
        boolean boolean59 = grafo26.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) 'a');
        int[] intArray62 = null;
        grafo61.cab = intArray62;
        int[] intArray67 = new int[] { (byte) 10, '4', 97 };
        grafo61.prox = intArray67;
        int[] intArray69 = grafo61.prox;
        grafo26.peso = intArray69;
        grafo1.prox = intArray69;
        int int72 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta75 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(aresta46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo3.retiraAresta(0, 1);
        int[] intArray14 = null;
        grafo3.prox = intArray14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo3.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta13 = grafo3.retiraAresta(0, 1);
        grafo3.insereAresta(10, (int) (byte) 1, (int) (byte) 100);
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(1);
        boolean boolean13 = grafo3.listaAdjVazia((int) 'a');
        grafo3.imprime();
        ds.Grafo.Aresta aresta17 = grafo3.retiraAresta(10, 0);
        ds.Grafo.Aresta aresta20 = grafo3.retiraAresta((int) ' ', (int) (byte) 0);
        ds.Grafo grafo21 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(0);
        boolean boolean7 = grafo3.listaAdjVazia(52);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo3.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (short) 1);
        grafo2.insereAresta((int) (byte) 10, 52, 32);
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj(1);
        int[] intArray23 = new int[] {};
        grafo14.prox = intArray23;
        grafo10.peso = intArray23;
        grafo2.peso = intArray23;
        boolean boolean29 = grafo2.existeAresta((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(52);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        boolean boolean6 = grafo1.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj(1);
        int[] intArray19 = new int[] {};
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        grafo1.imprime();
        int[] intArray23 = grafo1.cab;
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        int int26 = grafo25.numVertices();
        ds.Grafo grafo27 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int) (short) 100, (int) (byte) 0);
        grafo27.insereAresta((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta37 = grafo27.retiraAresta(0, 1);
        ds.Grafo grafo39 = new ds.Grafo((int) 'a');
        int int40 = grafo39.numVertices();
        grafo39.imprime();
        grafo39.imprime();
        ds.Grafo grafo43 = grafo39.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo46 = grafo45.grafoTransposto();
        ds.Grafo.Aresta aresta49 = grafo45.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo51 = new ds.Grafo((int) 'a');
        int[] intArray52 = null;
        grafo51.cab = intArray52;
        int[] intArray57 = new int[] { (byte) 10, '4', 97 };
        grafo51.prox = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        int int61 = grafo60.numVertices();
        ds.Grafo grafo62 = grafo60.grafoTransposto();
        ds.Grafo.Aresta aresta65 = grafo62.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta68 = grafo62.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta70 = grafo62.primeiroListaAdj(1);
        int[] intArray71 = new int[] {};
        grafo62.prox = intArray71;
        grafo51.prox = intArray71;
        grafo45.peso = intArray71;
        ds.Grafo grafo75 = grafo45.grafoTransposto();
        boolean boolean78 = grafo45.existeAresta(97, (int) (short) 1);
        ds.Grafo grafo80 = new ds.Grafo((int) 'a');
        int[] intArray81 = null;
        grafo80.cab = intArray81;
        int[] intArray86 = new int[] { (byte) 10, '4', 97 };
        grafo80.prox = intArray86;
        int[] intArray88 = grafo80.prox;
        grafo45.peso = intArray88;
        grafo39.peso = intArray88;
        grafo27.cab = intArray88;
        grafo1.peso = intArray88;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNotNull(aresta65);
        org.junit.Assert.assertNull(aresta68);
        org.junit.Assert.assertNull(aresta70);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(grafo75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[10, 52, 97]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int[] intArray2 = null;
        grafo1.cab = intArray2;
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(52);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta15 = grafo9.retiraAresta((int) (short) 0, (-1));
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta27 = grafo19.primeiroListaAdj(1);
        int[] intArray28 = new int[] {};
        grafo19.prox = intArray28;
        grafo9.peso = intArray28;
        boolean boolean32 = grafo9.listaAdjVazia((int) '4');
        ds.Grafo grafo34 = new ds.Grafo((int) 'a');
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo34.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) 'a');
        int[] intArray41 = null;
        grafo40.cab = intArray41;
        int[] intArray46 = new int[] { (byte) 10, '4', 97 };
        grafo40.prox = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) 'a');
        int int50 = grafo49.numVertices();
        ds.Grafo grafo51 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta57 = grafo51.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta59 = grafo51.primeiroListaAdj(1);
        int[] intArray60 = new int[] {};
        grafo51.prox = intArray60;
        grafo40.prox = intArray60;
        grafo34.peso = intArray60;
        ds.Grafo grafo64 = grafo34.grafoTransposto();
        boolean boolean67 = grafo34.existeAresta(97, (int) (short) 1);
        boolean boolean69 = grafo34.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo71 = new ds.Grafo((int) 'a');
        int[] intArray72 = null;
        grafo71.cab = intArray72;
        boolean boolean76 = grafo71.existeAresta(97, (int) (short) -1);
        ds.Grafo grafo78 = new ds.Grafo((int) 'a');
        int int79 = grafo78.numVertices();
        ds.Grafo grafo80 = grafo78.grafoTransposto();
        ds.Grafo.Aresta aresta83 = grafo80.retiraAresta((int) (short) 100, (int) (byte) 0);
        ds.Grafo.Aresta aresta86 = grafo80.retiraAresta((int) (short) 0, (-1));
        ds.Grafo.Aresta aresta88 = grafo80.primeiroListaAdj(1);
        int[] intArray89 = new int[] {};
        grafo80.prox = intArray89;
        grafo71.peso = intArray89;
        int[] intArray92 = grafo71.peso;
        grafo34.prox = intArray92;
        grafo9.cab = intArray92;
        grafo1.cab = intArray92;
        ds.Grafo grafo96 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta99 = grafo96.retiraAresta((int) (byte) 10, 0);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 52, 97]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertNotNull(grafo80);
        org.junit.Assert.assertNotNull(aresta83);
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNull(aresta88);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[]");
        org.junit.Assert.assertNotNull(grafo96);
        org.junit.Assert.assertNotNull(aresta99);
    }
}

