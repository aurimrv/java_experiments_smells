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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo8 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 10, (-1));
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        boolean boolean7 = grafo1.existeAresta(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo8 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo(10);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo11 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo1.existeAresta((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        int int11 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo(1);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 100, 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo24 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        int int11 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        int int12 = aresta11.v1();
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        java.lang.Class<?> wildcardClass29 = intArray27.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo1.existeAresta((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        grafo1.cab = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo(0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        int[] intArray5 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo6 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.imprime();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 0, (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        grafo8.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo8.prox = intArray24;
        boolean boolean30 = grafo8.listaAdjVazia(0);
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        boolean boolean36 = grafo32.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo37 = grafo32.grafoTransposto();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        ds.Grafo.Aresta aresta47 = grafo39.primeiroListaAdj((int) (short) 0);
        int[] intArray48 = grafo39.prox;
        grafo32.peso = intArray48;
        ds.Grafo.Aresta aresta51 = grafo32.proxAdj((int) (byte) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        int int54 = grafo53.numVertices();
        int[] intArray55 = null;
        grafo53.cab = intArray55;
        int int57 = grafo53.numVertices();
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta62 = grafo59.retiraAresta(10, (int) (byte) -1);
        int[] intArray67 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo59.peso = intArray67;
        grafo53.peso = intArray67;
        grafo32.cab = intArray67;
        grafo8.cab = intArray67;
        grafo6.peso = intArray67;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(grafo37);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[35]");
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, -1, 35, 0]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia(32);
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int[] intArray21 = new int[] { '#' };
        grafo19.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int[] intArray28 = new int[] { '#' };
        grafo26.prox = intArray28;
        grafo24.prox = intArray28;
        grafo19.cab = intArray28;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo19.cab = intArray43;
        grafo1.cab = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta50 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta(10, (int) (byte) -1);
        int[] intArray14 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo6.peso = intArray14;
        int[] intArray16 = grafo6.peso;
        grafo1.peso = intArray16;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(10, (int) (byte) -1);
        int[] intArray16 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo8.peso = intArray16;
        boolean boolean19 = grafo8.listaAdjVazia((int) (short) 1);
        int[] intArray20 = grafo8.peso;
        grafo1.prox = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        boolean boolean29 = grafo25.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        int[] intArray36 = new int[] { '#' };
        grafo34.prox = intArray36;
        grafo32.prox = intArray36;
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj((int) (short) 0);
        int[] intArray41 = grafo32.prox;
        grafo25.peso = intArray41;
        ds.Grafo.Aresta aresta44 = grafo25.proxAdj((int) (byte) 0);
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        int[] intArray48 = null;
        grafo46.cab = intArray48;
        int int50 = grafo46.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta(10, (int) (byte) -1);
        int[] intArray60 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo52.peso = intArray60;
        grafo46.peso = intArray60;
        grafo25.cab = intArray60;
        grafo1.cab = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35]");
        org.junit.Assert.assertNotNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35]");
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, -1, 35, 0]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.cab = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = grafo1.existeAresta((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo5 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.imprime();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 1);
        int int45 = grafo44.numVertices();
        grafo44.imprime();
        grafo44.imprime();
        boolean boolean50 = grafo44.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        int int53 = grafo52.numVertices();
        int[] intArray54 = null;
        grafo52.cab = intArray54;
        int int56 = grafo52.numVertices();
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 1);
        int[] intArray62 = new int[] { '#' };
        grafo60.prox = intArray62;
        grafo58.prox = intArray62;
        grafo52.cab = intArray62;
        grafo44.prox = intArray62;
        int[] intArray70 = new int[] { (byte) 0, 10, 1 };
        grafo44.peso = intArray70;
        int[] intArray72 = null;
        grafo44.peso = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 1);
        int int76 = grafo75.numVertices();
        ds.Grafo grafo78 = new ds.Grafo((int) (short) 1);
        int int79 = grafo78.numVertices();
        int[] intArray80 = null;
        grafo78.cab = intArray80;
        int int82 = grafo78.numVertices();
        ds.Grafo grafo84 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta87 = grafo84.retiraAresta(10, (int) (byte) -1);
        int[] intArray92 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo84.peso = intArray92;
        grafo78.peso = intArray92;
        grafo75.prox = intArray92;
        grafo44.prox = intArray92;
        grafo1.cab = intArray92;
        ds.Grafo.Aresta aresta99 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNull(aresta87);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[100, -1, 35, 0]");
        org.junit.Assert.assertNull(aresta99);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) '4', (int) (short) 0, (-1));
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(100, 0);
        int int9 = aresta8.peso();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        int[] intArray24 = null;
        grafo22.cab = intArray24;
        int int26 = grafo22.numVertices();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int[] intArray32 = new int[] { '#' };
        grafo30.prox = intArray32;
        grafo28.prox = intArray32;
        grafo22.cab = intArray32;
        grafo1.cab = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo1.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 100, (int) '#');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        int[] intArray37 = null;
        grafo35.cab = intArray37;
        int int39 = grafo35.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) (byte) -1);
        int[] intArray49 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo41.peso = intArray49;
        grafo35.peso = intArray49;
        grafo32.prox = intArray49;
        grafo1.prox = intArray49;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 0, 35, 0]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        grafo19.imprime();
        grafo19.imprime();
        boolean boolean25 = grafo19.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int int28 = grafo27.numVertices();
        int[] intArray29 = null;
        grafo27.cab = intArray29;
        int int31 = grafo27.numVertices();
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int[] intArray37 = new int[] { '#' };
        grafo35.prox = intArray37;
        grafo33.prox = intArray37;
        grafo27.cab = intArray37;
        grafo19.prox = intArray37;
        grafo1.peso = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        int[] intArray24 = null;
        grafo22.cab = intArray24;
        int int26 = grafo22.numVertices();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta(10, (int) (byte) -1);
        int[] intArray36 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo28.peso = intArray36;
        grafo22.peso = intArray36;
        grafo1.cab = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta41 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(aresta31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, -1, 35, 0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        boolean boolean49 = grafo45.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo50 = grafo45.grafoTransposto();
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int[] intArray56 = new int[] { '#' };
        grafo54.prox = intArray56;
        grafo52.prox = intArray56;
        ds.Grafo.Aresta aresta60 = grafo52.primeiroListaAdj((int) (short) 0);
        int[] intArray61 = grafo52.prox;
        grafo45.peso = intArray61;
        ds.Grafo.Aresta aresta64 = grafo45.proxAdj((int) (byte) 0);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 1);
        int[] intArray68 = new int[] { '#' };
        grafo66.prox = intArray68;
        int[] intArray70 = grafo66.prox;
        grafo45.prox = intArray70;
        grafo1.prox = intArray70;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[35]");
        org.junit.Assert.assertNotNull(aresta60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35]");
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[35]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        int[] intArray11 = grafo1.peso;
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) '4');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        int[] intArray26 = grafo22.prox;
        grafo1.prox = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo1.listaAdjVazia(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        grafo1.cab = intArray37;
        java.lang.Class<?> wildcardClass40 = intArray37.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        java.lang.Class<?> wildcardClass43 = intArray38.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        boolean boolean11 = grafo5.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        int[] intArray15 = null;
        grafo13.cab = intArray15;
        int int17 = grafo13.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int[] intArray23 = new int[] { '#' };
        grafo21.prox = intArray23;
        grafo19.prox = intArray23;
        grafo13.cab = intArray23;
        grafo5.prox = intArray23;
        int[] intArray31 = new int[] { (byte) 0, 10, 1 };
        grafo5.peso = intArray31;
        int[] intArray33 = null;
        grafo5.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        int int40 = grafo39.numVertices();
        int[] intArray41 = null;
        grafo39.cab = intArray41;
        int int43 = grafo39.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) (byte) -1);
        int[] intArray53 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo45.peso = intArray53;
        grafo39.peso = intArray53;
        grafo36.prox = intArray53;
        grafo5.prox = intArray53;
        grafo1.prox = intArray53;
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 1);
        int int61 = grafo60.numVertices();
        grafo60.imprime();
        boolean boolean64 = grafo60.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo65 = grafo60.grafoTransposto();
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta70 = grafo67.retiraAresta(10, (int) (byte) -1);
        int[] intArray75 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo67.peso = intArray75;
        boolean boolean78 = grafo67.listaAdjVazia((int) (short) 1);
        int[] intArray79 = grafo67.peso;
        grafo60.prox = intArray79;
        int int81 = grafo60.numVertices();
        int[] intArray82 = grafo60.prox;
        grafo1.cab = intArray82;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, -1, 35, 0]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        int[] intArray26 = grafo22.prox;
        grafo1.prox = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.primeiroListaAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta(100, (int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        boolean boolean25 = grafo1.existeAresta((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass26 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) -1, 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        boolean boolean10 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        boolean boolean6 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        java.lang.Class<?> wildcardClass12 = aresta11.getClass();
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        int[] intArray8 = null;
        grafo6.cab = intArray8;
        int int10 = grafo6.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int[] intArray16 = new int[] { '#' };
        grafo14.prox = intArray16;
        grafo12.prox = intArray16;
        grafo6.cab = intArray16;
        grafo1.prox = intArray16;
        boolean boolean22 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 1, 35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        int[] intArray14 = new int[] { 10, (byte) 0, '#', 100, (byte) 0, 35 };
        grafo1.prox = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 35, 100, 0, 35]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 1);
        int int5 = grafo4.numVertices();
        int[] intArray6 = null;
        grafo4.cab = intArray6;
        int int8 = grafo4.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(10, (int) (byte) -1);
        int[] intArray18 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo10.peso = intArray18;
        grafo4.peso = intArray18;
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo22 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, 35, 0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        int int35 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        boolean boolean8 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo7 = new ds.Grafo(1);
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo10.cab = intArray19;
        grafo8.peso = intArray19;
        grafo1.cab = intArray19;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int[] intArray10 = new int[] { '#' };
        grafo8.prox = intArray10;
        grafo6.prox = intArray10;
        grafo1.cab = intArray10;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int int16 = grafo15.numVertices();
        int[] intArray17 = null;
        grafo15.cab = intArray17;
        int int19 = grafo15.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        int[] intArray25 = new int[] { '#' };
        grafo23.prox = intArray25;
        grafo21.prox = intArray25;
        grafo15.cab = intArray25;
        grafo1.cab = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo30 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.listaAdjVazia((int) (byte) 10);
        boolean boolean9 = grafo1.existeAresta((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 1);
        int int5 = grafo4.numVertices();
        int[] intArray6 = null;
        grafo4.cab = intArray6;
        int int8 = grafo4.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(10, (int) (byte) -1);
        int[] intArray18 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo10.peso = intArray18;
        grafo4.peso = intArray18;
        grafo1.prox = intArray18;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        int[] intArray25 = new int[] { '#' };
        grafo23.prox = intArray25;
        grafo1.peso = intArray25;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int int13 = grafo12.numVertices();
        boolean boolean16 = grafo12.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo17 = grafo12.grafoTransposto();
        boolean boolean20 = grafo12.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        grafo22.imprime();
        grafo22.imprime();
        boolean boolean28 = grafo22.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        int[] intArray32 = null;
        grafo30.cab = intArray32;
        int int34 = grafo30.numVertices();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 1);
        int[] intArray40 = new int[] { '#' };
        grafo38.prox = intArray40;
        grafo36.prox = intArray40;
        grafo30.cab = intArray40;
        grafo22.prox = intArray40;
        int[] intArray48 = new int[] { (byte) 0, 10, 1 };
        grafo22.peso = intArray48;
        grafo12.cab = intArray48;
        grafo1.prox = intArray48;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta53 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 10, 1]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) '#', (-1));
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        boolean boolean10 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo43.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        int int12 = aresta11.v2();
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        boolean boolean11 = grafo5.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        int[] intArray15 = null;
        grafo13.cab = intArray15;
        int int17 = grafo13.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int[] intArray23 = new int[] { '#' };
        grafo21.prox = intArray23;
        grafo19.prox = intArray23;
        grafo13.cab = intArray23;
        grafo5.prox = intArray23;
        int[] intArray31 = new int[] { (byte) 0, 10, 1 };
        grafo5.peso = intArray31;
        int[] intArray33 = null;
        grafo5.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        int int40 = grafo39.numVertices();
        int[] intArray41 = null;
        grafo39.cab = intArray41;
        int int43 = grafo39.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) (byte) -1);
        int[] intArray53 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo45.peso = intArray53;
        grafo39.peso = intArray53;
        grafo36.prox = intArray53;
        grafo5.prox = intArray53;
        grafo1.prox = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, -1, 35, 0]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        int[] intArray10 = null;
        grafo8.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        grafo13.imprime();
        grafo13.imprime();
        boolean boolean19 = grafo13.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int int22 = grafo21.numVertices();
        int[] intArray23 = null;
        grafo21.cab = intArray23;
        int int25 = grafo21.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int[] intArray31 = new int[] { '#' };
        grafo29.prox = intArray31;
        grafo27.prox = intArray31;
        grafo21.cab = intArray31;
        grafo13.prox = intArray31;
        int[] intArray39 = new int[] { (byte) 0, 10, 1 };
        grafo13.peso = intArray39;
        grafo8.prox = intArray39;
        grafo4.cab = intArray39;
        grafo4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta45 = grafo4.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 10, 1]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        int int11 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (short) 100, (int) 'a');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 1);
        int[] intArray49 = new int[] { '#' };
        grafo47.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int[] intArray56 = new int[] { '#' };
        grafo54.prox = intArray56;
        grafo52.prox = intArray56;
        grafo47.cab = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        int int62 = grafo61.numVertices();
        int[] intArray63 = null;
        grafo61.cab = intArray63;
        int int65 = grafo61.numVertices();
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 1);
        int[] intArray71 = new int[] { '#' };
        grafo69.prox = intArray71;
        grafo67.prox = intArray71;
        grafo61.cab = intArray71;
        grafo47.cab = intArray71;
        grafo1.cab = intArray71;
        ds.Grafo.Aresta aresta78 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[35]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[35]");
        org.junit.Assert.assertNull(aresta78);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) ' ', (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        int int40 = grafo36.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 1);
        int[] intArray46 = new int[] { '#' };
        grafo44.prox = intArray46;
        grafo42.prox = intArray46;
        grafo36.cab = intArray46;
        int int50 = grafo36.numVertices();
        boolean boolean52 = grafo36.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int int55 = grafo54.numVertices();
        grafo54.imprime();
        grafo54.imprime();
        boolean boolean60 = grafo54.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        int int63 = grafo62.numVertices();
        int[] intArray64 = null;
        grafo62.cab = intArray64;
        int int66 = grafo62.numVertices();
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 1);
        int[] intArray72 = new int[] { '#' };
        grafo70.prox = intArray72;
        grafo68.prox = intArray72;
        grafo62.cab = intArray72;
        grafo54.prox = intArray72;
        grafo36.peso = intArray72;
        grafo1.cab = intArray72;
        java.lang.Class<?> wildcardClass79 = intArray72.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo1.numVertices();
        boolean boolean9 = grafo1.listaAdjVazia(35);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        int[] intArray13 = null;
        grafo11.cab = intArray13;
        int int15 = grafo11.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int[] intArray21 = new int[] { '#' };
        grafo19.prox = intArray21;
        grafo17.prox = intArray21;
        grafo11.cab = intArray21;
        int int25 = grafo11.numVertices();
        boolean boolean27 = grafo11.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int int30 = grafo29.numVertices();
        grafo29.imprime();
        boolean boolean33 = grafo29.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo34 = grafo29.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta(10, (int) (byte) -1);
        int[] intArray44 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo36.peso = intArray44;
        boolean boolean47 = grafo36.listaAdjVazia((int) (short) 1);
        int[] intArray48 = grafo36.peso;
        grafo29.prox = intArray48;
        grafo11.cab = intArray48;
        grafo1.cab = intArray48;
        java.lang.Class<?> wildcardClass52 = intArray48.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(10, (int) (byte) -1);
        int[] intArray16 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo8.peso = intArray16;
        boolean boolean19 = grafo8.listaAdjVazia((int) (short) 1);
        int[] intArray20 = grafo8.peso;
        grafo1.prox = intArray20;
        int int22 = grafo1.numVertices();
        int[] intArray23 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = grafo1.existeAresta((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, -1, 35, 0]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        int int23 = grafo1.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        int[] intArray27 = null;
        grafo25.cab = intArray27;
        int int29 = grafo25.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int[] intArray35 = new int[] { '#' };
        grafo33.prox = intArray35;
        grafo31.prox = intArray35;
        grafo25.cab = intArray35;
        ds.Grafo.Aresta aresta41 = grafo25.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 1);
        int[] intArray45 = new int[] { '#' };
        grafo43.prox = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int[] intArray52 = new int[] { '#' };
        grafo50.prox = intArray52;
        grafo48.prox = intArray52;
        grafo43.cab = intArray52;
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 1);
        int int58 = grafo57.numVertices();
        int[] intArray59 = null;
        grafo57.cab = intArray59;
        int int61 = grafo57.numVertices();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 1);
        int[] intArray67 = new int[] { '#' };
        grafo65.prox = intArray67;
        grafo63.prox = intArray67;
        grafo57.cab = intArray67;
        grafo43.cab = intArray67;
        grafo25.cab = intArray67;
        grafo1.prox = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = grafo1.existeAresta((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[35]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 100, (int) (short) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        int[] intArray24 = grafo1.cab;
        int[] intArray25 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int[] intArray10 = new int[] { '#' };
        grafo8.prox = intArray10;
        grafo6.prox = intArray10;
        grafo1.cab = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo14 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        grafo32.imprime();
        grafo32.imprime();
        boolean boolean38 = grafo32.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int int41 = grafo40.numVertices();
        int[] intArray42 = null;
        grafo40.cab = intArray42;
        int int44 = grafo40.numVertices();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int[] intArray50 = new int[] { '#' };
        grafo48.prox = intArray50;
        grafo46.prox = intArray50;
        grafo40.cab = intArray50;
        grafo32.prox = intArray50;
        grafo1.peso = intArray50;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = grafo1.existeAresta((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[35]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 10, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 0, (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        grafo9.imprime();
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int int18 = grafo17.numVertices();
        int[] intArray19 = null;
        grafo17.cab = intArray19;
        int int21 = grafo17.numVertices();
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        grafo23.prox = intArray27;
        grafo17.cab = intArray27;
        grafo9.prox = intArray27;
        int[] intArray35 = new int[] { (byte) 0, 10, 1 };
        grafo9.peso = intArray35;
        int[] intArray37 = null;
        grafo9.peso = intArray37;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int int41 = grafo40.numVertices();
        grafo40.imprime();
        grafo40.imprime();
        boolean boolean46 = grafo40.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int int49 = grafo48.numVertices();
        int[] intArray50 = null;
        grafo48.cab = intArray50;
        int int52 = grafo48.numVertices();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        int[] intArray58 = new int[] { '#' };
        grafo56.prox = intArray58;
        grafo54.prox = intArray58;
        grafo48.cab = intArray58;
        grafo40.prox = intArray58;
        grafo9.peso = intArray58;
        grafo6.prox = intArray58;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo1.listaAdjVazia((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        grafo1.insereAresta(10, (int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 10, 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.proxAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        boolean boolean10 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(aresta12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta46 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta46);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 10, (-1));
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        boolean boolean11 = grafo5.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        int[] intArray15 = null;
        grafo13.cab = intArray15;
        int int17 = grafo13.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int[] intArray23 = new int[] { '#' };
        grafo21.prox = intArray23;
        grafo19.prox = intArray23;
        grafo13.cab = intArray23;
        grafo5.prox = intArray23;
        int[] intArray31 = new int[] { (byte) 0, 10, 1 };
        grafo5.peso = intArray31;
        int[] intArray33 = null;
        grafo5.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        int int40 = grafo39.numVertices();
        int[] intArray41 = null;
        grafo39.cab = intArray41;
        int int43 = grafo39.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) (byte) -1);
        int[] intArray53 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo45.peso = intArray53;
        grafo39.peso = intArray53;
        grafo36.prox = intArray53;
        grafo5.prox = intArray53;
        grafo1.prox = intArray53;
        grafo1.insereAresta(0, (int) (short) 10, 0);
        int int63 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = grafo1.existeAresta(35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 0, 35, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int[] intArray21 = new int[] { '#' };
        grafo19.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int[] intArray28 = new int[] { '#' };
        grafo26.prox = intArray28;
        grafo24.prox = intArray28;
        grafo19.cab = intArray28;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo19.cab = intArray43;
        grafo1.cab = intArray43;
        ds.Grafo.Aresta aresta51 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta53 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNull(aresta51);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass44 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo6.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        int[] intArray16 = new int[] { (byte) 10, 35, 1, (short) 100, (byte) 1, (byte) 0 };
        grafo1.peso = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 35, 1, 100, 1, 0]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (short) 1, 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int int42 = grafo41.numVertices();
        grafo41.imprime();
        grafo41.imprime();
        boolean boolean47 = grafo41.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 1);
        int int50 = grafo49.numVertices();
        int[] intArray51 = null;
        grafo49.cab = intArray51;
        int int53 = grafo49.numVertices();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 1);
        int[] intArray59 = new int[] { '#' };
        grafo57.prox = intArray59;
        grafo55.prox = intArray59;
        grafo49.cab = intArray59;
        grafo41.prox = intArray59;
        int[] intArray67 = new int[] { (byte) 0, 10, 1 };
        grafo41.peso = intArray67;
        grafo36.prox = intArray67;
        grafo1.peso = intArray67;
        int int71 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        grafo7.insereAresta(10, 100, (int) '4');
        grafo7.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta17 = grafo7.proxAdj(0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        boolean boolean23 = grafo19.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo24 = grafo19.grafoTransposto();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        int[] intArray30 = new int[] { '#' };
        grafo28.prox = intArray30;
        grafo26.prox = intArray30;
        ds.Grafo.Aresta aresta34 = grafo26.primeiroListaAdj((int) (short) 0);
        int[] intArray35 = grafo26.prox;
        grafo19.peso = intArray35;
        ds.Grafo.Aresta aresta38 = grafo19.proxAdj((int) (byte) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int int41 = grafo40.numVertices();
        int[] intArray42 = null;
        grafo40.cab = intArray42;
        int int44 = grafo40.numVertices();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta49 = grafo46.retiraAresta(10, (int) (byte) -1);
        int[] intArray54 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo46.peso = intArray54;
        grafo40.peso = intArray54;
        grafo19.cab = intArray54;
        grafo7.prox = intArray54;
        grafo1.cab = intArray54;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[35]");
        org.junit.Assert.assertNotNull(aresta34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, -1, 35, 0]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int int18 = grafo17.numVertices();
        int[] intArray19 = null;
        grafo17.cab = intArray19;
        int int21 = grafo17.numVertices();
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        grafo23.prox = intArray27;
        grafo17.cab = intArray27;
        int int31 = grafo17.numVertices();
        boolean boolean33 = grafo17.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        grafo35.imprime();
        boolean boolean39 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo40 = grafo35.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) (byte) -1);
        int[] intArray50 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo42.peso = intArray50;
        boolean boolean53 = grafo42.listaAdjVazia((int) (short) 1);
        int[] intArray54 = grafo42.peso;
        grafo35.prox = intArray54;
        grafo17.cab = intArray54;
        grafo1.cab = intArray54;
        ds.Grafo.Aresta aresta60 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        int[] intArray61 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, -1, 35, 0]");
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, -1, 35, 0]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 1);
        int[] intArray49 = new int[] { '#' };
        grafo47.prox = intArray49;
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int[] intArray56 = new int[] { '#' };
        grafo54.prox = intArray56;
        grafo52.prox = intArray56;
        grafo47.cab = intArray56;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        int int62 = grafo61.numVertices();
        int[] intArray63 = null;
        grafo61.cab = intArray63;
        int int65 = grafo61.numVertices();
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 1);
        int[] intArray71 = new int[] { '#' };
        grafo69.prox = intArray71;
        grafo67.prox = intArray71;
        grafo61.cab = intArray71;
        grafo47.cab = intArray71;
        grafo1.cab = intArray71;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = grafo1.existeAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[35]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[35]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 1, 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        boolean boolean15 = grafo1.existeAresta((int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo16 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int int5 = grafo4.numVertices();
        grafo4.insereAresta(52, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        int[] intArray8 = null;
        grafo6.cab = intArray8;
        int int10 = grafo6.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int[] intArray16 = new int[] { '#' };
        grafo14.prox = intArray16;
        grafo12.prox = intArray16;
        grafo6.cab = intArray16;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass6 = grafo5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        int int31 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta((int) '4', (int) (short) 0, (-1));
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) (byte) -1);
        int[] intArray15 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo7.peso = intArray15;
        boolean boolean18 = grafo7.listaAdjVazia((int) (short) 1);
        int[] intArray19 = grafo7.peso;
        grafo1.prox = intArray19;
        int[] intArray21 = null;
        grafo1.cab = intArray21;
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, -1, 35, 0]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        grafo1.cab = intArray37;
        grafo1.imprime();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        boolean boolean46 = grafo42.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo47 = grafo42.grafoTransposto();
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta52 = grafo49.retiraAresta(10, (int) (byte) -1);
        int[] intArray57 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo49.peso = intArray57;
        boolean boolean60 = grafo49.listaAdjVazia((int) (short) 1);
        int[] intArray61 = grafo49.peso;
        grafo42.prox = intArray61;
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 1);
        grafo64.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 1);
        int int71 = grafo70.numVertices();
        int[] intArray72 = null;
        grafo70.cab = intArray72;
        int int74 = grafo70.numVertices();
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo78 = new ds.Grafo((int) (short) 1);
        int[] intArray80 = new int[] { '#' };
        grafo78.prox = intArray80;
        grafo76.prox = intArray80;
        grafo70.cab = intArray80;
        grafo64.prox = intArray80;
        grafo42.peso = intArray80;
        grafo1.cab = intArray80;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(grafo47);
        org.junit.Assert.assertNull(aresta52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[35]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo(100);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        grafo1.cab = intArray37;
        boolean boolean42 = grafo1.existeAresta((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        int[] intArray16 = new int[] { (byte) 10, 35, 1, (short) 100, (byte) 1, (byte) 0 };
        grafo1.peso = intArray16;
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 35, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        grafo46.imprime();
        grafo46.imprime();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 1);
        int int52 = grafo51.numVertices();
        grafo51.imprime();
        grafo51.imprime();
        boolean boolean57 = grafo51.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        int int60 = grafo59.numVertices();
        int[] intArray61 = null;
        grafo59.cab = intArray61;
        int int63 = grafo59.numVertices();
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        int[] intArray69 = new int[] { '#' };
        grafo67.prox = intArray69;
        grafo65.prox = intArray69;
        grafo59.cab = intArray69;
        grafo51.prox = intArray69;
        grafo46.peso = intArray69;
        grafo1.cab = intArray69;
        boolean boolean77 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[35]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(grafo78);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int int18 = grafo17.numVertices();
        int[] intArray19 = null;
        grafo17.cab = intArray19;
        int int21 = grafo17.numVertices();
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        grafo23.prox = intArray27;
        grafo17.cab = intArray27;
        int int31 = grafo17.numVertices();
        boolean boolean33 = grafo17.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        grafo35.imprime();
        boolean boolean39 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo40 = grafo35.grafoTransposto();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta45 = grafo42.retiraAresta(10, (int) (byte) -1);
        int[] intArray50 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo42.peso = intArray50;
        boolean boolean53 = grafo42.listaAdjVazia((int) (short) 1);
        int[] intArray54 = grafo42.peso;
        grafo35.prox = intArray54;
        grafo17.cab = intArray54;
        grafo1.cab = intArray54;
        int int58 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(grafo40);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        int[] intArray8 = null;
        grafo6.cab = intArray8;
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        grafo6.prox = intArray37;
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int int42 = grafo41.numVertices();
        int[] intArray43 = null;
        grafo41.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        grafo46.imprime();
        grafo46.imprime();
        boolean boolean52 = grafo46.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int int55 = grafo54.numVertices();
        int[] intArray56 = null;
        grafo54.cab = intArray56;
        int int58 = grafo54.numVertices();
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        int[] intArray64 = new int[] { '#' };
        grafo62.prox = intArray64;
        grafo60.prox = intArray64;
        grafo54.cab = intArray64;
        grafo46.prox = intArray64;
        int[] intArray72 = new int[] { (byte) 0, 10, 1 };
        grafo46.peso = intArray72;
        grafo41.prox = intArray72;
        grafo6.peso = intArray72;
        grafo1.peso = intArray72;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta78 = grafo1.primeiroListaAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 10, 1]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(0, (int) '#', 0);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        int[] intArray39 = null;
        grafo11.peso = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        int[] intArray47 = null;
        grafo45.cab = intArray47;
        int int49 = grafo45.numVertices();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) (byte) -1);
        int[] intArray59 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo51.peso = intArray59;
        grafo45.peso = intArray59;
        grafo42.prox = intArray59;
        grafo11.prox = intArray59;
        grafo7.prox = intArray59;
        grafo1.prox = intArray59;
        int int66 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int int13 = grafo12.numVertices();
        boolean boolean16 = grafo12.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo17 = grafo12.grafoTransposto();
        boolean boolean20 = grafo12.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        grafo22.imprime();
        grafo22.imprime();
        boolean boolean28 = grafo22.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        int[] intArray32 = null;
        grafo30.cab = intArray32;
        int int34 = grafo30.numVertices();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 1);
        int[] intArray40 = new int[] { '#' };
        grafo38.prox = intArray40;
        grafo36.prox = intArray40;
        grafo30.cab = intArray40;
        grafo22.prox = intArray40;
        int[] intArray48 = new int[] { (byte) 0, 10, 1 };
        grafo22.peso = intArray48;
        grafo12.cab = intArray48;
        grafo1.prox = intArray48;
        grafo1.insereAresta(1, 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 0, 1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta75 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        ds.Grafo grafo74 = grafo1.grafoTransposto();
        int[] intArray75 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta77 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 10, 1]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 1, (int) '#');
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        int int5 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.existeAresta((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) (byte) -1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) -1, (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = grafo1.existeAresta(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta75 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        boolean boolean15 = grafo1.existeAresta((int) '4', 1);
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        ds.Grafo grafo74 = grafo1.grafoTransposto();
        int int75 = grafo74.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        boolean boolean7 = grafo1.existeAresta(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(10, (int) (byte) -1);
        int[] intArray16 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo8.peso = intArray16;
        boolean boolean19 = grafo8.listaAdjVazia((int) (short) 1);
        int[] intArray20 = grafo8.peso;
        grafo1.prox = intArray20;
        int int22 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        int[] intArray13 = grafo1.peso;
        boolean boolean15 = grafo1.listaAdjVazia(0);
        grafo1.insereAresta(52, 0, (int) (byte) -1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int int29 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = grafo1.listaAdjVazia((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        int int10 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(52);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        java.lang.Class<?> wildcardClass9 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int[] intArray8 = new int[] { '#' };
        grafo6.prox = intArray8;
        grafo1.peso = intArray8;
        java.lang.Class<?> wildcardClass11 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 10, 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 32, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        int[] intArray24 = grafo1.cab;
        java.lang.Class<?> wildcardClass25 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        grafo46.imprime();
        ds.Grafo grafo49 = grafo46.grafoTransposto();
        boolean boolean51 = grafo49.listaAdjVazia(10);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        int int54 = grafo53.numVertices();
        int[] intArray55 = null;
        grafo53.cab = intArray55;
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int int59 = grafo58.numVertices();
        grafo58.imprime();
        grafo58.imprime();
        boolean boolean64 = grafo58.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 1);
        int int67 = grafo66.numVertices();
        int[] intArray68 = null;
        grafo66.cab = intArray68;
        int int70 = grafo66.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 1);
        int[] intArray76 = new int[] { '#' };
        grafo74.prox = intArray76;
        grafo72.prox = intArray76;
        grafo66.cab = intArray76;
        grafo58.prox = intArray76;
        int[] intArray84 = new int[] { (byte) 0, 10, 1 };
        grafo58.peso = intArray84;
        grafo53.prox = intArray84;
        grafo49.cab = intArray84;
        grafo1.prox = intArray84;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[35]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0, 10, 1]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (short) 100, (int) 'a');
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        grafo9.insereAresta(10, 100, (int) '4');
        grafo9.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        boolean boolean28 = grafo24.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo29 = grafo24.grafoTransposto();
        boolean boolean32 = grafo24.existeAresta((int) '4', (int) ' ');
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        int int35 = grafo34.numVertices();
        grafo34.imprime();
        grafo34.imprime();
        boolean boolean40 = grafo34.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        int[] intArray44 = null;
        grafo42.cab = intArray44;
        int int46 = grafo42.numVertices();
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int[] intArray52 = new int[] { '#' };
        grafo50.prox = intArray52;
        grafo48.prox = intArray52;
        grafo42.cab = intArray52;
        grafo34.prox = intArray52;
        int[] intArray60 = new int[] { (byte) 0, 10, 1 };
        grafo34.peso = intArray60;
        grafo24.cab = intArray60;
        grafo19.cab = intArray60;
        grafo9.peso = intArray60;
        grafo1.cab = intArray60;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[35]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 10, 1]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        int[] intArray20 = new int[] { '#' };
        grafo18.prox = intArray20;
        grafo16.prox = intArray20;
        grafo1.cab = intArray20;
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta27 = grafo1.retiraAresta(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35]");
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta27);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 100);
        int[] intArray18 = null;
        grafo1.prox = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int int22 = grafo21.numVertices();
        int[] intArray23 = null;
        grafo21.cab = intArray23;
        int int25 = grafo21.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int[] intArray31 = new int[] { '#' };
        grafo29.prox = intArray31;
        grafo27.prox = intArray31;
        grafo21.cab = intArray31;
        ds.Grafo.Aresta aresta37 = grafo21.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta40 = grafo21.retiraAresta(10, (int) (short) 10);
        boolean boolean42 = grafo21.listaAdjVazia((int) 'a');
        grafo21.imprime();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int[] intArray47 = new int[] { '#' };
        grafo45.prox = intArray47;
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        grafo50.imprime();
        ds.Grafo grafo53 = grafo50.grafoTransposto();
        boolean boolean55 = grafo53.listaAdjVazia(10);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 1);
        int int58 = grafo57.numVertices();
        int[] intArray59 = null;
        grafo57.cab = intArray59;
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        int int63 = grafo62.numVertices();
        grafo62.imprime();
        grafo62.imprime();
        boolean boolean68 = grafo62.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 1);
        int int71 = grafo70.numVertices();
        int[] intArray72 = null;
        grafo70.cab = intArray72;
        int int74 = grafo70.numVertices();
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo78 = new ds.Grafo((int) (short) 1);
        int[] intArray80 = new int[] { '#' };
        grafo78.prox = intArray80;
        grafo76.prox = intArray80;
        grafo70.cab = intArray80;
        grafo62.prox = intArray80;
        int[] intArray88 = new int[] { (byte) 0, 10, 1 };
        grafo62.peso = intArray88;
        grafo57.prox = intArray88;
        grafo53.cab = intArray88;
        grafo45.cab = intArray88;
        grafo21.peso = intArray88;
        grafo1.cab = intArray88;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35]");
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[35]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[0, 10, 1]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        int[] intArray37 = null;
        grafo35.cab = intArray37;
        int int39 = grafo35.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) (byte) -1);
        int[] intArray49 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo41.peso = intArray49;
        grafo35.peso = intArray49;
        grafo32.prox = intArray49;
        grafo1.prox = intArray49;
        int[] intArray54 = null;
        grafo1.cab = intArray54;
        java.lang.Class<?> wildcardClass56 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) ' ', (int) '#');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        int[] intArray13 = null;
        grafo1.peso = intArray13;
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo(52);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean23 = grafo1.existeAresta((int) (short) 100, (int) (byte) 100);
        boolean boolean25 = grafo1.listaAdjVazia(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 10, (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.cab = intArray24;
        java.lang.Class<?> wildcardClass30 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        int int15 = grafo1.numVertices();
        int int16 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        int[] intArray10 = null;
        grafo8.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        grafo13.imprime();
        grafo13.imprime();
        boolean boolean19 = grafo13.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int int22 = grafo21.numVertices();
        int[] intArray23 = null;
        grafo21.cab = intArray23;
        int int25 = grafo21.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int[] intArray31 = new int[] { '#' };
        grafo29.prox = intArray31;
        grafo27.prox = intArray31;
        grafo21.cab = intArray31;
        grafo13.prox = intArray31;
        int[] intArray39 = new int[] { (byte) 0, 10, 1 };
        grafo13.peso = intArray39;
        grafo8.prox = intArray39;
        grafo4.cab = intArray39;
        ds.Grafo grafo43 = grafo4.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        grafo45.imprime();
        grafo45.imprime();
        boolean boolean51 = grafo45.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        int int54 = grafo53.numVertices();
        int[] intArray55 = null;
        grafo53.cab = intArray55;
        int int57 = grafo53.numVertices();
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        int[] intArray63 = new int[] { '#' };
        grafo61.prox = intArray63;
        grafo59.prox = intArray63;
        grafo53.cab = intArray63;
        grafo45.prox = intArray63;
        int[] intArray71 = new int[] { (byte) 0, 10, 1 };
        grafo45.peso = intArray71;
        int[] intArray73 = null;
        grafo45.peso = intArray73;
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 1);
        int int77 = grafo76.numVertices();
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 1);
        int int80 = grafo79.numVertices();
        int[] intArray81 = null;
        grafo79.cab = intArray81;
        int int83 = grafo79.numVertices();
        ds.Grafo grafo85 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta88 = grafo85.retiraAresta(10, (int) (byte) -1);
        int[] intArray93 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo85.peso = intArray93;
        grafo79.peso = intArray93;
        grafo76.prox = intArray93;
        grafo45.prox = intArray93;
        grafo43.cab = intArray93;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNull(aresta88);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[100, -1, 35, 0]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        ds.Grafo.Aresta aresta23 = grafo7.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta26 = grafo7.retiraAresta(10, (int) (short) 10);
        boolean boolean28 = grafo7.listaAdjVazia((int) 'a');
        grafo7.imprime();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 1);
        int[] intArray33 = new int[] { '#' };
        grafo31.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        grafo36.imprime();
        ds.Grafo grafo39 = grafo36.grafoTransposto();
        boolean boolean41 = grafo39.listaAdjVazia(10);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 1);
        int int44 = grafo43.numVertices();
        int[] intArray45 = null;
        grafo43.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int int49 = grafo48.numVertices();
        grafo48.imprime();
        grafo48.imprime();
        boolean boolean54 = grafo48.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        int int57 = grafo56.numVertices();
        int[] intArray58 = null;
        grafo56.cab = intArray58;
        int int60 = grafo56.numVertices();
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 1);
        int[] intArray66 = new int[] { '#' };
        grafo64.prox = intArray66;
        grafo62.prox = intArray66;
        grafo56.cab = intArray66;
        grafo48.prox = intArray66;
        int[] intArray74 = new int[] { (byte) 0, 10, 1 };
        grafo48.peso = intArray74;
        grafo43.prox = intArray74;
        grafo39.cab = intArray74;
        grafo31.cab = intArray74;
        grafo7.peso = intArray74;
        ds.Grafo grafo80 = grafo7.grafoTransposto();
        int[] intArray81 = grafo7.peso;
        grafo1.cab = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(grafo39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo80);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 10, 1]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 10, (int) '4');
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        int[] intArray8 = null;
        grafo6.cab = intArray8;
        int int10 = grafo6.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int[] intArray16 = new int[] { '#' };
        grafo14.prox = intArray16;
        grafo12.prox = intArray16;
        grafo6.cab = intArray16;
        grafo1.prox = intArray16;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        int[] intArray24 = null;
        grafo22.cab = intArray24;
        int int26 = grafo22.numVertices();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int[] intArray32 = new int[] { '#' };
        grafo30.prox = intArray32;
        grafo28.prox = intArray32;
        grafo22.cab = intArray32;
        ds.Grafo.Aresta aresta38 = grafo22.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int[] intArray42 = new int[] { '#' };
        grafo40.prox = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 1);
        int[] intArray49 = new int[] { '#' };
        grafo47.prox = intArray49;
        grafo45.prox = intArray49;
        grafo40.cab = intArray49;
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int int55 = grafo54.numVertices();
        int[] intArray56 = null;
        grafo54.cab = intArray56;
        int int58 = grafo54.numVertices();
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        int[] intArray64 = new int[] { '#' };
        grafo62.prox = intArray64;
        grafo60.prox = intArray64;
        grafo54.cab = intArray64;
        grafo40.cab = intArray64;
        grafo22.cab = intArray64;
        grafo1.cab = intArray64;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35]");
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[35]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[35]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) '#');
        boolean boolean47 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int[] intArray21 = new int[] { '#' };
        grafo19.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int[] intArray28 = new int[] { '#' };
        grafo26.prox = intArray28;
        grafo24.prox = intArray28;
        grafo19.cab = intArray28;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo19.cab = intArray43;
        grafo1.cab = intArray43;
        grafo1.insereAresta((int) (short) 10, 35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        int int40 = grafo36.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 1);
        int[] intArray46 = new int[] { '#' };
        grafo44.prox = intArray46;
        grafo42.prox = intArray46;
        grafo36.cab = intArray46;
        int int50 = grafo36.numVertices();
        boolean boolean52 = grafo36.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        int int55 = grafo54.numVertices();
        grafo54.imprime();
        grafo54.imprime();
        boolean boolean60 = grafo54.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        int int63 = grafo62.numVertices();
        int[] intArray64 = null;
        grafo62.cab = intArray64;
        int int66 = grafo62.numVertices();
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 1);
        int[] intArray72 = new int[] { '#' };
        grafo70.prox = intArray72;
        grafo68.prox = intArray72;
        grafo62.cab = intArray72;
        grafo54.prox = intArray72;
        grafo36.peso = intArray72;
        grafo1.cab = intArray72;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = grafo1.existeAresta(32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        int[] intArray20 = new int[] { '#' };
        grafo18.prox = intArray20;
        grafo16.prox = intArray20;
        grafo1.cab = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 10, 32);
        boolean boolean23 = grafo1.listaAdjVazia(100);
        int[] intArray24 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 1);
        int[] intArray6 = new int[] { '#' };
        grafo4.prox = intArray6;
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int[] intArray13 = new int[] { '#' };
        grafo11.prox = intArray13;
        grafo9.prox = intArray13;
        grafo4.cab = intArray13;
        grafo2.peso = intArray13;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int int30 = grafo29.numVertices();
        grafo29.imprime();
        grafo29.imprime();
        boolean boolean35 = grafo29.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        int int41 = grafo37.numVertices();
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int[] intArray47 = new int[] { '#' };
        grafo45.prox = intArray47;
        grafo43.prox = intArray47;
        grafo37.cab = intArray47;
        grafo29.prox = intArray47;
        int[] intArray55 = new int[] { (byte) 0, 10, 1 };
        grafo29.peso = intArray55;
        grafo24.prox = intArray55;
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        int int60 = grafo59.numVertices();
        int[] intArray61 = null;
        grafo59.cab = intArray61;
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 1);
        int int65 = grafo64.numVertices();
        grafo64.imprime();
        grafo64.imprime();
        boolean boolean70 = grafo64.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 1);
        int int73 = grafo72.numVertices();
        int[] intArray74 = null;
        grafo72.cab = intArray74;
        int int76 = grafo72.numVertices();
        ds.Grafo grafo78 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 1);
        int[] intArray82 = new int[] { '#' };
        grafo80.prox = intArray82;
        grafo78.prox = intArray82;
        grafo72.cab = intArray82;
        grafo64.prox = intArray82;
        int[] intArray90 = new int[] { (byte) 0, 10, 1 };
        grafo64.peso = intArray90;
        grafo59.prox = intArray90;
        grafo24.peso = intArray90;
        grafo19.peso = intArray90;
        grafo2.prox = intArray90;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[0, 10, 1]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        int int11 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass12 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        ds.Grafo grafo74 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = grafo74.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo74);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 52);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (int) (byte) 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.insereAresta(100, (int) '4', (int) (byte) 1);
        boolean boolean7 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 100, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        boolean boolean10 = grafo6.existeAresta((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo6.existeAresta((int) (short) 1, (int) (short) 1);
        boolean boolean11 = grafo6.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo6.existeAresta((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int[] intArray8 = new int[] { '#' };
        grafo6.prox = intArray8;
        grafo4.prox = intArray8;
        boolean boolean13 = grafo4.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(10, (int) (byte) -1);
        int[] intArray23 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo15.peso = intArray23;
        boolean boolean26 = grafo15.listaAdjVazia((int) (short) 1);
        int[] intArray27 = grafo15.peso;
        grafo4.cab = intArray27;
        grafo1.peso = intArray27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1, 35, 0]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(10, (int) (byte) -1);
        int[] intArray16 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo8.peso = intArray16;
        boolean boolean19 = grafo8.listaAdjVazia((int) (short) 1);
        int[] intArray20 = grafo8.peso;
        grafo1.prox = intArray20;
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        grafo23.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int int30 = grafo29.numVertices();
        int[] intArray31 = null;
        grafo29.cab = intArray31;
        int int33 = grafo29.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int[] intArray39 = new int[] { '#' };
        grafo37.prox = intArray39;
        grafo35.prox = intArray39;
        grafo29.cab = intArray39;
        grafo23.prox = intArray39;
        grafo1.peso = intArray39;
        boolean boolean46 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int int49 = grafo48.numVertices();
        grafo48.imprime();
        grafo48.imprime();
        boolean boolean54 = grafo48.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        int int57 = grafo56.numVertices();
        int[] intArray58 = null;
        grafo56.cab = intArray58;
        int int60 = grafo56.numVertices();
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 1);
        int[] intArray66 = new int[] { '#' };
        grafo64.prox = intArray66;
        grafo62.prox = intArray66;
        grafo56.cab = intArray66;
        grafo48.prox = intArray66;
        int[] intArray74 = new int[] { (byte) 0, 10, 1 };
        grafo48.peso = intArray74;
        grafo1.cab = intArray74;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 10, 1]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta48 = grafo1.retiraAresta(0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertNull(aresta48);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        ds.Grafo.Aresta aresta26 = grafo22.retiraAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        int int29 = grafo28.numVertices();
        grafo28.imprime();
        grafo28.imprime();
        boolean boolean34 = grafo28.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        int int40 = grafo36.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 1);
        int[] intArray46 = new int[] { '#' };
        grafo44.prox = intArray46;
        grafo42.prox = intArray46;
        grafo36.cab = intArray46;
        grafo28.prox = intArray46;
        int[] intArray54 = new int[] { (byte) 0, 10, 1 };
        grafo28.peso = intArray54;
        int[] intArray56 = null;
        grafo28.peso = intArray56;
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        int int60 = grafo59.numVertices();
        grafo59.imprime();
        grafo59.imprime();
        boolean boolean65 = grafo59.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        int int68 = grafo67.numVertices();
        int[] intArray69 = null;
        grafo67.cab = intArray69;
        int int71 = grafo67.numVertices();
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 1);
        int[] intArray77 = new int[] { '#' };
        grafo75.prox = intArray77;
        grafo73.prox = intArray77;
        grafo67.cab = intArray77;
        grafo59.prox = intArray77;
        grafo28.peso = intArray77;
        grafo22.peso = intArray77;
        grafo1.cab = intArray77;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        int[] intArray10 = null;
        grafo8.cab = intArray10;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        grafo13.imprime();
        grafo13.imprime();
        boolean boolean19 = grafo13.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int int22 = grafo21.numVertices();
        int[] intArray23 = null;
        grafo21.cab = intArray23;
        int int25 = grafo21.numVertices();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int[] intArray31 = new int[] { '#' };
        grafo29.prox = intArray31;
        grafo27.prox = intArray31;
        grafo21.cab = intArray31;
        grafo13.prox = intArray31;
        int[] intArray39 = new int[] { (byte) 0, 10, 1 };
        grafo13.peso = intArray39;
        grafo8.prox = intArray39;
        grafo4.cab = intArray39;
        ds.Grafo grafo43 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta46 = grafo4.retiraAresta(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta46);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        boolean boolean9 = grafo1.listaAdjVazia((int) '#');
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) -1, (int) (short) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        int[] intArray14 = new int[] { 10, (byte) 0, '#', 100, (byte) 0, 35 };
        grafo1.prox = intArray14;
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 35, 100, 0, 35]");
        org.junit.Assert.assertNotNull(aresta17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo.Aresta aresta45 = grafo1.retiraAresta(100, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNull(aresta45);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) 'a', (int) (short) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        boolean boolean16 = grafo1.listaAdjVazia(0);
        int int17 = grafo1.numVertices();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo18.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        grafo1.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        grafo14.imprime();
        grafo14.imprime();
        boolean boolean20 = grafo14.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int int23 = grafo22.numVertices();
        int[] intArray24 = null;
        grafo22.cab = intArray24;
        int int26 = grafo22.numVertices();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int[] intArray32 = new int[] { '#' };
        grafo30.prox = intArray32;
        grafo28.prox = intArray32;
        grafo22.cab = intArray32;
        grafo14.prox = intArray32;
        int[] intArray40 = new int[] { (byte) 0, 10, 1 };
        grafo14.peso = intArray40;
        int[] intArray42 = null;
        grafo14.peso = intArray42;
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        grafo45.imprime();
        grafo45.imprime();
        boolean boolean51 = grafo45.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        int int54 = grafo53.numVertices();
        int[] intArray55 = null;
        grafo53.cab = intArray55;
        int int57 = grafo53.numVertices();
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        int[] intArray63 = new int[] { '#' };
        grafo61.prox = intArray63;
        grafo59.prox = intArray63;
        grafo53.cab = intArray63;
        grafo45.prox = intArray63;
        grafo14.peso = intArray63;
        grafo8.peso = intArray63;
        grafo1.prox = intArray63;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        grafo24.insereAresta(0, (int) '#', 0);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        boolean boolean32 = grafo30.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        int int35 = grafo34.numVertices();
        grafo34.imprime();
        grafo34.imprime();
        boolean boolean40 = grafo34.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        int[] intArray44 = null;
        grafo42.cab = intArray44;
        int int46 = grafo42.numVertices();
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int[] intArray52 = new int[] { '#' };
        grafo50.prox = intArray52;
        grafo48.prox = intArray52;
        grafo42.cab = intArray52;
        grafo34.prox = intArray52;
        int[] intArray60 = new int[] { (byte) 0, 10, 1 };
        grafo34.peso = intArray60;
        int[] intArray62 = null;
        grafo34.peso = intArray62;
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 1);
        int int66 = grafo65.numVertices();
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 1);
        int int69 = grafo68.numVertices();
        int[] intArray70 = null;
        grafo68.cab = intArray70;
        int int72 = grafo68.numVertices();
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta77 = grafo74.retiraAresta(10, (int) (byte) -1);
        int[] intArray82 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo74.peso = intArray82;
        grafo68.peso = intArray82;
        grafo65.prox = intArray82;
        grafo34.prox = intArray82;
        grafo30.prox = intArray82;
        grafo24.prox = intArray82;
        grafo1.peso = intArray82;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[35]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, -1, 35, 0]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        int int10 = aresta3.v1();
        int int11 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo1.existeAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) '4', 100);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        ds.Grafo grafo74 = grafo1.grafoTransposto();
        int[] intArray75 = grafo1.peso;
        ds.Grafo.Aresta aresta77 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 10, 1]");
        org.junit.Assert.assertNull(aresta77);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = grafo1.peso;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 0);
        grafo31.insereAresta((int) '4', (int) (short) 0, (-1));
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta40 = grafo37.retiraAresta(10, (int) (byte) -1);
        int[] intArray45 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo37.peso = intArray45;
        boolean boolean48 = grafo37.listaAdjVazia((int) (short) 1);
        int[] intArray49 = grafo37.peso;
        grafo31.prox = intArray49;
        grafo1.prox = intArray49;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 1]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, -1, 35, 0]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 100, (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) -1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        int int43 = grafo1.numVertices();
        int[] intArray44 = null;
        grafo1.cab = intArray44;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        int[] intArray11 = grafo1.peso;
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 35, 0]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        grafo1.imprime();
        boolean boolean21 = grafo1.existeAresta((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        int int8 = grafo7.numVertices();
        int[] intArray9 = null;
        grafo7.cab = intArray9;
        int int11 = grafo7.numVertices();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int[] intArray17 = new int[] { '#' };
        grafo15.prox = intArray17;
        grafo13.prox = intArray17;
        grafo7.cab = intArray17;
        grafo1.prox = intArray17;
        boolean boolean23 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        boolean boolean29 = grafo25.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        int[] intArray36 = new int[] { '#' };
        grafo34.prox = intArray36;
        grafo32.prox = intArray36;
        ds.Grafo.Aresta aresta40 = grafo32.primeiroListaAdj((int) (short) 0);
        int[] intArray41 = grafo32.prox;
        grafo25.peso = intArray41;
        ds.Grafo.Aresta aresta44 = grafo25.proxAdj((int) (byte) 0);
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        int[] intArray48 = null;
        grafo46.cab = intArray48;
        int int50 = grafo46.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta(10, (int) (byte) -1);
        int[] intArray60 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo52.peso = intArray60;
        grafo46.peso = intArray60;
        grafo25.cab = intArray60;
        grafo1.cab = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = grafo1.existeAresta((int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35]");
        org.junit.Assert.assertNotNull(aresta40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35]");
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNull(aresta55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, -1, 35, 0]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int[] intArray21 = new int[] { '#' };
        grafo19.prox = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int[] intArray28 = new int[] { '#' };
        grafo26.prox = intArray28;
        grafo24.prox = intArray28;
        grafo19.cab = intArray28;
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo19.cab = intArray43;
        grafo1.cab = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo1.retiraAresta((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = aresta10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        int[] intArray32 = new int[] { (byte) 0, 10, 1 };
        grafo6.peso = intArray32;
        grafo1.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int int42 = grafo41.numVertices();
        grafo41.imprime();
        grafo41.imprime();
        boolean boolean47 = grafo41.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 1);
        int int50 = grafo49.numVertices();
        int[] intArray51 = null;
        grafo49.cab = intArray51;
        int int53 = grafo49.numVertices();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo57 = new ds.Grafo((int) (short) 1);
        int[] intArray59 = new int[] { '#' };
        grafo57.prox = intArray59;
        grafo55.prox = intArray59;
        grafo49.cab = intArray59;
        grafo41.prox = intArray59;
        int[] intArray67 = new int[] { (byte) 0, 10, 1 };
        grafo41.peso = intArray67;
        grafo36.prox = intArray67;
        grafo1.peso = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta73 = grafo1.retiraAresta((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 10, 1]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) 'a', 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int45 = grafo1.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 0);
        grafo47.insereAresta((int) '4', (int) (short) 0, (-1));
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, (int) (byte) -1);
        int[] intArray61 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo53.peso = intArray61;
        boolean boolean64 = grafo53.listaAdjVazia((int) (short) 1);
        int[] intArray65 = grafo53.peso;
        grafo47.prox = intArray65;
        ds.Grafo grafo67 = grafo47.grafoTransposto();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 1);
        int int70 = grafo69.numVertices();
        int[] intArray71 = null;
        grafo69.cab = intArray71;
        int int73 = grafo69.numVertices();
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 1);
        int[] intArray79 = new int[] { '#' };
        grafo77.prox = intArray79;
        grafo75.prox = intArray79;
        grafo69.cab = intArray79;
        grafo67.cab = intArray79;
        grafo1.prox = intArray79;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        grafo10.imprime();
        boolean boolean16 = grafo10.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        int int19 = grafo18.numVertices();
        int[] intArray20 = null;
        grafo18.cab = intArray20;
        int int22 = grafo18.numVertices();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int[] intArray28 = new int[] { '#' };
        grafo26.prox = intArray28;
        grafo24.prox = intArray28;
        grafo18.cab = intArray28;
        grafo10.prox = intArray28;
        grafo5.peso = intArray28;
        grafo1.peso = intArray28;
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) -1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta(0, (-1));
        boolean boolean12 = grafo1.existeAresta(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 1, 52);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) 1, (int) 'a');
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int[] intArray10 = new int[] { '#' };
        grafo8.prox = intArray10;
        grafo6.prox = intArray10;
        grafo1.cab = intArray10;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int int16 = grafo15.numVertices();
        int[] intArray17 = null;
        grafo15.cab = intArray17;
        int int19 = grafo15.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        int[] intArray25 = new int[] { '#' };
        grafo23.prox = intArray25;
        grafo21.prox = intArray25;
        grafo15.cab = intArray25;
        grafo1.cab = intArray25;
        grafo1.insereAresta(100, (int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta35 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = grafo1.peso;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 1);
        int[] intArray33 = new int[] { '#' };
        grafo31.prox = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 1);
        int[] intArray40 = new int[] { '#' };
        grafo38.prox = intArray40;
        grafo36.prox = intArray40;
        grafo31.cab = intArray40;
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        int[] intArray47 = null;
        grafo45.cab = intArray47;
        int int49 = grafo45.numVertices();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        int[] intArray55 = new int[] { '#' };
        grafo53.prox = intArray55;
        grafo51.prox = intArray55;
        grafo45.cab = intArray55;
        grafo31.cab = intArray55;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta64 = grafo61.retiraAresta(10, (int) (byte) -1);
        int[] intArray69 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo61.peso = intArray69;
        boolean boolean72 = grafo61.listaAdjVazia((int) (short) 1);
        int[] intArray73 = grafo61.peso;
        grafo31.prox = intArray73;
        int[] intArray75 = grafo31.prox;
        grafo1.peso = intArray75;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[35]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35]");
        org.junit.Assert.assertNull(aresta64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, -1, 35, 0]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean23 = grafo1.existeAresta((int) (short) 100, (int) (byte) 100);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        grafo25.imprime();
        grafo25.imprime();
        boolean boolean31 = grafo25.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo25.prox = intArray43;
        int[] intArray51 = new int[] { (byte) 0, 10, 1 };
        grafo25.peso = intArray51;
        grafo1.prox = intArray51;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 10, 1]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) '4');
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        boolean boolean9 = grafo5.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int[] intArray16 = new int[] { '#' };
        grafo14.prox = intArray16;
        grafo12.prox = intArray16;
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj((int) (short) 0);
        int[] intArray21 = grafo12.prox;
        grafo5.peso = intArray21;
        ds.Grafo.Aresta aresta24 = grafo5.proxAdj((int) (byte) 0);
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        int int27 = grafo26.numVertices();
        int[] intArray28 = null;
        grafo26.cab = intArray28;
        int int30 = grafo26.numVertices();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta(10, (int) (byte) -1);
        int[] intArray40 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo32.peso = intArray40;
        grafo26.peso = intArray40;
        grafo5.cab = intArray40;
        grafo3.cab = intArray40;
        int[] intArray45 = grafo3.cab;
        grafo1.prox = intArray45;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35]");
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35]");
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, -1, 35, 0]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        int int43 = grafo1.numVertices();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNull(aresta45);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia(32);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        grafo6.imprime();
        boolean boolean12 = grafo6.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo6.prox = intArray24;
        grafo1.peso = intArray24;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 100, (int) (byte) -1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo1.existeAresta((int) ' ', (int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        boolean boolean19 = grafo10.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta(10, (int) (byte) -1);
        int[] intArray29 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo21.peso = intArray29;
        boolean boolean32 = grafo21.listaAdjVazia((int) (short) 1);
        int[] intArray33 = grafo21.peso;
        grafo10.cab = intArray33;
        grafo1.peso = intArray33;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, -1, 35, 0]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo6.existeAresta((int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo6.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        boolean boolean8 = grafo1.existeAresta((int) ' ', (int) '4');
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, (int) '#');
        boolean boolean13 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        grafo1.insereAresta(10, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        int[] intArray13 = grafo1.peso;
        boolean boolean15 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        grafo16.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        boolean boolean9 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        ds.Grafo grafo25 = new ds.Grafo((int) '4');
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int int28 = grafo27.numVertices();
        boolean boolean31 = grafo27.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo32 = grafo27.grafoTransposto();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int[] intArray38 = new int[] { '#' };
        grafo36.prox = intArray38;
        grafo34.prox = intArray38;
        ds.Grafo.Aresta aresta42 = grafo34.primeiroListaAdj((int) (short) 0);
        int[] intArray43 = grafo34.prox;
        grafo27.peso = intArray43;
        ds.Grafo.Aresta aresta46 = grafo27.proxAdj((int) (byte) 0);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int int49 = grafo48.numVertices();
        int[] intArray50 = null;
        grafo48.cab = intArray50;
        int int52 = grafo48.numVertices();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta57 = grafo54.retiraAresta(10, (int) (byte) -1);
        int[] intArray62 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo54.peso = intArray62;
        grafo48.peso = intArray62;
        grafo27.cab = intArray62;
        grafo25.cab = intArray62;
        grafo1.prox = intArray62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[35]");
        org.junit.Assert.assertNotNull(aresta42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(aresta57);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, -1, 35, 0]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean23 = grafo1.existeAresta((int) (short) 100, (int) (byte) 100);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        grafo25.imprime();
        grafo25.imprime();
        boolean boolean31 = grafo25.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo25.prox = intArray43;
        int[] intArray51 = new int[] { (byte) 0, 10, 1 };
        grafo25.peso = intArray51;
        grafo1.prox = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta56 = grafo1.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 10, 1]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) 10, (int) (byte) -1);
        boolean boolean7 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        int[] intArray14 = new int[] { 10, (byte) 0, '#', 100, (byte) 0, 35 };
        grafo1.prox = intArray14;
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo1.existeAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 35, 100, 0, 35]");
        org.junit.Assert.assertNotNull(aresta17);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        int[] intArray37 = null;
        grafo35.cab = intArray37;
        int int39 = grafo35.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) (byte) -1);
        int[] intArray49 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo41.peso = intArray49;
        grafo35.peso = intArray49;
        grafo32.prox = intArray49;
        grafo1.prox = intArray49;
        int[] intArray54 = null;
        grafo1.cab = intArray54;
        int int56 = grafo1.numVertices();
        int[] intArray57 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(intArray57);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(10, 100, (int) '4');
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        int int12 = aresta11.peso();
        int int13 = aresta11.v1();
        int int14 = aresta11.v1();
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int[] intArray10 = new int[] { '#' };
        grafo8.prox = intArray10;
        grafo6.prox = intArray10;
        grafo1.cab = intArray10;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int int16 = grafo15.numVertices();
        int[] intArray17 = null;
        grafo15.cab = intArray17;
        int int19 = grafo15.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        int[] intArray25 = new int[] { '#' };
        grafo23.prox = intArray25;
        grafo21.prox = intArray25;
        grafo15.cab = intArray25;
        grafo1.cab = intArray25;
        grafo1.insereAresta(100, (int) (byte) 100, (int) (byte) -1);
        int int34 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo1.existeAresta((int) ' ', (int) (short) 1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 100, (int) '#');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) (byte) -1);
        int[] intArray15 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo7.peso = intArray15;
        grafo1.peso = intArray15;
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(35, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        boolean boolean10 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) (byte) -1);
        int[] intArray20 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo12.peso = intArray20;
        boolean boolean23 = grafo12.listaAdjVazia((int) (short) 1);
        int[] intArray24 = grafo12.peso;
        grafo1.cab = intArray24;
        int int26 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo1.existeAresta(32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        int int36 = grafo35.numVertices();
        int[] intArray37 = null;
        grafo35.cab = intArray37;
        int int39 = grafo35.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta(10, (int) (byte) -1);
        int[] intArray49 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo41.peso = intArray49;
        grafo35.peso = intArray49;
        grafo32.prox = intArray49;
        grafo1.prox = intArray49;
        int[] intArray54 = null;
        grafo1.cab = intArray54;
        int int56 = grafo1.numVertices();
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int int59 = grafo58.numVertices();
        grafo58.imprime();
        grafo58.imprime();
        boolean boolean64 = grafo58.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo66 = new ds.Grafo((int) (short) 1);
        int int67 = grafo66.numVertices();
        int[] intArray68 = null;
        grafo66.cab = intArray68;
        int int70 = grafo66.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 1);
        int[] intArray76 = new int[] { '#' };
        grafo74.prox = intArray76;
        grafo72.prox = intArray76;
        grafo66.cab = intArray76;
        grafo58.prox = intArray76;
        int[] intArray84 = new int[] { (byte) 0, 10, 1 };
        grafo58.peso = intArray84;
        int[] intArray86 = grafo58.peso;
        grafo1.prox = intArray86;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(aresta44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[35]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 10, 1]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        int int47 = grafo46.numVertices();
        grafo46.imprime();
        grafo46.imprime();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 1);
        int int52 = grafo51.numVertices();
        grafo51.imprime();
        grafo51.imprime();
        boolean boolean57 = grafo51.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        int int60 = grafo59.numVertices();
        int[] intArray61 = null;
        grafo59.cab = intArray61;
        int int63 = grafo59.numVertices();
        ds.Grafo grafo65 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 1);
        int[] intArray69 = new int[] { '#' };
        grafo67.prox = intArray69;
        grafo65.prox = intArray69;
        grafo59.cab = intArray69;
        grafo51.prox = intArray69;
        grafo46.peso = intArray69;
        grafo1.cab = intArray69;
        ds.Grafo grafo76 = grafo1.grafoTransposto();
        ds.Grafo grafo77 = grafo76.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[35]");
        org.junit.Assert.assertNotNull(grafo76);
        org.junit.Assert.assertNotNull(grafo77);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(10, (int) (byte) -1);
        int[] intArray16 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo8.peso = intArray16;
        boolean boolean19 = grafo8.listaAdjVazia((int) (short) 1);
        int[] intArray20 = grafo8.peso;
        grafo1.prox = intArray20;
        int[] intArray22 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1, 35, 0]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(0, (int) '#', 0);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        int int12 = grafo11.numVertices();
        grafo11.imprime();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        int int20 = grafo19.numVertices();
        int[] intArray21 = null;
        grafo19.cab = intArray21;
        int int23 = grafo19.numVertices();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int[] intArray29 = new int[] { '#' };
        grafo27.prox = intArray29;
        grafo25.prox = intArray29;
        grafo19.cab = intArray29;
        grafo11.prox = intArray29;
        int[] intArray37 = new int[] { (byte) 0, 10, 1 };
        grafo11.peso = intArray37;
        int[] intArray39 = null;
        grafo11.peso = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        int int46 = grafo45.numVertices();
        int[] intArray47 = null;
        grafo45.cab = intArray47;
        int int49 = grafo45.numVertices();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta54 = grafo51.retiraAresta(10, (int) (byte) -1);
        int[] intArray59 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo51.peso = intArray59;
        grafo45.peso = intArray59;
        grafo42.prox = intArray59;
        grafo11.prox = intArray59;
        grafo7.prox = intArray59;
        grafo1.prox = intArray59;
        int int66 = grafo1.numVertices();
        ds.Grafo.Aresta aresta68 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(aresta68);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = null;
        grafo1.peso = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        grafo32.imprime();
        grafo32.imprime();
        boolean boolean38 = grafo32.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int int41 = grafo40.numVertices();
        int[] intArray42 = null;
        grafo40.cab = intArray42;
        int int44 = grafo40.numVertices();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int[] intArray50 = new int[] { '#' };
        grafo48.prox = intArray50;
        grafo46.prox = intArray50;
        grafo40.cab = intArray50;
        grafo32.prox = intArray50;
        grafo1.peso = intArray50;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = grafo1.listaAdjVazia((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[35]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        int int23 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        boolean boolean8 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.insereAresta(32, 32, (int) (byte) -1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int int16 = grafo15.numVertices();
        int[] intArray17 = null;
        grafo15.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        int int21 = grafo20.numVertices();
        grafo20.imprime();
        grafo20.imprime();
        boolean boolean26 = grafo20.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        int int29 = grafo28.numVertices();
        int[] intArray30 = null;
        grafo28.cab = intArray30;
        int int32 = grafo28.numVertices();
        ds.Grafo grafo34 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int[] intArray38 = new int[] { '#' };
        grafo36.prox = intArray38;
        grafo34.prox = intArray38;
        grafo28.cab = intArray38;
        grafo20.prox = intArray38;
        int[] intArray46 = new int[] { (byte) 0, 10, 1 };
        grafo20.peso = intArray46;
        grafo15.prox = intArray46;
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        int int64 = grafo50.numVertices();
        boolean boolean66 = grafo50.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo68 = new ds.Grafo((int) (short) 1);
        int int69 = grafo68.numVertices();
        grafo68.imprime();
        grafo68.imprime();
        boolean boolean74 = grafo68.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 1);
        int int77 = grafo76.numVertices();
        int[] intArray78 = null;
        grafo76.cab = intArray78;
        int int80 = grafo76.numVertices();
        ds.Grafo grafo82 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo84 = new ds.Grafo((int) (short) 1);
        int[] intArray86 = new int[] { '#' };
        grafo84.prox = intArray86;
        grafo82.prox = intArray86;
        grafo76.cab = intArray86;
        grafo68.prox = intArray86;
        grafo50.peso = intArray86;
        grafo15.cab = intArray86;
        grafo1.peso = intArray86;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[35]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[35]");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 100, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 10, 32);
        int[] intArray22 = null;
        grafo1.prox = intArray22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        boolean boolean12 = grafo8.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo13 = grafo8.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        ds.Grafo.Aresta aresta23 = grafo15.primeiroListaAdj((int) (short) 0);
        int[] intArray24 = grafo15.prox;
        grafo8.peso = intArray24;
        ds.Grafo.Aresta aresta27 = grafo8.proxAdj((int) (byte) 0);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int int30 = grafo29.numVertices();
        int[] intArray31 = null;
        grafo29.cab = intArray31;
        int int33 = grafo29.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta(10, (int) (byte) -1);
        int[] intArray43 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo35.peso = intArray43;
        grafo29.peso = intArray43;
        grafo8.cab = intArray43;
        grafo1.peso = intArray43;
        grafo1.imprime();
        grafo1.insereAresta(0, 32, (int) 'a');
        int[] intArray53 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 97, 35, 0]");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj((int) '#');
        boolean boolean48 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        int[] intArray49 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, -1, 35, 0]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int int9 = grafo8.numVertices();
        boolean boolean12 = grafo8.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo13 = grafo8.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        ds.Grafo.Aresta aresta23 = grafo15.primeiroListaAdj((int) (short) 0);
        int[] intArray24 = grafo15.prox;
        grafo8.peso = intArray24;
        ds.Grafo.Aresta aresta27 = grafo8.proxAdj((int) (byte) 0);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 1);
        int int30 = grafo29.numVertices();
        int[] intArray31 = null;
        grafo29.cab = intArray31;
        int int33 = grafo29.numVertices();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta(10, (int) (byte) -1);
        int[] intArray43 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo35.peso = intArray43;
        grafo29.peso = intArray43;
        grafo8.cab = intArray43;
        grafo1.peso = intArray43;
        grafo1.imprime();
        grafo1.insereAresta(0, 32, (int) 'a');
        ds.Grafo grafo53 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 97, 35, 0]");
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNull(aresta56);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        int int6 = grafo5.numVertices();
        grafo5.imprime();
        grafo5.imprime();
        boolean boolean11 = grafo5.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        int int14 = grafo13.numVertices();
        int[] intArray15 = null;
        grafo13.cab = intArray15;
        int int17 = grafo13.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        int[] intArray23 = new int[] { '#' };
        grafo21.prox = intArray23;
        grafo19.prox = intArray23;
        grafo13.cab = intArray23;
        grafo5.prox = intArray23;
        int[] intArray31 = new int[] { (byte) 0, 10, 1 };
        grafo5.peso = intArray31;
        int[] intArray33 = null;
        grafo5.peso = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        int int40 = grafo39.numVertices();
        int[] intArray41 = null;
        grafo39.cab = intArray41;
        int int43 = grafo39.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta(10, (int) (byte) -1);
        int[] intArray53 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo45.peso = intArray53;
        grafo39.peso = intArray53;
        grafo36.prox = intArray53;
        grafo5.prox = intArray53;
        grafo1.prox = intArray53;
        grafo1.insereAresta(0, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta65 = grafo1.retiraAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 0, 35, 0]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        boolean boolean16 = grafo1.listaAdjVazia(0);
        int int17 = grafo1.numVertices();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        int int21 = grafo20.numVertices();
        grafo20.imprime();
        ds.Grafo grafo23 = grafo20.grafoTransposto();
        boolean boolean25 = grafo23.listaAdjVazia(10);
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 1);
        int int28 = grafo27.numVertices();
        int[] intArray29 = null;
        grafo27.cab = intArray29;
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 1);
        int int33 = grafo32.numVertices();
        grafo32.imprime();
        grafo32.imprime();
        boolean boolean38 = grafo32.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 1);
        int int41 = grafo40.numVertices();
        int[] intArray42 = null;
        grafo40.cab = intArray42;
        int int44 = grafo40.numVertices();
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        int[] intArray50 = new int[] { '#' };
        grafo48.prox = intArray50;
        grafo46.prox = intArray50;
        grafo40.cab = intArray50;
        grafo32.prox = intArray50;
        int[] intArray58 = new int[] { (byte) 0, 10, 1 };
        grafo32.peso = intArray58;
        grafo27.prox = intArray58;
        grafo23.cab = intArray58;
        int[] intArray62 = grafo23.cab;
        grafo1.cab = intArray62;
        boolean boolean65 = grafo1.listaAdjVazia((int) (short) 0);
        grafo1.imprime();
        boolean boolean69 = grafo1.existeAresta(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[35]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        int int25 = grafo24.numVertices();
        int[] intArray26 = null;
        grafo24.cab = intArray26;
        int int28 = grafo24.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta(10, (int) (byte) -1);
        int[] intArray38 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo30.peso = intArray38;
        grafo24.peso = intArray38;
        grafo3.cab = intArray38;
        grafo1.cab = intArray38;
        ds.Grafo grafo43 = grafo1.grafoTransposto();
        boolean boolean46 = grafo43.existeAresta((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean9 = grafo1.existeAresta((int) '4', (int) ' ');
        boolean boolean11 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        grafo1.insereAresta(0, (int) '#', (int) (short) 10);
        boolean boolean18 = grafo1.listaAdjVazia(100);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo1.cab = intArray24;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int[] intArray3 = new int[] { '#' };
        grafo1.prox = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        int[] intArray10 = new int[] { '#' };
        grafo8.prox = intArray10;
        grafo6.prox = intArray10;
        grafo1.cab = intArray10;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        int int16 = grafo15.numVertices();
        int[] intArray17 = null;
        grafo15.cab = intArray17;
        int int19 = grafo15.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 1);
        int[] intArray25 = new int[] { '#' };
        grafo23.prox = intArray25;
        grafo21.prox = intArray25;
        grafo15.cab = intArray25;
        grafo1.cab = intArray25;
        grafo1.insereAresta(100, (int) (byte) 100, (int) (byte) -1);
        int[] intArray34 = grafo1.cab;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        int[] intArray13 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 35, 0]");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 100);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo1.numVertices();
        boolean boolean9 = grafo1.listaAdjVazia(35);
        boolean boolean12 = grafo1.existeAresta((int) '4', (int) (short) 10);
        boolean boolean14 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 1, 32);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int[] intArray10 = grafo1.prox;
        int[] intArray11 = null;
        grafo1.cab = intArray11;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(10, (int) (byte) -1);
        int[] intArray9 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo1.peso = intArray9;
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        int[] intArray13 = grafo1.peso;
        boolean boolean15 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        grafo18.insereAresta(10, 100, (int) '4');
        grafo18.insereAresta((int) 'a', (int) (byte) -1, (int) (byte) -1);
        int[] intArray33 = new int[] { (byte) 10, 35, 1, (short) 100, (byte) 1, (byte) 0 };
        grafo18.peso = intArray33;
        grafo1.cab = intArray33;
        java.lang.Class<?> wildcardClass36 = intArray33.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 35, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int[] intArray11 = new int[] { '#' };
        grafo9.prox = intArray11;
        grafo7.prox = intArray11;
        grafo1.cab = intArray11;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) (short) 10);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int[] intArray27 = new int[] { '#' };
        grafo25.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 1);
        int int31 = grafo30.numVertices();
        grafo30.imprime();
        ds.Grafo grafo33 = grafo30.grafoTransposto();
        boolean boolean35 = grafo33.listaAdjVazia(10);
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 1);
        int int38 = grafo37.numVertices();
        int[] intArray39 = null;
        grafo37.cab = intArray39;
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        int int43 = grafo42.numVertices();
        grafo42.imprime();
        grafo42.imprime();
        boolean boolean48 = grafo42.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 1);
        int int51 = grafo50.numVertices();
        int[] intArray52 = null;
        grafo50.cab = intArray52;
        int int54 = grafo50.numVertices();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        int[] intArray60 = new int[] { '#' };
        grafo58.prox = intArray60;
        grafo56.prox = intArray60;
        grafo50.cab = intArray60;
        grafo42.prox = intArray60;
        int[] intArray68 = new int[] { (byte) 0, 10, 1 };
        grafo42.peso = intArray68;
        grafo37.prox = intArray68;
        grafo33.cab = intArray68;
        grafo25.cab = intArray68;
        grafo1.peso = intArray68;
        ds.Grafo grafo74 = grafo1.grafoTransposto();
        boolean boolean76 = grafo74.listaAdjVazia(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo74.retiraAresta((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(grafo33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(grafo74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (-1), 35);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(10, (int) (byte) -1);
        int[] intArray15 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo7.peso = intArray15;
        grafo1.peso = intArray15;
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1, 35, 0]");
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int[] intArray5 = new int[] { '#' };
        grafo3.prox = intArray5;
        grafo1.prox = intArray5;
        boolean boolean10 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, (int) (byte) -1);
        int[] intArray20 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo12.peso = intArray20;
        boolean boolean23 = grafo12.listaAdjVazia((int) (short) 1);
        int[] intArray24 = grafo12.peso;
        grafo1.cab = intArray24;
        int int26 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int int11 = grafo10.numVertices();
        int[] intArray12 = null;
        grafo10.cab = intArray12;
        int int14 = grafo10.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        int[] intArray20 = new int[] { '#' };
        grafo18.prox = intArray20;
        grafo16.prox = intArray20;
        grafo10.cab = intArray20;
        int int24 = grafo10.numVertices();
        boolean boolean26 = grafo10.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 1);
        int int29 = grafo28.numVertices();
        grafo28.imprime();
        grafo28.imprime();
        boolean boolean34 = grafo28.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 1);
        int int37 = grafo36.numVertices();
        int[] intArray38 = null;
        grafo36.cab = intArray38;
        int int40 = grafo36.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo44 = new ds.Grafo((int) (short) 1);
        int[] intArray46 = new int[] { '#' };
        grafo44.prox = intArray46;
        grafo42.prox = intArray46;
        grafo36.cab = intArray46;
        grafo28.prox = intArray46;
        grafo10.peso = intArray46;
        grafo1.cab = intArray46;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta((int) (byte) 1, (-1), 35);
        boolean boolean7 = grafo1.listaAdjVazia((int) '4');
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(10, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        int int15 = grafo14.numVertices();
        int[] intArray16 = null;
        grafo14.cab = intArray16;
        int int18 = grafo14.numVertices();
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        int[] intArray24 = new int[] { '#' };
        grafo22.prox = intArray24;
        grafo20.prox = intArray24;
        grafo14.cab = intArray24;
        grafo9.prox = intArray24;
        grafo1.cab = intArray24;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        int int5 = grafo1.numVertices();
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        int int4 = grafo3.numVertices();
        boolean boolean7 = grafo3.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        int[] intArray14 = new int[] { '#' };
        grafo12.prox = intArray14;
        grafo10.prox = intArray14;
        ds.Grafo.Aresta aresta18 = grafo10.primeiroListaAdj((int) (short) 0);
        int[] intArray19 = grafo10.prox;
        grafo3.peso = intArray19;
        grafo1.prox = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta(1, (int) (byte) 1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        int[] intArray12 = new int[] { '#' };
        grafo10.prox = intArray12;
        grafo8.prox = intArray12;
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj((int) (short) 0);
        int[] intArray17 = grafo8.prox;
        grafo1.peso = intArray17;
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (byte) 0, 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 1);
        int int26 = grafo25.numVertices();
        grafo25.imprime();
        grafo25.imprime();
        boolean boolean31 = grafo25.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 1);
        int int34 = grafo33.numVertices();
        int[] intArray35 = null;
        grafo33.cab = intArray35;
        int int37 = grafo33.numVertices();
        ds.Grafo grafo39 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo41 = new ds.Grafo((int) (short) 1);
        int[] intArray43 = new int[] { '#' };
        grafo41.prox = intArray43;
        grafo39.prox = intArray43;
        grafo33.cab = intArray43;
        grafo25.prox = intArray43;
        int[] intArray51 = new int[] { (byte) 0, 10, 1 };
        grafo25.peso = intArray51;
        int[] intArray53 = null;
        grafo25.peso = intArray53;
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        int int57 = grafo56.numVertices();
        grafo56.imprime();
        grafo56.imprime();
        boolean boolean62 = grafo56.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo64 = new ds.Grafo((int) (short) 1);
        int int65 = grafo64.numVertices();
        int[] intArray66 = null;
        grafo64.cab = intArray66;
        int int68 = grafo64.numVertices();
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo72 = new ds.Grafo((int) (short) 1);
        int[] intArray74 = new int[] { '#' };
        grafo72.prox = intArray74;
        grafo70.prox = intArray74;
        grafo64.cab = intArray74;
        grafo56.prox = intArray74;
        grafo25.peso = intArray74;
        grafo1.prox = intArray74;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[35]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[35]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        int[] intArray3 = null;
        grafo1.cab = intArray3;
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        boolean boolean10 = grafo6.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(10, (int) (byte) -1);
        int[] intArray21 = new int[] { 100, (byte) -1, '#', (short) 0 };
        grafo13.peso = intArray21;
        boolean boolean24 = grafo13.listaAdjVazia((int) (short) 1);
        int[] intArray25 = grafo13.peso;
        grafo6.prox = intArray25;
        int int27 = grafo6.numVertices();
        int[] intArray28 = grafo6.prox;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, -1, 35, 0]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        int int10 = grafo9.numVertices();
        int[] intArray11 = null;
        grafo9.cab = intArray11;
        int int13 = grafo9.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 1);
        int[] intArray19 = new int[] { '#' };
        grafo17.prox = intArray19;
        grafo15.prox = intArray19;
        grafo9.cab = intArray19;
        grafo1.prox = intArray19;
        int[] intArray27 = new int[] { (byte) 0, 10, 1 };
        grafo1.peso = intArray27;
        int[] intArray29 = grafo1.peso;
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 1);
        int int32 = grafo31.numVertices();
        grafo31.imprime();
        grafo31.imprime();
        boolean boolean37 = grafo31.existeAresta((int) (byte) 10, (int) (byte) 0);
        int[] intArray44 = new int[] { 10, (byte) 0, '#', 100, (byte) 0, 35 };
        grafo31.prox = intArray44;
        ds.Grafo.Aresta aresta47 = grafo31.primeiroListaAdj(0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 1);
        int int50 = grafo49.numVertices();
        grafo49.imprime();
        ds.Grafo grafo52 = grafo49.grafoTransposto();
        boolean boolean54 = grafo52.listaAdjVazia(10);
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 1);
        int int57 = grafo56.numVertices();
        int[] intArray58 = null;
        grafo56.cab = intArray58;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        int int62 = grafo61.numVertices();
        grafo61.imprime();
        grafo61.imprime();
        boolean boolean67 = grafo61.existeAresta((int) (byte) 10, (int) (byte) 0);
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 1);
        int int70 = grafo69.numVertices();
        int[] intArray71 = null;
        grafo69.cab = intArray71;
        int int73 = grafo69.numVertices();
        ds.Grafo grafo75 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo77 = new ds.Grafo((int) (short) 1);
        int[] intArray79 = new int[] { '#' };
        grafo77.prox = intArray79;
        grafo75.prox = intArray79;
        grafo69.cab = intArray79;
        grafo61.prox = intArray79;
        int[] intArray87 = new int[] { (byte) 0, 10, 1 };
        grafo61.peso = intArray87;
        grafo56.prox = intArray87;
        grafo52.cab = intArray87;
        int[] intArray91 = grafo52.cab;
        grafo31.prox = intArray91;
        grafo1.cab = intArray91;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 0, 35, 100, 0, 35]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 10, 1]");
    }
}

