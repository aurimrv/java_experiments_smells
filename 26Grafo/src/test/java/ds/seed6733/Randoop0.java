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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', (int) 'a');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 1, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        int[] intArray19 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo13.peso = intArray19;
        grafo1.prox = intArray19;
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (byte) 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        grafo34.imprime();
        int int36 = grafo34.numVertices();
        boolean boolean39 = grafo34.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        grafo41.insereAresta((int) '4', 0, 0);
        int[] intArray56 = grafo41.prox;
        grafo34.peso = intArray56;
        grafo1.prox = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo1.retiraAresta((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        int[] intArray19 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo13.peso = intArray19;
        grafo1.prox = intArray19;
        java.lang.Class<?> wildcardClass22 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo17.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        boolean boolean8 = grafo1.existeAresta(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) '4');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean3 = grafo1.listaAdjVazia(100);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass39 = grafo38.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (short) 0);
        int int21 = aresta20.v2();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo13 = new ds.Grafo((int) 'a');
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo13.cab = intArray23;
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 0);
        int[] intArray34 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo28.peso = intArray34;
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 0);
        int[] intArray45 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo39.peso = intArray45;
        grafo37.prox = intArray45;
        grafo28.peso = intArray45;
        grafo13.peso = intArray45;
        grafo1.cab = intArray45;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo6.cab = intArray16;
        ds.Grafo.Aresta aresta21 = grafo6.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        grafo23.prox = intArray31;
        grafo23.insereAresta((int) '4', 0, 0);
        int[] intArray38 = grafo23.prox;
        grafo6.cab = intArray38;
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        int[] intArray51 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo45.peso = intArray51;
        grafo43.prox = intArray51;
        grafo41.cab = intArray51;
        ds.Grafo.Aresta aresta56 = grafo41.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        int[] intArray66 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo60.peso = intArray66;
        grafo58.prox = intArray66;
        grafo58.insereAresta((int) '4', 0, 0);
        int[] intArray73 = grafo58.prox;
        grafo41.cab = intArray73;
        int[] intArray75 = grafo41.cab;
        grafo6.cab = intArray75;
        grafo1.peso = intArray75;
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) 'a', (int) '4', 100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        int[] intArray38 = grafo1.cab;
        int int39 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo(0);
        grafo18.imprime();
        int int20 = grafo18.numVertices();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo18.peso = intArray46;
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 0);
        int[] intArray58 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo52.peso = intArray58;
        grafo50.prox = intArray58;
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        int[] intArray68 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo62.peso = intArray68;
        grafo50.prox = intArray68;
        grafo18.prox = intArray68;
        grafo1.prox = intArray68;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo10.insereAresta((int) '4', 0, 0);
        int[] intArray25 = grafo10.prox;
        grafo1.cab = intArray25;
        int int27 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        int int38 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        int[] intArray5 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = intArray5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo10.insereAresta((int) '4', 0, 0);
        int[] intArray25 = grafo10.prox;
        grafo1.cab = intArray25;
        int int27 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) (short) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo33 = grafo1.grafoTransposto();
        int[] intArray34 = grafo1.peso;
        int[] intArray35 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta37 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(52);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo17.peso = intArray46;
        grafo15.peso = intArray46;
        grafo1.prox = intArray46;
        java.lang.Class<?> wildcardClass51 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 1, (int) 'a');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.retiraAresta(100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 100, (int) '4');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 1, 1, (int) (byte) -1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo8.cab = intArray18;
        ds.Grafo.Aresta aresta23 = grafo8.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo25.insereAresta((int) '4', 0, 0);
        int[] intArray40 = grafo25.prox;
        grafo8.cab = intArray40;
        grafo1.cab = intArray40;
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '#', 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean27 = grafo1.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo28 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(grafo28);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        int[] intArray5 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) ' ', (int) (short) -1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo5.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo1.listaAdjVazia((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) '4', (int) '4', (int) (short) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = aresta16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        grafo1.insereAresta((int) (short) 10, 100, (int) (short) 10);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(100, (int) (short) -1);
        int int18 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) '#');
        int int19 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(100, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 0);
        boolean boolean21 = grafo16.existeAresta(10, (int) (short) 0);
        grafo16.imprime();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        int int25 = grafo1.numVertices();
        boolean boolean28 = grafo1.existeAresta(0, (int) (byte) -1);
        ds.Grafo.Aresta aresta31 = grafo1.retiraAresta((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(aresta31);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 1, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo36.cab = intArray46;
        ds.Grafo.Aresta aresta51 = grafo36.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        int[] intArray61 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo55.peso = intArray61;
        grafo53.prox = intArray61;
        grafo53.insereAresta((int) '4', 0, 0);
        int[] intArray68 = grafo53.prox;
        grafo36.cab = intArray68;
        int[] intArray70 = grafo36.cab;
        grafo1.cab = intArray70;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, 52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        int int19 = grafo18.numVertices();
        int[] intArray20 = null;
        grafo18.prox = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo23.peso = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        grafo47.prox = intArray55;
        grafo45.cab = intArray55;
        ds.Grafo.Aresta aresta60 = grafo45.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo62.insereAresta((int) '4', 0, 0);
        int[] intArray77 = grafo62.prox;
        grafo45.cab = intArray77;
        grafo23.prox = intArray77;
        grafo18.peso = intArray77;
        grafo14.peso = intArray77;
        grafo1.cab = intArray77;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta85 = grafo1.retiraAresta((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        boolean boolean17 = grafo1.existeAresta((int) '#', (int) (byte) 1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (byte) 10, (int) (short) 10);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        int[] intArray5 = grafo1.prox;
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        grafo17.imprime();
        ds.Grafo.Aresta aresta21 = grafo17.retiraAresta((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo17.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        int[] intArray19 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo13.peso = intArray19;
        grafo1.prox = intArray19;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, 0, (int) (short) 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 0);
        int[] intArray15 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo9.peso = intArray15;
        grafo7.prox = intArray15;
        ds.Grafo grafo18 = grafo7.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta22 = grafo20.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.prox = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 0);
        int[] intArray35 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo29.peso = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo29.peso = intArray46;
        ds.Grafo grafo51 = new ds.Grafo((int) 'a');
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        int[] intArray61 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo55.peso = intArray61;
        grafo53.prox = intArray61;
        grafo51.cab = intArray61;
        ds.Grafo.Aresta aresta66 = grafo51.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        int[] intArray76 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo70.peso = intArray76;
        grafo68.prox = intArray76;
        grafo68.insereAresta((int) '4', 0, 0);
        int[] intArray83 = grafo68.prox;
        grafo51.cab = intArray83;
        grafo29.prox = intArray83;
        grafo24.peso = intArray83;
        grafo20.peso = intArray83;
        grafo7.cab = intArray83;
        grafo1.peso = intArray83;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo23.cab = intArray33;
        ds.Grafo.Aresta aresta38 = grafo23.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        int[] intArray48 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo42.peso = intArray48;
        grafo40.prox = intArray48;
        grafo40.insereAresta((int) '4', 0, 0);
        int[] intArray55 = grafo40.prox;
        grafo23.cab = intArray55;
        grafo1.prox = intArray55;
        ds.Grafo grafo58 = grafo1.grafoTransposto();
        int[] intArray59 = null;
        grafo1.cab = intArray59;
        int[] intArray61 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = grafo1.listaAdjVazia(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        int int25 = grafo1.numVertices();
        ds.Grafo.Aresta aresta28 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        int int29 = grafo1.numVertices();
        boolean boolean32 = grafo1.existeAresta(0, (int) (short) 10);
        int int33 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        int int19 = grafo18.numVertices();
        int[] intArray20 = null;
        grafo18.prox = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo23.peso = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        grafo47.prox = intArray55;
        grafo45.cab = intArray55;
        ds.Grafo.Aresta aresta60 = grafo45.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo62.insereAresta((int) '4', 0, 0);
        int[] intArray77 = grafo62.prox;
        grafo45.cab = intArray77;
        grafo23.prox = intArray77;
        grafo18.peso = intArray77;
        grafo14.peso = intArray77;
        grafo1.cab = intArray77;
        int[] intArray83 = grafo1.cab;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo13.insereAresta((int) (short) -1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        grafo38.imprime();
        ds.Grafo grafo40 = grafo38.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(grafo40);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 100, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        grafo34.imprime();
        int int36 = grafo34.numVertices();
        boolean boolean39 = grafo34.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        grafo41.insereAresta((int) '4', 0, 0);
        int[] intArray56 = grafo41.prox;
        grafo34.peso = intArray56;
        grafo1.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo60.cab = intArray70;
        ds.Grafo.Aresta aresta75 = grafo60.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 0);
        int[] intArray85 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo79.peso = intArray85;
        grafo77.prox = intArray85;
        grafo77.insereAresta((int) '4', 0, 0);
        int[] intArray92 = grafo77.prox;
        grafo60.cab = intArray92;
        grafo1.prox = intArray92;
        int int95 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass96 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo6.peso = intArray23;
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        int[] intArray38 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo32.peso = intArray38;
        grafo30.prox = intArray38;
        grafo28.cab = intArray38;
        ds.Grafo.Aresta aresta43 = grafo28.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        int[] intArray53 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo47.peso = intArray53;
        grafo45.prox = intArray53;
        grafo45.insereAresta((int) '4', 0, 0);
        int[] intArray60 = grafo45.prox;
        grafo28.cab = intArray60;
        grafo6.prox = intArray60;
        grafo1.peso = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), (int) (short) 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        int int14 = grafo1.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo32.insereAresta((int) '4', 0, 0);
        int[] intArray47 = grafo32.prox;
        grafo23.cab = intArray47;
        grafo18.peso = intArray47;
        ds.Grafo grafo50 = grafo18.grafoTransposto();
        int[] intArray51 = grafo18.peso;
        grafo16.prox = intArray51;
        grafo1.cab = intArray51;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo23.cab = intArray33;
        ds.Grafo.Aresta aresta38 = grafo23.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        int[] intArray48 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo42.peso = intArray48;
        grafo40.prox = intArray48;
        grafo40.insereAresta((int) '4', 0, 0);
        int[] intArray55 = grafo40.prox;
        grafo23.cab = intArray55;
        grafo1.prox = intArray55;
        int int58 = grafo1.numVertices();
        int int59 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        grafo17.imprime();
        ds.Grafo.Aresta aresta21 = grafo17.retiraAresta((int) (short) 1, (int) ' ');
        int int22 = grafo17.numVertices();
        grafo17.insereAresta((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass27 = grafo17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo33 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta37 = grafo33.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNull(aresta35);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        ds.Grafo grafo35 = grafo3.grafoTransposto();
        int[] intArray36 = grafo3.peso;
        grafo1.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = grafo1.listaAdjVazia((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        boolean boolean19 = grafo17.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (-1), 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.existeAresta(1, 0);
        int[] intArray35 = grafo1.peso;
        java.lang.Class<?> wildcardClass36 = intArray35.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        grafo1.peso = intArray32;
        grafo1.imprime();
        ds.Grafo.Aresta aresta39 = grafo1.retiraAresta((int) (short) 0, (int) '#');
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta39);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, 1);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo12.cab = intArray22;
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        int[] intArray44 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo38.peso = intArray44;
        grafo36.prox = intArray44;
        grafo27.peso = intArray44;
        grafo12.peso = intArray44;
        int[] intArray49 = grafo12.cab;
        grafo1.peso = intArray49;
        java.lang.Class<?> wildcardClass51 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        int int17 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        int[] intArray10 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo4.peso = intArray10;
        grafo1.prox = intArray10;
        int int13 = grafo1.numVertices();
        int[] intArray14 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo23.cab = intArray33;
        ds.Grafo.Aresta aresta38 = grafo23.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        int[] intArray48 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo42.peso = intArray48;
        grafo40.prox = intArray48;
        grafo40.insereAresta((int) '4', 0, 0);
        int[] intArray55 = grafo40.prox;
        grafo23.cab = intArray55;
        grafo1.prox = intArray55;
        grafo1.insereAresta((int) (byte) 100, 100, (int) (short) 100);
        int[] intArray62 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.listaAdjVazia((int) ' ');
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo32.insereAresta((int) '4', 0, 0);
        int[] intArray47 = grafo32.prox;
        grafo23.cab = intArray47;
        grafo18.peso = intArray47;
        grafo1.cab = intArray47;
        int[] intArray51 = null;
        grafo1.cab = intArray51;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        grafo34.imprime();
        int int36 = grafo34.numVertices();
        boolean boolean39 = grafo34.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        grafo41.insereAresta((int) '4', 0, 0);
        int[] intArray56 = grafo41.prox;
        grafo34.peso = intArray56;
        grafo1.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo60.cab = intArray70;
        ds.Grafo.Aresta aresta75 = grafo60.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 0);
        int[] intArray85 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo79.peso = intArray85;
        grafo77.prox = intArray85;
        grafo77.insereAresta((int) '4', 0, 0);
        int[] intArray92 = grafo77.prox;
        grafo60.cab = intArray92;
        grafo1.prox = intArray92;
        int int95 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo96 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo.Aresta aresta40 = grafo1.retiraAresta(0, 52);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta40);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        int int5 = aresta4.v1();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass4 = grafo3.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo13.cab = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 0);
        int[] intArray34 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo28.peso = intArray34;
        grafo26.prox = intArray34;
        ds.Grafo grafo37 = grafo26.grafoTransposto();
        ds.Grafo grafo38 = grafo37.grafoTransposto();
        int int39 = grafo38.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        int[] intArray47 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo41.peso = intArray47;
        grafo38.cab = intArray47;
        grafo13.prox = intArray47;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        int int17 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        grafo1.insereAresta(97, (int) (byte) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 10);
        int[] intArray11 = null;
        grafo1.cab = intArray11;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(52);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo17.peso = intArray46;
        grafo15.peso = intArray46;
        grafo1.prox = intArray46;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        int[] intArray32 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        grafo38.imprime();
        grafo38.insereAresta((int) (short) 0, (int) (byte) -1, (int) 'a');
        ds.Grafo.Aresta aresta45 = grafo38.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta45);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        int int25 = grafo1.numVertices();
        boolean boolean28 = grafo1.existeAresta(0, (int) (byte) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        int[] intArray38 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo32.peso = intArray38;
        grafo30.prox = intArray38;
        grafo30.insereAresta((int) '4', 0, 0);
        int[] intArray45 = grafo30.prox;
        ds.Grafo grafo46 = grafo30.grafoTransposto();
        grafo46.imprime();
        ds.Grafo.Aresta aresta50 = grafo46.retiraAresta((int) (short) 1, (int) ' ');
        ds.Grafo grafo52 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 0);
        int[] intArray63 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo57.peso = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 0);
        int[] intArray74 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo68.peso = intArray74;
        grafo66.prox = intArray74;
        grafo66.insereAresta((int) '4', 0, 0);
        int[] intArray81 = grafo66.prox;
        grafo57.cab = intArray81;
        grafo52.peso = intArray81;
        ds.Grafo grafo84 = grafo52.grafoTransposto();
        int[] intArray85 = grafo52.peso;
        int[] intArray86 = grafo52.peso;
        grafo46.prox = intArray86;
        grafo1.cab = intArray86;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = grafo1.grafoTransposto();
        boolean boolean34 = grafo1.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, 97);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        ds.Grafo grafo35 = grafo3.grafoTransposto();
        int[] intArray36 = grafo3.peso;
        grafo1.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(52);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo17.peso = intArray46;
        grafo15.peso = intArray46;
        grafo1.prox = intArray46;
        int int51 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        int[] intArray38 = grafo1.cab;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        ds.Grafo grafo52 = grafo41.grafoTransposto();
        ds.Grafo grafo53 = grafo52.grafoTransposto();
        int int54 = grafo53.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        int[] intArray62 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo56.peso = intArray62;
        grafo53.cab = intArray62;
        grafo39.peso = intArray62;
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 100, (int) (byte) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, 10, (int) (short) -1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        java.lang.Class<?> wildcardClass7 = grafo5.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo23.cab = intArray33;
        ds.Grafo.Aresta aresta38 = grafo23.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        int[] intArray48 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo42.peso = intArray48;
        grafo40.prox = intArray48;
        grafo40.insereAresta((int) '4', 0, 0);
        int[] intArray55 = grafo40.prox;
        grafo23.cab = intArray55;
        grafo1.prox = intArray55;
        grafo1.insereAresta((int) (byte) 100, 100, (int) (short) 100);
        ds.Grafo.Aresta aresta64 = grafo1.retiraAresta(0, (int) (byte) -1);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta64);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo.Aresta aresta34 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta34);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 100, (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        ds.Grafo grafo30 = new ds.Grafo(0);
        grafo30.imprime();
        int int32 = grafo30.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        int[] intArray51 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo45.peso = intArray51;
        grafo43.prox = intArray51;
        grafo43.insereAresta((int) '4', 0, 0);
        int[] intArray58 = grafo43.prox;
        grafo34.cab = intArray58;
        grafo30.peso = intArray58;
        grafo28.cab = intArray58;
        grafo1.peso = intArray58;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo(0);
        grafo4.imprime();
        int int6 = grafo4.numVertices();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo4.peso = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        int[] intArray44 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo38.peso = intArray44;
        grafo36.prox = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 0);
        int[] intArray54 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo48.peso = intArray54;
        grafo36.prox = intArray54;
        grafo4.prox = intArray54;
        grafo1.prox = intArray54;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        int[] intArray7 = null;
        grafo5.peso = intArray7;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        ds.Grafo.Aresta aresta36 = grafo1.proxAdj((int) '#');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta36);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (short) 100, (int) (short) 0);
        int int21 = aresta20.peso();
        int int22 = aresta20.v1();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 10, (int) (short) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 1, (int) ' ');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) (short) 1, (int) (byte) 10);
        int int9 = grafo5.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int) 'a');
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta40 = grafo38.primeiroListaAdj(0);
        boolean boolean43 = grafo38.existeAresta((int) '#', 100);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.insereAresta(1, (int) (short) -1, (int) '#');
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, (int) ' ');
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(aresta14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        int[] intArray10 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo4.peso = intArray10;
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        ds.Grafo grafo35 = grafo3.grafoTransposto();
        int[] intArray36 = grafo3.peso;
        grafo1.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta39 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean11 = grafo5.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo5.retiraAresta((int) ' ', 10);
        boolean boolean17 = grafo5.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo5.retiraAresta((int) (byte) 100, (int) (byte) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        int[] intArray32 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo26.peso = intArray32;
        grafo24.prox = intArray32;
        grafo22.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo22.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        int[] intArray47 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo41.peso = intArray47;
        grafo39.prox = intArray47;
        grafo39.insereAresta((int) '4', 0, 0);
        int[] intArray54 = grafo39.prox;
        grafo22.cab = intArray54;
        grafo5.cab = intArray54;
        grafo3.cab = intArray54;
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        int[] intArray35 = grafo1.cab;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        int int9 = aresta8.v1();
        int int10 = aresta8.peso();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo.Aresta aresta39 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta43 = grafo1.retiraAresta((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta39);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo32);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        grafo1.insereAresta(1, (int) '4', (int) (short) 0);
        ds.Grafo grafo21 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) '#');
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        int[] intArray42 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo36.peso = intArray42;
        grafo34.prox = intArray42;
        grafo34.insereAresta((int) '4', 0, 0);
        int[] intArray49 = grafo34.prox;
        grafo25.cab = intArray49;
        grafo20.peso = intArray49;
        ds.Grafo grafo52 = grafo20.grafoTransposto();
        int[] intArray53 = grafo20.peso;
        ds.Grafo grafo55 = new ds.Grafo((int) 'a');
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 0);
        int[] intArray65 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo59.peso = intArray65;
        grafo57.prox = intArray65;
        grafo55.cab = intArray65;
        grafo20.peso = intArray65;
        grafo1.cab = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo1.retiraAresta((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[5, 0, 32, -1, 52]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) '4', 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        int int19 = grafo18.numVertices();
        int[] intArray20 = null;
        grafo18.prox = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo23.peso = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        grafo47.prox = intArray55;
        grafo45.cab = intArray55;
        ds.Grafo.Aresta aresta60 = grafo45.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo62.insereAresta((int) '4', 0, 0);
        int[] intArray77 = grafo62.prox;
        grafo45.cab = intArray77;
        grafo23.prox = intArray77;
        grafo18.peso = intArray77;
        grafo14.peso = intArray77;
        grafo1.cab = intArray77;
        int[] intArray83 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta86 = grafo1.retiraAresta((int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo6.existeAresta((int) (short) 100, 32);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        int[] intArray10 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo4.peso = intArray10;
        grafo1.prox = intArray10;
        int int13 = grafo1.numVertices();
        int[] intArray14 = grafo1.prox;
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        grafo1.insereAresta((int) (short) 1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 32, -1, 52]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean18 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        ds.Grafo grafo21 = new ds.Grafo((int) 'a');
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        grafo23.prox = intArray31;
        grafo21.cab = intArray31;
        ds.Grafo.Aresta aresta36 = grafo21.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo38.insereAresta((int) '4', 0, 0);
        int[] intArray53 = grafo38.prox;
        grafo21.cab = intArray53;
        int[] intArray55 = grafo21.cab;
        grafo1.cab = intArray55;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        boolean boolean17 = grafo1.existeAresta((int) '#', (int) (byte) 1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (byte) 10, (int) (short) 10);
        ds.Grafo grafo22 = new ds.Grafo((int) 'a');
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        int[] intArray32 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo26.peso = intArray32;
        grafo24.prox = intArray32;
        grafo22.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo22.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        int[] intArray47 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo41.peso = intArray47;
        grafo39.prox = intArray47;
        grafo39.insereAresta((int) '4', 0, 0);
        int[] intArray54 = grafo39.prox;
        grafo22.cab = intArray54;
        ds.Grafo grafo57 = new ds.Grafo((int) 'a');
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 0);
        int[] intArray67 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo61.peso = intArray67;
        grafo59.prox = intArray67;
        grafo57.cab = intArray67;
        ds.Grafo.Aresta aresta72 = grafo57.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 0);
        int[] intArray82 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo76.peso = intArray82;
        grafo74.prox = intArray82;
        grafo74.insereAresta((int) '4', 0, 0);
        int[] intArray89 = grafo74.prox;
        grafo57.cab = intArray89;
        int[] intArray91 = grafo57.cab;
        grafo22.cab = intArray91;
        grafo1.prox = intArray91;
        ds.Grafo.Aresta aresta95 = grafo1.primeiroListaAdj(1);
        boolean boolean98 = grafo1.existeAresta(1, 52);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(52);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo17.peso = intArray46;
        grafo15.peso = intArray46;
        grafo1.prox = intArray46;
        int[] intArray51 = grafo1.peso;
        int[] intArray52 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        grafo11.imprime();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        boolean boolean15 = grafo11.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        grafo17.imprime();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        boolean boolean21 = grafo17.listaAdjVazia((int) (byte) 1);
        grafo17.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        int[] intArray30 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo24.peso = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 0);
        int[] intArray41 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo35.peso = intArray41;
        grafo33.prox = intArray41;
        grafo33.insereAresta((int) '4', 0, 0);
        int[] intArray48 = grafo33.prox;
        grafo24.cab = intArray48;
        grafo17.peso = intArray48;
        grafo11.prox = intArray48;
        grafo9.peso = intArray48;
        java.lang.Class<?> wildcardClass53 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        grafo1.imprime();
        ds.Grafo grafo26 = grafo1.grafoTransposto();
        grafo1.imprime();
        int[] intArray28 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 100, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo10.insereAresta((int) '4', 0, 0);
        int[] intArray25 = grafo10.prox;
        grafo1.cab = intArray25;
        int[] intArray27 = grafo1.peso;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        ds.Grafo grafo25 = grafo1.grafoTransposto();
        int int26 = grafo25.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean18 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        int[] intArray35 = grafo1.cab;
        int int36 = grafo1.numVertices();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo38.insereAresta((int) '4', 0, 0);
        int[] intArray53 = grafo38.prox;
        ds.Grafo grafo54 = grafo38.grafoTransposto();
        grafo54.imprime();
        ds.Grafo.Aresta aresta58 = grafo54.retiraAresta((int) (short) 1, (int) ' ');
        int int59 = grafo54.numVertices();
        grafo54.insereAresta((int) 'a', (int) (byte) 0, (int) '4');
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 0);
        int[] intArray73 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo67.peso = intArray73;
        grafo65.prox = intArray73;
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        int[] intArray83 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo77.peso = intArray83;
        grafo65.prox = intArray83;
        grafo54.cab = intArray83;
        grafo1.peso = intArray83;
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        grafo34.imprime();
        int int36 = grafo34.numVertices();
        boolean boolean39 = grafo34.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        grafo41.insereAresta((int) '4', 0, 0);
        int[] intArray56 = grafo41.prox;
        grafo34.peso = intArray56;
        grafo1.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo60.cab = intArray70;
        ds.Grafo.Aresta aresta75 = grafo60.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 0);
        int[] intArray85 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo79.peso = intArray85;
        grafo77.prox = intArray85;
        grafo77.insereAresta((int) '4', 0, 0);
        int[] intArray92 = grafo77.prox;
        grafo60.cab = intArray92;
        grafo1.prox = intArray92;
        int int95 = grafo1.numVertices();
        int int96 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 97 + "'", int96 == 97);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) '4', (int) (byte) 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) ' ', 32);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean3 = grafo1.listaAdjVazia(100);
        boolean boolean6 = grafo1.existeAresta(0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 1, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) 1, 100);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 1, (int) (short) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 1, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        ds.Grafo grafo35 = grafo3.grafoTransposto();
        int[] intArray36 = grafo3.peso;
        grafo1.prox = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) '#');
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo28 = new ds.Grafo(52);
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 0);
        int[] intArray41 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo35.peso = intArray41;
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        int[] intArray52 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo46.peso = intArray52;
        grafo44.prox = intArray52;
        grafo44.insereAresta((int) '4', 0, 0);
        int[] intArray59 = grafo44.prox;
        grafo35.cab = intArray59;
        grafo30.peso = intArray59;
        grafo28.peso = intArray59;
        grafo1.peso = intArray59;
        boolean boolean66 = grafo1.existeAresta(52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int int6 = grafo5.numVertices();
        int[] intArray7 = null;
        grafo5.prox = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 0);
        int[] intArray27 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo21.peso = intArray27;
        grafo19.prox = intArray27;
        grafo10.peso = intArray27;
        ds.Grafo grafo32 = new ds.Grafo((int) 'a');
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        int[] intArray42 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo36.peso = intArray42;
        grafo34.prox = intArray42;
        grafo32.cab = intArray42;
        ds.Grafo.Aresta aresta47 = grafo32.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 0);
        int[] intArray57 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo51.peso = intArray57;
        grafo49.prox = intArray57;
        grafo49.insereAresta((int) '4', 0, 0);
        int[] intArray64 = grafo49.prox;
        grafo32.cab = intArray64;
        grafo10.prox = intArray64;
        grafo5.peso = intArray64;
        grafo1.peso = intArray64;
        ds.Grafo grafo69 = grafo1.grafoTransposto();
        ds.Grafo grafo71 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        int[] intArray79 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo73.peso = intArray79;
        grafo71.prox = intArray79;
        ds.Grafo grafo83 = new ds.Grafo((int) (short) 0);
        int[] intArray89 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo83.peso = intArray89;
        grafo71.prox = intArray89;
        grafo69.prox = intArray89;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo69);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo(0);
        ds.Grafo grafo5 = new ds.Grafo(52);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        grafo21.prox = intArray29;
        grafo21.insereAresta((int) '4', 0, 0);
        int[] intArray36 = grafo21.prox;
        grafo12.cab = intArray36;
        grafo7.peso = intArray36;
        grafo5.peso = intArray36;
        grafo3.peso = intArray36;
        grafo1.peso = intArray36;
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) '4', (-1));
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean28 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 1, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        int int25 = grafo1.numVertices();
        boolean boolean28 = grafo1.existeAresta(0, (int) (byte) -1);
        boolean boolean30 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 0);
        boolean boolean20 = grafo16.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo9 = new ds.Grafo((int) 'a');
        grafo9.imprime();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        boolean boolean13 = grafo9.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo15 = new ds.Grafo((int) 'a');
        grafo15.imprime();
        ds.Grafo grafo17 = grafo15.grafoTransposto();
        boolean boolean19 = grafo15.listaAdjVazia((int) (byte) 1);
        grafo15.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo15.peso = intArray46;
        grafo9.prox = intArray46;
        grafo1.prox = intArray46;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        java.lang.Class<?> wildcardClass22 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo16 = new ds.Grafo(1);
        grafo16.imprime();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        int[] intArray30 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo24.peso = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 0);
        int[] intArray41 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo35.peso = intArray41;
        grafo33.prox = intArray41;
        grafo24.peso = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) 'a');
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 0);
        int[] intArray56 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo50.peso = intArray56;
        grafo48.prox = intArray56;
        grafo46.cab = intArray56;
        ds.Grafo.Aresta aresta61 = grafo46.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 0);
        int[] intArray71 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo65.peso = intArray71;
        grafo63.prox = intArray71;
        grafo63.insereAresta((int) '4', 0, 0);
        int[] intArray78 = grafo63.prox;
        grafo46.cab = intArray78;
        grafo24.prox = intArray78;
        grafo19.peso = intArray78;
        grafo16.prox = intArray78;
        grafo13.prox = intArray78;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 100, (int) (short) 0);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, 10, (int) (short) 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        int int14 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        grafo7.imprime();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        boolean boolean11 = grafo7.listaAdjVazia((int) (byte) 1);
        grafo7.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        int[] intArray20 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo14.peso = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        grafo23.prox = intArray31;
        grafo23.insereAresta((int) '4', 0, 0);
        int[] intArray38 = grafo23.prox;
        grafo14.cab = intArray38;
        grafo7.peso = intArray38;
        grafo1.prox = intArray38;
        ds.Grafo grafo43 = new ds.Grafo(0);
        grafo43.imprime();
        int int45 = grafo43.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        int[] intArray53 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo47.peso = intArray53;
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        int[] intArray64 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo58.peso = intArray64;
        grafo56.prox = intArray64;
        grafo56.insereAresta((int) '4', 0, 0);
        int[] intArray71 = grafo56.prox;
        grafo47.cab = intArray71;
        grafo43.peso = intArray71;
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        int[] intArray83 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo77.peso = intArray83;
        grafo75.prox = intArray83;
        ds.Grafo grafo87 = new ds.Grafo((int) (short) 0);
        int[] intArray93 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo87.peso = intArray93;
        grafo75.prox = intArray93;
        grafo43.prox = intArray93;
        grafo1.peso = intArray93;
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        grafo1.imprime();
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean27 = grafo1.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo28 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(1, 1);
        java.lang.Class<?> wildcardClass32 = grafo28.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo(10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (byte) 0, 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        grafo1.insereAresta(1, (int) '4', (int) (short) 0);
        int[] intArray21 = grafo1.prox;
        int[] intArray22 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 32, -1, 52]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) '4', 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.existeAresta(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, 1);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo12.cab = intArray22;
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        int[] intArray44 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo38.peso = intArray44;
        grafo36.prox = intArray44;
        grafo27.peso = intArray44;
        grafo12.peso = intArray44;
        int[] intArray49 = grafo12.cab;
        grafo1.peso = intArray49;
        ds.Grafo.Aresta aresta52 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta52);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo12.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.insereAresta(1, (int) (short) -1, (int) '#');
        grafo1.insereAresta((int) (short) 0, 0, (int) (byte) 1);
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass33 = grafo32.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) '#');
        ds.Grafo grafo20 = new ds.Grafo(1);
        grafo20.imprime();
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        grafo20.prox = intArray29;
        int int32 = grafo20.numVertices();
        int[] intArray33 = grafo20.prox;
        ds.Grafo grafo35 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 0);
        int[] intArray57 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo51.peso = intArray57;
        grafo49.prox = intArray57;
        grafo49.insereAresta((int) '4', 0, 0);
        int[] intArray64 = grafo49.prox;
        grafo40.cab = intArray64;
        grafo35.peso = intArray64;
        ds.Grafo grafo67 = grafo35.grafoTransposto();
        int[] intArray68 = grafo35.peso;
        ds.Grafo grafo70 = new ds.Grafo((int) 'a');
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 0);
        int[] intArray80 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo74.peso = intArray80;
        grafo72.prox = intArray80;
        grafo70.cab = intArray80;
        grafo35.peso = intArray80;
        grafo20.prox = intArray80;
        grafo1.peso = intArray80;
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 1, (int) ' ');
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) '4', (int) '4', (int) (short) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) '#');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        grafo11.imprime();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        boolean boolean15 = grafo11.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        grafo17.imprime();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        boolean boolean21 = grafo17.listaAdjVazia((int) (byte) 1);
        grafo17.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        int[] intArray30 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo24.peso = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 0);
        int[] intArray41 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo35.peso = intArray41;
        grafo33.prox = intArray41;
        grafo33.insereAresta((int) '4', 0, 0);
        int[] intArray48 = grafo33.prox;
        grafo24.cab = intArray48;
        grafo17.peso = intArray48;
        grafo11.prox = intArray48;
        grafo9.peso = intArray48;
        boolean boolean55 = grafo9.existeAresta((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta(97, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        grafo38.imprime();
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        int[] intArray52 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo46.peso = intArray52;
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 0);
        int[] intArray63 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo57.peso = intArray63;
        grafo55.prox = intArray63;
        grafo55.insereAresta((int) '4', 0, 0);
        int[] intArray70 = grafo55.prox;
        grafo46.cab = intArray70;
        grafo41.peso = intArray70;
        grafo38.cab = intArray70;
        int[] intArray74 = grafo38.cab;
        ds.Grafo grafo75 = grafo38.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo75);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) ' ');
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        grafo1.imprime();
        ds.Grafo grafo26 = grafo1.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 0);
        int[] intArray50 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo44.peso = intArray50;
        grafo42.prox = intArray50;
        grafo42.insereAresta((int) '4', 0, 0);
        int[] intArray57 = grafo42.prox;
        grafo33.cab = intArray57;
        grafo28.peso = intArray57;
        grafo1.peso = intArray57;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        int int19 = grafo18.numVertices();
        int[] intArray20 = null;
        grafo18.prox = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        int[] intArray29 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo23.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        grafo32.prox = intArray40;
        grafo23.peso = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        grafo47.prox = intArray55;
        grafo45.cab = intArray55;
        ds.Grafo.Aresta aresta60 = grafo45.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo62.insereAresta((int) '4', 0, 0);
        int[] intArray77 = grafo62.prox;
        grafo45.cab = intArray77;
        grafo23.prox = intArray77;
        grafo18.peso = intArray77;
        grafo14.peso = intArray77;
        grafo1.cab = intArray77;
        int[] intArray83 = grafo1.cab;
        int int84 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean9 = grafo1.listaAdjVazia(97);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo1.peso = intArray18;
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        int[] intArray17 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo11.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        grafo20.prox = intArray28;
        grafo20.insereAresta((int) '4', 0, 0);
        int[] intArray35 = grafo20.prox;
        grafo11.cab = intArray35;
        grafo6.peso = intArray35;
        ds.Grafo grafo38 = grafo6.grafoTransposto();
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 0);
        int[] intArray48 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo42.peso = intArray48;
        grafo40.prox = intArray48;
        grafo40.insereAresta((int) '4', 0, 0);
        int[] intArray55 = grafo40.prox;
        grafo38.peso = intArray55;
        grafo1.cab = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 0);
        int[] intArray13 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo7.peso = intArray13;
        grafo5.prox = intArray13;
        ds.Grafo grafo16 = grafo5.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo20 = new ds.Grafo(0);
        grafo20.imprime();
        int int22 = grafo20.numVertices();
        boolean boolean25 = grafo20.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 0);
        int[] intArray35 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo29.peso = intArray35;
        grafo27.prox = intArray35;
        grafo27.insereAresta((int) '4', 0, 0);
        int[] intArray42 = grafo27.prox;
        grafo20.peso = intArray42;
        boolean boolean46 = grafo20.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo47 = grafo20.grafoTransposto();
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        int[] intArray66 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo60.peso = intArray66;
        grafo58.prox = intArray66;
        grafo49.peso = intArray66;
        grafo20.peso = intArray66;
        grafo18.cab = intArray66;
        grafo16.prox = intArray66;
        grafo1.cab = intArray66;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean27 = grafo1.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo28 = grafo1.grafoTransposto();
        ds.Grafo grafo29 = grafo28.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo28.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(grafo29);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo3 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        int[] intArray14 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        int[] intArray25 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo19.peso = intArray25;
        grafo17.prox = intArray25;
        grafo17.insereAresta((int) '4', 0, 0);
        int[] intArray32 = grafo17.prox;
        grafo8.cab = intArray32;
        grafo3.peso = intArray32;
        grafo1.peso = intArray32;
        grafo1.imprime();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo38.insereAresta((int) '4', 0, 0);
        int[] intArray53 = grafo38.prox;
        ds.Grafo grafo54 = grafo38.grafoTransposto();
        grafo54.imprime();
        ds.Grafo.Aresta aresta58 = grafo54.retiraAresta((int) (short) 1, (int) ' ');
        int int59 = grafo54.numVertices();
        grafo54.insereAresta((int) 'a', (int) (byte) 0, (int) '4');
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 0);
        int[] intArray73 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo67.peso = intArray73;
        grafo65.prox = intArray73;
        grafo54.cab = intArray73;
        grafo1.cab = intArray73;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 0, 52);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo(0);
        grafo5.imprime();
        int int7 = grafo5.numVertices();
        boolean boolean10 = grafo5.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        int[] intArray20 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo14.peso = intArray20;
        grafo12.prox = intArray20;
        grafo12.insereAresta((int) '4', 0, 0);
        int[] intArray27 = grafo12.prox;
        grafo5.peso = intArray27;
        int int29 = grafo5.numVertices();
        ds.Grafo.Aresta aresta32 = grafo5.retiraAresta((int) (byte) 100, (int) (byte) 1);
        int int33 = grafo5.numVertices();
        int int34 = grafo5.numVertices();
        int[] intArray35 = grafo5.peso;
        grafo1.cab = intArray35;
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        int[] intArray12 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        int[] intArray23 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo17.peso = intArray23;
        grafo15.prox = intArray23;
        grafo15.insereAresta((int) '4', 0, 0);
        int[] intArray30 = grafo15.prox;
        grafo6.cab = intArray30;
        grafo1.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo(0);
        grafo34.imprime();
        int int36 = grafo34.numVertices();
        boolean boolean39 = grafo34.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        int[] intArray49 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo43.peso = intArray49;
        grafo41.prox = intArray49;
        grafo41.insereAresta((int) '4', 0, 0);
        int[] intArray56 = grafo41.prox;
        grafo34.peso = intArray56;
        grafo1.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) 'a');
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 0);
        int[] intArray70 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo64.peso = intArray70;
        grafo62.prox = intArray70;
        grafo60.cab = intArray70;
        ds.Grafo.Aresta aresta75 = grafo60.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 0);
        int[] intArray85 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo79.peso = intArray85;
        grafo77.prox = intArray85;
        grafo77.insereAresta((int) '4', 0, 0);
        int[] intArray92 = grafo77.prox;
        grafo60.cab = intArray92;
        grafo1.prox = intArray92;
        int int95 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 97, (int) (byte) 100);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int[] intArray7 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo10.insereAresta((int) '4', 0, 0);
        int[] intArray25 = grafo10.prox;
        grafo1.cab = intArray25;
        int int27 = grafo1.numVertices();
        int[] intArray28 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        int[] intArray20 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo14.peso = intArray20;
        grafo12.prox = intArray20;
        ds.Grafo grafo23 = grafo12.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta27 = grafo25.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 0);
        int int30 = grafo29.numVertices();
        int[] intArray31 = null;
        grafo29.prox = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        int[] intArray40 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo34.peso = intArray40;
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        int[] intArray51 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo45.peso = intArray51;
        grafo43.prox = intArray51;
        grafo34.peso = intArray51;
        ds.Grafo grafo56 = new ds.Grafo((int) 'a');
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        int[] intArray66 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo60.peso = intArray66;
        grafo58.prox = intArray66;
        grafo56.cab = intArray66;
        ds.Grafo.Aresta aresta71 = grafo56.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 0);
        int[] intArray81 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo75.peso = intArray81;
        grafo73.prox = intArray81;
        grafo73.insereAresta((int) '4', 0, 0);
        int[] intArray88 = grafo73.prox;
        grafo56.cab = intArray88;
        grafo34.prox = intArray88;
        grafo29.peso = intArray88;
        grafo25.peso = intArray88;
        grafo12.cab = intArray88;
        grafo1.prox = intArray88;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        grafo1.insereAresta(97, (int) (byte) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo1.retiraAresta(0, 97);
        int int14 = aresta13.peso();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(52);
        ds.Grafo grafo17 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        int[] intArray39 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo33.peso = intArray39;
        grafo31.prox = intArray39;
        grafo31.insereAresta((int) '4', 0, 0);
        int[] intArray46 = grafo31.prox;
        grafo22.cab = intArray46;
        grafo17.peso = intArray46;
        grafo15.peso = intArray46;
        grafo1.prox = intArray46;
        ds.Grafo grafo52 = new ds.Grafo(52);
        ds.Grafo grafo54 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta57 = grafo54.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 0);
        int[] intArray65 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo59.peso = intArray65;
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        int[] intArray76 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo70.peso = intArray76;
        grafo68.prox = intArray76;
        grafo68.insereAresta((int) '4', 0, 0);
        int[] intArray83 = grafo68.prox;
        grafo59.cab = intArray83;
        grafo54.peso = intArray83;
        grafo52.peso = intArray83;
        grafo1.prox = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta89 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo.Aresta aresta39 = grafo1.primeiroListaAdj((int) (byte) 1);
        int[] intArray40 = grafo1.cab;
        int int41 = grafo1.numVertices();
        int[] intArray42 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo1.peso = intArray11;
        ds.Grafo grafo15 = new ds.Grafo(0);
        grafo15.imprime();
        int int17 = grafo15.numVertices();
        boolean boolean20 = grafo15.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        int[] intArray30 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo24.peso = intArray30;
        grafo22.prox = intArray30;
        grafo22.insereAresta((int) '4', 0, 0);
        int[] intArray37 = grafo22.prox;
        grafo15.peso = intArray37;
        boolean boolean40 = grafo15.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo42 = new ds.Grafo(52);
        ds.Grafo grafo44 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta47 = grafo44.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        int[] intArray55 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo49.peso = intArray55;
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        int[] intArray66 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo60.peso = intArray66;
        grafo58.prox = intArray66;
        grafo58.insereAresta((int) '4', 0, 0);
        int[] intArray73 = grafo58.prox;
        grafo49.cab = intArray73;
        grafo44.peso = intArray73;
        grafo42.peso = intArray73;
        grafo15.peso = intArray73;
        grafo1.peso = intArray73;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int) (short) 1);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        int[] intArray10 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo4.peso = intArray10;
        grafo1.prox = intArray10;
        int int13 = grafo1.numVertices();
        int[] intArray14 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', 10);
        boolean boolean13 = grafo1.existeAresta((int) (short) 0, (int) 'a');
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 0);
        grafo16.insereAresta(32, 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo(0);
        grafo3.imprime();
        int int5 = grafo3.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 0);
        int[] intArray13 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo7.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        int[] intArray24 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo18.peso = intArray24;
        grafo16.prox = intArray24;
        grafo16.insereAresta((int) '4', 0, 0);
        int[] intArray31 = grafo16.prox;
        grafo7.cab = intArray31;
        grafo3.peso = intArray31;
        grafo1.cab = intArray31;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta37 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo36.cab = intArray46;
        ds.Grafo.Aresta aresta51 = grafo36.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        int[] intArray61 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo55.peso = intArray61;
        grafo53.prox = intArray61;
        grafo53.insereAresta((int) '4', 0, 0);
        int[] intArray68 = grafo53.prox;
        grafo36.cab = intArray68;
        int[] intArray70 = grafo36.cab;
        grafo1.cab = intArray70;
        java.lang.Class<?> wildcardClass72 = intArray70.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (byte) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo14.insereAresta((int) '4', 0, 0);
        int[] intArray29 = grafo14.prox;
        grafo5.cab = intArray29;
        grafo1.peso = intArray29;
        boolean boolean34 = grafo1.existeAresta(1, 0);
        int[] intArray35 = grafo1.peso;
        ds.Grafo grafo36 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo36);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        int[] intArray26 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo20.peso = intArray26;
        grafo18.prox = intArray26;
        grafo18.insereAresta((int) '4', 0, 0);
        int[] intArray33 = grafo18.prox;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) 'a');
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        int[] intArray46 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo40.peso = intArray46;
        grafo38.prox = intArray46;
        grafo36.cab = intArray46;
        ds.Grafo.Aresta aresta51 = grafo36.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        int[] intArray61 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo55.peso = intArray61;
        grafo53.prox = intArray61;
        grafo53.insereAresta((int) '4', 0, 0);
        int[] intArray68 = grafo53.prox;
        grafo36.cab = intArray68;
        int[] intArray70 = grafo36.cab;
        grafo1.cab = intArray70;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        int[] intArray10 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo4.peso = intArray10;
        grafo1.prox = intArray10;
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo14 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        int[] intArray16 = grafo1.prox;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo(1);
        grafo19.imprime();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        int[] intArray28 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo22.peso = intArray28;
        grafo19.prox = intArray28;
        grafo17.peso = intArray28;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        grafo1.insereAresta((int) '4', 0, 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        grafo1.imprime();
        int[] intArray18 = grafo1.prox;
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) 'a');
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, 1);
        ds.Grafo grafo12 = new ds.Grafo((int) 'a');
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        grafo14.prox = intArray22;
        grafo12.cab = intArray22;
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        int[] intArray44 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo38.peso = intArray44;
        grafo36.prox = intArray44;
        grafo27.peso = intArray44;
        grafo12.peso = intArray44;
        int[] intArray49 = grafo12.cab;
        grafo1.peso = intArray49;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, 0);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), (int) (byte) 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo7 = new ds.Grafo((int) 'a');
        grafo7.imprime();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        boolean boolean11 = grafo7.listaAdjVazia((int) (byte) 1);
        grafo7.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        int[] intArray20 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo14.peso = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        grafo23.prox = intArray31;
        grafo23.insereAresta((int) '4', 0, 0);
        int[] intArray38 = grafo23.prox;
        grafo14.cab = intArray38;
        grafo7.peso = intArray38;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta43 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        int[] intArray16 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo10.peso = intArray16;
        grafo8.prox = intArray16;
        grafo8.insereAresta((int) '4', 0, 0);
        int[] intArray23 = grafo8.prox;
        grafo1.peso = intArray23;
        boolean boolean27 = grafo1.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo28 = grafo1.grafoTransposto();
        int int29 = grafo28.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) '#');
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        int[] intArray42 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo36.peso = intArray42;
        grafo34.prox = intArray42;
        grafo34.insereAresta((int) '4', 0, 0);
        int[] intArray49 = grafo34.prox;
        grafo25.cab = intArray49;
        grafo20.peso = intArray49;
        ds.Grafo grafo52 = grafo20.grafoTransposto();
        int[] intArray53 = grafo20.peso;
        ds.Grafo grafo55 = new ds.Grafo((int) 'a');
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 0);
        int[] intArray65 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo59.peso = intArray65;
        grafo57.prox = intArray65;
        grafo55.cab = intArray65;
        grafo20.peso = intArray65;
        grafo1.cab = intArray65;
        int[] intArray71 = null;
        grafo1.cab = intArray71;
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(1, (int) '4');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) '4', (int) '4', (int) (short) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 0);
        int[] intArray18 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo12.peso = intArray18;
        grafo10.prox = intArray18;
        grafo8.cab = intArray18;
        ds.Grafo.Aresta aresta23 = grafo8.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo25.insereAresta((int) '4', 0, 0);
        int[] intArray40 = grafo25.prox;
        grafo8.cab = intArray40;
        int[] intArray42 = grafo8.cab;
        grafo1.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) 'a');
        ds.Grafo grafo47 = new ds.Grafo(0);
        grafo47.imprime();
        int int49 = grafo47.numVertices();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 0);
        int[] intArray57 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo51.peso = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        int[] intArray68 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo62.peso = intArray68;
        grafo60.prox = intArray68;
        grafo60.insereAresta((int) '4', 0, 0);
        int[] intArray75 = grafo60.prox;
        grafo51.cab = intArray75;
        grafo47.peso = intArray75;
        grafo45.cab = intArray75;
        grafo1.peso = intArray75;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        int[] intArray9 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo3.peso = intArray9;
        grafo1.prox = intArray9;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo16 = new ds.Grafo(0);
        grafo16.imprime();
        int int18 = grafo16.numVertices();
        boolean boolean21 = grafo16.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        int[] intArray31 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo25.peso = intArray31;
        grafo23.prox = intArray31;
        grafo23.insereAresta((int) '4', 0, 0);
        int[] intArray38 = grafo23.prox;
        grafo16.peso = intArray38;
        boolean boolean42 = grafo16.existeAresta((int) (byte) 0, (int) (byte) -1);
        ds.Grafo grafo43 = grafo16.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        int[] intArray51 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo45.peso = intArray51;
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        int[] intArray62 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo56.peso = intArray62;
        grafo54.prox = intArray62;
        grafo45.peso = intArray62;
        grafo16.peso = intArray62;
        grafo14.cab = intArray62;
        grafo12.prox = intArray62;
        grafo12.imprime();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[97, 0, 32, -1, 52]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        int[] intArray22 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo16.peso = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        int[] intArray33 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo27.peso = intArray33;
        grafo25.prox = intArray33;
        grafo16.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        grafo38.imprime();
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 0, (int) 'a');
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        int[] intArray52 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo46.peso = intArray52;
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 0);
        int[] intArray63 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo57.peso = intArray63;
        grafo55.prox = intArray63;
        grafo55.insereAresta((int) '4', 0, 0);
        int[] intArray70 = grafo55.prox;
        grafo46.cab = intArray70;
        grafo41.peso = intArray70;
        grafo38.cab = intArray70;
        // The following exception was thrown during execution in test generation
        try {
            grafo38.insereAresta((int) (byte) 100, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 32, -1, 52]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 32, -1, 52]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        int[] intArray11 = new int[] { 'a', (byte) 0, ' ', (short) -1, '4' };
        grafo5.peso = intArray11;
        grafo3.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 32, -1, 52]");
        org.junit.Assert.assertNull(aresta17);
    }
}

