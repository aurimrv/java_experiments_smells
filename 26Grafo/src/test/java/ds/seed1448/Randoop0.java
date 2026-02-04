package ds.seed1448;

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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo15 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo26 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo1.existeAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        java.lang.Class<?> wildcardClass30 = intArray26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        java.lang.Class<?> wildcardClass14 = intArray12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.existeAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo28 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo(52);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int int26 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo40 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.retiraAresta((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        grafo12.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo1.existeAresta((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo(52);
        boolean boolean4 = grafo1.existeAresta(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        int int10 = aresta9.v1();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        java.lang.Class<?> wildcardClass15 = intArray13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean17 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 100);
        int int29 = grafo28.numVertices();
        grafo28.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray40 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo28.cab = intArray40;
        int[] intArray45 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo28.prox = intArray45;
        grafo26.peso = intArray45;
        grafo6.prox = intArray45;
        grafo4.prox = intArray45;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo4.retiraAresta((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 0, -1]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = grafo1.existeAresta((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        java.lang.Class<?> wildcardClass37 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        int int10 = aresta9.v2();
        java.lang.Class<?> wildcardClass11 = aresta9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        grafo1.cab = intArray32;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo37 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo25.cab = intArray36;
        ds.Grafo.Aresta aresta39 = grafo25.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta42 = grafo25.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        int int45 = grafo44.numVertices();
        grafo44.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo44.cab = intArray56;
        grafo25.cab = intArray56;
        grafo1.cab = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = grafo1.existeAresta((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        grafo14.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo38.imprime();
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        grafo38.cab = intArray82;
        grafo1.peso = intArray82;
        java.lang.Class<?> wildcardClass87 = intArray82.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        boolean boolean86 = grafo51.listaAdjVazia((int) '#');
        int[] intArray87 = grafo51.cab;
        grafo1.peso = intArray87;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.retiraAresta((int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        int[] intArray41 = grafo1.peso;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        boolean boolean45 = grafo43.listaAdjVazia((int) (short) 10);
        int[] intArray52 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo43.peso = intArray52;
        ds.Grafo grafo54 = grafo43.grafoTransposto();
        ds.Grafo grafo55 = grafo43.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        int int58 = grafo57.numVertices();
        grafo57.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo57.cab = intArray69;
        int[] intArray74 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo57.prox = intArray74;
        int[] intArray78 = new int[] { (byte) 0, (byte) 1 };
        grafo57.prox = intArray78;
        ds.Grafo grafo81 = new ds.Grafo((int) (byte) 100);
        boolean boolean83 = grafo81.listaAdjVazia((int) (short) 10);
        int[] intArray90 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo81.peso = intArray90;
        grafo57.cab = intArray90;
        grafo43.prox = intArray90;
        grafo1.cab = intArray90;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (byte) 10, (int) '#', (int) '#');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        boolean boolean39 = grafo1.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) '#');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        grafo7.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo20.cab = intArray31;
        grafo7.prox = intArray31;
        grafo5.prox = intArray31;
        int[] intArray35 = new int[] {};
        grafo5.peso = intArray35;
        grafo1.peso = intArray35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        boolean boolean16 = grafo1.listaAdjVazia(52);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 101]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        java.lang.Class<?> wildcardClass18 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        boolean boolean57 = grafo55.listaAdjVazia((int) (short) 10);
        int int58 = grafo55.numVertices();
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        int[] intArray74 = grafo60.cab;
        grafo55.cab = intArray74;
        grafo1.cab = intArray74;
        java.lang.Class<?> wildcardClass77 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        java.lang.Class<?> wildcardClass50 = intArray47.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        int[] intArray42 = new int[] { (byte) 0, (byte) 1 };
        grafo21.prox = intArray42;
        grafo6.peso = intArray42;
        int int45 = grafo6.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo6.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) 'a');
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        grafo75.peso = intArray91;
        grafo60.cab = intArray91;
        grafo6.prox = intArray91;
        grafo1.cab = intArray91;
        ds.Grafo.Aresta aresta97 = grafo1.primeiroListaAdj(1);
        boolean boolean99 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, 97);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        int int12 = grafo11.numVertices();
        grafo11.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray23 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo11.cab = intArray23;
        int[] intArray28 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo11.prox = intArray28;
        int[] intArray32 = new int[] { (byte) 0, (byte) 1 };
        grafo11.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        boolean boolean37 = grafo35.listaAdjVazia((int) (short) 10);
        int[] intArray44 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo35.peso = intArray44;
        grafo11.cab = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 100);
        boolean boolean50 = grafo48.listaAdjVazia((int) (short) 10);
        int[] intArray57 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo48.peso = intArray57;
        grafo11.peso = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 100);
        int int62 = grafo61.numVertices();
        grafo61.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray73 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo61.cab = intArray73;
        ds.Grafo grafo76 = new ds.Grafo((int) 'a');
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 100);
        int int79 = grafo78.numVertices();
        grafo78.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray90 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo78.cab = intArray90;
        int[] intArray92 = grafo78.cab;
        grafo76.peso = intArray92;
        grafo61.cab = intArray92;
        boolean boolean96 = grafo61.listaAdjVazia((int) '#');
        int[] intArray97 = grafo61.cab;
        grafo11.peso = intArray97;
        grafo9.peso = intArray97;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray5 = null;
        grafo1.peso = intArray5;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        ds.Grafo grafo29 = grafo18.grafoTransposto();
        boolean boolean31 = grafo18.listaAdjVazia((int) (short) 0);
        int[] intArray32 = grafo18.peso;
        grafo1.peso = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) '#', 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        ds.Grafo grafo18 = grafo7.grafoTransposto();
        boolean boolean20 = grafo7.listaAdjVazia((int) (short) 0);
        int[] intArray21 = grafo7.peso;
        grafo1.prox = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo23 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia(0);
        boolean boolean43 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo25.cab = intArray36;
        ds.Grafo.Aresta aresta39 = grafo25.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta42 = grafo25.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        int int45 = grafo44.numVertices();
        grafo44.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo44.cab = intArray56;
        grafo25.cab = intArray56;
        grafo1.cab = intArray56;
        int[] intArray60 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        int int16 = grafo15.numVertices();
        grafo15.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray27 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo15.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 100);
        int int33 = grafo32.numVertices();
        grafo32.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray44 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo32.cab = intArray44;
        int[] intArray46 = grafo32.cab;
        grafo30.peso = intArray46;
        grafo15.cab = intArray46;
        grafo1.prox = intArray46;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        boolean boolean86 = grafo51.listaAdjVazia((int) '#');
        int[] intArray87 = grafo51.cab;
        grafo1.peso = intArray87;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo89 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo12 = new ds.Grafo(0);
        grafo12.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        boolean boolean32 = grafo18.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        boolean boolean36 = grafo34.listaAdjVazia((int) (short) 10);
        int[] intArray43 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo34.peso = intArray43;
        grafo34.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        int int48 = grafo47.numVertices();
        grafo47.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo47.cab = intArray58;
        grafo34.prox = intArray58;
        grafo18.cab = intArray58;
        grafo12.prox = intArray58;
        grafo1.cab = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean17 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) '#');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        int int56 = grafo55.numVertices();
        grafo55.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray67 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo55.cab = intArray67;
        ds.Grafo grafo70 = new ds.Grafo((int) 'a');
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        int int73 = grafo72.numVertices();
        grafo72.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray84 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo72.cab = intArray84;
        int[] intArray86 = grafo72.cab;
        grafo70.peso = intArray86;
        grafo55.cab = intArray86;
        grafo1.prox = intArray86;
        int[] intArray90 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        int[] intArray29 = grafo1.prox;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 100);
        int int47 = grafo46.numVertices();
        grafo46.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo46.cab = intArray58;
        int[] intArray63 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo46.prox = intArray63;
        int[] intArray67 = new int[] { (byte) 0, (byte) 1 };
        grafo46.prox = intArray67;
        grafo31.peso = intArray67;
        int int70 = grafo31.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        boolean boolean74 = grafo72.listaAdjVazia((int) (short) 10);
        int[] intArray81 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo72.peso = intArray81;
        grafo31.cab = intArray81;
        grafo1.cab = intArray81;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        int[] intArray41 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = aresta18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray17 = grafo3.cab;
        grafo1.peso = intArray17;
        boolean boolean21 = grafo1.existeAresta(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(52);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        grafo1.cab = intArray32;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta39 = grafo1.retiraAresta(0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        int[] intArray22 = grafo1.cab;
        int int23 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        int[] intArray82 = grafo1.prox;
        int[] intArray83 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        grafo14.peso = intArray33;
        grafo1.peso = intArray33;
        int int37 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (-1));
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 52);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        grafo14.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo.Aresta aresta38 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta38);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        boolean boolean61 = grafo1.existeAresta(100, 10);
        ds.Grafo.Aresta aresta63 = grafo1.proxAdj(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(aresta63);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        int int24 = grafo23.numVertices();
        grafo23.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray35 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo23.cab = intArray35;
        int[] intArray40 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo23.prox = intArray40;
        grafo21.peso = intArray40;
        grafo1.prox = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 100);
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 1, (int) (byte) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        int[] intArray82 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = grafo1.existeAresta((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 10, 97);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) '#', 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray19 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo7.cab = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 100);
        int int23 = grafo22.numVertices();
        grafo22.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray34 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo22.cab = intArray34;
        int[] intArray39 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo22.prox = intArray39;
        int[] intArray43 = new int[] { (byte) 0, (byte) 1 };
        grafo22.prox = intArray43;
        grafo7.peso = intArray43;
        int int46 = grafo7.numVertices();
        int[] intArray47 = grafo7.peso;
        grafo1.prox = intArray47;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 1]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        int[] intArray31 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo14.prox = intArray31;
        int[] intArray35 = new int[] { (byte) 0, (byte) 1 };
        grafo14.prox = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray49 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo38.cab = intArray49;
        ds.Grafo.Aresta aresta52 = grafo38.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta55 = grafo38.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        int int58 = grafo57.numVertices();
        grafo57.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo57.cab = intArray69;
        grafo38.cab = intArray69;
        grafo14.cab = intArray69;
        int[] intArray73 = grafo14.cab;
        grafo1.prox = intArray73;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta77 = grafo1.retiraAresta(97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.existeAresta((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        int[] intArray21 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo4.prox = intArray21;
        int[] intArray25 = new int[] { (byte) 0, (byte) 1 };
        grafo4.prox = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 100);
        int int29 = grafo28.numVertices();
        grafo28.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray39 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo28.cab = intArray39;
        ds.Grafo.Aresta aresta42 = grafo28.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta45 = grafo28.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        int int48 = grafo47.numVertices();
        grafo47.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray59 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo47.cab = intArray59;
        grafo28.cab = intArray59;
        grafo4.cab = intArray59;
        int[] intArray63 = grafo4.cab;
        grafo2.cab = intArray63;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 100);
        boolean boolean31 = grafo29.listaAdjVazia((int) (short) 10);
        int int32 = grafo29.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        int int35 = grafo34.numVertices();
        grafo34.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo34.cab = intArray46;
        int[] intArray48 = grafo34.cab;
        grafo29.cab = intArray48;
        grafo14.cab = intArray48;
        grafo12.prox = intArray48;
        int[] intArray52 = grafo12.prox;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        int int56 = grafo55.numVertices();
        grafo55.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray67 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo55.cab = intArray67;
        ds.Grafo grafo70 = new ds.Grafo((int) 'a');
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        int int73 = grafo72.numVertices();
        grafo72.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray84 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo72.cab = intArray84;
        int[] intArray86 = grafo72.cab;
        grafo70.peso = intArray86;
        grafo55.cab = intArray86;
        grafo1.prox = intArray86;
        int[] intArray90 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[0, 1]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        int[] intArray16 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, 97);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        boolean boolean61 = grafo1.existeAresta(100, 10);
        boolean boolean63 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray5 = null;
        grafo1.peso = intArray5;
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        int[] intArray30 = grafo1.peso;
        boolean boolean33 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(32, 10);
        boolean boolean21 = grafo1.existeAresta(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray24 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 97, 97);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        grafo1.insereAresta((int) '#', 100, (int) (short) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        grafo19.prox = intArray41;
        grafo16.peso = intArray41;
        grafo1.cab = intArray41;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        int[] intArray31 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo14.prox = intArray31;
        grafo12.cab = intArray31;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 0, -1]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        int[] intArray14 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo15 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
        grafo1.insereAresta(97, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray5 = null;
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo18 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) '4', 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '#', (int) (short) 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, 10, 100, 97, 1]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        int[] intArray42 = new int[] { (byte) 0, (byte) 1 };
        grafo21.prox = intArray42;
        grafo6.peso = intArray42;
        int int45 = grafo6.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo6.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) 'a');
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        grafo75.peso = intArray91;
        grafo60.cab = intArray91;
        grafo6.prox = intArray91;
        grafo1.cab = intArray91;
        boolean boolean98 = grafo1.existeAresta((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 32, (int) '#');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 100);
        int int47 = grafo46.numVertices();
        grafo46.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo46.cab = intArray58;
        int[] intArray63 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo46.prox = intArray63;
        grafo44.peso = intArray63;
        grafo24.prox = intArray63;
        grafo22.prox = intArray63;
        grafo1.peso = intArray63;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta70 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 0, -1]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean14 = grafo1.existeAresta(0, (-1));
        boolean boolean17 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(0, (int) (short) 1);
        boolean boolean22 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) ' ');
        int int10 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        grafo1.cab = intArray32;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta39 = grafo1.retiraAresta((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        boolean boolean15 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray20 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo3.prox = intArray20;
        grafo1.peso = intArray20;
        int int23 = grafo1.numVertices();
        int[] intArray24 = grafo1.peso;
        boolean boolean27 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(35, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 10);
        int[] intArray26 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo17.peso = intArray26;
        grafo17.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        int int31 = grafo30.numVertices();
        grafo30.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray41 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo30.cab = intArray41;
        grafo17.prox = intArray41;
        int int44 = grafo17.numVertices();
        int[] intArray45 = grafo17.prox;
        grafo1.peso = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 100);
        int int49 = grafo48.numVertices();
        boolean boolean52 = grafo48.existeAresta((int) '#', 1);
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 100);
        boolean boolean56 = grafo54.listaAdjVazia((int) (short) 10);
        int[] intArray63 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo54.peso = intArray63;
        ds.Grafo grafo65 = grafo54.grafoTransposto();
        boolean boolean67 = grafo54.listaAdjVazia((int) (short) 0);
        int[] intArray68 = grafo54.peso;
        grafo48.prox = intArray68;
        grafo1.cab = intArray68;
        ds.Grafo.Aresta aresta72 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta72);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        ds.Grafo grafo29 = grafo18.grafoTransposto();
        boolean boolean31 = grafo18.listaAdjVazia((int) (short) 0);
        int[] intArray32 = grafo18.peso;
        grafo1.peso = intArray32;
        java.lang.Class<?> wildcardClass34 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta((int) (byte) 100, 0, 10);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(97, 32);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        int int12 = grafo11.numVertices();
        grafo11.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray23 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo11.cab = intArray23;
        int[] intArray28 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo11.prox = intArray28;
        grafo6.prox = intArray28;
        grafo1.peso = intArray28;
        java.lang.Class<?> wildcardClass32 = intArray28.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        int[] intArray30 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 0, -1]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.existeAresta(35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = grafo1.existeAresta(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        int[] intArray24 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo15.peso = intArray24;
        int[] intArray26 = grafo15.peso;
        boolean boolean29 = grafo15.existeAresta(52, (int) (byte) 0);
        boolean boolean32 = grafo15.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        boolean boolean36 = grafo34.listaAdjVazia((int) (short) 10);
        int[] intArray43 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo34.peso = intArray43;
        ds.Grafo grafo45 = grafo34.grafoTransposto();
        int[] intArray47 = new int[] { '#' };
        grafo34.cab = intArray47;
        int[] intArray49 = grafo34.peso;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        ds.Grafo grafo62 = grafo51.grafoTransposto();
        boolean boolean64 = grafo51.listaAdjVazia((int) (short) 0);
        int[] intArray65 = grafo51.peso;
        grafo34.peso = intArray65;
        grafo15.peso = intArray65;
        grafo1.prox = intArray65;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(52);
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean19 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia(0);
        boolean boolean43 = grafo1.listaAdjVazia(35);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        boolean boolean39 = grafo1.listaAdjVazia((int) ' ');
        int int40 = grafo1.numVertices();
        int int41 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 10);
        int[] intArray15 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((int) (short) 0, (int) (byte) 1);
        boolean boolean16 = grafo6.existeAresta(0, 0);
        ds.Grafo grafo17 = grafo6.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        boolean boolean36 = grafo34.listaAdjVazia((int) (short) 10);
        int int37 = grafo34.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 100);
        int int40 = grafo39.numVertices();
        grafo39.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray51 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo39.cab = intArray51;
        int[] intArray53 = grafo39.cab;
        grafo34.cab = intArray53;
        grafo19.cab = intArray53;
        boolean boolean57 = grafo19.listaAdjVazia(52);
        boolean boolean59 = grafo19.listaAdjVazia(0);
        ds.Grafo.Aresta aresta61 = grafo19.proxAdj((int) (short) 1);
        int[] intArray62 = grafo19.cab;
        grafo17.cab = intArray62;
        grafo1.cab = intArray62;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean16 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) 'a', 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia((int) '4');
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        int int44 = grafo43.numVertices();
        grafo43.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray55 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo43.cab = intArray55;
        int[] intArray60 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo43.prox = intArray60;
        int[] intArray64 = new int[] { (byte) 0, (byte) 1 };
        grafo43.prox = intArray64;
        grafo1.prox = intArray64;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 1]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int[] intArray25 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo16.peso = intArray25;
        ds.Grafo grafo27 = grafo16.grafoTransposto();
        int[] intArray29 = new int[] { '#' };
        grafo16.cab = intArray29;
        grafo13.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            grafo13.insereAresta(1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int[] intArray13 = grafo1.peso;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(97, 32);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        boolean boolean22 = grafo20.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo23 = grafo20.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo25.cab = intArray37;
        int[] intArray42 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo25.prox = intArray42;
        grafo20.prox = intArray42;
        grafo15.peso = intArray42;
        grafo1.prox = intArray42;
        ds.Grafo grafo48 = new ds.Grafo(52);
        ds.Grafo grafo49 = grafo48.grafoTransposto();
        boolean boolean52 = grafo49.existeAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 100);
        boolean boolean56 = grafo54.listaAdjVazia((int) (short) 10);
        int[] intArray63 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo54.peso = intArray63;
        grafo54.imprime();
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 100);
        int int68 = grafo67.numVertices();
        grafo67.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray78 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo67.cab = intArray78;
        grafo54.prox = intArray78;
        int int81 = grafo54.numVertices();
        int[] intArray82 = grafo54.prox;
        grafo49.cab = intArray82;
        grafo1.peso = intArray82;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int[] intArray13 = grafo1.peso;
        ds.Grafo grafo15 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(97, 32);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        boolean boolean22 = grafo20.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo23 = grafo20.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo25.cab = intArray37;
        int[] intArray42 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo25.prox = intArray42;
        grafo20.prox = intArray42;
        grafo15.peso = intArray42;
        grafo1.prox = intArray42;
        int int47 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray4 = null;
        grafo1.peso = intArray4;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo(52);
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        grafo11.imprime();
        grafo11.insereAresta(0, (int) (short) 100, (int) (short) 10);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        int int22 = grafo19.numVertices();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray38 = grafo24.cab;
        grafo19.cab = intArray38;
        grafo11.cab = intArray38;
        grafo9.prox = intArray38;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', 52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(1, 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean16 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 10);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo3.peso = intArray12;
        ds.Grafo grafo14 = grafo3.grafoTransposto();
        int[] intArray16 = new int[] { '#' };
        grafo3.cab = intArray16;
        int[] intArray18 = grafo3.peso;
        grafo1.prox = intArray18;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) '4');
        int int5 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, (int) (short) 10);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 10);
        int int12 = grafo9.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        int[] intArray28 = grafo14.cab;
        grafo9.cab = intArray28;
        grafo1.cab = intArray28;
        ds.Grafo.Aresta aresta32 = grafo1.proxAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta32);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        ds.Grafo.Aresta aresta43 = grafo1.proxAdj(10);
        ds.Grafo.Aresta aresta46 = grafo1.retiraAresta((int) (byte) 1, 0);
        int int47 = aresta46.v2();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(aresta46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        boolean boolean20 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(97, 52);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        ds.Grafo grafo29 = grafo18.grafoTransposto();
        boolean boolean31 = grafo18.listaAdjVazia((int) (short) 0);
        int[] intArray32 = grafo18.peso;
        grafo1.peso = intArray32;
        ds.Grafo.Aresta aresta36 = grafo1.retiraAresta((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta36);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 52);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 35, (int) (byte) -1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, -1]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        boolean boolean61 = grafo1.existeAresta(100, 10);
        ds.Grafo.Aresta aresta64 = grafo1.retiraAresta(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(aresta64);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        boolean boolean13 = grafo11.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray50 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo38.cab = intArray50;
        int[] intArray55 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo38.prox = intArray55;
        grafo36.peso = intArray55;
        grafo16.prox = intArray55;
        grafo14.prox = intArray55;
        grafo1.prox = intArray55;
        java.lang.Class<?> wildcardClass61 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta35 = grafo1.retiraAresta((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 97, (int) (short) 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        grafo1.cab = intArray32;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.imprime();
        int int41 = grafo38.numVertices();
        grafo38.imprime();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo46 = new ds.Grafo((int) '#');
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 100);
        boolean boolean50 = grafo48.listaAdjVazia((int) (short) 10);
        int[] intArray57 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo48.peso = intArray57;
        grafo48.imprime();
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 100);
        int int62 = grafo61.numVertices();
        grafo61.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo61.cab = intArray72;
        grafo48.prox = intArray72;
        grafo46.prox = intArray72;
        grafo44.cab = intArray72;
        grafo38.cab = intArray72;
        grafo1.peso = intArray72;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        boolean boolean16 = grafo14.listaAdjVazia((int) (short) 10);
        int[] intArray23 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo14.peso = intArray23;
        int[] intArray25 = grafo14.peso;
        boolean boolean28 = grafo14.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        boolean boolean32 = grafo30.listaAdjVazia((int) (short) 10);
        int[] intArray39 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo30.peso = intArray39;
        grafo30.imprime();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        int int44 = grafo43.numVertices();
        grafo43.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray54 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo43.cab = intArray54;
        grafo30.prox = intArray54;
        int int57 = grafo30.numVertices();
        int[] intArray58 = grafo30.prox;
        grafo14.peso = intArray58;
        grafo1.prox = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta53 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray85 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo68.prox = intArray85;
        int[] intArray89 = new int[] { (byte) 0, (byte) 1 };
        grafo68.prox = intArray89;
        grafo53.peso = intArray89;
        int int92 = grafo53.numVertices();
        boolean boolean94 = grafo53.listaAdjVazia((int) 'a');
        int[] intArray95 = grafo53.cab;
        grafo1.peso = intArray95;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        boolean boolean43 = grafo1.listaAdjVazia(52);
        int[] intArray44 = grafo1.peso;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 100);
        int int47 = grafo46.numVertices();
        grafo46.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo46.cab = intArray58;
        int[] intArray60 = grafo46.cab;
        int[] intArray61 = grafo46.cab;
        grafo1.prox = intArray61;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia(0);
        boolean boolean43 = grafo1.listaAdjVazia(35);
        int int44 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = null;
        grafo1.prox = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta41 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean6 = grafo1.existeAresta((int) (short) 10, (int) ' ');
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 100);
        boolean boolean10 = grafo8.listaAdjVazia((int) (short) 10);
        int[] intArray17 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo8.peso = intArray17;
        int[] intArray19 = grafo8.peso;
        boolean boolean21 = grafo8.listaAdjVazia((int) (byte) 10);
        int[] intArray22 = grafo8.peso;
        ds.Grafo grafo24 = new ds.Grafo(52);
        ds.Grafo grafo25 = grafo24.grafoTransposto();
        grafo24.imprime();
        grafo24.insereAresta(0, (int) (short) 100, (int) (short) 10);
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 100);
        boolean boolean34 = grafo32.listaAdjVazia((int) (short) 10);
        int int35 = grafo32.numVertices();
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 100);
        int int38 = grafo37.numVertices();
        grafo37.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray49 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo37.cab = intArray49;
        int[] intArray51 = grafo37.cab;
        grafo32.cab = intArray51;
        grafo24.cab = intArray51;
        grafo8.cab = intArray51;
        grafo1.cab = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 10);
        int[] intArray15 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo6.peso = intArray15;
        ds.Grafo grafo17 = grafo6.grafoTransposto();
        int int18 = grafo6.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        boolean boolean22 = grafo20.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo23 = grafo20.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo25.cab = intArray37;
        int[] intArray42 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo25.prox = intArray42;
        grafo20.prox = intArray42;
        int[] intArray45 = grafo20.prox;
        grafo6.peso = intArray45;
        grafo3.cab = intArray45;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 0, -1]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 10, (int) 'a');
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        ds.Grafo.Aresta aresta43 = grafo1.proxAdj(10);
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        int int48 = grafo47.numVertices();
        grafo47.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray59 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo47.cab = intArray59;
        int[] intArray61 = grafo47.cab;
        grafo45.peso = intArray61;
        grafo1.peso = intArray61;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        int[] intArray29 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = grafo1.existeAresta((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) ' ');
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 10, 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        boolean boolean60 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        ds.Grafo grafo62 = new ds.Grafo((int) (byte) 100);
        int int63 = grafo62.numVertices();
        grafo62.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray74 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo62.cab = intArray74;
        ds.Grafo grafo77 = new ds.Grafo((int) 'a');
        ds.Grafo grafo79 = new ds.Grafo((int) (byte) 100);
        int int80 = grafo79.numVertices();
        grafo79.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray91 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo79.cab = intArray91;
        int[] intArray93 = grafo79.cab;
        grafo77.peso = intArray93;
        grafo62.cab = intArray93;
        grafo1.peso = intArray93;
        int[] intArray97 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        int[] intArray45 = grafo31.cab;
        grafo29.peso = intArray45;
        grafo14.cab = intArray45;
        grafo1.cab = intArray45;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        int int51 = grafo50.numVertices();
        grafo50.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray62 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo50.cab = intArray62;
        int[] intArray64 = grafo50.cab;
        int[] intArray65 = grafo50.cab;
        grafo1.prox = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = grafo1.existeAresta(32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        grafo1.insereAresta((int) '#', 100, (int) (short) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        grafo19.prox = intArray41;
        grafo16.peso = intArray41;
        grafo1.cab = intArray41;
        boolean boolean48 = grafo1.existeAresta((int) (short) 0, (int) (short) 10);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        boolean boolean52 = grafo50.listaAdjVazia((int) (short) 10);
        int int53 = grafo50.numVertices();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        int int56 = grafo55.numVertices();
        grafo55.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray67 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo55.cab = intArray67;
        int[] intArray69 = grafo55.cab;
        grafo50.cab = intArray69;
        int[] intArray71 = grafo50.cab;
        grafo1.prox = intArray71;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray17 = grafo3.cab;
        grafo1.peso = intArray17;
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        boolean boolean21 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) ' ', (int) ' ');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        boolean boolean16 = grafo1.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo3.numVertices();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) '#', 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        ds.Grafo grafo18 = grafo7.grafoTransposto();
        boolean boolean20 = grafo7.listaAdjVazia((int) (short) 0);
        int[] intArray21 = grafo7.peso;
        grafo1.prox = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int[] intArray4 = null;
        grafo1.prox = intArray4;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 32, 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        boolean boolean16 = grafo1.listaAdjVazia(52);
        ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo1.existeAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 52, (int) (byte) 10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 100);
        boolean boolean41 = grafo39.listaAdjVazia((int) (short) 10);
        int[] intArray48 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo39.peso = intArray48;
        grafo39.imprime();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 100);
        int int53 = grafo52.numVertices();
        grafo52.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray64 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo52.cab = intArray64;
        ds.Grafo grafo67 = new ds.Grafo((int) 'a');
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 100);
        int int70 = grafo69.numVertices();
        grafo69.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray81 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo69.cab = intArray81;
        int[] intArray83 = grafo69.cab;
        grafo67.peso = intArray83;
        grafo52.cab = intArray83;
        grafo39.cab = intArray83;
        grafo1.peso = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        grafo18.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray42 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo31.cab = intArray42;
        grafo18.prox = intArray42;
        grafo14.prox = intArray42;
        grafo1.prox = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta49 = grafo1.retiraAresta((int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 10);
        int[] intArray26 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo17.peso = intArray26;
        grafo17.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        int int31 = grafo30.numVertices();
        grafo30.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray41 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo30.cab = intArray41;
        grafo17.prox = intArray41;
        int int44 = grafo17.numVertices();
        int[] intArray45 = grafo17.prox;
        grafo1.peso = intArray45;
        boolean boolean49 = grafo1.existeAresta(1, (int) (byte) 100);
        ds.Grafo.Aresta aresta51 = grafo1.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(aresta51);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        boolean boolean39 = grafo1.listaAdjVazia((int) ' ');
        int int40 = grafo1.numVertices();
        ds.Grafo.Aresta aresta43 = grafo1.retiraAresta(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNull(aresta43);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        int int15 = grafo14.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) 'a', (int) '4', 1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(0, 52);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        boolean boolean16 = grafo14.listaAdjVazia((int) (short) 10);
        int int17 = grafo14.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray33 = grafo19.cab;
        grafo14.cab = intArray33;
        int[] intArray35 = grafo14.cab;
        int[] intArray36 = grafo14.cab;
        grafo1.peso = intArray36;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        int[] intArray13 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo4.peso = intArray13;
        ds.Grafo grafo15 = grafo4.grafoTransposto();
        int[] intArray16 = grafo4.peso;
        boolean boolean18 = grafo4.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo20.cab = intArray31;
        ds.Grafo.Aresta aresta34 = grafo20.proxAdj((int) ' ');
        int[] intArray35 = grafo20.cab;
        grafo4.peso = intArray35;
        grafo1.prox = intArray35;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 1, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        int int24 = grafo23.numVertices();
        grafo23.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray35 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo23.cab = intArray35;
        int[] intArray40 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo23.prox = intArray40;
        grafo21.peso = intArray40;
        grafo1.prox = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta69 = grafo1.primeiroListaAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        boolean boolean42 = grafo1.listaAdjVazia((int) 'a');
        int[] intArray43 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo44 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 32, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int[] intArray13 = grafo1.peso;
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        java.lang.Class<?> wildcardClass50 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = grafo1.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int int15 = grafo1.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        int int18 = grafo17.numVertices();
        grafo17.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 100);
        int int33 = grafo32.numVertices();
        grafo32.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray44 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo32.cab = intArray44;
        int[] intArray49 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo32.prox = intArray49;
        int[] intArray53 = new int[] { (byte) 0, (byte) 1 };
        grafo32.prox = intArray53;
        grafo17.peso = intArray53;
        int int56 = grafo17.numVertices();
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 100);
        boolean boolean60 = grafo58.listaAdjVazia((int) (short) 10);
        int[] intArray67 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo58.peso = intArray67;
        grafo17.cab = intArray67;
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 100);
        boolean boolean73 = grafo71.listaAdjVazia((int) (short) 10);
        int[] intArray80 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo71.peso = intArray80;
        int[] intArray82 = grafo71.peso;
        boolean boolean84 = grafo71.listaAdjVazia((int) (byte) 10);
        int[] intArray85 = grafo71.peso;
        grafo17.prox = intArray85;
        grafo1.prox = intArray85;
        int[] intArray88 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        int[] intArray37 = null;
        grafo1.cab = intArray37;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        int[] intArray45 = grafo31.cab;
        grafo29.peso = intArray45;
        grafo14.cab = intArray45;
        grafo1.cab = intArray45;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        int int51 = grafo50.numVertices();
        grafo50.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray62 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo50.cab = intArray62;
        int[] intArray64 = grafo50.cab;
        int[] intArray65 = grafo50.cab;
        grafo1.prox = intArray65;
        int[] intArray67 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo68 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray20 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo3.prox = intArray20;
        grafo1.peso = intArray20;
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(32);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        int int27 = grafo26.numVertices();
        grafo26.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo26.cab = intArray37;
        int[] intArray39 = grafo26.cab;
        grafo1.prox = intArray39;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) '4');
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo3.numVertices();
        java.lang.Class<?> wildcardClass5 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(52);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        grafo1.insereAresta((int) '#', 100, (int) (short) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        grafo19.prox = intArray41;
        grafo16.peso = intArray41;
        grafo1.cab = intArray41;
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo50 = grafo47.grafoTransposto();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 100);
        int int53 = grafo52.numVertices();
        grafo52.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray64 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo52.cab = intArray64;
        int[] intArray69 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo52.prox = intArray69;
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo74 = new ds.Grafo((int) (byte) 100);
        int int75 = grafo74.numVertices();
        grafo74.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray86 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo74.cab = intArray86;
        int[] intArray91 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo74.prox = intArray91;
        grafo72.peso = intArray91;
        grafo52.prox = intArray91;
        grafo50.prox = intArray91;
        grafo1.peso = intArray91;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[32, 0, -1]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        boolean boolean56 = grafo1.existeAresta((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        int[] intArray82 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 10, 100, 97, 1]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo1.existeAresta(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        java.lang.Class<?> wildcardClass42 = intArray40.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        grafo1.insereAresta(52, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 100, 1, -1, 0, 10]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(35);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        int int38 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean14 = grafo1.existeAresta(0, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int[] intArray25 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo16.peso = intArray25;
        int[] intArray27 = grafo16.peso;
        int[] intArray28 = grafo16.peso;
        grafo1.prox = intArray28;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        boolean boolean13 = grafo11.listaAdjVazia((int) (short) 10);
        int[] intArray20 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo11.peso = intArray20;
        ds.Grafo grafo23 = new ds.Grafo(52);
        ds.Grafo grafo24 = grafo23.grafoTransposto();
        grafo23.imprime();
        grafo23.insereAresta(0, (int) (short) 100, (int) (short) 10);
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        boolean boolean33 = grafo31.listaAdjVazia((int) (short) 10);
        int int34 = grafo31.numVertices();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray48 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo36.cab = intArray48;
        int[] intArray50 = grafo36.cab;
        grafo31.cab = intArray50;
        grafo23.cab = intArray50;
        grafo11.cab = intArray50;
        grafo1.prox = intArray50;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 1, (int) (byte) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta((int) ' ', (int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        boolean boolean61 = grafo1.existeAresta(100, 10);
        ds.Grafo grafo62 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(grafo62);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray20 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo3.prox = intArray20;
        grafo1.peso = intArray20;
        int int23 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean27 = grafo1.existeAresta((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 52);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        boolean boolean42 = grafo1.listaAdjVazia((int) 'a');
        int int43 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo44 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(35, 1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        int[] intArray28 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo19.peso = intArray28;
        int[] intArray30 = grafo19.peso;
        boolean boolean32 = grafo19.listaAdjVazia((int) (byte) 10);
        int[] intArray33 = grafo19.peso;
        ds.Grafo grafo35 = new ds.Grafo(52);
        ds.Grafo grafo36 = grafo35.grafoTransposto();
        grafo35.imprime();
        grafo35.insereAresta(0, (int) (short) 100, (int) (short) 10);
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        boolean boolean45 = grafo43.listaAdjVazia((int) (short) 10);
        int int46 = grafo43.numVertices();
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 100);
        int int49 = grafo48.numVertices();
        grafo48.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray60 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo48.cab = intArray60;
        int[] intArray62 = grafo48.cab;
        grafo43.cab = intArray62;
        grafo35.cab = intArray62;
        grafo19.cab = intArray62;
        grafo13.cab = intArray62;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        boolean boolean61 = grafo1.existeAresta(100, 10);
        ds.Grafo grafo62 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = grafo62.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNotNull(grafo63);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        int int2 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        boolean boolean21 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta24 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = aresta24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(52);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.imprime();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 100);
        boolean boolean15 = grafo13.listaAdjVazia((int) (short) 10);
        int[] intArray22 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo13.peso = intArray22;
        grafo13.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        int int27 = grafo26.numVertices();
        grafo26.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo26.cab = intArray37;
        grafo13.prox = intArray37;
        grafo9.prox = intArray37;
        grafo1.prox = intArray37;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        boolean boolean42 = grafo1.listaAdjVazia((int) 'a');
        int int43 = grafo1.numVertices();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNull(aresta45);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(1, 0);
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        ds.Grafo.Aresta aresta60 = grafo1.primeiroListaAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = aresta60.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta60);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 10, 32);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta((int) (short) 1, (int) ' ');
        boolean boolean10 = grafo4.existeAresta((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 100);
        int int14 = grafo13.numVertices();
        grafo13.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo13.cab = intArray25;
        grafo1.peso = intArray25;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 10);
        int[] intArray26 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo17.peso = intArray26;
        grafo17.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        int int31 = grafo30.numVertices();
        grafo30.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray41 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo30.cab = intArray41;
        grafo17.prox = intArray41;
        int int44 = grafo17.numVertices();
        int[] intArray45 = grafo17.prox;
        grafo1.peso = intArray45;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 100);
        boolean boolean30 = grafo28.listaAdjVazia((int) (short) 10);
        int[] intArray37 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo28.peso = intArray37;
        grafo28.imprime();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 100);
        int int42 = grafo41.numVertices();
        grafo41.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray53 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo41.cab = intArray53;
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 100);
        int int59 = grafo58.numVertices();
        grafo58.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray70 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo58.cab = intArray70;
        int[] intArray72 = grafo58.cab;
        grafo56.peso = intArray72;
        grafo41.cab = intArray72;
        grafo28.cab = intArray72;
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        int[] intArray92 = grafo77.cab;
        grafo28.prox = intArray92;
        grafo1.cab = intArray92;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        int int12 = grafo11.numVertices();
        grafo11.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray23 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo11.cab = intArray23;
        int[] intArray25 = grafo11.cab;
        grafo1.cab = intArray25;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 1, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        int[] intArray45 = grafo31.cab;
        grafo29.peso = intArray45;
        grafo14.cab = intArray45;
        grafo1.cab = intArray45;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta43 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(aresta43);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        int int50 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass51 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        int[] intArray14 = grafo1.cab;
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        ds.Grafo grafo29 = grafo18.grafoTransposto();
        boolean boolean31 = grafo18.listaAdjVazia((int) (short) 0);
        int[] intArray32 = grafo18.peso;
        grafo1.peso = intArray32;
        ds.Grafo.Aresta aresta36 = grafo1.retiraAresta(35, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta36);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        boolean boolean39 = grafo1.listaAdjVazia((int) ' ');
        int int40 = grafo1.numVertices();
        boolean boolean43 = grafo1.existeAresta((int) '4', 0);
        int[] intArray44 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        int[] intArray30 = grafo1.peso;
        int int31 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta((int) (short) 1, (int) ' ');
        int int8 = grafo4.numVertices();
        grafo4.insereAresta((int) (byte) 0, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(32, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo1.insereAresta(1, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        boolean boolean60 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        boolean boolean62 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 32);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo35.cab = intArray47;
        int[] intArray52 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo35.prox = intArray52;
        int[] intArray56 = new int[] { (byte) 0, (byte) 1 };
        grafo35.prox = intArray56;
        grafo20.peso = intArray56;
        int int59 = grafo20.numVertices();
        int[] intArray60 = grafo20.peso;
        grafo15.prox = intArray60;
        grafo1.prox = intArray60;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 1]");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        boolean boolean22 = grafo20.listaAdjVazia((int) (short) 10);
        int[] intArray29 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo20.peso = intArray29;
        ds.Grafo grafo31 = grafo20.grafoTransposto();
        int[] intArray33 = new int[] { '#' };
        grafo20.cab = intArray33;
        int[] intArray35 = grafo20.peso;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 100);
        boolean boolean39 = grafo37.listaAdjVazia((int) (short) 10);
        int[] intArray46 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo37.peso = intArray46;
        ds.Grafo grafo48 = grafo37.grafoTransposto();
        boolean boolean50 = grafo37.listaAdjVazia((int) (short) 0);
        int[] intArray51 = grafo37.peso;
        grafo20.peso = intArray51;
        grafo1.peso = intArray51;
        ds.Grafo.Aresta aresta55 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int56 = grafo1.numVertices();
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 100);
        int int59 = grafo58.numVertices();
        grafo58.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray70 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo58.cab = intArray70;
        int[] intArray72 = grafo58.cab;
        int[] intArray73 = grafo58.cab;
        grafo1.cab = intArray73;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 97, 32);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo50 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        java.lang.Class<?> wildcardClass33 = intArray29.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray5 = null;
        grafo1.peso = intArray5;
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        int[] intArray14 = grafo1.cab;
        boolean boolean17 = grafo1.existeAresta(1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 32, 97);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        grafo1.insereAresta((int) (byte) 100, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 52, 1, -1, 0, 10]");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(32, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 100);
        boolean boolean31 = grafo29.listaAdjVazia((int) (short) 10);
        int int32 = grafo29.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        int int35 = grafo34.numVertices();
        grafo34.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo34.cab = intArray46;
        int[] intArray48 = grafo34.cab;
        grafo29.cab = intArray48;
        grafo14.cab = intArray48;
        boolean boolean52 = grafo14.listaAdjVazia(52);
        boolean boolean54 = grafo14.listaAdjVazia(0);
        ds.Grafo.Aresta aresta56 = grafo14.proxAdj((int) (short) 1);
        int[] intArray57 = grafo14.cab;
        grafo12.cab = intArray57;
        java.lang.Class<?> wildcardClass59 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 10, 52);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(0, (int) (byte) 10, 52);
        boolean boolean9 = grafo1.existeAresta(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) '#', (int) (byte) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        int[] intArray18 = grafo7.peso;
        boolean boolean21 = grafo7.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        int int50 = grafo23.numVertices();
        int[] intArray51 = grafo23.prox;
        grafo7.peso = intArray51;
        grafo1.cab = intArray51;
        int[] intArray54 = grafo1.cab;
        ds.Grafo.Aresta aresta56 = grafo1.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta56);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        boolean boolean21 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta24 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        boolean boolean26 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        int[] intArray42 = new int[] { (byte) 0, (byte) 1 };
        grafo21.prox = intArray42;
        grafo6.peso = intArray42;
        int int45 = grafo6.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo6.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) 'a');
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        grafo75.peso = intArray91;
        grafo60.cab = intArray91;
        grafo6.prox = intArray91;
        grafo1.cab = intArray91;
        ds.Grafo.Aresta aresta97 = grafo1.primeiroListaAdj(1);
        int int98 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 100 + "'", int98 == 100);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int[] intArray13 = grafo1.peso;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (short) 0, 32);
        ds.Grafo.Aresta aresta8 = grafo2.retiraAresta((int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo2.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        boolean boolean43 = grafo1.listaAdjVazia(52);
        ds.Grafo grafo44 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(grafo44);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) (byte) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (short) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        int[] intArray41 = grafo1.peso;
        java.lang.Class<?> wildcardClass42 = intArray41.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(97, 32);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray17 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo6.cab = intArray17;
        int[] intArray19 = grafo6.cab;
        grafo1.cab = intArray19;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        int[] intArray42 = new int[] { (byte) 0, (byte) 1 };
        grafo21.prox = intArray42;
        grafo6.peso = intArray42;
        int int45 = grafo6.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo6.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) 'a');
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        grafo75.peso = intArray91;
        grafo60.cab = intArray91;
        grafo6.prox = intArray91;
        grafo1.cab = intArray91;
        boolean boolean97 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 100);
        int int47 = grafo46.numVertices();
        grafo46.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo46.cab = intArray58;
        int[] intArray63 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo46.prox = intArray63;
        grafo44.peso = intArray63;
        grafo24.prox = intArray63;
        grafo22.prox = intArray63;
        grafo1.peso = intArray63;
        ds.Grafo.Aresta aresta70 = grafo1.primeiroListaAdj(0);
        int[] intArray71 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta70);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.peso();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 100);
        int int14 = grafo13.numVertices();
        grafo13.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo13.cab = intArray25;
        int[] intArray30 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo13.prox = intArray30;
        int[] intArray34 = new int[] { (byte) 0, (byte) 1 };
        grafo13.prox = intArray34;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 100);
        int int38 = grafo37.numVertices();
        grafo37.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray48 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo37.cab = intArray48;
        ds.Grafo.Aresta aresta51 = grafo37.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta54 = grafo37.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 100);
        int int57 = grafo56.numVertices();
        grafo56.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray68 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo56.cab = intArray68;
        grafo37.cab = intArray68;
        grafo13.cab = intArray68;
        int[] intArray72 = grafo13.cab;
        grafo1.peso = intArray72;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        ds.Grafo.Aresta aresta31 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 100);
        boolean boolean35 = grafo33.listaAdjVazia((int) (short) 10);
        int int36 = grafo33.numVertices();
        grafo33.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta43 = grafo33.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean46 = grafo33.existeAresta(0, (-1));
        boolean boolean49 = grafo33.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo51 = new ds.Grafo(52);
        ds.Grafo grafo52 = grafo51.grafoTransposto();
        boolean boolean55 = grafo52.existeAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        boolean boolean59 = grafo57.listaAdjVazia((int) (short) 10);
        int[] intArray66 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo57.peso = intArray66;
        grafo57.imprime();
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 100);
        int int71 = grafo70.numVertices();
        grafo70.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray81 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo70.cab = intArray81;
        grafo57.prox = intArray81;
        int int84 = grafo57.numVertices();
        int[] intArray85 = grafo57.prox;
        grafo52.cab = intArray85;
        grafo33.cab = intArray85;
        grafo1.cab = intArray85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int int15 = grafo1.numVertices();
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) '4');
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean19 = grafo16.existeAresta(10, (int) '#');
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        grafo16.peso = intArray38;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        ds.Grafo.Aresta aresta60 = grafo1.primeiroListaAdj((int) ' ');
        int int61 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 10);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo3.peso = intArray12;
        grafo3.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray27 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo16.cab = intArray27;
        grafo3.prox = intArray27;
        grafo1.prox = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.retiraAresta((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 10);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo3.peso = intArray12;
        grafo3.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray27 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo16.cab = intArray27;
        grafo3.prox = intArray27;
        grafo1.prox = intArray27;
        int[] intArray31 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo32 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = null;
        grafo1.prox = intArray37;
        int int39 = grafo1.numVertices();
        int[] intArray40 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 52, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        boolean boolean22 = grafo20.listaAdjVazia((int) (short) 10);
        int[] intArray29 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo20.peso = intArray29;
        ds.Grafo grafo31 = grafo20.grafoTransposto();
        int[] intArray33 = new int[] { '#' };
        grafo20.cab = intArray33;
        int[] intArray35 = grafo20.peso;
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 100);
        boolean boolean39 = grafo37.listaAdjVazia((int) (short) 10);
        int[] intArray46 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo37.peso = intArray46;
        ds.Grafo grafo48 = grafo37.grafoTransposto();
        boolean boolean50 = grafo37.listaAdjVazia((int) (short) 0);
        int[] intArray51 = grafo37.peso;
        grafo20.peso = intArray51;
        grafo1.peso = intArray51;
        ds.Grafo.Aresta aresta55 = grafo1.primeiroListaAdj((int) (byte) 0);
        int[] intArray56 = null;
        grafo1.cab = intArray56;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta55);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 32, 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta69 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 100);
        int int9 = grafo8.numVertices();
        grafo8.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray20 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo8.cab = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray37 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo25.cab = intArray37;
        int[] intArray39 = grafo25.cab;
        grafo23.peso = intArray39;
        grafo8.cab = intArray39;
        boolean boolean43 = grafo8.listaAdjVazia((int) '#');
        int[] intArray44 = grafo8.cab;
        boolean boolean46 = grafo8.listaAdjVazia((int) ' ');
        int int47 = grafo8.numVertices();
        int[] intArray48 = grafo8.cab;
        grafo1.peso = intArray48;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 52);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        ds.Grafo.Aresta aresta60 = grafo1.primeiroListaAdj((int) ' ');
        int[] intArray61 = null;
        grafo1.cab = intArray61;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta60);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Grafo grafo1 = new ds.Grafo(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (short) 0, 32);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        int int12 = grafo11.numVertices();
        grafo11.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray23 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo11.cab = intArray23;
        int[] intArray28 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo11.prox = intArray28;
        grafo9.peso = intArray28;
        grafo1.prox = intArray28;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 0, -1]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo19 = new ds.Grafo(52);
        ds.Grafo grafo20 = grafo19.grafoTransposto();
        boolean boolean23 = grafo20.existeAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo25.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray49 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo38.cab = intArray49;
        grafo25.prox = intArray49;
        int int52 = grafo25.numVertices();
        int[] intArray53 = grafo25.prox;
        grafo20.cab = intArray53;
        grafo1.peso = intArray53;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        ds.Grafo.Aresta aresta31 = grafo1.primeiroListaAdj((int) (short) 1);
        int int32 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean14 = grafo1.existeAresta(0, (-1));
        boolean boolean17 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 1, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 10);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo3.peso = intArray12;
        ds.Grafo grafo14 = grafo3.grafoTransposto();
        boolean boolean16 = grafo3.listaAdjVazia((int) (short) 0);
        int[] intArray17 = grafo3.peso;
        grafo1.peso = intArray17;
        int int19 = grafo1.numVertices();
        boolean boolean21 = grafo1.listaAdjVazia(100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        boolean boolean3 = grafo1.listaAdjVazia(97);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) '4', 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        int[] intArray31 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo14.prox = intArray31;
        int[] intArray35 = new int[] { (byte) 0, (byte) 1 };
        grafo14.prox = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray49 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo38.cab = intArray49;
        ds.Grafo.Aresta aresta52 = grafo38.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta55 = grafo38.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        int int58 = grafo57.numVertices();
        grafo57.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo57.cab = intArray69;
        grafo38.cab = intArray69;
        grafo14.cab = intArray69;
        int[] intArray73 = grafo14.cab;
        grafo1.cab = intArray73;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        boolean boolean21 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int) '#');
        boolean boolean26 = grafo1.existeAresta(52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        int[] intArray31 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo14.prox = intArray31;
        int[] intArray35 = new int[] { (byte) 0, (byte) 1 };
        grafo14.prox = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        int int39 = grafo38.numVertices();
        grafo38.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray49 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo38.cab = intArray49;
        ds.Grafo.Aresta aresta52 = grafo38.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta55 = grafo38.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        int int58 = grafo57.numVertices();
        grafo57.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo57.cab = intArray69;
        grafo38.cab = intArray69;
        grafo14.cab = intArray69;
        int[] intArray73 = grafo14.cab;
        grafo1.prox = intArray73;
        int[] intArray75 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean14 = grafo1.existeAresta(0, (-1));
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 32, 32);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 1, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 0, 97);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        boolean boolean20 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(97, 52);
        int[] intArray24 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo42.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        int int56 = grafo55.numVertices();
        grafo55.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray66 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo55.cab = intArray66;
        grafo42.prox = intArray66;
        int int69 = grafo42.numVertices();
        int[] intArray70 = grafo42.peso;
        grafo1.prox = intArray70;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        grafo1.insereAresta((int) '#', 100, (int) (short) -1);
        int int15 = grafo1.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 10);
        int[] intArray26 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo17.peso = intArray26;
        int[] intArray28 = grafo17.peso;
        int int29 = grafo17.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray42 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo31.cab = intArray42;
        boolean boolean45 = grafo31.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo47.imprime();
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray71 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo60.cab = intArray71;
        grafo47.prox = intArray71;
        grafo31.cab = intArray71;
        grafo17.peso = intArray71;
        grafo1.prox = intArray71;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int int58 = grafo1.numVertices();
        boolean boolean61 = grafo1.existeAresta(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        int[] intArray24 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo15.peso = intArray24;
        ds.Grafo grafo26 = grafo15.grafoTransposto();
        int int27 = grafo15.numVertices();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 100);
        boolean boolean31 = grafo29.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo32 = grafo29.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        int int35 = grafo34.numVertices();
        grafo34.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo34.cab = intArray46;
        int[] intArray51 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo34.prox = intArray51;
        grafo29.prox = intArray51;
        int[] intArray54 = grafo29.prox;
        grafo15.peso = intArray54;
        grafo13.prox = intArray54;
        int[] intArray57 = grafo13.prox;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[32, 0, -1]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) '#', 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        ds.Grafo grafo18 = grafo7.grafoTransposto();
        boolean boolean20 = grafo7.listaAdjVazia((int) (short) 0);
        int[] intArray21 = grafo7.peso;
        grafo1.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 100);
        int int28 = grafo27.numVertices();
        grafo27.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray39 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo27.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        int int43 = grafo42.numVertices();
        grafo42.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray54 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo42.cab = intArray54;
        int[] intArray59 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo42.prox = intArray59;
        int[] intArray63 = new int[] { (byte) 0, (byte) 1 };
        grafo42.prox = intArray63;
        grafo27.peso = intArray63;
        int int66 = grafo27.numVertices();
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        boolean boolean70 = grafo68.listaAdjVazia((int) (short) 10);
        int[] intArray77 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo68.peso = intArray77;
        grafo27.cab = intArray77;
        grafo24.peso = intArray77;
        int[] intArray81 = grafo24.peso;
        grafo1.prox = intArray81;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 10);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo3.peso = intArray12;
        ds.Grafo grafo14 = grafo3.grafoTransposto();
        boolean boolean16 = grafo3.listaAdjVazia((int) (short) 0);
        int[] intArray17 = grafo3.peso;
        grafo1.peso = intArray17;
        int int19 = grafo1.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) '#');
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo21.prox = intArray47;
        int[] intArray51 = grafo21.prox;
        grafo1.cab = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        int[] intArray24 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo15.peso = intArray24;
        ds.Grafo grafo26 = grafo15.grafoTransposto();
        int int27 = grafo15.numVertices();
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 100);
        boolean boolean31 = grafo29.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo32 = grafo29.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        int int35 = grafo34.numVertices();
        grafo34.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo34.cab = intArray46;
        int[] intArray51 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo34.prox = intArray51;
        grafo29.prox = intArray51;
        int[] intArray54 = grafo29.prox;
        grafo15.peso = intArray54;
        grafo13.prox = intArray54;
        int int57 = grafo13.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        int int16 = grafo15.numVertices();
        grafo15.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray27 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo15.cab = intArray27;
        int[] intArray32 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo15.prox = intArray32;
        int[] intArray36 = new int[] { (byte) 0, (byte) 1 };
        grafo15.prox = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 100);
        boolean boolean41 = grafo39.listaAdjVazia((int) (short) 10);
        int[] intArray48 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo39.peso = intArray48;
        grafo15.cab = intArray48;
        grafo1.prox = intArray48;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        boolean boolean55 = grafo53.listaAdjVazia((int) (short) 10);
        int[] intArray62 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo53.peso = intArray62;
        ds.Grafo grafo64 = grafo53.grafoTransposto();
        int int65 = grafo53.numVertices();
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 100);
        boolean boolean69 = grafo67.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo70 = grafo67.grafoTransposto();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        int int73 = grafo72.numVertices();
        grafo72.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray84 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo72.cab = intArray84;
        int[] intArray89 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo72.prox = intArray89;
        grafo67.prox = intArray89;
        int[] intArray92 = grafo67.prox;
        grafo53.peso = intArray92;
        boolean boolean95 = grafo53.listaAdjVazia(52);
        int[] intArray96 = grafo53.peso;
        grafo1.prox = intArray96;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(grafo70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[32, 0, -1]");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        boolean boolean20 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(97, 52);
        boolean boolean25 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo26 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(grafo26);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        boolean boolean19 = grafo1.existeAresta(97, 52);
        boolean boolean21 = grafo1.listaAdjVazia(100);
        ds.Grafo.Aresta aresta24 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        boolean boolean28 = grafo26.listaAdjVazia((int) (short) 10);
        int[] intArray35 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo26.peso = intArray35;
        ds.Grafo grafo37 = grafo26.grafoTransposto();
        int[] intArray39 = new int[] { '#' };
        grafo26.cab = intArray39;
        int[] intArray41 = grafo26.peso;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        boolean boolean45 = grafo43.listaAdjVazia((int) (short) 10);
        int[] intArray52 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo43.peso = intArray52;
        ds.Grafo grafo54 = grafo43.grafoTransposto();
        boolean boolean56 = grafo43.listaAdjVazia((int) (short) 0);
        int[] intArray57 = grafo43.peso;
        grafo26.peso = intArray57;
        grafo1.prox = intArray57;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 100, 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 100, (int) (byte) 10);
    }
}

