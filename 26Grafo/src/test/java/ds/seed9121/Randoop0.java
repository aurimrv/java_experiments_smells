package ds.seed9121;

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
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = grafo1.listaAdjVazia((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo15 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.retiraAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        java.lang.Class<?> wildcardClass31 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        java.lang.Class<?> wildcardClass11 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        java.lang.Class<?> wildcardClass29 = grafo7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        int[] intArray25 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        int[] intArray25 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) 'a', 52);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo19 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        int[] intArray36 = new int[] { '4', 'a' };
        grafo20.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) ' ');
        int[] intArray46 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo39.prox = intArray46;
        int[] intArray51 = new int[] { (short) 1, '#', (byte) 10 };
        grafo39.cab = intArray51;
        grafo20.prox = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (short) -1, 'a', (short) 10 };
        grafo55.peso = intArray59;
        int[] intArray61 = grafo55.peso;
        grafo20.peso = intArray61;
        grafo1.cab = intArray61;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.existeAresta(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta36 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo7.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) ' ');
        int[] intArray40 = new int[] { (short) -1, 'a', (short) 10 };
        grafo36.peso = intArray40;
        int[] intArray42 = grafo36.peso;
        grafo1.peso = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 97, 10]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray17 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo18 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray17 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta89 = grafo7.retiraAresta((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) ' ');
        int[] intArray40 = new int[] { (short) -1, 'a', (short) 10 };
        grafo36.peso = intArray40;
        int[] intArray42 = grafo36.peso;
        grafo1.peso = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) ' ');
        int[] intArray67 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo60.prox = intArray67;
        int[] intArray72 = new int[] { (short) 1, '#', (byte) 10 };
        grafo60.cab = intArray72;
        grafo45.prox = intArray72;
        ds.Grafo grafo76 = new ds.Grafo((int) ' ');
        int[] intArray80 = new int[] { (short) -1, 'a', (short) 10 };
        grafo76.peso = intArray80;
        int[] intArray82 = grafo76.peso;
        int[] intArray84 = new int[] { 1 };
        grafo76.peso = intArray84;
        int[] intArray86 = grafo76.peso;
        grafo45.prox = intArray86;
        grafo1.peso = intArray86;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo1.existeAresta((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        grafo1.peso = intArray12;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) (byte) 10, 32, (int) '4');
        java.lang.Class<?> wildcardClass13 = grafo7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        java.lang.Class<?> wildcardClass35 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo31.prox = intArray38;
        int[] intArray43 = new int[] { (short) 1, '#', (byte) 10 };
        grafo31.cab = intArray43;
        ds.Grafo.Aresta aresta46 = grafo31.proxAdj((int) (byte) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (short) -1, 'a', (short) 10 };
        grafo48.peso = intArray52;
        grafo31.prox = intArray52;
        int[] intArray55 = grafo31.cab;
        grafo7.prox = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo57 = grafo7.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        boolean boolean27 = grafo1.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        boolean boolean27 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        grafo13.prox = intArray35;
        grafo11.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = grafo11.existeAresta(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta36 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '#', (int) '#');
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo.Aresta aresta31 = grafo7.retiraAresta((int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNull(aresta31);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        java.lang.Class<?> wildcardClass29 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        int[] intArray52 = grafo7.cab;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo20 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo12 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (short) -1, 'a', (short) 10 };
        grafo12.peso = intArray16;
        int[] intArray18 = grafo12.peso;
        grafo1.peso = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        ds.Grafo grafo21 = new ds.Grafo((int) ' ');
        int[] intArray28 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo21.prox = intArray28;
        int[] intArray33 = new int[] { (short) 1, '#', (byte) 10 };
        grafo21.cab = intArray33;
        ds.Grafo.Aresta aresta36 = grafo21.proxAdj((int) (byte) 1);
        int[] intArray37 = grafo21.cab;
        grafo1.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo40.prox = intArray47;
        int[] intArray52 = new int[] { (short) 1, '#', (byte) 10 };
        grafo40.cab = intArray52;
        ds.Grafo.Aresta aresta55 = grafo40.proxAdj((int) (byte) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray61 = new int[] { (short) -1, 'a', (short) 10 };
        grafo57.peso = intArray61;
        grafo40.prox = intArray61;
        grafo1.prox = intArray61;
        java.lang.Class<?> wildcardClass65 = intArray61.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        ds.Grafo grafo21 = new ds.Grafo((int) ' ');
        int[] intArray28 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo21.prox = intArray28;
        int[] intArray33 = new int[] { (short) 1, '#', (byte) 10 };
        grafo21.cab = intArray33;
        ds.Grafo.Aresta aresta36 = grafo21.proxAdj((int) (byte) 1);
        int[] intArray37 = grafo21.cab;
        grafo1.prox = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo39 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 35, 10]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        int[] intArray50 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 35, 10]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo12 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (short) -1, 'a', (short) 10 };
        grafo12.peso = intArray16;
        int[] intArray18 = grafo12.peso;
        grafo1.peso = intArray18;
        boolean boolean22 = grafo1.existeAresta(10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        ds.Grafo grafo63 = new ds.Grafo((int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo63.prox = intArray70;
        int[] intArray75 = new int[] { (short) 1, '#', (byte) 10 };
        grafo63.cab = intArray75;
        int[] intArray79 = new int[] { '4', 'a' };
        grafo63.cab = intArray79;
        int[] intArray81 = grafo63.prox;
        grafo40.prox = intArray81;
        grafo1.peso = intArray81;
        boolean boolean85 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta87 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        java.lang.Class<?> wildcardClass34 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (byte) -1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        grafo13.prox = intArray35;
        grafo11.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo11.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        grafo1.peso = intArray12;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, (int) '#');
        boolean boolean20 = grafo1.existeAresta((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 52, (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        int[] intArray40 = new int[] { (short) 1, '#', (byte) 10 };
        grafo28.cab = intArray40;
        grafo9.prox = intArray40;
        grafo1.prox = intArray40;
        java.lang.Class<?> wildcardClass44 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo31.prox = intArray38;
        int[] intArray43 = new int[] { (short) 1, '#', (byte) 10 };
        grafo31.cab = intArray43;
        ds.Grafo.Aresta aresta46 = grafo31.proxAdj((int) (byte) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (short) -1, 'a', (short) 10 };
        grafo48.peso = intArray52;
        grafo31.prox = intArray52;
        int[] intArray55 = grafo31.cab;
        grafo7.prox = intArray55;
        ds.Grafo.Aresta aresta58 = grafo7.primeiroListaAdj(0);
        int int59 = aresta58.v2();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        int[] intArray25 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 1, (int) (short) 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        int[] intArray42 = grafo32.peso;
        grafo1.prox = intArray42;
        int int44 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        int[] intArray22 = grafo1.prox;
        int[] intArray23 = grafo1.prox;
        java.lang.Class<?> wildcardClass24 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        int[] intArray50 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = grafo1.existeAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) (byte) 10, 32, (int) '4');
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = grafo7.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (short) -1, 'a', (short) 10 };
        grafo26.peso = intArray30;
        ds.Grafo grafo32 = grafo26.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        int[] intArray46 = new int[] { (short) 1, '#', (byte) 10 };
        grafo34.cab = intArray46;
        int[] intArray50 = new int[] { '4', 'a' };
        grafo34.cab = intArray50;
        int[] intArray52 = grafo34.prox;
        grafo32.cab = intArray52;
        grafo32.imprime();
        ds.Grafo grafo56 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo56.prox = intArray63;
        int[] intArray68 = new int[] { (short) 1, '#', (byte) 10 };
        grafo56.cab = intArray68;
        ds.Grafo.Aresta aresta71 = grafo56.proxAdj((int) (byte) 1);
        ds.Grafo grafo73 = new ds.Grafo((int) ' ');
        int[] intArray77 = new int[] { (short) -1, 'a', (short) 10 };
        grafo73.peso = intArray77;
        grafo56.prox = intArray77;
        int[] intArray80 = grafo56.cab;
        grafo32.prox = intArray80;
        grafo1.prox = intArray80;
        java.lang.Class<?> wildcardClass83 = intArray80.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) (byte) 10, 32, (int) '4');
        boolean boolean15 = grafo7.existeAresta((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (short) 0, (int) '#', (int) '4');
        grafo4.insereAresta(10, (int) ' ', (int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', (int) (short) 100, (int) '4');
        grafo7.insereAresta(52, (int) (byte) 1, (int) (short) 100);
        grafo7.imprime();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta(0, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        int[] intArray50 = grafo7.cab;
        int[] intArray51 = null;
        grafo7.cab = intArray51;
        int int53 = grafo7.numVertices();
        int[] intArray54 = null;
        grafo7.peso = intArray54;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) (byte) 10, 32, (int) '4');
        int int13 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta32 = grafo17.proxAdj((int) (byte) 1);
        int[] intArray33 = grafo17.cab;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) ' ');
        int[] intArray43 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo36.prox = intArray43;
        int[] intArray48 = new int[] { (short) 1, '#', (byte) 10 };
        grafo36.cab = intArray48;
        int[] intArray50 = grafo36.prox;
        ds.Grafo grafo52 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo52.prox = intArray59;
        int[] intArray64 = new int[] { (short) 1, '#', (byte) 10 };
        grafo52.cab = intArray64;
        ds.Grafo.Aresta aresta67 = grafo52.proxAdj((int) (byte) 1);
        int[] intArray68 = grafo52.cab;
        grafo36.cab = intArray68;
        grafo1.peso = intArray68;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta67);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 35, 10]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        int[] intArray18 = new int[] { (short) -1, 'a', (short) 10 };
        grafo14.peso = intArray18;
        int[] intArray20 = grafo14.peso;
        grafo1.peso = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 10]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int) (byte) 100);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) ' ', (int) (byte) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (short) -1, 'a', (short) 10 };
        grafo13.peso = intArray17;
        grafo11.peso = intArray17;
        ds.Grafo.Aresta aresta22 = grafo11.retiraAresta((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        boolean boolean31 = grafo7.existeAresta((int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) ' ');
        int[] intArray10 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo3.prox = intArray10;
        int[] intArray15 = new int[] { (short) 1, '#', (byte) 10 };
        grafo3.cab = intArray15;
        int[] intArray19 = new int[] { '4', 'a' };
        grafo3.cab = intArray19;
        int[] intArray21 = grafo3.prox;
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo23.prox = intArray30;
        int[] intArray35 = new int[] { (short) 1, '#', (byte) 10 };
        grafo23.cab = intArray35;
        ds.Grafo.Aresta aresta38 = grafo23.proxAdj((int) (byte) 1);
        int[] intArray39 = grafo23.cab;
        grafo3.prox = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        ds.Grafo.Aresta aresta57 = grafo42.proxAdj((int) (byte) 1);
        ds.Grafo grafo59 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (short) -1, 'a', (short) 10 };
        grafo59.peso = intArray63;
        grafo42.prox = intArray63;
        grafo3.prox = intArray63;
        grafo1.prox = intArray63;
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, 10]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 10, 52);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = grafo7.listaAdjVazia((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        int int22 = grafo1.numVertices();
        boolean boolean24 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (short) -1, 'a', (short) 10 };
        grafo13.peso = intArray17;
        grafo11.peso = intArray17;
        boolean boolean22 = grafo11.existeAresta(100, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo7.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        boolean boolean88 = grafo7.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        int int36 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray11 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo4.prox = intArray11;
        int[] intArray16 = new int[] { (short) 1, '#', (byte) 10 };
        grafo4.cab = intArray16;
        ds.Grafo.Aresta aresta19 = grafo4.proxAdj((int) (byte) 1);
        int[] intArray20 = grafo4.cab;
        grafo2.cab = intArray20;
        boolean boolean23 = grafo2.listaAdjVazia((int) '#');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        java.lang.Class<?> wildcardClass10 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) 'a', 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        ds.Grafo grafo63 = new ds.Grafo((int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo63.prox = intArray70;
        int[] intArray75 = new int[] { (short) 1, '#', (byte) 10 };
        grafo63.cab = intArray75;
        int[] intArray79 = new int[] { '4', 'a' };
        grafo63.cab = intArray79;
        int[] intArray81 = grafo63.prox;
        grafo40.prox = intArray81;
        grafo1.peso = intArray81;
        boolean boolean85 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = grafo1.listaAdjVazia((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        ds.Grafo grafo63 = new ds.Grafo((int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo63.prox = intArray70;
        int[] intArray75 = new int[] { (short) 1, '#', (byte) 10 };
        grafo63.cab = intArray75;
        int[] intArray79 = new int[] { '4', 'a' };
        grafo63.cab = intArray79;
        int[] intArray81 = grafo63.prox;
        grafo40.prox = intArray81;
        grafo1.peso = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo84 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        boolean boolean12 = grafo7.listaAdjVazia((int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (short) 0, (int) '#', (int) '4');
        grafo4.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray14 = new int[] {};
        grafo13.peso = intArray14;
        grafo11.prox = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo17 = grafo11.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo1.existeAresta((int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        int[] intArray14 = null;
        grafo1.peso = intArray14;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        grafo1.prox = intArray60;
        ds.Grafo grafo64 = new ds.Grafo((int) ' ');
        int[] intArray68 = new int[] { (short) -1, 'a', (short) 10 };
        grafo64.peso = intArray68;
        int[] intArray70 = grafo64.peso;
        int[] intArray72 = new int[] { 1 };
        grafo64.peso = intArray72;
        ds.Grafo grafo74 = grafo64.grafoTransposto();
        ds.Grafo grafo76 = new ds.Grafo((int) ' ');
        int[] intArray77 = new int[] {};
        grafo76.peso = intArray77;
        grafo74.prox = intArray77;
        grafo1.prox = intArray77;
        ds.Grafo grafo82 = new ds.Grafo((int) ' ');
        grafo82.imprime();
        ds.Grafo grafo85 = new ds.Grafo((int) ' ');
        int[] intArray89 = new int[] { (short) -1, 'a', (short) 10 };
        grafo85.peso = intArray89;
        int[] intArray91 = grafo85.peso;
        int[] intArray93 = new int[] { 1 };
        grafo85.peso = intArray93;
        grafo82.peso = intArray93;
        grafo1.peso = intArray93;
        int[] intArray97 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[1]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo10.prox = intArray17;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 10 };
        grafo10.cab = intArray22;
        int[] intArray26 = new int[] { '4', 'a' };
        grafo10.cab = intArray26;
        int[] intArray28 = grafo10.prox;
        boolean boolean30 = grafo10.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        grafo10.peso = intArray40;
        grafo4.peso = intArray40;
        grafo2.peso = intArray40;
        ds.Grafo grafo45 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta47 = grafo2.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNull(aresta47);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        grafo13.prox = intArray35;
        grafo11.prox = intArray35;
        java.lang.Class<?> wildcardClass39 = intArray35.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, (int) (short) 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        int[] intArray24 = grafo6.prox;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray33 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo26.prox = intArray33;
        int[] intArray38 = new int[] { (short) 1, '#', (byte) 10 };
        grafo26.cab = intArray38;
        ds.Grafo.Aresta aresta41 = grafo26.proxAdj((int) (byte) 1);
        int[] intArray42 = grafo26.cab;
        grafo6.prox = intArray42;
        grafo1.peso = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta46 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo12.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray25 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo18.prox = intArray25;
        int[] intArray30 = new int[] { (short) 1, '#', (byte) 10 };
        grafo18.cab = intArray30;
        int[] intArray34 = new int[] { '4', 'a' };
        grafo18.cab = intArray34;
        int[] intArray36 = grafo18.prox;
        boolean boolean38 = grafo18.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray44 = new int[] { (short) -1, 'a', (short) 10 };
        grafo40.peso = intArray44;
        int[] intArray46 = grafo40.peso;
        int[] intArray48 = new int[] { 1 };
        grafo40.peso = intArray48;
        grafo18.peso = intArray48;
        grafo12.peso = intArray48;
        grafo1.prox = intArray48;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (short) -1, 'a', (short) 10 };
        grafo26.peso = intArray30;
        ds.Grafo grafo32 = grafo26.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        int[] intArray46 = new int[] { (short) 1, '#', (byte) 10 };
        grafo34.cab = intArray46;
        int[] intArray50 = new int[] { '4', 'a' };
        grafo34.cab = intArray50;
        int[] intArray52 = grafo34.prox;
        grafo32.cab = intArray52;
        grafo32.imprime();
        ds.Grafo grafo56 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo56.prox = intArray63;
        int[] intArray68 = new int[] { (short) 1, '#', (byte) 10 };
        grafo56.cab = intArray68;
        ds.Grafo.Aresta aresta71 = grafo56.proxAdj((int) (byte) 1);
        ds.Grafo grafo73 = new ds.Grafo((int) ' ');
        int[] intArray77 = new int[] { (short) -1, 'a', (short) 10 };
        grafo73.peso = intArray77;
        grafo56.prox = intArray77;
        int[] intArray80 = grafo56.cab;
        grafo32.prox = intArray80;
        grafo1.prox = intArray80;
        int int83 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 32 + "'", int83 == 32);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo31.prox = intArray38;
        grafo16.prox = intArray38;
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray56 = grafo42.prox;
        ds.Grafo grafo58 = new ds.Grafo((int) ' ');
        int[] intArray65 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo58.prox = intArray65;
        int[] intArray70 = new int[] { (short) 1, '#', (byte) 10 };
        grafo58.cab = intArray70;
        ds.Grafo.Aresta aresta73 = grafo58.proxAdj((int) (byte) 1);
        int[] intArray74 = grafo58.cab;
        grafo42.cab = intArray74;
        grafo16.peso = intArray74;
        grafo1.peso = intArray74;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta73);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 35, 10]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        grafo1.peso = intArray12;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        int[] intArray44 = new int[] { (short) 1, '#', (byte) 10 };
        grafo32.cab = intArray44;
        grafo17.prox = intArray44;
        grafo15.prox = intArray44;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 35, 10]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta(100, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo(1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta88 = grafo7.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', (int) '4');
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo11.imprime();
        boolean boolean14 = grafo11.listaAdjVazia((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 0, (int) '#');
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        int[] intArray24 = grafo6.prox;
        boolean boolean26 = grafo6.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray32 = new int[] { (short) -1, 'a', (short) 10 };
        grafo28.peso = intArray32;
        int[] intArray34 = grafo28.peso;
        int[] intArray36 = new int[] { 1 };
        grafo28.peso = intArray36;
        grafo6.peso = intArray36;
        int int39 = grafo6.numVertices();
        int[] intArray40 = grafo6.prox;
        grafo3.cab = intArray40;
        boolean boolean43 = grafo3.listaAdjVazia((int) 'a');
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        int[] intArray61 = new int[] { '4', 'a' };
        grafo45.cab = intArray61;
        int[] intArray63 = grafo45.prox;
        boolean boolean65 = grafo45.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) ' ');
        int[] intArray71 = new int[] { (short) -1, 'a', (short) 10 };
        grafo67.peso = intArray71;
        int[] intArray73 = grafo67.peso;
        int[] intArray75 = new int[] { 1 };
        grafo67.peso = intArray75;
        grafo45.peso = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) ' ');
        int[] intArray86 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo79.prox = intArray86;
        int[] intArray91 = new int[] { (short) 1, '#', (byte) 10 };
        grafo79.cab = intArray91;
        grafo45.peso = intArray91;
        int[] intArray94 = grafo45.prox;
        grafo3.cab = intArray94;
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta(0, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo12 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (short) -1, 'a', (short) 10 };
        grafo12.peso = intArray16;
        int[] intArray18 = grafo12.peso;
        grafo1.peso = intArray18;
        boolean boolean22 = grafo1.existeAresta(52, 52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int[] intArray11 = grafo1.peso;
        boolean boolean13 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        int int34 = grafo1.numVertices();
        int[] intArray35 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo36 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        int[] intArray11 = grafo1.peso;
        int[] intArray12 = null;
        grafo1.prox = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) ' ');
        ds.Grafo grafo16 = grafo15.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo18.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) ' ');
        int[] intArray31 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo24.prox = intArray31;
        int[] intArray36 = new int[] { (short) 1, '#', (byte) 10 };
        grafo24.cab = intArray36;
        int[] intArray40 = new int[] { '4', 'a' };
        grafo24.cab = intArray40;
        int[] intArray42 = grafo24.prox;
        boolean boolean44 = grafo24.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo46 = new ds.Grafo((int) ' ');
        int[] intArray50 = new int[] { (short) -1, 'a', (short) 10 };
        grafo46.peso = intArray50;
        int[] intArray52 = grafo46.peso;
        int[] intArray54 = new int[] { 1 };
        grafo46.peso = intArray54;
        grafo24.peso = intArray54;
        grafo18.peso = intArray54;
        grafo16.peso = intArray54;
        grafo1.prox = intArray54;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) ' ');
        int[] intArray32 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo25.prox = intArray32;
        int[] intArray37 = new int[] { (short) 1, '#', (byte) 10 };
        grafo25.cab = intArray37;
        int[] intArray41 = new int[] { '4', 'a' };
        grafo25.cab = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) ' ');
        int[] intArray51 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo44.prox = intArray51;
        int[] intArray56 = new int[] { (short) 1, '#', (byte) 10 };
        grafo44.cab = intArray56;
        grafo25.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) ' ');
        int[] intArray64 = new int[] { (short) -1, 'a', (short) 10 };
        grafo60.peso = intArray64;
        int[] intArray66 = grafo60.peso;
        grafo25.peso = intArray66;
        grafo6.cab = intArray66;
        grafo1.cab = intArray66;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, 10]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        int[] intArray25 = grafo1.cab;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray34 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo27.prox = intArray34;
        int[] intArray39 = new int[] { (short) 1, '#', (byte) 10 };
        grafo27.cab = intArray39;
        int[] intArray43 = new int[] { '4', 'a' };
        grafo27.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) ' ');
        int[] intArray53 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo46.prox = intArray53;
        int[] intArray58 = new int[] { (short) 1, '#', (byte) 10 };
        grafo46.cab = intArray58;
        grafo27.prox = intArray58;
        ds.Grafo grafo62 = new ds.Grafo((int) ' ');
        int[] intArray66 = new int[] { (short) -1, 'a', (short) 10 };
        grafo62.peso = intArray66;
        int[] intArray68 = grafo62.peso;
        grafo27.peso = intArray68;
        grafo1.prox = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, 10]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray11 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo4.prox = intArray11;
        int[] intArray16 = new int[] { (short) 1, '#', (byte) 10 };
        grafo4.cab = intArray16;
        ds.Grafo.Aresta aresta19 = grafo4.proxAdj((int) (byte) 1);
        int[] intArray20 = grafo4.cab;
        grafo2.cab = intArray20;
        ds.Grafo.Aresta aresta23 = grafo2.proxAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo10.prox = intArray17;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 10 };
        grafo10.cab = intArray22;
        int[] intArray26 = new int[] { '4', 'a' };
        grafo10.cab = intArray26;
        int[] intArray28 = grafo10.prox;
        boolean boolean30 = grafo10.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        grafo10.peso = intArray40;
        grafo4.peso = intArray40;
        grafo2.peso = intArray40;
        ds.Grafo grafo45 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = grafo45.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(grafo45);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        int[] intArray36 = new int[] { '4', 'a' };
        grafo20.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) ' ');
        int[] intArray46 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo39.prox = intArray46;
        int[] intArray51 = new int[] { (short) 1, '#', (byte) 10 };
        grafo39.cab = intArray51;
        grafo20.prox = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (short) -1, 'a', (short) 10 };
        grafo55.peso = intArray59;
        int[] intArray61 = grafo55.peso;
        grafo20.peso = intArray61;
        grafo1.cab = intArray61;
        int[] intArray64 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 97, 10]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        int[] intArray18 = new int[] { (short) -1, 'a', (short) 10 };
        grafo14.peso = intArray18;
        int[] intArray20 = grafo14.peso;
        grafo1.peso = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, 32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 10]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        ds.Grafo grafo37 = new ds.Grafo((int) ' ');
        int[] intArray44 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo37.prox = intArray44;
        int[] intArray49 = new int[] { (short) 1, '#', (byte) 10 };
        grafo37.cab = intArray49;
        int[] intArray53 = new int[] { '4', 'a' };
        grafo37.cab = intArray53;
        int[] intArray55 = grafo37.prox;
        boolean boolean57 = grafo37.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo59 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (short) -1, 'a', (short) 10 };
        grafo59.peso = intArray63;
        int[] intArray65 = grafo59.peso;
        int[] intArray67 = new int[] { 1 };
        grafo59.peso = intArray67;
        grafo37.peso = intArray67;
        grafo1.cab = intArray67;
        boolean boolean72 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta74 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo31.prox = intArray38;
        int[] intArray43 = new int[] { (short) 1, '#', (byte) 10 };
        grafo31.cab = intArray43;
        ds.Grafo.Aresta aresta46 = grafo31.proxAdj((int) (byte) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (short) -1, 'a', (short) 10 };
        grafo48.peso = intArray52;
        grafo31.prox = intArray52;
        int[] intArray55 = grafo31.cab;
        grafo7.prox = intArray55;
        ds.Grafo.Aresta aresta58 = grafo7.primeiroListaAdj(0);
        int int59 = aresta58.v1();
        int int60 = aresta58.peso();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        int[] intArray50 = grafo7.cab;
        int[] intArray51 = null;
        grafo7.cab = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo53 = grafo7.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) ' ');
        int[] intArray40 = new int[] { (short) -1, 'a', (short) 10 };
        grafo36.peso = intArray40;
        int[] intArray42 = grafo36.peso;
        grafo1.peso = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) ' ');
        int[] intArray67 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo60.prox = intArray67;
        int[] intArray72 = new int[] { (short) 1, '#', (byte) 10 };
        grafo60.cab = intArray72;
        grafo45.prox = intArray72;
        ds.Grafo grafo76 = new ds.Grafo((int) ' ');
        int[] intArray80 = new int[] { (short) -1, 'a', (short) 10 };
        grafo76.peso = intArray80;
        int[] intArray82 = grafo76.peso;
        int[] intArray84 = new int[] { 1 };
        grafo76.peso = intArray84;
        int[] intArray86 = grafo76.peso;
        grafo45.prox = intArray86;
        grafo1.peso = intArray86;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.retiraAresta((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta32 = grafo17.proxAdj((int) (byte) 1);
        int[] intArray33 = grafo17.cab;
        grafo1.cab = intArray33;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo35 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        int[] intArray40 = new int[] { (short) 1, '#', (byte) 10 };
        grafo28.cab = intArray40;
        grafo9.prox = intArray40;
        grafo1.prox = intArray40;
        int[] intArray44 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 97, 10]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        int int12 = grafo11.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        int[] intArray18 = new int[] { (short) -1, 'a', (short) 10 };
        grafo14.peso = intArray18;
        int[] intArray20 = grafo14.peso;
        boolean boolean23 = grafo14.existeAresta((int) (short) 100, (int) (short) -1);
        int int24 = grafo14.numVertices();
        int int25 = grafo14.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray31 = new int[] { (short) -1, 'a', (short) 10 };
        grafo27.peso = intArray31;
        int[] intArray33 = grafo27.peso;
        grafo14.peso = intArray33;
        grafo11.cab = intArray33;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, 10]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        grafo13.prox = intArray35;
        grafo11.prox = intArray35;
        int int39 = grafo11.numVertices();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        int[] intArray36 = new int[] { '4', 'a' };
        grafo20.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) ' ');
        int[] intArray46 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo39.prox = intArray46;
        int[] intArray51 = new int[] { (short) 1, '#', (byte) 10 };
        grafo39.cab = intArray51;
        grafo20.prox = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (short) -1, 'a', (short) 10 };
        grafo55.peso = intArray59;
        int[] intArray61 = grafo55.peso;
        grafo20.peso = intArray61;
        grafo1.cab = intArray61;
        boolean boolean65 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 1, (int) (short) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) ' ');
        int[] intArray15 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo8.prox = intArray15;
        int[] intArray20 = new int[] { (short) 1, '#', (byte) 10 };
        grafo8.cab = intArray20;
        ds.Grafo.Aresta aresta23 = grafo8.proxAdj((int) (byte) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) ' ');
        int[] intArray32 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo25.prox = intArray32;
        int[] intArray37 = new int[] { (short) 1, '#', (byte) 10 };
        grafo25.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo40.prox = intArray47;
        grafo25.prox = intArray47;
        grafo8.prox = intArray47;
        grafo5.cab = intArray47;
        grafo1.cab = intArray47;
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        int[] intArray50 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo7 = new ds.Grafo((int) ' ');
        int[] intArray11 = new int[] { (short) -1, 'a', (short) 10 };
        grafo7.peso = intArray11;
        int[] intArray13 = grafo7.peso;
        boolean boolean16 = grafo7.existeAresta((int) (short) 100, (int) (short) -1);
        int[] intArray17 = grafo7.peso;
        grafo1.cab = intArray17;
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        int[] intArray40 = new int[] { (short) 1, '#', (byte) 10 };
        grafo28.cab = intArray40;
        grafo9.prox = intArray40;
        grafo1.prox = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        int[] intArray61 = new int[] { '4', 'a' };
        grafo45.cab = intArray61;
        int[] intArray63 = grafo45.prox;
        boolean boolean65 = grafo45.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) ' ');
        int[] intArray71 = new int[] { (short) -1, 'a', (short) 10 };
        grafo67.peso = intArray71;
        int[] intArray73 = grafo67.peso;
        int[] intArray75 = new int[] { 1 };
        grafo67.peso = intArray75;
        grafo45.peso = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) ' ');
        int[] intArray86 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo79.prox = intArray86;
        int[] intArray91 = new int[] { (short) 1, '#', (byte) 10 };
        grafo79.cab = intArray91;
        grafo45.peso = intArray91;
        grafo1.cab = intArray91;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = grafo1.existeAresta((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 35, 10]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        int int34 = grafo1.numVertices();
        int[] intArray35 = grafo1.prox;
        ds.Grafo grafo37 = new ds.Grafo((int) ' ');
        int[] intArray44 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo37.prox = intArray44;
        int[] intArray49 = new int[] { (short) 1, '#', (byte) 10 };
        grafo37.cab = intArray49;
        int[] intArray51 = grafo37.prox;
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        ds.Grafo grafo68 = new ds.Grafo((int) ' ');
        int[] intArray75 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo68.prox = intArray75;
        grafo53.prox = intArray75;
        grafo37.prox = intArray75;
        grafo1.peso = intArray75;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        int int43 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) ' ', (int) ' ');
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        grafo7.imprime();
        ds.Grafo.Aresta aresta32 = grafo7.proxAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNull(aresta32);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo31.prox = intArray38;
        int[] intArray43 = new int[] { (short) 1, '#', (byte) 10 };
        grafo31.cab = intArray43;
        ds.Grafo.Aresta aresta46 = grafo31.proxAdj((int) (byte) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (short) -1, 'a', (short) 10 };
        grafo48.peso = intArray52;
        grafo31.prox = intArray52;
        int[] intArray55 = grafo31.cab;
        grafo7.prox = intArray55;
        ds.Grafo.Aresta aresta58 = grafo7.primeiroListaAdj(0);
        int int59 = aresta58.peso();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 1, (int) (byte) -1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia(100);
        ds.Grafo grafo7 = new ds.Grafo((int) ' ');
        int[] intArray11 = new int[] { (short) -1, 'a', (short) 10 };
        grafo7.peso = intArray11;
        int[] intArray13 = grafo7.peso;
        boolean boolean16 = grafo7.existeAresta((int) (short) 100, (int) (short) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        int[] intArray24 = grafo18.peso;
        grafo7.peso = intArray24;
        grafo1.cab = intArray24;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 97, 10]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray34 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo27.prox = intArray34;
        int[] intArray39 = new int[] { (short) 1, '#', (byte) 10 };
        grafo27.cab = intArray39;
        int[] intArray41 = grafo27.prox;
        ds.Grafo grafo43 = new ds.Grafo((int) ' ');
        int[] intArray50 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo43.prox = intArray50;
        int[] intArray55 = new int[] { (short) 1, '#', (byte) 10 };
        grafo43.cab = intArray55;
        ds.Grafo.Aresta aresta58 = grafo43.proxAdj((int) (byte) 1);
        int[] intArray59 = grafo43.cab;
        grafo27.cab = intArray59;
        grafo1.peso = intArray59;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo62 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 35, 10]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        int int34 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(35, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo11.imprime();
        ds.Grafo.Aresta aresta14 = grafo11.proxAdj(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo10.prox = intArray17;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 10 };
        grafo10.cab = intArray22;
        int[] intArray26 = new int[] { '4', 'a' };
        grafo10.cab = intArray26;
        int[] intArray28 = grafo10.prox;
        boolean boolean30 = grafo10.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        grafo10.peso = intArray40;
        grafo4.peso = intArray40;
        grafo2.peso = intArray40;
        ds.Grafo grafo45 = grafo2.grafoTransposto();
        ds.Grafo grafo47 = new ds.Grafo((int) ' ');
        int[] intArray54 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo47.prox = intArray54;
        int[] intArray59 = new int[] { (short) 1, '#', (byte) 10 };
        grafo47.cab = intArray59;
        int[] intArray63 = new int[] { '4', 'a' };
        grafo47.cab = intArray63;
        int[] intArray65 = grafo47.prox;
        grafo2.peso = intArray65;
        java.lang.Class<?> wildcardClass67 = intArray65.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        java.lang.Class<?> wildcardClass50 = intArray47.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) (byte) 10, 32, (int) '4');
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        int[] intArray21 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo14.prox = intArray21;
        int[] intArray26 = new int[] { (short) 1, '#', (byte) 10 };
        grafo14.cab = intArray26;
        int[] intArray28 = grafo14.prox;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        ds.Grafo.Aresta aresta45 = grafo30.proxAdj((int) (byte) 1);
        int[] intArray46 = grafo30.cab;
        grafo14.cab = intArray46;
        grafo7.peso = intArray46;
        boolean boolean51 = grafo7.existeAresta((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray17 = grafo1.cab;
        ds.Grafo grafo19 = new ds.Grafo((int) ' ');
        int[] intArray26 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo19.prox = intArray26;
        int[] intArray31 = new int[] { (short) 1, '#', (byte) 10 };
        grafo19.cab = intArray31;
        int[] intArray35 = new int[] { '4', 'a' };
        grafo19.cab = intArray35;
        int[] intArray37 = grafo19.prox;
        boolean boolean39 = grafo19.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) ' ');
        int[] intArray45 = new int[] { (short) -1, 'a', (short) 10 };
        grafo41.peso = intArray45;
        int[] intArray47 = grafo41.peso;
        int[] intArray49 = new int[] { 1 };
        grafo41.peso = intArray49;
        grafo19.peso = intArray49;
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        grafo19.peso = intArray65;
        int[] intArray68 = grafo19.prox;
        grafo1.cab = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta72 = grafo1.retiraAresta((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        grafo1.prox = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[32, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 32, 10]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) 'a', (int) '4');
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (short) -1, 'a', (short) 10 };
        grafo13.peso = intArray17;
        grafo11.peso = intArray17;
        ds.Grafo.Aresta aresta22 = grafo11.retiraAresta(35, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 10]");
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        ds.Grafo grafo14 = new ds.Grafo((int) ' ');
        int[] intArray18 = new int[] { (short) -1, 'a', (short) 10 };
        grafo14.peso = intArray18;
        int[] intArray20 = grafo14.peso;
        grafo1.peso = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo23.prox = intArray30;
        int[] intArray35 = new int[] { (short) 1, '#', (byte) 10 };
        grafo23.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) ' ');
        int[] intArray45 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo38.prox = intArray45;
        grafo23.prox = intArray45;
        grafo1.prox = intArray45;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray34 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo27.prox = intArray34;
        int[] intArray39 = new int[] { (short) 1, '#', (byte) 10 };
        grafo27.cab = intArray39;
        int[] intArray41 = grafo27.prox;
        ds.Grafo grafo43 = new ds.Grafo((int) ' ');
        int[] intArray50 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo43.prox = intArray50;
        int[] intArray55 = new int[] { (short) 1, '#', (byte) 10 };
        grafo43.cab = intArray55;
        ds.Grafo.Aresta aresta58 = grafo43.proxAdj((int) (byte) 1);
        int[] intArray59 = grafo43.cab;
        grafo27.cab = intArray59;
        grafo1.peso = intArray59;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = grafo1.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 35, 10]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        ds.Grafo grafo27 = new ds.Grafo(100);
        ds.Grafo grafo28 = grafo27.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        grafo30.prox = intArray52;
        grafo27.prox = intArray52;
        grafo1.peso = intArray52;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        int int50 = grafo7.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo7.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        boolean boolean4 = grafo1.existeAresta((int) (byte) 100, (-1));
        boolean boolean6 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo.Aresta aresta32 = grafo17.proxAdj((int) (byte) 1);
        int[] intArray33 = grafo17.cab;
        grafo1.cab = intArray33;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) 'a', (int) 'a', 10);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 100);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) ' ', (int) 'a');
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo7 = new ds.Grafo((int) ' ');
        int[] intArray11 = new int[] { (short) -1, 'a', (short) 10 };
        grafo7.peso = intArray11;
        int[] intArray13 = grafo7.peso;
        int[] intArray15 = new int[] { 1 };
        grafo7.peso = intArray15;
        ds.Grafo grafo17 = grafo7.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) ' ');
        int[] intArray26 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo19.prox = intArray26;
        int[] intArray31 = new int[] { (short) 1, '#', (byte) 10 };
        grafo19.cab = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        grafo19.prox = intArray41;
        grafo17.prox = intArray41;
        grafo1.cab = intArray41;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        grafo1.prox = intArray60;
        ds.Grafo grafo64 = new ds.Grafo((int) ' ');
        int[] intArray68 = new int[] { (short) -1, 'a', (short) 10 };
        grafo64.peso = intArray68;
        int[] intArray70 = grafo64.peso;
        int[] intArray72 = new int[] { 1 };
        grafo64.peso = intArray72;
        ds.Grafo grafo74 = grafo64.grafoTransposto();
        ds.Grafo grafo76 = new ds.Grafo((int) ' ');
        int[] intArray77 = new int[] {};
        grafo76.peso = intArray77;
        grafo74.prox = intArray77;
        grafo1.prox = intArray77;
        ds.Grafo grafo82 = new ds.Grafo((int) ' ');
        grafo82.imprime();
        ds.Grafo grafo85 = new ds.Grafo((int) ' ');
        int[] intArray89 = new int[] { (short) -1, 'a', (short) 10 };
        grafo85.peso = intArray89;
        int[] intArray91 = grafo85.peso;
        int[] intArray93 = new int[] { 1 };
        grafo85.peso = intArray93;
        grafo82.peso = intArray93;
        grafo1.peso = intArray93;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray17 = grafo1.cab;
        ds.Grafo grafo19 = new ds.Grafo((int) ' ');
        int[] intArray26 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo19.prox = intArray26;
        int[] intArray31 = new int[] { (short) 1, '#', (byte) 10 };
        grafo19.cab = intArray31;
        int[] intArray35 = new int[] { '4', 'a' };
        grafo19.cab = intArray35;
        int[] intArray37 = grafo19.prox;
        boolean boolean39 = grafo19.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) ' ');
        int[] intArray45 = new int[] { (short) -1, 'a', (short) 10 };
        grafo41.peso = intArray45;
        int[] intArray47 = grafo41.peso;
        int[] intArray49 = new int[] { 1 };
        grafo41.peso = intArray49;
        grafo19.peso = intArray49;
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        grafo19.peso = intArray65;
        int[] intArray68 = grafo19.prox;
        grafo1.cab = intArray68;
        int[] intArray70 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray25 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo18.prox = intArray25;
        int[] intArray30 = new int[] { (short) 1, '#', (byte) 10 };
        grafo18.cab = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) ' ');
        int[] intArray40 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo33.prox = intArray40;
        grafo18.prox = intArray40;
        grafo1.prox = intArray40;
        int int44 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray2 = new int[] {};
        grafo1.peso = intArray2;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (short) -1, 'a', (short) 10 };
        grafo26.peso = intArray30;
        int[] intArray32 = grafo26.peso;
        int[] intArray34 = new int[] { 1 };
        grafo26.peso = intArray34;
        int[] intArray36 = grafo26.peso;
        int[] intArray37 = null;
        grafo26.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        grafo40.imprime();
        ds.Grafo grafo43 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (short) -1, 'a', (short) 10 };
        grafo43.peso = intArray47;
        int[] intArray49 = grafo43.peso;
        int[] intArray51 = new int[] { 1 };
        grafo43.peso = intArray51;
        grafo40.peso = intArray51;
        grafo26.cab = intArray51;
        grafo1.peso = intArray51;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        int[] intArray11 = grafo1.peso;
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (short) 1);
        int[] intArray17 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', (int) (short) 100, (int) '4');
        grafo7.insereAresta(52, (int) (byte) 1, (int) (short) 100);
        grafo7.insereAresta((int) (short) 100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        int[] intArray14 = grafo4.peso;
        int[] intArray15 = null;
        grafo4.prox = intArray15;
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        grafo18.imprime();
        ds.Grafo grafo21 = new ds.Grafo((int) ' ');
        int[] intArray25 = new int[] { (short) -1, 'a', (short) 10 };
        grafo21.peso = intArray25;
        int[] intArray27 = grafo21.peso;
        int[] intArray29 = new int[] { 1 };
        grafo21.peso = intArray29;
        grafo18.peso = intArray29;
        grafo4.cab = intArray29;
        grafo2.peso = intArray29;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        int[] intArray36 = null;
        grafo1.peso = intArray36;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray31 = new int[] { (short) -1, 'a', (short) 10 };
        grafo27.peso = intArray31;
        int[] intArray33 = grafo27.peso;
        int[] intArray35 = new int[] { 1 };
        grafo27.peso = intArray35;
        int[] intArray37 = grafo27.peso;
        int[] intArray38 = null;
        grafo27.prox = intArray38;
        ds.Grafo grafo41 = new ds.Grafo((int) ' ');
        grafo41.imprime();
        ds.Grafo grafo44 = new ds.Grafo((int) ' ');
        int[] intArray48 = new int[] { (short) -1, 'a', (short) 10 };
        grafo44.peso = intArray48;
        int[] intArray50 = grafo44.peso;
        int[] intArray52 = new int[] { 1 };
        grafo44.peso = intArray52;
        grafo41.peso = intArray52;
        grafo27.cab = intArray52;
        grafo1.prox = intArray52;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        int[] intArray24 = grafo6.prox;
        boolean boolean26 = grafo6.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray32 = new int[] { (short) -1, 'a', (short) 10 };
        grafo28.peso = intArray32;
        int[] intArray34 = grafo28.peso;
        int[] intArray36 = new int[] { 1 };
        grafo28.peso = intArray36;
        grafo6.peso = intArray36;
        int int39 = grafo6.numVertices();
        int[] intArray40 = grafo6.prox;
        grafo3.cab = intArray40;
        boolean boolean43 = grafo3.listaAdjVazia((int) 'a');
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        int[] intArray61 = new int[] { '4', 'a' };
        grafo45.cab = intArray61;
        int[] intArray63 = grafo45.prox;
        boolean boolean65 = grafo45.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) ' ');
        int[] intArray71 = new int[] { (short) -1, 'a', (short) 10 };
        grafo67.peso = intArray71;
        int[] intArray73 = grafo67.peso;
        int[] intArray75 = new int[] { 1 };
        grafo67.peso = intArray75;
        grafo45.peso = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) ' ');
        int[] intArray86 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo79.prox = intArray86;
        int[] intArray91 = new int[] { (short) 1, '#', (byte) 10 };
        grafo79.cab = intArray91;
        grafo45.peso = intArray91;
        int[] intArray94 = grafo45.prox;
        grafo3.cab = intArray94;
        grafo3.imprime();
        int[] intArray97 = grafo3.cab;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo43 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        grafo1.peso = intArray12;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(10, 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        int int43 = grafo1.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (short) -1, 'a', (short) 10 };
        grafo45.peso = intArray49;
        ds.Grafo grafo51 = grafo45.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        grafo51.cab = intArray71;
        ds.Grafo grafo74 = new ds.Grafo((int) ' ');
        int[] intArray81 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo74.prox = intArray81;
        int[] intArray86 = new int[] { (short) 1, '#', (byte) 10 };
        grafo74.cab = intArray86;
        int[] intArray90 = new int[] { '4', 'a' };
        grafo74.cab = intArray90;
        int[] intArray92 = grafo74.prox;
        grafo51.prox = intArray92;
        int[] intArray94 = grafo51.cab;
        grafo1.cab = intArray94;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        int[] intArray87 = grafo7.cab;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        int[] intArray31 = new int[] { 1 };
        grafo23.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo35.prox = intArray42;
        int[] intArray47 = new int[] { (short) 1, '#', (byte) 10 };
        grafo35.cab = intArray47;
        grafo1.peso = intArray47;
        int int50 = grafo1.numVertices();
        int int51 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta(100, (-1), 1);
        java.lang.Class<?> wildcardClass9 = grafo3.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        grafo7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo7.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        int[] intArray24 = grafo6.prox;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray33 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo26.prox = intArray33;
        int[] intArray38 = new int[] { (short) 1, '#', (byte) 10 };
        grafo26.cab = intArray38;
        ds.Grafo.Aresta aresta41 = grafo26.proxAdj((int) (byte) 1);
        int[] intArray42 = grafo26.cab;
        grafo6.prox = intArray42;
        grafo1.peso = intArray42;
        ds.Grafo grafo45 = grafo1.grafoTransposto();
        ds.Grafo grafo46 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo46.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(grafo46);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo4.imprime();
        boolean boolean8 = grafo4.existeAresta(35, 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean3 = grafo1.listaAdjVazia(10);
        grafo1.insereAresta((int) ' ', (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        int[] intArray29 = new int[] { '4', 'a' };
        grafo13.cab = intArray29;
        grafo1.prox = intArray29;
        int int32 = grafo1.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray38 = new int[] { (short) -1, 'a', (short) 10 };
        grafo34.peso = intArray38;
        ds.Grafo grafo40 = grafo34.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        int[] intArray58 = new int[] { '4', 'a' };
        grafo42.cab = intArray58;
        int[] intArray60 = grafo42.prox;
        grafo40.cab = intArray60;
        ds.Grafo grafo63 = new ds.Grafo((int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo63.prox = intArray70;
        int[] intArray75 = new int[] { (short) 1, '#', (byte) 10 };
        grafo63.cab = intArray75;
        int[] intArray79 = new int[] { '4', 'a' };
        grafo63.cab = intArray79;
        int[] intArray81 = grafo63.prox;
        grafo40.prox = intArray81;
        grafo1.peso = intArray81;
        int[] intArray84 = grafo1.peso;
        java.lang.Class<?> wildcardClass85 = intArray84.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo3 = new ds.Grafo((int) ' ');
        int[] intArray7 = new int[] { (short) -1, 'a', (short) 10 };
        grafo3.peso = intArray7;
        int[] intArray9 = grafo3.peso;
        int[] intArray11 = new int[] { 1 };
        grafo3.peso = intArray11;
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo15.prox = intArray22;
        grafo13.prox = intArray22;
        grafo1.cab = intArray22;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray31 = new int[] { (short) -1, 'a', (short) 10 };
        grafo27.peso = intArray31;
        int[] intArray33 = grafo27.peso;
        int[] intArray35 = new int[] { 1 };
        grafo27.peso = intArray35;
        ds.Grafo grafo37 = grafo27.grafoTransposto();
        ds.Grafo grafo39 = new ds.Grafo((int) ' ');
        int[] intArray40 = new int[] {};
        grafo39.peso = intArray40;
        grafo37.prox = intArray40;
        ds.Grafo grafo44 = new ds.Grafo((int) ' ');
        int[] intArray51 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo44.prox = intArray51;
        int[] intArray56 = new int[] { (short) 1, '#', (byte) 10 };
        grafo44.cab = intArray56;
        int[] intArray60 = new int[] { '4', 'a' };
        grafo44.cab = intArray60;
        int[] intArray62 = grafo44.prox;
        boolean boolean64 = grafo44.listaAdjVazia((int) (byte) 1);
        int[] intArray65 = grafo44.prox;
        grafo37.peso = intArray65;
        grafo1.prox = intArray65;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int[] intArray8 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 10 };
        grafo4.peso = intArray8;
        int[] intArray10 = grafo4.peso;
        int[] intArray12 = new int[] { 1 };
        grafo4.peso = intArray12;
        grafo1.peso = intArray12;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) ' ');
        int[] intArray12 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo5.prox = intArray12;
        int[] intArray17 = new int[] { (short) 1, '#', (byte) 10 };
        grafo5.cab = intArray17;
        int[] intArray19 = grafo5.prox;
        grafo1.cab = intArray19;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        ds.Grafo grafo37 = new ds.Grafo((int) ' ');
        int[] intArray44 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo37.prox = intArray44;
        int[] intArray49 = new int[] { (short) 1, '#', (byte) 10 };
        grafo37.cab = intArray49;
        int[] intArray53 = new int[] { '4', 'a' };
        grafo37.cab = intArray53;
        int[] intArray55 = grafo37.prox;
        boolean boolean57 = grafo37.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo59 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (short) -1, 'a', (short) 10 };
        grafo59.peso = intArray63;
        int[] intArray65 = grafo59.peso;
        int[] intArray67 = new int[] { 1 };
        grafo59.peso = intArray67;
        grafo37.peso = intArray67;
        grafo1.cab = intArray67;
        boolean boolean72 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo73 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray17 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 35, 10]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        ds.Grafo grafo21 = new ds.Grafo((int) ' ');
        int[] intArray28 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo21.prox = intArray28;
        int[] intArray33 = new int[] { (short) 1, '#', (byte) 10 };
        grafo21.cab = intArray33;
        ds.Grafo.Aresta aresta36 = grafo21.proxAdj((int) (byte) 1);
        int[] intArray37 = grafo21.cab;
        grafo1.prox = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo40.prox = intArray47;
        int[] intArray52 = new int[] { (short) 1, '#', (byte) 10 };
        grafo40.cab = intArray52;
        ds.Grafo.Aresta aresta55 = grafo40.proxAdj((int) (byte) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray61 = new int[] { (short) -1, 'a', (short) 10 };
        grafo57.peso = intArray61;
        grafo40.prox = intArray61;
        grafo1.prox = intArray61;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = grafo1.existeAresta((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        ds.Grafo grafo37 = new ds.Grafo((int) ' ');
        int[] intArray44 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo37.prox = intArray44;
        int[] intArray49 = new int[] { (short) 1, '#', (byte) 10 };
        grafo37.cab = intArray49;
        int[] intArray53 = new int[] { '4', 'a' };
        grafo37.cab = intArray53;
        int[] intArray55 = grafo37.prox;
        boolean boolean57 = grafo37.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo59 = new ds.Grafo((int) ' ');
        int[] intArray63 = new int[] { (short) -1, 'a', (short) 10 };
        grafo59.peso = intArray63;
        int[] intArray65 = grafo59.peso;
        int[] intArray67 = new int[] { 1 };
        grafo59.peso = intArray67;
        grafo37.peso = intArray67;
        grafo1.cab = intArray67;
        int[] intArray76 = new int[] { (short) 0, (byte) 10, (byte) 0, (short) 100, 100 };
        grafo1.peso = intArray76;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 10, 0, 100, 100]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        int[] intArray42 = grafo32.peso;
        grafo1.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (short) -1, 'a', (short) 10 };
        grafo45.peso = intArray49;
        int[] intArray51 = grafo45.peso;
        int[] intArray53 = new int[] { 1 };
        grafo45.peso = intArray53;
        ds.Grafo grafo55 = grafo45.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray58 = new int[] {};
        grafo57.peso = intArray58;
        grafo55.prox = intArray58;
        grafo1.prox = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo62 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        int int43 = grafo1.numVertices();
        int[] intArray44 = grafo1.cab;
        int[] intArray45 = grafo1.cab;
        int[] intArray46 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo3 = new ds.Grafo((int) ' ');
        int[] intArray7 = new int[] { (short) -1, 'a', (short) 10 };
        grafo3.peso = intArray7;
        int[] intArray9 = grafo3.peso;
        boolean boolean12 = grafo3.existeAresta((int) (short) 100, (int) (short) -1);
        int int13 = grafo3.numVertices();
        int int14 = grafo3.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (short) -1, 'a', (short) 10 };
        grafo16.peso = intArray20;
        int[] intArray22 = grafo16.peso;
        grafo3.peso = intArray22;
        grafo1.peso = intArray22;
        boolean boolean27 = grafo1.existeAresta(35, (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo29.prox = intArray36;
        int[] intArray41 = new int[] { (short) 1, '#', (byte) 10 };
        grafo29.cab = intArray41;
        int[] intArray45 = new int[] { '4', 'a' };
        grafo29.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) ' ');
        int[] intArray55 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo48.prox = intArray55;
        int[] intArray60 = new int[] { (short) 1, '#', (byte) 10 };
        grafo48.cab = intArray60;
        grafo29.prox = intArray60;
        ds.Grafo grafo64 = new ds.Grafo((int) ' ');
        int[] intArray68 = new int[] { (short) -1, 'a', (short) 10 };
        grafo64.peso = intArray68;
        int[] intArray70 = grafo64.peso;
        grafo29.peso = intArray70;
        grafo1.peso = intArray70;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 97, 10]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray21 = new int[] { (short) -1, 'a', (short) 10 };
        grafo17.peso = intArray21;
        int[] intArray23 = grafo17.peso;
        grafo1.peso = intArray23;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (short) -1, 'a', (short) 10 };
        grafo26.peso = intArray30;
        ds.Grafo grafo32 = grafo26.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        int[] intArray46 = new int[] { (short) 1, '#', (byte) 10 };
        grafo34.cab = intArray46;
        int[] intArray50 = new int[] { '4', 'a' };
        grafo34.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        grafo34.prox = intArray65;
        grafo26.prox = intArray65;
        grafo1.cab = intArray65;
        ds.Grafo grafo71 = new ds.Grafo((int) ' ');
        int[] intArray75 = new int[] { (short) -1, 'a', (short) 10 };
        grafo71.peso = intArray75;
        int[] intArray77 = grafo71.peso;
        boolean boolean80 = grafo71.existeAresta((int) (short) 100, (int) (short) -1);
        int[] intArray81 = grafo71.peso;
        grafo1.cab = intArray81;
        int[] intArray83 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int int8 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo10.prox = intArray17;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 10 };
        grafo10.cab = intArray22;
        int[] intArray26 = new int[] { '4', 'a' };
        grafo10.cab = intArray26;
        int[] intArray28 = grafo10.prox;
        boolean boolean30 = grafo10.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        grafo10.peso = intArray40;
        grafo4.peso = intArray40;
        grafo2.peso = intArray40;
        ds.Grafo grafo45 = grafo2.grafoTransposto();
        grafo45.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(grafo45);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        grafo1.prox = intArray23;
        boolean boolean27 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta30 = grafo1.retiraAresta((int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(aresta30);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) ' ');
        int[] intArray22 = new int[] { (short) -1, 'a', (short) 10 };
        grafo18.peso = intArray22;
        grafo1.prox = intArray22;
        int[] intArray25 = grafo1.cab;
        ds.Grafo grafo27 = new ds.Grafo((int) ' ');
        int[] intArray34 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo27.prox = intArray34;
        int[] intArray39 = new int[] { (short) 1, '#', (byte) 10 };
        grafo27.cab = intArray39;
        int[] intArray43 = new int[] { '4', 'a' };
        grafo27.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) ' ');
        int[] intArray53 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo46.prox = intArray53;
        int[] intArray58 = new int[] { (short) 1, '#', (byte) 10 };
        grafo46.cab = intArray58;
        grafo27.prox = intArray58;
        ds.Grafo grafo62 = new ds.Grafo((int) ' ');
        int[] intArray66 = new int[] { (short) -1, 'a', (short) 10 };
        grafo62.peso = intArray66;
        int[] intArray68 = grafo62.peso;
        grafo27.peso = intArray68;
        grafo1.prox = intArray68;
        ds.Grafo grafo72 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo72.prox = intArray79;
        int[] intArray84 = new int[] { (short) 1, '#', (byte) 10 };
        grafo72.cab = intArray84;
        ds.Grafo.Aresta aresta87 = grafo72.proxAdj((int) (byte) 1);
        int[] intArray88 = grafo72.cab;
        grafo1.cab = intArray88;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = grafo1.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 35, 10]");
        org.junit.Assert.assertNull(aresta87);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 35, 10]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) -1, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        int[] intArray42 = grafo32.peso;
        grafo1.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (short) -1, 'a', (short) 10 };
        grafo45.peso = intArray49;
        int[] intArray51 = grafo45.peso;
        int[] intArray53 = new int[] { 1 };
        grafo45.peso = intArray53;
        ds.Grafo grafo55 = grafo45.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray58 = new int[] {};
        grafo57.peso = intArray58;
        grafo55.prox = intArray58;
        grafo1.prox = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta63 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        int[] intArray32 = new int[] { '4', 'a' };
        grafo16.cab = intArray32;
        int[] intArray34 = grafo16.prox;
        boolean boolean36 = grafo16.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) ' ');
        int[] intArray42 = new int[] { (short) -1, 'a', (short) 10 };
        grafo38.peso = intArray42;
        int[] intArray44 = grafo38.peso;
        int[] intArray46 = new int[] { 1 };
        grafo38.peso = intArray46;
        grafo16.peso = intArray46;
        int int49 = grafo16.numVertices();
        int[] intArray50 = grafo16.prox;
        grafo13.cab = intArray50;
        grafo1.prox = intArray50;
        java.lang.Class<?> wildcardClass53 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) 1);
        int[] intArray10 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 10]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) '4');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        int[] intArray19 = grafo1.prox;
        int int20 = grafo1.numVertices();
        ds.Grafo grafo22 = new ds.Grafo((int) ' ');
        int[] intArray26 = new int[] { (short) -1, 'a', (short) 10 };
        grafo22.peso = intArray26;
        int[] intArray28 = grafo22.peso;
        int[] intArray30 = new int[] { 1 };
        grafo22.peso = intArray30;
        ds.Grafo grafo32 = grafo22.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        int[] intArray46 = new int[] { (short) 1, '#', (byte) 10 };
        grafo34.cab = intArray46;
        int[] intArray50 = new int[] { '4', 'a' };
        grafo34.cab = intArray50;
        grafo22.prox = intArray50;
        int int53 = grafo22.numVertices();
        ds.Grafo grafo55 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (short) -1, 'a', (short) 10 };
        grafo55.peso = intArray59;
        ds.Grafo grafo61 = grafo55.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) ' ');
        int[] intArray70 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo63.prox = intArray70;
        int[] intArray75 = new int[] { (short) 1, '#', (byte) 10 };
        grafo63.cab = intArray75;
        int[] intArray79 = new int[] { '4', 'a' };
        grafo63.cab = intArray79;
        int[] intArray81 = grafo63.prox;
        grafo61.cab = intArray81;
        grafo22.prox = intArray81;
        grafo1.prox = intArray81;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 97]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) ' ');
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo16.prox = intArray23;
        int[] intArray28 = new int[] { (short) 1, '#', (byte) 10 };
        grafo16.cab = intArray28;
        grafo1.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        int[] intArray42 = grafo32.peso;
        grafo1.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (short) -1, 'a', (short) 10 };
        grafo45.peso = intArray49;
        int[] intArray51 = grafo45.peso;
        int[] intArray53 = new int[] { 1 };
        grafo45.peso = intArray53;
        ds.Grafo grafo55 = grafo45.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray58 = new int[] {};
        grafo57.peso = intArray58;
        grafo55.prox = intArray58;
        grafo1.prox = intArray58;
        int[] intArray62 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo.Aresta aresta10 = grafo7.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '#', (int) (byte) -1);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) ' ');
        int[] intArray14 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo7.prox = intArray14;
        int[] intArray19 = new int[] { (short) 1, '#', (byte) 10 };
        grafo7.cab = intArray19;
        int[] intArray21 = grafo7.prox;
        ds.Grafo grafo23 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (short) -1, 'a', (short) 10 };
        grafo23.peso = intArray27;
        int[] intArray29 = grafo23.peso;
        grafo7.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        ds.Grafo grafo38 = grafo32.grafoTransposto();
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo40.prox = intArray47;
        int[] intArray52 = new int[] { (short) 1, '#', (byte) 10 };
        grafo40.cab = intArray52;
        int[] intArray56 = new int[] { '4', 'a' };
        grafo40.cab = intArray56;
        ds.Grafo grafo59 = new ds.Grafo((int) ' ');
        int[] intArray66 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo59.prox = intArray66;
        int[] intArray71 = new int[] { (short) 1, '#', (byte) 10 };
        grafo59.cab = intArray71;
        grafo40.prox = intArray71;
        grafo32.prox = intArray71;
        grafo7.cab = intArray71;
        ds.Grafo grafo77 = new ds.Grafo((int) ' ');
        int[] intArray81 = new int[] { (short) -1, 'a', (short) 10 };
        grafo77.peso = intArray81;
        int[] intArray83 = grafo77.peso;
        boolean boolean86 = grafo77.existeAresta((int) (short) 100, (int) (short) -1);
        int[] intArray87 = grafo77.peso;
        grafo7.cab = intArray87;
        grafo1.cab = intArray87;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 97, 10]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) ' ');
        int[] intArray37 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo30.prox = intArray37;
        int[] intArray42 = new int[] { (short) 1, '#', (byte) 10 };
        grafo30.cab = intArray42;
        int[] intArray46 = new int[] { '4', 'a' };
        grafo30.cab = intArray46;
        int[] intArray48 = grafo30.prox;
        grafo7.prox = intArray48;
        boolean boolean51 = grafo7.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        int[] intArray69 = new int[] { '4', 'a' };
        grafo53.cab = intArray69;
        int[] intArray71 = grafo53.prox;
        boolean boolean73 = grafo53.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) ' ');
        int[] intArray79 = new int[] { (short) -1, 'a', (short) 10 };
        grafo75.peso = intArray79;
        int[] intArray81 = grafo75.peso;
        int[] intArray83 = new int[] { 1 };
        grafo75.peso = intArray83;
        grafo53.peso = intArray83;
        grafo7.prox = intArray83;
        int int87 = grafo7.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta89 = grafo7.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 32 + "'", int87 == 32);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(35);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (-1), (int) (short) -1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) ' ');
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo10.prox = intArray17;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 10 };
        grafo10.cab = intArray22;
        int[] intArray26 = new int[] { '4', 'a' };
        grafo10.cab = intArray26;
        int[] intArray28 = grafo10.prox;
        boolean boolean30 = grafo10.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray36 = new int[] { (short) -1, 'a', (short) 10 };
        grafo32.peso = intArray36;
        int[] intArray38 = grafo32.peso;
        int[] intArray40 = new int[] { 1 };
        grafo32.peso = intArray40;
        grafo10.peso = intArray40;
        grafo4.peso = intArray40;
        grafo2.peso = intArray40;
        ds.Grafo grafo45 = grafo2.grafoTransposto();
        ds.Grafo grafo47 = new ds.Grafo((int) ' ');
        int[] intArray54 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo47.prox = intArray54;
        int[] intArray59 = new int[] { (short) 1, '#', (byte) 10 };
        grafo47.cab = intArray59;
        int[] intArray63 = new int[] { '4', 'a' };
        grafo47.cab = intArray63;
        int[] intArray65 = grafo47.prox;
        grafo2.peso = intArray65;
        ds.Grafo grafo67 = grafo2.grafoTransposto();
        grafo67.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(grafo45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(grafo67);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) ' ');
        int[] intArray16 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo9.prox = intArray16;
        int[] intArray21 = new int[] { (short) 1, '#', (byte) 10 };
        grafo9.cab = intArray21;
        int[] intArray25 = new int[] { '4', 'a' };
        grafo9.cab = intArray25;
        int[] intArray27 = grafo9.prox;
        grafo7.cab = intArray27;
        ds.Grafo.Aresta aresta30 = grafo7.primeiroListaAdj(10);
        int int31 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        int int43 = grafo1.numVertices();
        int[] intArray44 = grafo1.cab;
        int[] intArray45 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta47 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 35, 10]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta((int) (short) 10, (int) (short) 0);
        ds.Grafo.Aresta aresta16 = grafo11.primeiroListaAdj(10);
        ds.Grafo grafo17 = grafo11.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) ' ');
        int[] intArray20 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo13.prox = intArray20;
        int[] intArray25 = new int[] { (short) 1, '#', (byte) 10 };
        grafo13.cab = intArray25;
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray35 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo28.prox = intArray35;
        grafo13.prox = intArray35;
        grafo11.prox = intArray35;
        ds.Grafo.Aresta aresta40 = grafo11.primeiroListaAdj((int) (byte) 1);
        ds.Grafo grafo42 = new ds.Grafo((int) ' ');
        int[] intArray49 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo42.prox = intArray49;
        int[] intArray54 = new int[] { (short) 1, '#', (byte) 10 };
        grafo42.cab = intArray54;
        ds.Grafo grafo57 = new ds.Grafo((int) ' ');
        int[] intArray64 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo57.prox = intArray64;
        int[] intArray69 = new int[] { (short) 1, '#', (byte) 10 };
        grafo57.cab = intArray69;
        grafo42.prox = intArray69;
        int[] intArray72 = grafo42.cab;
        grafo11.peso = intArray72;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 35, 10]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray17 = new int[] { '4', 'a' };
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) ' ');
        int[] intArray27 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo20.prox = intArray27;
        int[] intArray32 = new int[] { (short) 1, '#', (byte) 10 };
        grafo20.cab = intArray32;
        int[] intArray36 = new int[] { '4', 'a' };
        grafo20.cab = intArray36;
        ds.Grafo grafo39 = new ds.Grafo((int) ' ');
        int[] intArray46 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo39.prox = intArray46;
        int[] intArray51 = new int[] { (short) 1, '#', (byte) 10 };
        grafo39.cab = intArray51;
        grafo20.prox = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) ' ');
        int[] intArray59 = new int[] { (short) -1, 'a', (short) 10 };
        grafo55.peso = intArray59;
        int[] intArray61 = grafo55.peso;
        grafo20.peso = intArray61;
        grafo1.cab = intArray61;
        ds.Grafo grafo65 = new ds.Grafo((int) ' ');
        int[] intArray72 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo65.prox = intArray72;
        int[] intArray77 = new int[] { (short) 1, '#', (byte) 10 };
        grafo65.cab = intArray77;
        grafo1.prox = intArray77;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1, 35, 10]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) -1, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray21 = new int[] { (short) -1, 'a', (short) 10 };
        grafo17.peso = intArray21;
        int[] intArray23 = grafo17.peso;
        grafo1.peso = intArray23;
        ds.Grafo grafo26 = new ds.Grafo((int) ' ');
        int[] intArray30 = new int[] { (short) -1, 'a', (short) 10 };
        grafo26.peso = intArray30;
        ds.Grafo grafo32 = grafo26.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) ' ');
        int[] intArray41 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo34.prox = intArray41;
        int[] intArray46 = new int[] { (short) 1, '#', (byte) 10 };
        grafo34.cab = intArray46;
        int[] intArray50 = new int[] { '4', 'a' };
        grafo34.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) ' ');
        int[] intArray60 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo53.prox = intArray60;
        int[] intArray65 = new int[] { (short) 1, '#', (byte) 10 };
        grafo53.cab = intArray65;
        grafo34.prox = intArray65;
        grafo26.prox = intArray65;
        grafo1.cab = intArray65;
        ds.Grafo grafo71 = new ds.Grafo((int) ' ');
        int[] intArray75 = new int[] { (short) -1, 'a', (short) 10 };
        grafo71.peso = intArray75;
        int[] intArray77 = grafo71.peso;
        boolean boolean80 = grafo71.existeAresta((int) (short) 100, (int) (short) -1);
        int[] intArray81 = grafo71.peso;
        grafo1.cab = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, 10]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) -1, (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo1.prox = intArray8;
        int[] intArray13 = new int[] { (short) 1, '#', (byte) 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.prox;
        ds.Grafo grafo17 = new ds.Grafo((int) ' ');
        int[] intArray24 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo17.prox = intArray24;
        int[] intArray29 = new int[] { (short) 1, '#', (byte) 10 };
        grafo17.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) ' ');
        int[] intArray39 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo32.prox = intArray39;
        grafo17.prox = intArray39;
        grafo1.prox = intArray39;
        int int43 = grafo1.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) ' ');
        int[] intArray52 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo45.prox = intArray52;
        int[] intArray57 = new int[] { (short) 1, '#', (byte) 10 };
        grafo45.cab = intArray57;
        int[] intArray59 = grafo45.prox;
        ds.Grafo grafo61 = new ds.Grafo((int) ' ');
        int[] intArray68 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo61.prox = intArray68;
        int[] intArray73 = new int[] { (short) 1, '#', (byte) 10 };
        grafo61.cab = intArray73;
        ds.Grafo grafo76 = new ds.Grafo((int) ' ');
        int[] intArray83 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo76.prox = intArray83;
        grafo61.prox = intArray83;
        grafo45.prox = intArray83;
        int int87 = grafo45.numVertices();
        int[] intArray88 = grafo45.cab;
        int[] intArray89 = grafo45.cab;
        grafo1.cab = intArray89;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 32 + "'", int87 == 32);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[1, 35, 10]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(52, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean4 = grafo1.existeAresta(32, (int) (byte) 10);
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        int[] intArray13 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo6.prox = intArray13;
        int[] intArray18 = new int[] { (short) 1, '#', (byte) 10 };
        grafo6.cab = intArray18;
        int[] intArray22 = new int[] { '4', 'a' };
        grafo6.cab = intArray22;
        int[] intArray24 = grafo6.prox;
        boolean boolean26 = grafo6.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) ' ');
        int[] intArray32 = new int[] { (short) -1, 'a', (short) 10 };
        grafo28.peso = intArray32;
        int[] intArray34 = grafo28.peso;
        int[] intArray36 = new int[] { 1 };
        grafo28.peso = intArray36;
        grafo6.peso = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) ' ');
        int[] intArray47 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo40.prox = intArray47;
        int[] intArray52 = new int[] { (short) 1, '#', (byte) 10 };
        grafo40.cab = intArray52;
        grafo6.peso = intArray52;
        grafo1.peso = intArray52;
        int[] intArray56 = grafo1.peso;
        ds.Grafo grafo58 = new ds.Grafo((int) ' ');
        int[] intArray65 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo58.prox = intArray65;
        int[] intArray70 = new int[] { (short) 1, '#', (byte) 10 };
        grafo58.cab = intArray70;
        ds.Grafo grafo73 = new ds.Grafo((int) ' ');
        int[] intArray80 = new int[] { (byte) 100, (byte) 0, 100, '#', (short) 10, (byte) 1 };
        grafo73.prox = intArray80;
        grafo58.prox = intArray80;
        grafo1.peso = intArray80;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 100, 35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 0, 100, 35, 10, 1]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) '4');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        int[] intArray9 = new int[] { 1 };
        grafo1.peso = intArray9;
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) ' ');
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10 };
        grafo1.peso = intArray5;
        int[] intArray7 = grafo1.peso;
        boolean boolean10 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }
}

