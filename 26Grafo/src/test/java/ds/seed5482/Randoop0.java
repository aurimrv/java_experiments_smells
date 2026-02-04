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
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) 'a', 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo(100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo27 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo(35);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        grafo1.peso = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.existeAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo13 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta((int) (byte) -1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo1.listaAdjVazia((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo5.cab = intArray23;
        java.lang.Class<?> wildcardClass26 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 1, (int) (byte) 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 100, (int) ' ');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo30 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) 'a');
        grafo8.imprime();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = grafo14.grafoTransposto();
        int[] intArray21 = new int[] { 35, (short) -1, '#' };
        grafo14.cab = intArray21;
        grafo12.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        int[] intArray30 = new int[] { 1, (short) 0, 10, 10 };
        grafo25.cab = intArray30;
        grafo12.cab = intArray30;
        grafo1.cab = intArray30;
        java.lang.Class<?> wildcardClass34 = intArray30.getClass();
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        int[] intArray8 = new int[] { 1, (short) 0, 10, 10 };
        grafo3.cab = intArray8;
        grafo1.peso = intArray8;
        ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo29 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = grafo1.existeAresta((-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta((int) ' ', (int) (short) -1, 100);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 1, (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo5.cab = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo5.retiraAresta((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(35, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) 'a');
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo9.cab = intArray35;
        grafo1.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo41 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.insereAresta((int) (short) 100, (int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 10);
        int[] intArray10 = new int[] { '#', 0, (byte) 10 };
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo12 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0, 10]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo1.existeAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
        int int11 = aresta10.v2();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta43 = grafo41.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta45 = grafo41.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta48 = grafo41.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo51 = grafo50.grafoTransposto();
        ds.Grafo.Aresta aresta53 = grafo50.proxAdj(35);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta57 = grafo55.proxAdj((int) 'a');
        grafo55.imprime();
        ds.Grafo grafo59 = grafo55.grafoTransposto();
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo64 = grafo61.grafoTransposto();
        int[] intArray68 = new int[] { 35, (short) -1, '#' };
        grafo61.cab = intArray68;
        grafo59.prox = intArray68;
        grafo50.peso = intArray68;
        grafo41.cab = intArray68;
        grafo1.prox = intArray68;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(grafo59);
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[35, -1, 35]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        int[] intArray6 = null;
        grafo1.prox = intArray6;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int) (short) 1, 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        int[] intArray11 = new int[] { (short) 10, (short) 1 };
        grafo8.cab = intArray11;
        grafo1.prox = intArray11;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo10.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo20 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo19.proxAdj(35);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) 'a');
        grafo24.imprime();
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) (short) 1);
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        int[] intArray37 = new int[] { 35, (short) -1, '#' };
        grafo30.cab = intArray37;
        grafo28.prox = intArray37;
        grafo19.peso = intArray37;
        grafo10.cab = intArray37;
        grafo1.prox = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo43 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35, -1, 35]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        grafo1.imprime();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 100, (int) (byte) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo5.cab = intArray27;
        int[] intArray31 = null;
        grafo5.cab = intArray31;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        int[] intArray8 = new int[] { 1, (short) 0, 10, 10 };
        grafo3.cab = intArray8;
        grafo1.peso = intArray8;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 10, 10]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(aresta12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 100, (int) (short) 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo.Aresta aresta40 = grafo1.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta40);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 10);
        int[] intArray10 = new int[] { '#', 0, (byte) 10 };
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0, 10]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray19 = new int[] { 1, (short) 0, 10, 10 };
        grafo14.cab = intArray19;
        grafo10.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        int[] intArray32 = new int[] { 1, (short) 0, 10, 10 };
        grafo27.cab = intArray32;
        grafo23.prox = intArray32;
        grafo10.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo10.proxAdj((int) (short) 1);
        int[] intArray38 = grafo10.prox;
        grafo1.peso = intArray38;
        java.lang.Class<?> wildcardClass40 = intArray38.getClass();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (-1), (int) 'a');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo(97);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = aresta4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) 'a');
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo9.cab = intArray35;
        grafo1.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = grafo1.existeAresta((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) 'a');
        grafo8.imprime();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = grafo14.grafoTransposto();
        int[] intArray21 = new int[] { 35, (short) -1, '#' };
        grafo14.cab = intArray21;
        grafo12.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        int[] intArray30 = new int[] { 1, (short) 0, 10, 10 };
        grafo25.cab = intArray30;
        grafo12.cab = intArray30;
        grafo1.cab = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo34 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (-1), (int) 'a');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, 97);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        int[] intArray11 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 35]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { (short) 10, (short) 1 };
        grafo32.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass39 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        grafo1.peso = intArray22;
        ds.Grafo grafo26 = grafo1.grafoTransposto();
        grafo26.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo26);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { (short) 10, (short) 1 };
        grafo32.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta41 = grafo1.retiraAresta((int) '#', 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta41);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta((int) ' ', (int) (short) -1, 100);
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = aresta28.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        java.lang.Class<?> wildcardClass17 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.insereAresta((int) (short) 100, (int) (short) 100, (int) '4');
        boolean boolean7 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), (int) (byte) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.insereAresta((int) (short) 100, (int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = aresta12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo(10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, (int) (short) -1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo(32);
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        int[] intArray17 = new int[] { 1, (short) 0, 10, 10 };
        grafo12.cab = intArray17;
        grafo8.prox = intArray17;
        grafo6.peso = intArray17;
        grafo1.prox = intArray17;
        int[] intArray22 = grafo1.prox;
        int[] intArray23 = grafo1.prox;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) (short) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        int[] intArray39 = new int[] { 1, (short) 0, 10, 10 };
        grafo34.cab = intArray39;
        grafo30.prox = intArray39;
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta45 = grafo43.proxAdj((int) (short) 1);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 100);
        int[] intArray52 = new int[] { 1, (short) 0, 10, 10 };
        grafo47.cab = intArray52;
        grafo43.prox = intArray52;
        grafo30.cab = intArray52;
        ds.Grafo.Aresta aresta57 = grafo30.proxAdj((int) (short) 1);
        int[] intArray58 = grafo30.cab;
        grafo8.cab = intArray58;
        grafo2.prox = intArray58;
        boolean boolean62 = grafo2.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(97);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) 'a');
        grafo8.imprime();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = grafo14.grafoTransposto();
        int[] intArray21 = new int[] { 35, (short) -1, '#' };
        grafo14.cab = intArray21;
        grafo12.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        int[] intArray30 = new int[] { 1, (short) 0, 10, 10 };
        grafo25.cab = intArray30;
        grafo12.cab = intArray30;
        grafo1.cab = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = grafo1.existeAresta((int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo14.peso = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = grafo25.grafoTransposto();
        int[] intArray32 = new int[] { 35, (short) -1, '#' };
        grafo25.cab = intArray32;
        grafo14.prox = intArray32;
        grafo12.cab = intArray32;
        int[] intArray36 = grafo12.cab;
        int[] intArray38 = new int[] { (byte) 1 };
        grafo12.prox = intArray38;
        java.lang.Class<?> wildcardClass40 = grafo12.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        int[] intArray11 = grafo1.cab;
        ds.Grafo grafo13 = new ds.Grafo(100);
        grafo13.imprime();
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) 'a');
        grafo16.imprime();
        ds.Grafo grafo20 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo20.proxAdj((int) (short) 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        int[] intArray33 = new int[] { 1, (short) 0, 10, 10 };
        grafo28.cab = intArray33;
        grafo24.prox = intArray33;
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta39 = grafo37.proxAdj((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        int[] intArray46 = new int[] { 1, (short) 0, 10, 10 };
        grafo41.cab = intArray46;
        grafo37.prox = intArray46;
        grafo24.cab = intArray46;
        grafo20.cab = intArray46;
        grafo13.cab = intArray46;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        int[] intArray58 = new int[] { 1, (short) 0, 10, 10 };
        grafo53.cab = intArray58;
        grafo13.prox = intArray58;
        grafo1.peso = intArray58;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 0, 10, 10]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '4', (int) (byte) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo1.existeAresta(35, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo12.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.retiraAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo1.prox = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 10, 10]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 1, 100, 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) ' ', 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        int int12 = grafo11.numVertices();
        int int13 = grafo11.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 100);
        int[] intArray20 = new int[] { 1, (short) 0, 10, 10 };
        grafo15.cab = intArray20;
        grafo11.cab = intArray20;
        grafo11.imprime();
        ds.Grafo.Aresta aresta26 = grafo11.retiraAresta((int) (short) 100, 32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta34 = grafo32.proxAdj((int) 'a');
        grafo32.imprime();
        ds.Grafo grafo36 = grafo32.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj((int) (short) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta42 = grafo40.proxAdj((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 100);
        int[] intArray49 = new int[] { 1, (short) 0, 10, 10 };
        grafo44.cab = intArray49;
        grafo40.prox = intArray49;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        int[] intArray62 = new int[] { 1, (short) 0, 10, 10 };
        grafo57.cab = intArray62;
        grafo53.prox = intArray62;
        grafo40.cab = intArray62;
        grafo36.cab = intArray62;
        grafo1.peso = intArray62;
        ds.Grafo.Aresta aresta69 = grafo1.proxAdj(10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta69);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 100, 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo10.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo20 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo19.proxAdj(35);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) 'a');
        grafo24.imprime();
        ds.Grafo grafo28 = grafo24.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) (short) 1);
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        int[] intArray37 = new int[] { 35, (short) -1, '#' };
        grafo30.cab = intArray37;
        grafo28.prox = intArray37;
        grafo19.peso = intArray37;
        grafo10.cab = intArray37;
        grafo1.prox = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = grafo1.existeAresta(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35, -1, 35]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.retiraAresta((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray19 = new int[] { 1, (short) 0, 10, 10 };
        grafo14.cab = intArray19;
        grafo10.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        int[] intArray32 = new int[] { 1, (short) 0, 10, 10 };
        grafo27.cab = intArray32;
        grafo23.prox = intArray32;
        grafo10.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo10.proxAdj((int) (short) 1);
        int[] intArray38 = grafo10.prox;
        grafo1.peso = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta41 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        int[] intArray16 = new int[] { 1, (short) 0, 10, 10 };
        grafo11.cab = intArray16;
        grafo7.prox = intArray16;
        grafo5.peso = intArray16;
        grafo1.cab = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 10, 10]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 35, 35);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 100, 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo7.peso = intArray31;
        grafo1.peso = intArray31;
        int int37 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, (int) '4');
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 10, 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        java.lang.Class<?> wildcardClass39 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass8 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo1.retiraAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        int[] intArray11 = grafo1.cab;
        boolean boolean13 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta((int) (short) 10, (int) (short) 10, 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        grafo7.insereAresta(100, 0, (int) ' ');
        grafo7.imprime();
        ds.Grafo.Aresta aresta14 = grafo7.primeiroListaAdj(10);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta20 = grafo16.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo26 = grafo25.grafoTransposto();
        ds.Grafo.Aresta aresta28 = grafo25.proxAdj(35);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) 'a');
        grafo30.imprime();
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = grafo36.grafoTransposto();
        int[] intArray43 = new int[] { 35, (short) -1, '#' };
        grafo36.cab = intArray43;
        grafo34.prox = intArray43;
        grafo25.peso = intArray43;
        grafo16.cab = intArray43;
        grafo7.prox = intArray43;
        grafo1.prox = intArray43;
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35, -1, 35]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) 1, 32);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 32, 32);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        boolean boolean41 = grafo1.existeAresta((int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, 97);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 100);
        grafo8.insereAresta(100, 0, (int) ' ');
        grafo8.imprime();
        ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj(10);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo17.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta24 = grafo17.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo27 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.proxAdj(35);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) 'a');
        grafo31.imprime();
        ds.Grafo grafo35 = grafo31.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta39 = grafo37.proxAdj((int) (short) 1);
        ds.Grafo grafo40 = grafo37.grafoTransposto();
        int[] intArray44 = new int[] { 35, (short) -1, '#' };
        grafo37.cab = intArray44;
        grafo35.prox = intArray44;
        grafo26.peso = intArray44;
        grafo17.cab = intArray44;
        grafo8.prox = intArray44;
        grafo1.peso = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 0, 0);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 0, 0);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        java.lang.Class<?> wildcardClass15 = grafo14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        grafo4.insereAresta((int) (short) 10, (int) 'a', 100);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta29 = grafo27.proxAdj((int) (short) 1);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo27.prox = intArray36;
        grafo14.cab = intArray36;
        ds.Grafo.Aresta aresta41 = grafo14.proxAdj((int) (short) 1);
        int[] intArray42 = grafo14.cab;
        grafo4.peso = intArray42;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 0, 10, 10]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo11.peso = intArray35;
        grafo1.peso = intArray35;
        int[] intArray41 = grafo1.peso;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 10, 10]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) '#');
        grafo1.imprime();
        grafo1.insereAresta(97, 0, (int) ' ');
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta22 = grafo20.proxAdj((int) (short) 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo20.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        int[] intArray42 = new int[] { 1, (short) 0, 10, 10 };
        grafo37.cab = intArray42;
        grafo33.prox = intArray42;
        grafo20.cab = intArray42;
        grafo18.peso = intArray42;
        int[] intArray47 = grafo18.peso;
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int) 'a');
        grafo49.imprime();
        ds.Grafo grafo53 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta59 = grafo57.proxAdj((int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        int[] intArray66 = new int[] { 1, (short) 0, 10, 10 };
        grafo61.cab = intArray66;
        grafo57.prox = intArray66;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta72 = grafo70.proxAdj((int) (short) 1);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 100);
        int[] intArray79 = new int[] { 1, (short) 0, 10, 10 };
        grafo74.cab = intArray79;
        grafo70.prox = intArray79;
        grafo57.cab = intArray79;
        grafo53.cab = intArray79;
        grafo18.peso = intArray79;
        grafo1.cab = intArray79;
        java.lang.Class<?> wildcardClass86 = intArray79.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 100, 97, (int) (short) 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        grafo1.peso = intArray22;
        boolean boolean27 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        grafo5.imprime();
        ds.Grafo.Aresta aresta8 = grafo5.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo12.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 100);
        int[] intArray34 = new int[] { 1, (short) 0, 10, 10 };
        grafo29.cab = intArray34;
        grafo25.prox = intArray34;
        grafo12.cab = intArray34;
        grafo8.cab = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        int[] intArray46 = new int[] { 1, (short) 0, 10, 10 };
        grafo41.cab = intArray46;
        grafo1.prox = intArray46;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta50 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 0, 10, 10]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta34 = grafo32.proxAdj((int) 'a');
        grafo32.imprime();
        ds.Grafo grafo36 = grafo32.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj((int) (short) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta42 = grafo40.proxAdj((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 100);
        int[] intArray49 = new int[] { 1, (short) 0, 10, 10 };
        grafo44.cab = intArray49;
        grafo40.prox = intArray49;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        int[] intArray62 = new int[] { 1, (short) 0, 10, 10 };
        grafo57.cab = intArray62;
        grafo53.prox = intArray62;
        grafo40.cab = intArray62;
        grafo36.cab = intArray62;
        grafo1.peso = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        grafo1.imprime();
        ds.Grafo.Aresta aresta48 = grafo1.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta48);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        boolean boolean8 = grafo5.listaAdjVazia((int) '#');
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) 'a');
        grafo10.imprime();
        boolean boolean16 = grafo10.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean19 = grafo10.existeAresta((int) (byte) 1, (int) '4');
        int int20 = grafo10.numVertices();
        ds.Grafo grafo21 = grafo10.grafoTransposto();
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        int[] intArray30 = new int[] { 1, (short) 0, 10, 10 };
        grafo25.cab = intArray30;
        grafo23.peso = intArray30;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta36 = grafo34.proxAdj((int) (short) 1);
        ds.Grafo grafo37 = grafo34.grafoTransposto();
        int[] intArray41 = new int[] { 35, (short) -1, '#' };
        grafo34.cab = intArray41;
        grafo23.prox = intArray41;
        grafo21.cab = intArray41;
        grafo5.peso = intArray41;
        ds.Grafo.Aresta aresta47 = grafo5.proxAdj((int) ' ');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta47);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) 'a');
        grafo6.imprime();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        int[] intArray19 = new int[] { 35, (short) -1, '#' };
        grafo12.cab = intArray19;
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        grafo24.insereAresta(100, 0, (int) ' ');
        grafo24.imprime();
        ds.Grafo.Aresta aresta31 = grafo24.primeiroListaAdj(10);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta37 = grafo33.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta40 = grafo33.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo43 = grafo42.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo42.proxAdj(35);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta49 = grafo47.proxAdj((int) 'a');
        grafo47.imprime();
        ds.Grafo grafo51 = grafo47.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo56 = grafo53.grafoTransposto();
        int[] intArray60 = new int[] { 35, (short) -1, '#' };
        grafo53.cab = intArray60;
        grafo51.prox = intArray60;
        grafo42.peso = intArray60;
        grafo33.cab = intArray60;
        grafo24.prox = intArray60;
        grafo1.prox = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo67 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35, -1, 35]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo(35);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 100, (int) (byte) 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) ' ', 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo2.prox = intArray26;
        ds.Grafo.Aresta aresta31 = grafo2.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta31);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        int[] intArray15 = new int[] { 1, (short) 0, 10, 10 };
        grafo10.cab = intArray15;
        grafo6.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        int[] intArray28 = new int[] { 1, (short) 0, 10, 10 };
        grafo23.cab = intArray28;
        grafo19.prox = intArray28;
        grafo6.cab = intArray28;
        grafo4.peso = intArray28;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        int[] intArray39 = new int[] { 1, (short) 0, 10, 10 };
        grafo34.cab = intArray39;
        grafo4.cab = intArray39;
        grafo1.cab = intArray39;
        int int43 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { (short) 10, (short) 1 };
        grafo32.cab = intArray35;
        grafo1.peso = intArray35;
        ds.Grafo grafo38 = grafo1.grafoTransposto();
        boolean boolean40 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) 'a');
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo9.cab = intArray35;
        grafo1.prox = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta42 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo9.imprime();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (short) 1);
        boolean boolean9 = grafo5.listaAdjVazia(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(35);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) 'a');
        grafo15.imprime();
        boolean boolean21 = grafo15.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean24 = grafo15.existeAresta((int) (byte) 1, (int) '4');
        int int25 = grafo15.numVertices();
        ds.Grafo grafo26 = grafo15.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) 'a');
        grafo28.imprime();
        ds.Grafo grafo32 = grafo28.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta36 = grafo34.proxAdj((int) (short) 1);
        ds.Grafo grafo37 = grafo34.grafoTransposto();
        int[] intArray41 = new int[] { 35, (short) -1, '#' };
        grafo34.cab = intArray41;
        grafo32.prox = intArray41;
        grafo26.prox = intArray41;
        int[] intArray45 = new int[] {};
        grafo26.cab = intArray45;
        grafo1.peso = intArray45;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo39.insereAresta((int) (short) -1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) ' ');
        grafo8.insereAresta(0, (int) (byte) 0, 97);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(97, (int) (short) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj(0);
        int int11 = grafo6.numVertices();
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo6.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) 'a');
        grafo17.imprime();
        boolean boolean23 = grafo17.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean26 = grafo17.existeAresta((int) (byte) 1, (int) '4');
        int int27 = grafo17.numVertices();
        ds.Grafo grafo28 = grafo17.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) 'a');
        grafo30.imprime();
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = grafo36.grafoTransposto();
        int[] intArray43 = new int[] { 35, (short) -1, '#' };
        grafo36.cab = intArray43;
        grafo34.prox = intArray43;
        grafo28.prox = intArray43;
        grafo6.peso = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35, -1, 35]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, 97);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 100);
        grafo8.insereAresta(100, 0, (int) ' ');
        grafo8.imprime();
        ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj(10);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo17.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta24 = grafo17.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo27 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.proxAdj(35);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) 'a');
        grafo31.imprime();
        ds.Grafo grafo35 = grafo31.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta39 = grafo37.proxAdj((int) (short) 1);
        ds.Grafo grafo40 = grafo37.grafoTransposto();
        int[] intArray44 = new int[] { 35, (short) -1, '#' };
        grafo37.cab = intArray44;
        grafo35.prox = intArray44;
        grafo26.peso = intArray44;
        grafo17.cab = intArray44;
        grafo8.prox = intArray44;
        grafo1.peso = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta53 = grafo1.retiraAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo7.peso = intArray31;
        grafo1.peso = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, 97);
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 100);
        grafo1.imprime();
        boolean boolean11 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) ' ', 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) ' ', 100);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo1.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo grafo44 = new ds.Grafo((int) '#');
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 100);
        int[] intArray70 = new int[] { 1, (short) 0, 10, 10 };
        grafo65.cab = intArray70;
        grafo61.prox = intArray70;
        grafo48.cab = intArray70;
        grafo46.peso = intArray70;
        int[] intArray75 = grafo46.peso;
        grafo44.peso = intArray75;
        grafo1.cab = intArray75;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = grafo1.existeAresta((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 0, 10, 10]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        boolean boolean11 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        int[] intArray17 = new int[] { 1, (short) 0, 10, 10 };
        grafo12.cab = intArray17;
        grafo8.prox = intArray17;
        grafo6.peso = intArray17;
        grafo1.prox = intArray17;
        int[] intArray22 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo23 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo10.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        int[] intArray44 = new int[] { 1, (short) 0, 10, 10 };
        grafo39.cab = intArray44;
        grafo35.prox = intArray44;
        grafo22.cab = intArray44;
        grafo20.peso = intArray44;
        grafo10.peso = intArray44;
        grafo1.peso = intArray44;
        int[] intArray57 = new int[] { 'a', 0, (byte) 100, 'a', (short) 1, 10 };
        grafo1.prox = intArray57;
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, 0, 100, 97, 1, 10]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        int int12 = grafo11.numVertices();
        int int13 = grafo11.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 100);
        int[] intArray20 = new int[] { 1, (short) 0, 10, 10 };
        grafo15.cab = intArray20;
        grafo11.cab = intArray20;
        ds.Grafo.Aresta aresta25 = grafo11.retiraAresta((int) ' ', (int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo39.retiraAresta(0, (int) (short) -1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta42);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta((int) (byte) 1, 10);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) '#');
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        int[] intArray19 = new int[] { 35, (short) -1, '#' };
        grafo12.cab = intArray19;
        int[] intArray21 = grafo12.cab;
        grafo1.peso = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo27 = grafo26.grafoTransposto();
        ds.Grafo.Aresta aresta29 = grafo26.proxAdj(35);
        ds.Grafo.Aresta aresta31 = grafo26.proxAdj((int) (byte) 10);
        int[] intArray35 = new int[] { '#', 0, (byte) 10 };
        grafo26.prox = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta40 = grafo38.proxAdj((int) 'a');
        grafo38.imprime();
        boolean boolean44 = grafo38.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean47 = grafo38.existeAresta((int) (byte) 1, (int) '4');
        int int48 = grafo38.numVertices();
        ds.Grafo grafo49 = grafo38.grafoTransposto();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta53 = grafo51.proxAdj((int) (short) 1);
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 100);
        int[] intArray60 = new int[] { 1, (short) 0, 10, 10 };
        grafo55.cab = intArray60;
        grafo51.prox = intArray60;
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta66 = grafo64.proxAdj((int) (short) 1);
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 100);
        int[] intArray73 = new int[] { 1, (short) 0, 10, 10 };
        grafo68.cab = intArray73;
        grafo64.prox = intArray73;
        grafo51.cab = intArray73;
        ds.Grafo.Aresta aresta78 = grafo51.proxAdj((int) (short) 1);
        int[] intArray79 = grafo51.cab;
        grafo38.peso = intArray79;
        grafo26.peso = intArray79;
        grafo24.peso = intArray79;
        grafo1.cab = intArray79;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNull(aresta29);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, 0, 10]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta78);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 0, 10, 10]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        int[] intArray16 = new int[] { 1, (short) 0, 10, 10 };
        grafo11.cab = intArray16;
        grafo7.prox = intArray16;
        grafo5.peso = intArray16;
        grafo1.cab = intArray16;
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) ' ', 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, (int) (short) 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo2.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo32 = grafo31.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta36 = grafo34.proxAdj((int) 'a');
        grafo34.imprime();
        ds.Grafo grafo38 = grafo34.grafoTransposto();
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta42 = grafo40.proxAdj((int) (short) 1);
        ds.Grafo grafo43 = grafo40.grafoTransposto();
        int[] intArray47 = new int[] { 35, (short) -1, '#' };
        grafo40.cab = intArray47;
        grafo38.prox = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 100);
        int[] intArray56 = new int[] { 1, (short) 0, 10, 10 };
        grafo51.cab = intArray56;
        grafo38.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta62 = grafo60.proxAdj((int) (short) 1);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 100);
        int[] intArray69 = new int[] { 1, (short) 0, 10, 10 };
        grafo64.cab = intArray69;
        grafo60.prox = intArray69;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta75 = grafo73.proxAdj((int) (short) 1);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 100);
        int[] intArray82 = new int[] { 1, (short) 0, 10, 10 };
        grafo77.cab = intArray82;
        grafo73.prox = intArray82;
        grafo60.cab = intArray82;
        ds.Grafo.Aresta aresta87 = grafo60.proxAdj((int) (short) 1);
        int[] intArray88 = grafo60.cab;
        grafo38.cab = intArray88;
        grafo32.prox = intArray88;
        grafo2.cab = intArray88;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 0, 10, 10]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        int[] intArray40 = grafo1.peso;
        ds.Grafo grafo41 = grafo1.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta45 = grafo43.proxAdj((int) (short) 1);
        ds.Grafo grafo46 = grafo43.grafoTransposto();
        int[] intArray50 = new int[] { 35, (short) -1, '#' };
        grafo43.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) 'a');
        grafo53.imprime();
        boolean boolean59 = grafo53.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean62 = grafo53.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo63 = grafo53.grafoTransposto();
        int int64 = grafo63.numVertices();
        int int65 = grafo63.numVertices();
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 100);
        int[] intArray72 = new int[] { 1, (short) 0, 10, 10 };
        grafo67.cab = intArray72;
        grafo63.cab = intArray72;
        grafo43.cab = intArray72;
        grafo41.peso = intArray72;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(grafo63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 10, 10]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 10);
        int[] intArray10 = new int[] { '#', 0, (byte) 10 };
        grafo1.prox = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) 'a');
        grafo13.imprime();
        boolean boolean19 = grafo13.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean22 = grafo13.existeAresta((int) (byte) 1, (int) '4');
        int int23 = grafo13.numVertices();
        ds.Grafo grafo24 = grafo13.grafoTransposto();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) (short) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        int[] intArray48 = new int[] { 1, (short) 0, 10, 10 };
        grafo43.cab = intArray48;
        grafo39.prox = intArray48;
        grafo26.cab = intArray48;
        ds.Grafo.Aresta aresta53 = grafo26.proxAdj((int) (short) 1);
        int[] intArray54 = grafo26.cab;
        grafo13.peso = intArray54;
        grafo1.peso = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, 10]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 0, 10, 10]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo5.cab = intArray27;
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 0, 32);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        grafo1.insereAresta(10, 0, (int) '4');
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        int[] intArray14 = new int[] { 35, (short) -1, '#' };
        grafo7.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo5.cab = intArray23;
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta31 = grafo29.proxAdj((int) (short) 1);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        int[] intArray38 = new int[] { 1, (short) 0, 10, 10 };
        grafo33.cab = intArray38;
        grafo29.prox = intArray38;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta44 = grafo42.proxAdj((int) (short) 1);
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 100);
        int[] intArray51 = new int[] { 1, (short) 0, 10, 10 };
        grafo46.cab = intArray51;
        grafo42.prox = intArray51;
        grafo29.cab = intArray51;
        grafo27.peso = intArray51;
        int[] intArray56 = grafo27.peso;
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta60 = grafo58.proxAdj((int) 'a');
        grafo58.imprime();
        ds.Grafo grafo62 = grafo58.grafoTransposto();
        ds.Grafo.Aresta aresta64 = grafo62.proxAdj((int) (short) 1);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta68 = grafo66.proxAdj((int) (short) 1);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 100);
        int[] intArray75 = new int[] { 1, (short) 0, 10, 10 };
        grafo70.cab = intArray75;
        grafo66.prox = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta81 = grafo79.proxAdj((int) (short) 1);
        ds.Grafo grafo83 = new ds.Grafo((int) (short) 100);
        int[] intArray88 = new int[] { 1, (short) 0, 10, 10 };
        grafo83.cab = intArray88;
        grafo79.prox = intArray88;
        grafo66.cab = intArray88;
        grafo62.cab = intArray88;
        grafo27.peso = intArray88;
        grafo5.cab = intArray88;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNull(aresta68);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta81);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 0, 10, 10]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 0, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) '#');
        int[] intArray12 = null;
        grafo1.peso = intArray12;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 0, 32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.prox;
        ds.Grafo grafo31 = new ds.Grafo((int) '#');
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        int[] intArray44 = new int[] { 1, (short) 0, 10, 10 };
        grafo39.cab = intArray44;
        grafo35.prox = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        grafo35.cab = intArray57;
        grafo33.peso = intArray57;
        int[] intArray62 = grafo33.peso;
        grafo31.peso = intArray62;
        grafo1.peso = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo(35);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        grafo1.imprime();
        int int47 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) 'a');
        grafo16.imprime();
        boolean boolean22 = grafo16.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean25 = grafo16.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo26 = grafo16.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) (short) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray37 = new int[] { 1, (short) 0, 10, 10 };
        grafo32.cab = intArray37;
        grafo28.prox = intArray37;
        grafo16.peso = intArray37;
        ds.Grafo grafo41 = grafo16.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo44 = grafo43.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo43.proxAdj(35);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) 'a');
        grafo48.imprime();
        ds.Grafo grafo52 = grafo48.grafoTransposto();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta56 = grafo54.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = grafo54.grafoTransposto();
        int[] intArray61 = new int[] { 35, (short) -1, '#' };
        grafo54.cab = intArray61;
        grafo52.prox = intArray61;
        grafo43.peso = intArray61;
        grafo41.peso = intArray61;
        grafo1.cab = intArray61;
        java.lang.Class<?> wildcardClass67 = intArray61.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int[] intArray4 = null;
        grafo1.peso = intArray4;
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(35);
        boolean boolean15 = grafo1.listaAdjVazia((int) ' ');
        java.lang.Class<?> wildcardClass16 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.cab;
        int[] intArray30 = null;
        grafo1.cab = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (byte) -1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(35);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) (short) 1);
        boolean boolean20 = grafo15.existeAresta((int) (byte) 0, (int) (short) 10);
        int int21 = grafo15.numVertices();
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo24 = grafo23.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo23.proxAdj(35);
        ds.Grafo.Aresta aresta28 = grafo23.proxAdj((int) (byte) 10);
        int[] intArray32 = new int[] { '#', 0, (byte) 10 };
        grafo23.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) 'a');
        grafo35.imprime();
        boolean boolean41 = grafo35.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean44 = grafo35.existeAresta((int) (byte) 1, (int) '4');
        int int45 = grafo35.numVertices();
        ds.Grafo grafo46 = grafo35.grafoTransposto();
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 100);
        int[] intArray70 = new int[] { 1, (short) 0, 10, 10 };
        grafo65.cab = intArray70;
        grafo61.prox = intArray70;
        grafo48.cab = intArray70;
        ds.Grafo.Aresta aresta75 = grafo48.proxAdj((int) (short) 1);
        int[] intArray76 = grafo48.cab;
        grafo35.peso = intArray76;
        grafo23.peso = intArray76;
        grafo15.peso = intArray76;
        grafo1.prox = intArray76;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, 0, 10]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(grafo46);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta75);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 0, 10, 10]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        int[] intArray40 = grafo1.peso;
        ds.Grafo grafo41 = grafo1.grafoTransposto();
        grafo41.insereAresta((int) (short) 0, (int) (short) 1, 0);
        ds.Grafo.Aresta aresta48 = grafo41.retiraAresta((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta48);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = aresta13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo14.peso = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = grafo25.grafoTransposto();
        int[] intArray32 = new int[] { 35, (short) -1, '#' };
        grafo25.cab = intArray32;
        grafo14.prox = intArray32;
        grafo12.cab = intArray32;
        int[] intArray36 = grafo12.cab;
        ds.Grafo.Aresta aresta38 = grafo12.proxAdj((int) '4');
        grafo12.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta38);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (-1), (int) (byte) 10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) '#');
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta31 = grafo29.proxAdj((int) (short) 1);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        int[] intArray38 = new int[] { 1, (short) 0, 10, 10 };
        grafo33.cab = intArray38;
        grafo29.prox = intArray38;
        grafo16.cab = intArray38;
        grafo14.peso = intArray38;
        grafo1.prox = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = grafo1.listaAdjVazia(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        int[] intArray15 = new int[] { 1, (short) 0, 10, 10 };
        grafo10.cab = intArray15;
        grafo6.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        int[] intArray28 = new int[] { 1, (short) 0, 10, 10 };
        grafo23.cab = intArray28;
        grafo19.prox = intArray28;
        grafo6.cab = intArray28;
        grafo4.peso = intArray28;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        int[] intArray39 = new int[] { 1, (short) 0, 10, 10 };
        grafo34.cab = intArray39;
        grafo4.cab = intArray39;
        grafo1.cab = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean14 = grafo1.existeAresta((int) (short) 0, 0);
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(1, (int) (short) 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo14.peso = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = grafo25.grafoTransposto();
        int[] intArray32 = new int[] { 35, (short) -1, '#' };
        grafo25.cab = intArray32;
        grafo14.prox = intArray32;
        grafo12.cab = intArray32;
        int int36 = grafo12.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta((int) ' ', (int) (short) -1, 100);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 100);
        grafo10.insereAresta(100, 0, (int) ' ');
        grafo10.imprime();
        ds.Grafo.Aresta aresta17 = grafo10.primeiroListaAdj(10);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta23 = grafo19.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta26 = grafo19.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo29 = grafo28.grafoTransposto();
        ds.Grafo.Aresta aresta31 = grafo28.proxAdj(35);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) 'a');
        grafo33.imprime();
        ds.Grafo grafo37 = grafo33.grafoTransposto();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) (short) 1);
        ds.Grafo grafo42 = grafo39.grafoTransposto();
        int[] intArray46 = new int[] { 35, (short) -1, '#' };
        grafo39.cab = intArray46;
        grafo37.prox = intArray46;
        grafo28.peso = intArray46;
        grafo19.cab = intArray46;
        grafo10.prox = intArray46;
        grafo1.prox = intArray46;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, -1, 35]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray17 = new int[] { (short) 10, (short) 1 };
        grafo14.cab = intArray17;
        grafo1.cab = intArray17;
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1]");
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '#', (int) (short) 10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) (short) 0);
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        grafo1.imprime();
        java.lang.Class<?> wildcardClass47 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 100, 32);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { (short) 10, (short) 1 };
        grafo32.cab = intArray35;
        grafo1.peso = intArray35;
        int[] intArray38 = grafo1.peso;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 1]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) 'a');
        grafo12.imprime();
        boolean boolean18 = grafo12.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean21 = grafo12.existeAresta((int) (byte) 1, (int) '4');
        int int22 = grafo12.numVertices();
        ds.Grafo grafo23 = grafo12.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) 'a');
        grafo25.imprime();
        ds.Grafo grafo29 = grafo25.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) (short) 1);
        ds.Grafo grafo34 = grafo31.grafoTransposto();
        int[] intArray38 = new int[] { 35, (short) -1, '#' };
        grafo31.cab = intArray38;
        grafo29.prox = intArray38;
        grafo23.prox = intArray38;
        grafo1.peso = intArray38;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        grafo44.insereAresta(100, 0, (int) ' ');
        grafo44.imprime();
        ds.Grafo.Aresta aresta51 = grafo44.primeiroListaAdj(10);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        int[] intArray62 = new int[] { 1, (short) 0, 10, 10 };
        grafo57.cab = intArray62;
        grafo53.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta68 = grafo66.proxAdj((int) (short) 1);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 100);
        int[] intArray75 = new int[] { 1, (short) 0, 10, 10 };
        grafo70.cab = intArray75;
        grafo66.prox = intArray75;
        grafo53.cab = intArray75;
        ds.Grafo.Aresta aresta80 = grafo53.proxAdj((int) (short) 1);
        int[] intArray81 = grafo53.prox;
        grafo44.peso = intArray81;
        grafo1.peso = intArray81;
        int int84 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta68);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta80);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo1.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo grafo44 = new ds.Grafo((int) '#');
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 100);
        int[] intArray70 = new int[] { 1, (short) 0, 10, 10 };
        grafo65.cab = intArray70;
        grafo61.prox = intArray70;
        grafo48.cab = intArray70;
        grafo46.peso = intArray70;
        int[] intArray75 = grafo46.peso;
        grafo44.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 100);
        int[] intArray82 = new int[] { (short) 10, (short) 1 };
        grafo79.cab = intArray82;
        grafo1.peso = intArray82;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[10, 1]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo1.retiraAresta((int) (short) 1, (int) '#');
        grafo1.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 100);
        int[] intArray50 = new int[] { 1, (short) 0, 10, 10 };
        grafo45.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) 'a');
        grafo53.imprime();
        boolean boolean59 = grafo53.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean62 = grafo53.existeAresta((int) (byte) 1, (int) '4');
        int int63 = grafo53.numVertices();
        ds.Grafo grafo64 = grafo53.grafoTransposto();
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 100);
        int[] intArray73 = new int[] { 1, (short) 0, 10, 10 };
        grafo68.cab = intArray73;
        grafo66.peso = intArray73;
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta79 = grafo77.proxAdj((int) (short) 1);
        ds.Grafo grafo80 = grafo77.grafoTransposto();
        int[] intArray84 = new int[] { 35, (short) -1, '#' };
        grafo77.cab = intArray84;
        grafo66.prox = intArray84;
        grafo64.cab = intArray84;
        int[] intArray88 = grafo64.cab;
        grafo45.cab = intArray88;
        grafo1.peso = intArray88;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta79);
        org.junit.Assert.assertNotNull(grafo80);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[35, -1, 35]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo5.cab = intArray31;
        int[] intArray36 = grafo5.cab;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo2.prox = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta(10, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        int int9 = grafo4.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta((-1), (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(35, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(aresta14);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo12.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 100);
        int[] intArray34 = new int[] { 1, (short) 0, 10, 10 };
        grafo29.cab = intArray34;
        grafo25.prox = intArray34;
        grafo12.cab = intArray34;
        grafo8.cab = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        int[] intArray46 = new int[] { 1, (short) 0, 10, 10 };
        grafo41.cab = intArray46;
        grafo1.prox = intArray46;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        grafo50.insereAresta(100, 0, (int) ' ');
        grafo50.imprime();
        ds.Grafo.Aresta aresta57 = grafo50.primeiroListaAdj(10);
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta61 = grafo59.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta63 = grafo59.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta66 = grafo59.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo69 = grafo68.grafoTransposto();
        ds.Grafo.Aresta aresta71 = grafo68.proxAdj(35);
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta75 = grafo73.proxAdj((int) 'a');
        grafo73.imprime();
        ds.Grafo grafo77 = grafo73.grafoTransposto();
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta81 = grafo79.proxAdj((int) (short) 1);
        ds.Grafo grafo82 = grafo79.grafoTransposto();
        int[] intArray86 = new int[] { 35, (short) -1, '#' };
        grafo79.cab = intArray86;
        grafo77.prox = intArray86;
        grafo68.peso = intArray86;
        grafo59.cab = intArray86;
        grafo50.prox = intArray86;
        grafo1.cab = intArray86;
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(grafo69);
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(grafo77);
        org.junit.Assert.assertNull(aresta81);
        org.junit.Assert.assertNotNull(grafo82);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[35, -1, 35]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        ds.Grafo.Aresta aresta48 = grafo1.retiraAresta(10, (int) (short) 10);
        int[] intArray49 = grafo1.cab;
        boolean boolean52 = grafo1.existeAresta((int) (short) 100, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        int[] intArray11 = grafo1.cab;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) (short) 1);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        int[] intArray24 = new int[] { 1, (short) 0, 10, 10 };
        grafo19.cab = intArray24;
        grafo15.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) (short) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray37 = new int[] { 1, (short) 0, 10, 10 };
        grafo32.cab = intArray37;
        grafo28.prox = intArray37;
        grafo15.cab = intArray37;
        grafo13.peso = intArray37;
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        int[] intArray48 = new int[] { 1, (short) 0, 10, 10 };
        grafo43.cab = intArray48;
        grafo13.cab = intArray48;
        grafo1.cab = intArray48;
        int[] intArray52 = grafo1.cab;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 0, 10, 10]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo7.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta14 = grafo7.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        int[] intArray28 = new int[] { 1, (short) 0, 10, 10 };
        grafo23.cab = intArray28;
        grafo19.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta34 = grafo32.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 100);
        int[] intArray41 = new int[] { 1, (short) 0, 10, 10 };
        grafo36.cab = intArray41;
        grafo32.prox = intArray41;
        grafo19.cab = intArray41;
        grafo17.peso = intArray41;
        grafo7.peso = intArray41;
        grafo5.peso = intArray41;
        java.lang.Class<?> wildcardClass48 = intArray41.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        grafo5.imprime();
        ds.Grafo grafo7 = grafo5.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) '#');
        grafo1.imprime();
        grafo1.insereAresta(97, 0, (int) ' ');
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta22 = grafo20.proxAdj((int) (short) 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo20.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        int[] intArray42 = new int[] { 1, (short) 0, 10, 10 };
        grafo37.cab = intArray42;
        grafo33.prox = intArray42;
        grafo20.cab = intArray42;
        grafo18.peso = intArray42;
        int[] intArray47 = grafo18.peso;
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int) 'a');
        grafo49.imprime();
        ds.Grafo grafo53 = grafo49.grafoTransposto();
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta59 = grafo57.proxAdj((int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        int[] intArray66 = new int[] { 1, (short) 0, 10, 10 };
        grafo61.cab = intArray66;
        grafo57.prox = intArray66;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta72 = grafo70.proxAdj((int) (short) 1);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 100);
        int[] intArray79 = new int[] { 1, (short) 0, 10, 10 };
        grafo74.cab = intArray79;
        grafo70.prox = intArray79;
        grafo57.cab = intArray79;
        grafo53.cab = intArray79;
        grafo18.peso = intArray79;
        grafo1.cab = intArray79;
        boolean boolean88 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta72);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta(0, 0, (int) (short) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) 'a');
        grafo7.imprime();
        boolean boolean13 = grafo7.existeAresta((int) (short) 1, (int) (short) 100);
        grafo7.insereAresta((int) (short) 100, 1, (int) '#');
        grafo7.imprime();
        grafo7.insereAresta(97, 0, (int) ' ');
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) (short) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        int[] intArray48 = new int[] { 1, (short) 0, 10, 10 };
        grafo43.cab = intArray48;
        grafo39.prox = intArray48;
        grafo26.cab = intArray48;
        grafo24.peso = intArray48;
        int[] intArray53 = grafo24.peso;
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta57 = grafo55.proxAdj((int) 'a');
        grafo55.imprime();
        ds.Grafo grafo59 = grafo55.grafoTransposto();
        ds.Grafo.Aresta aresta61 = grafo59.proxAdj((int) (short) 1);
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta65 = grafo63.proxAdj((int) (short) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 100);
        int[] intArray72 = new int[] { 1, (short) 0, 10, 10 };
        grafo67.cab = intArray72;
        grafo63.prox = intArray72;
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta78 = grafo76.proxAdj((int) (short) 1);
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 100);
        int[] intArray85 = new int[] { 1, (short) 0, 10, 10 };
        grafo80.cab = intArray85;
        grafo76.prox = intArray85;
        grafo63.cab = intArray85;
        grafo59.cab = intArray85;
        grafo24.peso = intArray85;
        grafo7.cab = intArray85;
        grafo1.cab = intArray85;
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(grafo59);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta78);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 0, 10, 10]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (-1));
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(100, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, 97);
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 100);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo5.numVertices();
        boolean boolean8 = grafo5.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.insereAresta((int) (short) 100, (int) (short) 100, (int) '4');
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray19 = new int[] { 1, (short) 0, 10, 10 };
        grafo14.cab = intArray19;
        grafo10.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        int[] intArray32 = new int[] { 1, (short) 0, 10, 10 };
        grafo27.cab = intArray32;
        grafo23.prox = intArray32;
        grafo10.cab = intArray32;
        grafo8.peso = intArray32;
        int[] intArray37 = grafo8.peso;
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) 'a');
        grafo39.imprime();
        boolean boolean45 = grafo39.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean48 = grafo39.existeAresta((int) (byte) 1, (int) '4');
        int int49 = grafo39.numVertices();
        ds.Grafo grafo50 = grafo39.grafoTransposto();
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 100);
        int[] intArray59 = new int[] { 1, (short) 0, 10, 10 };
        grafo54.cab = intArray59;
        grafo52.peso = intArray59;
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta65 = grafo63.proxAdj((int) (short) 1);
        ds.Grafo grafo66 = grafo63.grafoTransposto();
        int[] intArray70 = new int[] { 35, (short) -1, '#' };
        grafo63.cab = intArray70;
        grafo52.prox = intArray70;
        grafo50.cab = intArray70;
        int[] intArray74 = grafo50.cab;
        int[] intArray76 = new int[] { (byte) 1 };
        grafo50.prox = intArray76;
        grafo8.prox = intArray76;
        grafo6.prox = intArray76;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(grafo66);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray19 = new int[] { 1, (short) 0, 10, 10 };
        grafo14.cab = intArray19;
        grafo10.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        int[] intArray32 = new int[] { 1, (short) 0, 10, 10 };
        grafo27.cab = intArray32;
        grafo23.prox = intArray32;
        grafo10.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo10.proxAdj((int) (short) 1);
        int[] intArray38 = grafo10.prox;
        grafo1.peso = intArray38;
        int int40 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta(0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 32, (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 35);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        int[] intArray17 = new int[] { 1, (short) 0, 10, 10 };
        grafo12.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta23 = grafo21.proxAdj((int) (short) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        int[] intArray30 = new int[] { 1, (short) 0, 10, 10 };
        grafo25.cab = intArray30;
        grafo21.prox = intArray30;
        grafo8.cab = intArray30;
        grafo6.peso = intArray30;
        int[] intArray35 = grafo6.peso;
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta39 = grafo37.proxAdj((int) 'a');
        grafo37.imprime();
        boolean boolean43 = grafo37.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean46 = grafo37.existeAresta((int) (byte) 1, (int) '4');
        int int47 = grafo37.numVertices();
        ds.Grafo grafo48 = grafo37.grafoTransposto();
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo50.peso = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo64 = grafo61.grafoTransposto();
        int[] intArray68 = new int[] { 35, (short) -1, '#' };
        grafo61.cab = intArray68;
        grafo50.prox = intArray68;
        grafo48.cab = intArray68;
        int[] intArray72 = grafo48.cab;
        int[] intArray74 = new int[] { (byte) 1 };
        grafo48.prox = intArray74;
        grafo6.prox = intArray74;
        grafo1.prox = intArray74;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo9.insereAresta((int) 'a', 0, (int) (short) 1);
        boolean boolean15 = grafo9.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta(97, (int) (short) 1);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta23 = grafo19.primeiroListaAdj(0);
        int int24 = grafo19.numVertices();
        ds.Grafo grafo25 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta28 = grafo19.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) 'a');
        grafo30.imprime();
        boolean boolean36 = grafo30.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean39 = grafo30.existeAresta((int) (byte) 1, (int) '4');
        int int40 = grafo30.numVertices();
        ds.Grafo grafo41 = grafo30.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta45 = grafo43.proxAdj((int) 'a');
        grafo43.imprime();
        ds.Grafo grafo47 = grafo43.grafoTransposto();
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = grafo49.grafoTransposto();
        int[] intArray56 = new int[] { 35, (short) -1, '#' };
        grafo49.cab = intArray56;
        grafo47.prox = intArray56;
        grafo41.prox = intArray56;
        grafo19.peso = intArray56;
        grafo14.prox = intArray56;
        grafo1.peso = intArray56;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[35, -1, 35]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 10);
        boolean boolean10 = grafo1.existeAresta((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo1.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) 'a');
        grafo31.imprime();
        boolean boolean37 = grafo31.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean40 = grafo31.existeAresta((int) (byte) 1, (int) '4');
        int int41 = grafo31.numVertices();
        ds.Grafo grafo42 = grafo31.grafoTransposto();
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 100);
        int[] intArray51 = new int[] { 1, (short) 0, 10, 10 };
        grafo46.cab = intArray51;
        grafo44.peso = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta57 = grafo55.proxAdj((int) (short) 1);
        ds.Grafo grafo58 = grafo55.grafoTransposto();
        int[] intArray62 = new int[] { 35, (short) -1, '#' };
        grafo55.cab = intArray62;
        grafo44.prox = intArray62;
        grafo42.cab = intArray62;
        int[] intArray66 = grafo42.cab;
        grafo1.peso = intArray66;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(grafo58);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, -1, 35]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        grafo1.peso = intArray12;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) 'a');
        grafo16.imprime();
        boolean boolean22 = grafo16.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean25 = grafo16.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo26 = grafo16.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) (short) 1);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray37 = new int[] { 1, (short) 0, 10, 10 };
        grafo32.cab = intArray37;
        grafo28.prox = intArray37;
        grafo16.peso = intArray37;
        ds.Grafo grafo41 = grafo16.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo44 = grafo43.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo43.proxAdj(35);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) 'a');
        grafo48.imprime();
        ds.Grafo grafo52 = grafo48.grafoTransposto();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta56 = grafo54.proxAdj((int) (short) 1);
        ds.Grafo grafo57 = grafo54.grafoTransposto();
        int[] intArray61 = new int[] { 35, (short) -1, '#' };
        grafo54.cab = intArray61;
        grafo52.prox = intArray61;
        grafo43.peso = intArray61;
        grafo41.peso = intArray61;
        grafo1.cab = intArray61;
        ds.Grafo.Aresta aresta68 = grafo1.proxAdj(10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta68);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 1, 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta((int) 'a', (int) '#');
        ds.Grafo.Aresta aresta14 = grafo9.primeiroListaAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo9.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) 'a', 97);
        grafo1.insereAresta(0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.prox;
        ds.Grafo grafo31 = new ds.Grafo((int) '#');
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        int[] intArray44 = new int[] { 1, (short) 0, 10, 10 };
        grafo39.cab = intArray44;
        grafo35.prox = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        grafo35.cab = intArray57;
        grafo33.peso = intArray57;
        int[] intArray62 = grafo33.peso;
        grafo31.peso = intArray62;
        grafo1.peso = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        int[] intArray16 = new int[] { 1, (short) 0, 10, 10 };
        grafo11.cab = intArray16;
        grafo7.prox = intArray16;
        grafo5.peso = intArray16;
        grafo1.cab = intArray16;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) 'a');
        grafo22.imprime();
        boolean boolean28 = grafo22.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean31 = grafo22.existeAresta((int) (byte) 1, (int) '4');
        int int32 = grafo22.numVertices();
        ds.Grafo grafo33 = grafo22.grafoTransposto();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) 'a');
        grafo35.imprime();
        ds.Grafo grafo39 = grafo35.grafoTransposto();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta43 = grafo41.proxAdj((int) (short) 1);
        ds.Grafo grafo44 = grafo41.grafoTransposto();
        int[] intArray48 = new int[] { 35, (short) -1, '#' };
        grafo41.cab = intArray48;
        grafo39.prox = intArray48;
        grafo33.prox = intArray48;
        int[] intArray52 = new int[] {};
        grafo33.cab = intArray52;
        grafo1.prox = intArray52;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        int int12 = grafo11.numVertices();
        ds.Grafo.Aresta aresta15 = grafo11.retiraAresta(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo11.retiraAresta((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo9.proxAdj(35);
        ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int) (byte) 10);
        int[] intArray18 = new int[] { '#', 0, (byte) 10 };
        grafo9.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta23 = grafo21.proxAdj((int) 'a');
        grafo21.imprime();
        boolean boolean27 = grafo21.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean30 = grafo21.existeAresta((int) (byte) 1, (int) '4');
        int int31 = grafo21.numVertices();
        ds.Grafo grafo32 = grafo21.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta36 = grafo34.proxAdj((int) (short) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 100);
        int[] intArray43 = new int[] { 1, (short) 0, 10, 10 };
        grafo38.cab = intArray43;
        grafo34.prox = intArray43;
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta49 = grafo47.proxAdj((int) (short) 1);
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 100);
        int[] intArray56 = new int[] { 1, (short) 0, 10, 10 };
        grafo51.cab = intArray56;
        grafo47.prox = intArray56;
        grafo34.cab = intArray56;
        ds.Grafo.Aresta aresta61 = grafo34.proxAdj((int) (short) 1);
        int[] intArray62 = grafo34.cab;
        grafo21.peso = intArray62;
        grafo9.peso = intArray62;
        grafo1.peso = intArray62;
        ds.Grafo.Aresta aresta68 = grafo1.retiraAresta(0, 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 0, 10]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta68);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        grafo11.insereAresta(100, 0, (int) ' ');
        grafo11.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) 'a');
        grafo18.imprime();
        ds.Grafo grafo22 = grafo18.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = grafo24.grafoTransposto();
        int[] intArray31 = new int[] { 35, (short) -1, '#' };
        grafo24.cab = intArray31;
        grafo22.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        int[] intArray40 = new int[] { 1, (short) 0, 10, 10 };
        grafo35.cab = intArray40;
        grafo22.cab = intArray40;
        grafo11.cab = intArray40;
        grafo1.prox = intArray40;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 10, 10]");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta30 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNull(aresta30);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(35, (int) (byte) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo5.retiraAresta(100, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(aresta10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (-1));
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(97, (int) (short) 0);
        int int8 = aresta7.v1();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { (short) 10, (short) 1 };
        grafo32.cab = intArray35;
        grafo1.peso = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 1]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo1.peso = intArray6;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        boolean boolean12 = grafo1.existeAresta((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.cab;
        int[] intArray30 = null;
        grafo1.cab = intArray30;
        ds.Grafo.Aresta aresta33 = grafo1.proxAdj(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta33);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (-1), (int) '4');
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(32, 97);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta((int) ' ', (int) (short) -1, 100);
        grafo1.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        int[] intArray17 = new int[] { 1, (short) 0, 10, 10 };
        grafo12.cab = intArray17;
        grafo8.prox = intArray17;
        grafo1.cab = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, 10, 10]");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo11.peso = intArray35;
        grafo1.peso = intArray35;
        grafo1.imprime();
        ds.Grafo.Aresta aresta43 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta43);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo7.peso = intArray31;
        grafo1.peso = intArray31;
        ds.Grafo.Aresta aresta38 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta38);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) 'a');
        grafo6.imprime();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        int[] intArray19 = new int[] { 35, (short) -1, '#' };
        grafo12.cab = intArray19;
        grafo10.prox = intArray19;
        grafo1.peso = intArray19;
        int int23 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 35]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        int int4 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean14 = grafo1.existeAresta((int) (short) 0, 0);
        boolean boolean17 = grafo1.existeAresta((int) (short) 100, 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(32);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) ' ');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.primeiroListaAdj(10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 10, (int) (byte) 1, 10);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) 'a', 0);
        grafo1.insereAresta((int) (short) 1, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(aresta6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.insereAresta(32, 32, (int) '4');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '4', (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        int[] intArray15 = new int[] { 1, (short) 0, 10, 10 };
        grafo10.cab = intArray15;
        grafo6.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        int[] intArray28 = new int[] { 1, (short) 0, 10, 10 };
        grafo23.cab = intArray28;
        grafo19.prox = intArray28;
        grafo6.cab = intArray28;
        grafo4.peso = intArray28;
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        int[] intArray39 = new int[] { 1, (short) 0, 10, 10 };
        grafo34.cab = intArray39;
        grafo4.cab = intArray39;
        grafo1.cab = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo1.primeiroListaAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) ' ');
        int int11 = grafo1.numVertices();
        grafo1.imprime();
        int[] intArray13 = null;
        grafo1.peso = intArray13;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 100, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 10, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo14.peso = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = grafo25.grafoTransposto();
        int[] intArray32 = new int[] { 35, (short) -1, '#' };
        grafo25.cab = intArray32;
        grafo14.prox = intArray32;
        grafo12.cab = intArray32;
        int[] intArray36 = grafo12.cab;
        ds.Grafo.Aresta aresta38 = grafo12.proxAdj((int) '4');
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo41 = grafo40.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta45 = grafo43.proxAdj((int) 'a');
        grafo43.imprime();
        ds.Grafo grafo47 = grafo43.grafoTransposto();
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = grafo49.grafoTransposto();
        int[] intArray56 = new int[] { 35, (short) -1, '#' };
        grafo49.cab = intArray56;
        grafo47.prox = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 100);
        int[] intArray65 = new int[] { 1, (short) 0, 10, 10 };
        grafo60.cab = intArray65;
        grafo47.cab = intArray65;
        grafo41.prox = intArray65;
        grafo12.cab = intArray65;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 0, 10, 10]");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        grafo1.insereAresta(10, 0, (int) '4');
        grafo1.insereAresta((int) (short) 100, 100, 32);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        int[] intArray16 = new int[] { 35, (short) -1, '#' };
        grafo9.cab = intArray16;
        grafo7.prox = intArray16;
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo7.cab = intArray25;
        grafo1.cab = intArray25;
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        boolean boolean33 = grafo1.existeAresta((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.insereAresta(32, 32, (int) '4');
        int int16 = grafo1.numVertices();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) (short) 1);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        int[] intArray40 = new int[] { 1, (short) 0, 10, 10 };
        grafo35.cab = intArray40;
        grafo31.prox = intArray40;
        grafo18.cab = intArray40;
        ds.Grafo.Aresta aresta45 = grafo18.proxAdj((int) (short) 1);
        int[] intArray46 = grafo18.prox;
        ds.Grafo grafo48 = new ds.Grafo((int) '#');
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta54 = grafo52.proxAdj((int) (short) 1);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 100);
        int[] intArray61 = new int[] { 1, (short) 0, 10, 10 };
        grafo56.cab = intArray61;
        grafo52.prox = intArray61;
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta67 = grafo65.proxAdj((int) (short) 1);
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 100);
        int[] intArray74 = new int[] { 1, (short) 0, 10, 10 };
        grafo69.cab = intArray74;
        grafo65.prox = intArray74;
        grafo52.cab = intArray74;
        grafo50.peso = intArray74;
        int[] intArray79 = grafo50.peso;
        grafo48.peso = intArray79;
        grafo18.peso = intArray79;
        grafo1.prox = intArray79;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta67);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 0, 10, 10]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) 'a');
        grafo13.imprime();
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        int[] intArray26 = new int[] { 35, (short) -1, '#' };
        grafo19.cab = intArray26;
        grafo17.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) (short) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        int[] intArray39 = new int[] { 1, (short) 0, 10, 10 };
        grafo34.cab = intArray39;
        grafo30.prox = intArray39;
        grafo17.cab = intArray39;
        grafo11.cab = intArray39;
        int[] intArray44 = grafo11.cab;
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 10, 10]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        grafo1.imprime();
        int[] intArray10 = null;
        grafo1.cab = intArray10;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, 97);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo7.peso = intArray31;
        int[] intArray36 = grafo7.peso;
        grafo1.peso = intArray36;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        int[] intArray14 = new int[] { 1, (short) 0, 10, 10 };
        grafo9.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo5.cab = intArray27;
        grafo3.peso = intArray27;
        int[] intArray32 = grafo3.peso;
        grafo1.peso = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta37 = grafo35.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        int[] intArray44 = new int[] { 1, (short) 0, 10, 10 };
        grafo39.cab = intArray44;
        grafo35.prox = intArray44;
        grafo1.prox = intArray44;
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 0, 10, 10]");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 100, (int) (short) 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo9.proxAdj(35);
        ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int) (byte) 10);
        int[] intArray18 = new int[] { '#', 0, (byte) 10 };
        grafo9.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta23 = grafo21.proxAdj((int) 'a');
        grafo21.imprime();
        boolean boolean27 = grafo21.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean30 = grafo21.existeAresta((int) (byte) 1, (int) '4');
        int int31 = grafo21.numVertices();
        ds.Grafo grafo32 = grafo21.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta36 = grafo34.proxAdj((int) (short) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 100);
        int[] intArray43 = new int[] { 1, (short) 0, 10, 10 };
        grafo38.cab = intArray43;
        grafo34.prox = intArray43;
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta49 = grafo47.proxAdj((int) (short) 1);
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 100);
        int[] intArray56 = new int[] { 1, (short) 0, 10, 10 };
        grafo51.cab = intArray56;
        grafo47.prox = intArray56;
        grafo34.cab = intArray56;
        ds.Grafo.Aresta aresta61 = grafo34.proxAdj((int) (short) 1);
        int[] intArray62 = grafo34.cab;
        grafo21.peso = intArray62;
        grafo9.peso = intArray62;
        grafo1.peso = intArray62;
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta69 = grafo67.proxAdj((int) 'a');
        grafo67.imprime();
        boolean boolean73 = grafo67.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean76 = grafo67.existeAresta((int) (byte) 1, (int) '4');
        int int77 = grafo67.numVertices();
        ds.Grafo grafo78 = grafo67.grafoTransposto();
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 100);
        int[] intArray83 = new int[] { (short) 10, (short) 1 };
        grafo80.cab = intArray83;
        grafo67.cab = intArray83;
        grafo1.peso = intArray83;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 0, 10]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[10, 1]");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        grafo1.insereAresta((int) (short) 100, 1, (int) '#');
        grafo1.imprime();
        grafo1.insereAresta(97, 0, (int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '4');
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        grafo4.insereAresta((int) (short) 10, (int) 'a', 100);
        grafo4.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        int[] intArray18 = new int[] { 1, (short) 0, 10, 10 };
        grafo13.cab = intArray18;
        grafo9.prox = intArray18;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        int[] intArray31 = new int[] { 1, (short) 0, 10, 10 };
        grafo26.cab = intArray31;
        grafo22.prox = intArray31;
        grafo9.cab = intArray31;
        grafo7.peso = intArray31;
        grafo1.peso = intArray31;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo1.retiraAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        int[] intArray40 = grafo1.peso;
        ds.Grafo grafo41 = grafo1.grafoTransposto();
        boolean boolean43 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 32, (int) (short) 100);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        int[] intArray30 = grafo1.peso;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta34 = grafo32.proxAdj((int) 'a');
        grafo32.imprime();
        boolean boolean38 = grafo32.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean41 = grafo32.existeAresta((int) (byte) 1, (int) '4');
        int int42 = grafo32.numVertices();
        ds.Grafo grafo43 = grafo32.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 100);
        int[] intArray52 = new int[] { 1, (short) 0, 10, 10 };
        grafo47.cab = intArray52;
        grafo45.peso = intArray52;
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta58 = grafo56.proxAdj((int) (short) 1);
        ds.Grafo grafo59 = grafo56.grafoTransposto();
        int[] intArray63 = new int[] { 35, (short) -1, '#' };
        grafo56.cab = intArray63;
        grafo45.prox = intArray63;
        grafo43.cab = intArray63;
        int[] intArray67 = grafo43.cab;
        int[] intArray69 = new int[] { (byte) 1 };
        grafo43.prox = intArray69;
        grafo1.prox = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(grafo59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (-1));
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(97, (int) (short) 0);
        int int8 = aresta7.peso();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(97, (-1));
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.prox;
        boolean boolean32 = grafo1.existeAresta(0, 0);
        int[] intArray33 = grafo1.cab;
        int[] intArray34 = grafo1.prox;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 10, 10]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo5.proxAdj(35);
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        int int10 = grafo9.numVertices();
        boolean boolean12 = grafo9.listaAdjVazia((int) '#');
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) 'a');
        grafo14.imprime();
        boolean boolean20 = grafo14.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean23 = grafo14.existeAresta((int) (byte) 1, (int) '4');
        int int24 = grafo14.numVertices();
        ds.Grafo grafo25 = grafo14.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 100);
        int[] intArray34 = new int[] { 1, (short) 0, 10, 10 };
        grafo29.cab = intArray34;
        grafo27.peso = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta40 = grafo38.proxAdj((int) (short) 1);
        ds.Grafo grafo41 = grafo38.grafoTransposto();
        int[] intArray45 = new int[] { 35, (short) -1, '#' };
        grafo38.cab = intArray45;
        grafo27.prox = intArray45;
        grafo25.cab = intArray45;
        grafo9.peso = intArray45;
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta53 = grafo51.proxAdj((int) 'a');
        grafo51.imprime();
        boolean boolean57 = grafo51.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean60 = grafo51.existeAresta((int) (byte) 1, (int) '4');
        int int61 = grafo51.numVertices();
        ds.Grafo grafo62 = grafo51.grafoTransposto();
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 100);
        int[] intArray71 = new int[] { 1, (short) 0, 10, 10 };
        grafo66.cab = intArray71;
        grafo64.peso = intArray71;
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta77 = grafo75.proxAdj((int) (short) 1);
        ds.Grafo grafo78 = grafo75.grafoTransposto();
        int[] intArray82 = new int[] { 35, (short) -1, '#' };
        grafo75.cab = intArray82;
        grafo64.prox = intArray82;
        grafo62.cab = intArray82;
        grafo9.prox = intArray82;
        grafo1.prox = intArray82;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta77);
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35, -1, 35]");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        grafo1.insereAresta(0, 52, (int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        grafo1.peso = intArray22;
        ds.Grafo grafo26 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo26.existeAresta((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo26);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 10);
        grafo1.insereAresta((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(aresta13);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray4 = new int[] { (short) 10, (short) 1 };
        grafo1.cab = intArray4;
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 1, (int) '4');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo9.numVertices();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (-1), (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 35);
        int int5 = grafo1.numVertices();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 10);
        grafo1.insereAresta((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta42 = grafo1.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        grafo44.insereAresta(100, 0, (int) ' ');
        grafo44.imprime();
        ds.Grafo.Aresta aresta51 = grafo44.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta53 = grafo44.proxAdj(0);
        ds.Grafo grafo54 = grafo44.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta58 = grafo56.proxAdj((int) 'a');
        grafo56.imprime();
        ds.Grafo grafo60 = grafo56.grafoTransposto();
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta64 = grafo62.proxAdj((int) (short) 1);
        ds.Grafo grafo65 = grafo62.grafoTransposto();
        int[] intArray69 = new int[] { 35, (short) -1, '#' };
        grafo62.cab = intArray69;
        grafo60.prox = intArray69;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta75 = grafo73.proxAdj((int) (short) 1);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 100);
        int[] intArray82 = new int[] { 1, (short) 0, 10, 10 };
        grafo77.cab = intArray82;
        grafo73.prox = intArray82;
        grafo60.cab = intArray82;
        grafo54.cab = intArray82;
        grafo1.prox = intArray82;
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 0, 10, 10]");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 100, 32);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        int[] intArray46 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, -1, 35]");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Grafo grafo1 = new ds.Grafo(35);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) 'a', 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        int[] intArray15 = new int[] { 35, (short) -1, '#' };
        grafo8.cab = intArray15;
        int[] intArray17 = grafo8.cab;
        grafo1.peso = intArray17;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int[] intArray6 = null;
        grafo1.peso = intArray6;
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray8 = new int[] { 35, (short) -1, '#' };
        grafo1.cab = intArray8;
        int[] intArray10 = grafo1.cab;
        int[] intArray11 = grafo1.cab;
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 35]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        int[] intArray22 = new int[] { 1, (short) 0, 10, 10 };
        grafo17.cab = intArray22;
        grafo13.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        grafo13.cab = intArray35;
        grafo11.peso = intArray35;
        grafo1.peso = intArray35;
        grafo1.imprime();
        ds.Grafo.Aresta aresta43 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo44 = grafo1.grafoTransposto();
        boolean boolean46 = grafo1.listaAdjVazia(32);
        ds.Grafo grafo47 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(grafo47);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        int[] intArray19 = new int[] { 35, (short) -1, '#' };
        grafo12.cab = intArray19;
        int[] intArray21 = grafo12.cab;
        int[] intArray22 = grafo12.cab;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) (short) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        int[] intArray48 = new int[] { 1, (short) 0, 10, 10 };
        grafo43.cab = intArray48;
        grafo39.prox = intArray48;
        grafo26.cab = intArray48;
        grafo24.peso = intArray48;
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 100);
        int[] intArray59 = new int[] { 1, (short) 0, 10, 10 };
        grafo54.cab = intArray59;
        grafo24.cab = intArray59;
        grafo12.cab = intArray59;
        grafo10.cab = intArray59;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta65 = grafo10.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 0, 10, 10]");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) 'a');
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int[] intArray17 = new int[] { 35, (short) -1, '#' };
        grafo10.cab = intArray17;
        grafo8.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo8.cab = intArray26;
        grafo2.prox = intArray26;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int) 'a');
        grafo31.imprime();
        ds.Grafo grafo35 = grafo31.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo(100);
        grafo37.imprime();
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta42 = grafo40.proxAdj((int) 'a');
        grafo40.imprime();
        ds.Grafo grafo44 = grafo40.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo44.proxAdj((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta50 = grafo48.proxAdj((int) (short) 1);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        int[] intArray57 = new int[] { 1, (short) 0, 10, 10 };
        grafo52.cab = intArray57;
        grafo48.prox = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta63 = grafo61.proxAdj((int) (short) 1);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 100);
        int[] intArray70 = new int[] { 1, (short) 0, 10, 10 };
        grafo65.cab = intArray70;
        grafo61.prox = intArray70;
        grafo48.cab = intArray70;
        grafo44.cab = intArray70;
        grafo37.cab = intArray70;
        grafo31.cab = intArray70;
        grafo2.prox = intArray70;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = grafo2.existeAresta((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertNotNull(grafo44);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1, 0, 10, 10]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) 'a');
        grafo14.imprime();
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta22 = grafo20.proxAdj((int) (short) 1);
        ds.Grafo grafo23 = grafo20.grafoTransposto();
        int[] intArray27 = new int[] { 35, (short) -1, '#' };
        grafo20.cab = intArray27;
        grafo18.prox = intArray27;
        grafo12.prox = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            grafo12.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, -1, 35]");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo4.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        int[] intArray21 = new int[] { 1, (short) 0, 10, 10 };
        grafo16.cab = intArray21;
        grafo14.peso = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta27 = grafo25.proxAdj((int) (short) 1);
        ds.Grafo grafo28 = grafo25.grafoTransposto();
        int[] intArray32 = new int[] { 35, (short) -1, '#' };
        grafo25.cab = intArray32;
        grafo14.prox = intArray32;
        grafo12.cab = intArray32;
        int[] intArray36 = grafo12.cab;
        ds.Grafo.Aresta aresta39 = grafo12.retiraAresta(32, (int) (short) -1);
        boolean boolean42 = grafo12.existeAresta(97, (int) (short) -1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        int[] intArray10 = new int[] { 1, (short) 0, 10, 10 };
        grafo5.cab = intArray10;
        grafo1.prox = intArray10;
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        int[] intArray23 = new int[] { 1, (short) 0, 10, 10 };
        grafo18.cab = intArray23;
        grafo14.prox = intArray23;
        grafo1.cab = intArray23;
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) (short) 1);
        int[] intArray29 = grafo1.cab;
        int[] intArray30 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = grafo1.existeAresta((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0, 10, 10]");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        int int39 = grafo1.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta43 = grafo41.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta45 = grafo41.primeiroListaAdj(0);
        int int46 = grafo41.numVertices();
        ds.Grafo grafo47 = grafo41.grafoTransposto();
        ds.Grafo.Aresta aresta50 = grafo41.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta54 = grafo52.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta56 = grafo52.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta59 = grafo52.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo62 = grafo61.grafoTransposto();
        ds.Grafo.Aresta aresta64 = grafo61.proxAdj(35);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta68 = grafo66.proxAdj((int) 'a');
        grafo66.imprime();
        ds.Grafo grafo70 = grafo66.grafoTransposto();
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta74 = grafo72.proxAdj((int) (short) 1);
        ds.Grafo grafo75 = grafo72.grafoTransposto();
        int[] intArray79 = new int[] { 35, (short) -1, '#' };
        grafo72.cab = intArray79;
        grafo70.prox = intArray79;
        grafo61.peso = intArray79;
        grafo52.cab = intArray79;
        grafo41.peso = intArray79;
        grafo1.peso = intArray79;
        int[] intArray86 = grafo1.peso;
        ds.Grafo.Aresta aresta88 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta90 = grafo1.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta50);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNull(aresta68);
        org.junit.Assert.assertNotNull(grafo70);
        org.junit.Assert.assertNull(aresta74);
        org.junit.Assert.assertNotNull(grafo75);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta88);
        org.junit.Assert.assertNull(aresta90);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        int[] intArray14 = new int[] { 1, (short) 0, 10, 10 };
        grafo9.cab = intArray14;
        grafo5.prox = intArray14;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo5.cab = intArray27;
        grafo3.peso = intArray27;
        int[] intArray32 = grafo3.peso;
        grafo1.peso = intArray32;
        ds.Grafo.Aresta aresta36 = grafo1.retiraAresta(35, 97);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta36);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        ds.Grafo.Aresta aresta30 = grafo3.proxAdj((int) (short) 1);
        int[] intArray31 = grafo3.prox;
        boolean boolean34 = grafo3.existeAresta(0, 0);
        int[] intArray35 = grafo3.cab;
        grafo1.prox = intArray35;
        java.lang.Class<?> wildcardClass37 = intArray35.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, 97);
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 100);
        grafo1.imprime();
        grafo1.insereAresta(35, (int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj(52);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(100, 0, (int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 100);
        int[] intArray19 = new int[] { 1, (short) 0, 10, 10 };
        grafo14.cab = intArray19;
        grafo10.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta25 = grafo23.proxAdj((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 100);
        int[] intArray32 = new int[] { 1, (short) 0, 10, 10 };
        grafo27.cab = intArray32;
        grafo23.prox = intArray32;
        grafo10.cab = intArray32;
        ds.Grafo.Aresta aresta37 = grafo10.proxAdj((int) (short) 1);
        int[] intArray38 = grafo10.prox;
        grafo1.peso = intArray38;
        boolean boolean42 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta46 = grafo44.proxAdj((int) 'a');
        grafo44.imprime();
        boolean boolean50 = grafo44.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean53 = grafo44.existeAresta((int) (byte) 1, (int) '4');
        int int54 = grafo44.numVertices();
        ds.Grafo grafo55 = grafo44.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 100);
        int[] intArray60 = new int[] { (short) 10, (short) 1 };
        grafo57.cab = intArray60;
        grafo44.cab = intArray60;
        ds.Grafo.Aresta aresta64 = grafo44.proxAdj((int) (byte) 1);
        int[] intArray65 = grafo44.cab;
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta69 = grafo67.proxAdj((int) 'a');
        grafo67.imprime();
        ds.Grafo grafo71 = grafo67.grafoTransposto();
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta75 = grafo73.proxAdj((int) (short) 1);
        ds.Grafo grafo76 = grafo73.grafoTransposto();
        int[] intArray80 = new int[] { 35, (short) -1, '#' };
        grafo73.cab = intArray80;
        grafo71.prox = intArray80;
        ds.Grafo grafo84 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta86 = grafo84.proxAdj((int) (short) 1);
        ds.Grafo grafo88 = new ds.Grafo((int) (short) 100);
        int[] intArray93 = new int[] { 1, (short) 0, 10, 10 };
        grafo88.cab = intArray93;
        grafo84.prox = intArray93;
        grafo71.cab = intArray93;
        int[] intArray97 = grafo71.prox;
        grafo44.prox = intArray97;
        grafo1.peso = intArray97;
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 1]");
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[10, 1]");
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(grafo71);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[35, -1, 35]");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean10 = grafo1.existeAresta((int) (byte) 1, (int) '4');
        int int11 = grafo1.numVertices();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(100, 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo18 = grafo17.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.proxAdj(35);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta24 = grafo22.proxAdj((int) 'a');
        grafo22.imprime();
        ds.Grafo grafo26 = grafo22.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta30 = grafo28.proxAdj((int) (short) 1);
        ds.Grafo grafo31 = grafo28.grafoTransposto();
        int[] intArray35 = new int[] { 35, (short) -1, '#' };
        grafo28.cab = intArray35;
        grafo26.prox = intArray35;
        grafo17.peso = intArray35;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 100);
        grafo40.insereAresta(100, 0, (int) ' ');
        grafo40.imprime();
        ds.Grafo.Aresta aresta47 = grafo40.primeiroListaAdj(10);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta53 = grafo49.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta56 = grafo49.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo59 = grafo58.grafoTransposto();
        ds.Grafo.Aresta aresta61 = grafo58.proxAdj(35);
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta65 = grafo63.proxAdj((int) 'a');
        grafo63.imprime();
        ds.Grafo grafo67 = grafo63.grafoTransposto();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta71 = grafo69.proxAdj((int) (short) 1);
        ds.Grafo grafo72 = grafo69.grafoTransposto();
        int[] intArray76 = new int[] { 35, (short) -1, '#' };
        grafo69.cab = intArray76;
        grafo67.prox = intArray76;
        grafo58.peso = intArray76;
        grafo49.cab = intArray76;
        grafo40.prox = intArray76;
        grafo17.prox = intArray76;
        grafo12.prox = intArray76;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(grafo59);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertNull(aresta71);
        org.junit.Assert.assertNotNull(grafo72);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[35, -1, 35]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(35, (int) '4');
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) ' ');
        int int11 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta(35, (int) (short) -1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(35);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '#', (int) (byte) -1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        grafo11.insereAresta((int) ' ', (int) (short) -1, 100);
        grafo11.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        int[] intArray27 = new int[] { 1, (short) 0, 10, 10 };
        grafo22.cab = intArray27;
        grafo18.prox = intArray27;
        grafo11.cab = intArray27;
        grafo9.peso = intArray27;
        grafo9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = grafo9.existeAresta((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, 10, 10]");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int[] intArray6 = new int[] { 1, (short) 0, 10, 10 };
        grafo1.cab = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean18 = grafo9.existeAresta((int) (byte) 1, (int) '4');
        int int19 = grafo9.numVertices();
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        int[] intArray29 = new int[] { 1, (short) 0, 10, 10 };
        grafo24.cab = intArray29;
        grafo22.peso = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta35 = grafo33.proxAdj((int) (short) 1);
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        int[] intArray40 = new int[] { 35, (short) -1, '#' };
        grafo33.cab = intArray40;
        grafo22.prox = intArray40;
        grafo20.cab = intArray40;
        int[] intArray44 = grafo20.cab;
        grafo1.cab = intArray44;
        ds.Grafo.Aresta aresta48 = grafo1.retiraAresta(10, (int) (short) 10);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo51 = grafo50.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta55 = grafo53.proxAdj((int) 'a');
        grafo53.imprime();
        ds.Grafo grafo57 = grafo53.grafoTransposto();
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta61 = grafo59.proxAdj((int) (short) 1);
        ds.Grafo grafo62 = grafo59.grafoTransposto();
        int[] intArray66 = new int[] { 35, (short) -1, '#' };
        grafo59.cab = intArray66;
        grafo57.prox = intArray66;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 100);
        int[] intArray75 = new int[] { 1, (short) 0, 10, 10 };
        grafo70.cab = intArray75;
        grafo57.cab = intArray75;
        grafo50.prox = intArray75;
        grafo1.prox = intArray75;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(grafo62);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 0, 10, 10]");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, (int) (short) 10);
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) (short) 1);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        int[] intArray19 = new int[] { 35, (short) -1, '#' };
        grafo12.cab = intArray19;
        int[] intArray21 = grafo12.cab;
        int[] intArray22 = grafo12.cab;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        int[] intArray35 = new int[] { 1, (short) 0, 10, 10 };
        grafo30.cab = intArray35;
        grafo26.prox = intArray35;
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta41 = grafo39.proxAdj((int) (short) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 100);
        int[] intArray48 = new int[] { 1, (short) 0, 10, 10 };
        grafo43.cab = intArray48;
        grafo39.prox = intArray48;
        grafo26.cab = intArray48;
        grafo24.peso = intArray48;
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 100);
        int[] intArray59 = new int[] { 1, (short) 0, 10, 10 };
        grafo54.cab = intArray59;
        grafo24.cab = intArray59;
        grafo12.cab = intArray59;
        grafo10.cab = intArray59;
        int int64 = grafo10.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, -1, 35]");
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 100);
        int[] intArray12 = new int[] { 1, (short) 0, 10, 10 };
        grafo7.cab = intArray12;
        grafo3.prox = intArray12;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 100);
        int[] intArray25 = new int[] { 1, (short) 0, 10, 10 };
        grafo20.cab = intArray25;
        grafo16.prox = intArray25;
        grafo3.cab = intArray25;
        grafo1.peso = intArray25;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 100);
        int[] intArray36 = new int[] { 1, (short) 0, 10, 10 };
        grafo31.cab = intArray36;
        grafo1.cab = intArray36;
        int[] intArray39 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 0, 10, 10]");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(97, (int) (short) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj(0);
        int int11 = grafo6.numVertices();
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo6.retiraAresta(35, (int) (byte) 10);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) 'a');
        grafo17.imprime();
        boolean boolean23 = grafo17.existeAresta((int) (short) 1, (int) (short) 100);
        boolean boolean26 = grafo17.existeAresta((int) (byte) 1, (int) '4');
        int int27 = grafo17.numVertices();
        ds.Grafo grafo28 = grafo17.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta32 = grafo30.proxAdj((int) 'a');
        grafo30.imprime();
        ds.Grafo grafo34 = grafo30.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta38 = grafo36.proxAdj((int) (short) 1);
        ds.Grafo grafo39 = grafo36.grafoTransposto();
        int[] intArray43 = new int[] { 35, (short) -1, '#' };
        grafo36.cab = intArray43;
        grafo34.prox = intArray43;
        grafo28.prox = intArray43;
        grafo6.peso = intArray43;
        grafo1.prox = intArray43;
        ds.Grafo.Aresta aresta50 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35, -1, 35]");
        org.junit.Assert.assertNotNull(aresta50);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 100);
        int[] intArray13 = new int[] { 1, (short) 0, 10, 10 };
        grafo8.cab = intArray13;
        grafo4.prox = intArray13;
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 100);
        int[] intArray26 = new int[] { 1, (short) 0, 10, 10 };
        grafo21.cab = intArray26;
        grafo17.prox = intArray26;
        grafo4.cab = intArray26;
        ds.Grafo.Aresta aresta31 = grafo4.proxAdj((int) (short) 1);
        int[] intArray32 = grafo4.cab;
        int[] intArray33 = null;
        grafo4.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo37 = grafo36.grafoTransposto();
        ds.Grafo.Aresta aresta39 = grafo36.proxAdj(35);
        ds.Grafo grafo40 = grafo36.grafoTransposto();
        int int41 = grafo40.numVertices();
        ds.Grafo grafo42 = grafo40.grafoTransposto();
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta46 = grafo44.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta49 = grafo44.retiraAresta(35, (int) '4');
        int int50 = grafo44.numVertices();
        int int51 = grafo44.numVertices();
        ds.Grafo.Aresta aresta53 = grafo44.primeiroListaAdj((int) ' ');
        int int54 = grafo44.numVertices();
        boolean boolean57 = grafo44.existeAresta((int) '#', (int) (short) -1);
        ds.Grafo grafo59 = new ds.Grafo((int) '#');
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta65 = grafo63.proxAdj((int) (short) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 100);
        int[] intArray72 = new int[] { 1, (short) 0, 10, 10 };
        grafo67.cab = intArray72;
        grafo63.prox = intArray72;
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta78 = grafo76.proxAdj((int) (short) 1);
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 100);
        int[] intArray85 = new int[] { 1, (short) 0, 10, 10 };
        grafo80.cab = intArray85;
        grafo76.prox = intArray85;
        grafo63.cab = intArray85;
        grafo61.peso = intArray85;
        int[] intArray90 = grafo61.peso;
        grafo59.peso = intArray90;
        grafo44.prox = intArray90;
        grafo42.cab = intArray90;
        grafo4.peso = intArray90;
        grafo1.peso = intArray90;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(grafo42);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 10, 10]");
        org.junit.Assert.assertNull(aresta78);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 0, 10, 10]");
    }
}

