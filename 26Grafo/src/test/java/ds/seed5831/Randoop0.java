package ds.seed5831;

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
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo2.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass35 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta37 = grafo34.retiraAresta((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        boolean boolean35 = grafo1.listaAdjVazia(97);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        grafo13.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo31.peso = intArray37;
        int[] intArray39 = grafo31.peso;
        grafo13.prox = intArray39;
        grafo11.cab = intArray39;
        int[] intArray42 = grafo11.cab;
        int[] intArray43 = grafo11.cab;
        grafo1.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        grafo1.prox = intArray74;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 1);
        boolean boolean9 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        boolean boolean14 = grafo1.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo1.cab = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        grafo1.prox = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo1.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        grafo1.imprime();
        boolean boolean35 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo4.peso = intArray10;
        int[] intArray12 = grafo4.peso;
        ds.Grafo.Aresta aresta14 = grafo4.proxAdj(1);
        boolean boolean17 = grafo4.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo4.cab = intArray25;
        grafo1.peso = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        int[] intArray11 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo5.peso = intArray11;
        grafo1.cab = intArray11;
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        grafo1.prox = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass4 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        boolean boolean10 = grafo1.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        int[] intArray36 = grafo28.peso;
        grafo10.prox = intArray36;
        grafo8.cab = intArray36;
        int[] intArray39 = grafo8.cab;
        int[] intArray40 = grafo8.cab;
        int[] intArray43 = new int[] { (byte) 100, 1 };
        grafo8.cab = intArray43;
        grafo4.prox = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 1]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        int[] intArray48 = new int[] { (byte) 100, 1 };
        grafo13.cab = intArray48;
        grafo9.prox = intArray48;
        grafo1.cab = intArray48;
        ds.Grafo grafo52 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta54 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 1]");
        org.junit.Assert.assertNotNull(grafo52);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        int[] intArray38 = grafo30.peso;
        grafo12.prox = intArray38;
        grafo10.cab = intArray38;
        int[] intArray41 = grafo10.cab;
        int[] intArray42 = grafo10.cab;
        ds.Grafo grafo43 = grafo10.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) ' ', 35);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        grafo45.peso = intArray64;
        grafo10.prox = intArray64;
        grafo1.prox = intArray64;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta72 = grafo1.retiraAresta((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass11 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj(1);
        boolean boolean16 = grafo3.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo3.cab = intArray24;
        grafo1.prox = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta(0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = aresta4.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        int[] intArray11 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo5.peso = intArray11;
        grafo1.cab = intArray11;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo4.peso = intArray10;
        int[] intArray12 = grafo4.peso;
        ds.Grafo.Aresta aresta14 = grafo4.proxAdj(1);
        boolean boolean17 = grafo4.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo4.cab = intArray25;
        grafo1.peso = intArray25;
        java.lang.Class<?> wildcardClass29 = intArray25.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta14 = grafo8.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo8.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        int[] intArray34 = grafo26.peso;
        grafo8.prox = intArray34;
        grafo6.cab = intArray34;
        int[] intArray37 = grafo6.cab;
        int[] intArray38 = grafo6.cab;
        int[] intArray41 = new int[] { (byte) 100, 1 };
        grafo6.cab = intArray41;
        grafo1.prox = intArray41;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = grafo1.existeAresta((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 1]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) 'a');
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        int int20 = grafo13.numVertices();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        grafo22.prox = intArray36;
        grafo13.cab = intArray36;
        grafo11.cab = intArray36;
        grafo9.peso = intArray36;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) ' ', 35);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo36.peso = intArray55;
        grafo1.prox = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo1.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo12 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj(1);
        boolean boolean16 = grafo3.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo3.cab = intArray24;
        grafo1.prox = intArray24;
        java.lang.Class<?> wildcardClass28 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta14 = grafo8.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo8.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        int[] intArray34 = grafo26.peso;
        grafo8.prox = intArray34;
        grafo6.cab = intArray34;
        int[] intArray37 = grafo6.cab;
        int[] intArray38 = grafo6.cab;
        int[] intArray41 = new int[] { (byte) 100, 1 };
        grafo6.cab = intArray41;
        grafo1.prox = intArray41;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 10]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        boolean boolean12 = grafo1.existeAresta(100, 10);
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) 'a', 97);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        int[] intArray24 = grafo16.peso;
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta31 = grafo28.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta34 = grafo28.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        grafo28.prox = intArray42;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray52 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo46.peso = intArray52;
        int[] intArray54 = grafo46.peso;
        grafo28.prox = intArray54;
        grafo26.cab = intArray54;
        int[] intArray57 = grafo26.cab;
        int[] intArray58 = grafo26.cab;
        grafo16.cab = intArray58;
        ds.Grafo grafo61 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta66 = grafo63.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta69 = grafo63.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo71.peso = intArray77;
        grafo63.prox = intArray77;
        ds.Grafo grafo81 = new ds.Grafo((int) (byte) 10);
        int[] intArray87 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo81.peso = intArray87;
        int[] intArray89 = grafo81.peso;
        grafo63.prox = intArray89;
        grafo61.cab = intArray89;
        grafo16.prox = intArray89;
        grafo1.prox = intArray89;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNull(aresta34);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta66);
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        boolean boolean14 = grafo1.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo1.cab = intArray22;
        boolean boolean26 = grafo1.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        grafo3.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        grafo3.prox = intArray76;
        grafo1.prox = intArray76;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = grafo1.existeAresta((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 35, (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        boolean boolean10 = grafo1.listaAdjVazia((int) 'a');
        boolean boolean12 = grafo1.listaAdjVazia(10);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        int int6 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        boolean boolean34 = grafo1.existeAresta((int) '#', 0);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 100, 52);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta((int) ' ', (int) (byte) 10, (int) 'a');
        boolean boolean9 = grafo2.existeAresta((int) '#', 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray20 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo14.peso = intArray20;
        grafo6.prox = intArray20;
        grafo1.peso = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        int int6 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        int[] intArray36 = grafo28.peso;
        grafo10.prox = intArray36;
        grafo8.cab = intArray36;
        int[] intArray39 = grafo8.cab;
        int[] intArray40 = grafo8.cab;
        int[] intArray43 = new int[] { (byte) 100, 1 };
        grafo8.cab = intArray43;
        grafo4.prox = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 1]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        int[] intArray38 = grafo30.peso;
        grafo12.prox = intArray38;
        grafo10.cab = intArray38;
        int[] intArray41 = grafo10.cab;
        int[] intArray42 = grafo10.cab;
        ds.Grafo grafo43 = grafo10.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) ' ', 35);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        grafo45.peso = intArray64;
        grafo10.prox = intArray64;
        grafo1.prox = intArray64;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNull(aresta48);
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        grafo1.insereAresta(52, 0, 0);
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        grafo22.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        int[] intArray46 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo40.peso = intArray46;
        int[] intArray48 = grafo40.peso;
        grafo22.prox = intArray48;
        grafo20.cab = intArray48;
        int[] intArray51 = grafo20.cab;
        int[] intArray52 = grafo20.cab;
        ds.Grafo grafo53 = grafo20.grafoTransposto();
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta58 = grafo55.retiraAresta((int) ' ', 35);
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta63 = grafo60.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta66 = grafo60.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        grafo60.prox = intArray74;
        grafo55.peso = intArray74;
        grafo20.prox = intArray74;
        grafo11.prox = intArray74;
        grafo9.peso = intArray74;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) 'a');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        grafo3.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        grafo3.prox = intArray76;
        grafo1.prox = intArray76;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo81 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo1.cab = intArray33;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) '#', (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) ' ', 35);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo36.peso = intArray55;
        grafo1.prox = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta61 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        boolean boolean10 = grafo1.listaAdjVazia((int) 'a');
        boolean boolean13 = grafo1.existeAresta((int) ' ', (int) (short) 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo(35);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        grafo13.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo31.peso = intArray37;
        int[] intArray39 = grafo31.peso;
        grafo13.prox = intArray39;
        grafo11.cab = intArray39;
        int[] intArray42 = grafo11.cab;
        int[] intArray43 = grafo11.cab;
        grafo1.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        grafo1.prox = intArray74;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta79 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        int int4 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        grafo1.prox = intArray40;
        int[] intArray43 = null;
        grafo1.cab = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta47 = grafo1.retiraAresta((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo4.peso = intArray10;
        int[] intArray12 = grafo4.peso;
        ds.Grafo.Aresta aresta14 = grafo4.proxAdj(1);
        boolean boolean17 = grafo4.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo4.cab = intArray25;
        grafo1.peso = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta14 = grafo8.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo8.prox = intArray22;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        int[] intArray34 = grafo26.peso;
        grafo8.prox = intArray34;
        grafo6.cab = intArray34;
        int[] intArray37 = grafo6.cab;
        int[] intArray38 = grafo6.cab;
        int[] intArray41 = new int[] { (byte) 100, 1 };
        grafo6.cab = intArray41;
        grafo1.prox = intArray41;
        java.lang.Class<?> wildcardClass44 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) '#', (int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = aresta11.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (byte) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo13.peso = intArray19;
        grafo5.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        int[] intArray31 = grafo23.peso;
        grafo5.prox = intArray31;
        grafo3.cab = intArray31;
        int[] intArray34 = grafo3.cab;
        int[] intArray35 = null;
        grafo3.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo3.peso = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        int[] intArray79 = grafo48.cab;
        int[] intArray80 = grafo48.cab;
        int[] intArray83 = new int[] { (byte) 100, 1 };
        grafo48.cab = intArray83;
        grafo3.cab = intArray83;
        grafo1.peso = intArray83;
        java.lang.Class<?> wildcardClass87 = intArray83.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) 'a', (int) (byte) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        boolean boolean7 = grafo1.listaAdjVazia(100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(1);
        ds.Grafo grafo8 = new ds.Grafo((int) 'a');
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        int int17 = grafo10.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo27.peso = intArray33;
        grafo19.prox = intArray33;
        grafo10.cab = intArray33;
        grafo8.cab = intArray33;
        grafo1.peso = intArray33;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) '#', (int) (byte) 0);
        int int5 = aresta4.v2();
        int int6 = aresta4.v2();
        int int7 = aresta4.v2();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta(0, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        java.lang.Class<?> wildcardClass7 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        boolean boolean12 = grafo1.existeAresta(0, (int) (short) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', 35);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta25 = grafo19.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        int[] intArray33 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo27.peso = intArray33;
        grafo19.prox = intArray33;
        grafo14.peso = intArray33;
        grafo1.peso = intArray33;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = null;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        grafo1.peso = intArray42;
        int[] intArray45 = grafo1.cab;
        int int46 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        boolean boolean14 = grafo1.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        int[] intArray22 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo16.peso = intArray22;
        grafo1.cab = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 100, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        int int42 = grafo5.numVertices();
        int[] intArray43 = grafo5.cab;
        grafo1.cab = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta46 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 1]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia(0);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo12 = new ds.Grafo(100);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray20 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo14.peso = intArray20;
        int[] intArray22 = grafo14.peso;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo34.peso = intArray40;
        grafo26.prox = intArray40;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray50 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo44.peso = intArray50;
        int[] intArray52 = grafo44.peso;
        grafo26.prox = intArray52;
        grafo24.cab = intArray52;
        int[] intArray55 = grafo24.cab;
        int[] intArray56 = grafo24.cab;
        grafo14.cab = intArray56;
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta64 = grafo61.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta67 = grafo61.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        int[] intArray75 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo69.peso = intArray75;
        grafo61.prox = intArray75;
        ds.Grafo grafo79 = new ds.Grafo((int) (byte) 10);
        int[] intArray85 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo79.peso = intArray85;
        int[] intArray87 = grafo79.peso;
        grafo61.prox = intArray87;
        grafo59.cab = intArray87;
        grafo14.prox = intArray87;
        grafo12.prox = intArray87;
        grafo1.prox = intArray87;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta64);
        org.junit.Assert.assertNull(aresta67);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 35, 35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        grafo1.imprime();
        boolean boolean34 = grafo1.listaAdjVazia((int) ' ');
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        int int10 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) 'a', 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta40 = grafo37.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta43 = grafo37.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo45.peso = intArray51;
        grafo37.prox = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray61 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo55.peso = intArray61;
        int[] intArray63 = grafo55.peso;
        grafo37.prox = intArray63;
        grafo34.prox = intArray63;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo66 = grafo34.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta40);
        org.junit.Assert.assertNull(aresta43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 10, (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) ' ', 35);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo36.peso = intArray55;
        grafo1.prox = intArray55;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        int int6 = grafo2.numVertices();
        grafo2.insereAresta((int) (byte) 1, (int) (short) 100, (int) ' ');
        grafo2.imprime();
        boolean boolean14 = grafo2.existeAresta(100, 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia(100);
        boolean boolean8 = grafo1.existeAresta(97, 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1, 0, -1, 0]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        int int20 = grafo13.numVertices();
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo22.peso = intArray28;
        int[] intArray30 = grafo22.peso;
        ds.Grafo.Aresta aresta32 = grafo22.proxAdj(1);
        boolean boolean35 = grafo22.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo37.peso = intArray43;
        grafo22.cab = intArray43;
        grafo13.peso = intArray43;
        grafo1.cab = intArray43;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        grafo1.insereAresta((int) 'a', (int) (short) 0, 97);
        grafo1.insereAresta((int) '4', (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        int int11 = grafo1.numVertices();
        int[] intArray12 = null;
        grafo1.peso = intArray12;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = null;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        grafo1.peso = intArray42;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        int[] intArray77 = grafo46.cab;
        int[] intArray78 = grafo46.cab;
        int[] intArray81 = new int[] { (byte) 100, 1 };
        grafo46.cab = intArray81;
        grafo1.cab = intArray81;
        ds.Grafo.Aresta aresta86 = grafo1.retiraAresta((int) ' ', (int) '#');
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 1]");
        org.junit.Assert.assertNull(aresta86);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(35, 0);
        int[] intArray14 = grafo1.peso;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (byte) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        grafo4.cab = intArray12;
        java.lang.Class<?> wildcardClass15 = grafo4.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        int int11 = grafo1.numVertices();
        boolean boolean14 = grafo1.existeAresta((int) ' ', 35);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        grafo15.imprime();
        java.lang.Class<?> wildcardClass17 = grafo15.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(100, 1);
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo17.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo35.peso = intArray41;
        int[] intArray43 = grafo35.peso;
        grafo17.prox = intArray43;
        grafo15.cab = intArray43;
        int[] intArray46 = grafo15.cab;
        int[] intArray47 = grafo15.cab;
        ds.Grafo grafo48 = grafo15.grafoTransposto();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) ' ', 35);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta58 = grafo55.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta61 = grafo55.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        grafo55.prox = intArray69;
        grafo50.peso = intArray69;
        grafo15.prox = intArray69;
        grafo6.prox = intArray69;
        grafo1.peso = intArray69;
        int[] intArray76 = grafo1.peso;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        int int5 = aresta4.peso();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        boolean boolean7 = grafo1.existeAresta(10, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo grafo36 = grafo35.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo40 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta46 = grafo40.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo48.peso = intArray54;
        grafo40.prox = intArray54;
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        int[] intArray66 = grafo58.peso;
        grafo40.prox = intArray66;
        grafo38.cab = intArray66;
        int[] intArray69 = grafo38.cab;
        int[] intArray70 = grafo38.cab;
        ds.Grafo grafo71 = grafo38.grafoTransposto();
        ds.Grafo grafo73 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta76 = grafo73.retiraAresta((int) ' ', 35);
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta81 = grafo78.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta84 = grafo78.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo86 = new ds.Grafo((int) (byte) 10);
        int[] intArray92 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo86.peso = intArray92;
        grafo78.prox = intArray92;
        grafo73.peso = intArray92;
        grafo38.prox = intArray92;
        grafo36.peso = intArray92;
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta43);
        org.junit.Assert.assertNull(aresta46);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo71);
        org.junit.Assert.assertNull(aresta76);
        org.junit.Assert.assertNotNull(aresta81);
        org.junit.Assert.assertNull(aresta84);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 10, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        boolean boolean7 = grafo2.listaAdjVazia((int) '4');
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo9.prox = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        int[] intArray54 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo48.peso = intArray54;
        int[] intArray56 = grafo48.peso;
        ds.Grafo.Aresta aresta58 = grafo48.proxAdj(1);
        boolean boolean61 = grafo48.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        grafo48.cab = intArray69;
        grafo9.peso = intArray69;
        grafo2.prox = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo74 = grafo2.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray20 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo14.peso = intArray20;
        grafo6.prox = intArray20;
        grafo1.peso = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        java.lang.Class<?> wildcardClass33 = intArray32.getClass();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        grafo13.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo31.peso = intArray37;
        int[] intArray39 = grafo31.peso;
        grafo13.prox = intArray39;
        grafo11.cab = intArray39;
        int[] intArray42 = grafo11.cab;
        int[] intArray43 = grafo11.cab;
        grafo1.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        grafo1.prox = intArray74;
        int int78 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        int[] intArray39 = grafo1.cab;
        ds.Grafo grafo41 = new ds.Grafo((int) 'a');
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta46 = grafo43.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta49 = grafo43.retiraAresta(1, (int) (byte) -1);
        int int50 = grafo43.numVertices();
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta55 = grafo52.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta58 = grafo52.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        int[] intArray66 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo60.peso = intArray66;
        grafo52.prox = intArray66;
        grafo43.cab = intArray66;
        grafo41.cab = intArray66;
        int[] intArray71 = grafo41.cab;
        grafo1.peso = intArray71;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 1]");
        org.junit.Assert.assertNotNull(aresta46);
        org.junit.Assert.assertNull(aresta49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(aresta55);
        org.junit.Assert.assertNull(aresta58);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        grafo1.insereAresta((int) 'a', (int) (short) 0, 97);
        grafo1.insereAresta((int) '4', (int) (short) 0, 10);
        int[] intArray17 = null;
        grafo1.cab = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        int[] intArray28 = grafo20.peso;
        grafo1.peso = intArray28;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) '#', (int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        grafo1.cab = intArray24;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo29.peso = intArray35;
        int[] intArray37 = grafo29.peso;
        grafo1.cab = intArray37;
        ds.Grafo grafo39 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo39);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(100, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        boolean boolean12 = grafo1.existeAresta(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.insereAresta(0, 100, 32);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia(100);
        boolean boolean8 = grafo1.existeAresta(97, 100);
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        grafo3.cab = intArray45;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        grafo3.prox = intArray76;
        grafo1.prox = intArray76;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta82 = grafo1.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo3 = new ds.Grafo(0);
        int int4 = grafo3.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray20 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo14.peso = intArray20;
        grafo6.prox = intArray20;
        grafo3.cab = intArray20;
        grafo1.prox = intArray20;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo(1);
        boolean boolean4 = grafo1.existeAresta((int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        boolean boolean7 = grafo2.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta((int) (short) -1, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        int[] intArray48 = new int[] { (byte) 100, 1 };
        grafo13.cab = intArray48;
        grafo9.prox = intArray48;
        grafo1.cab = intArray48;
        ds.Grafo grafo52 = grafo1.grafoTransposto();
        boolean boolean55 = grafo52.existeAresta((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta57 = grafo52.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 1]");
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        grafo1.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        int[] intArray27 = grafo19.peso;
        grafo1.prox = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta35 = grafo32.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta38 = grafo32.retiraAresta(1, (int) (byte) -1);
        int int39 = grafo32.numVertices();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo32.cab = intArray55;
        grafo30.cab = intArray55;
        int[] intArray60 = grafo30.cab;
        ds.Grafo grafo62 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo63 = grafo62.grafoTransposto();
        ds.Grafo grafo64 = grafo62.grafoTransposto();
        ds.Grafo grafo65 = grafo62.grafoTransposto();
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo67.peso = intArray73;
        grafo65.cab = intArray73;
        grafo30.peso = intArray73;
        grafo1.prox = intArray73;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNull(aresta38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo63);
        org.junit.Assert.assertNotNull(grafo64);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo grafo36 = grafo35.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo35.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(grafo36);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 1);
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta17 = grafo11.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo11.prox = intArray25;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo29.peso = intArray35;
        int[] intArray37 = grafo29.peso;
        grafo11.prox = intArray37;
        grafo9.cab = intArray37;
        int[] intArray40 = grafo9.cab;
        int[] intArray41 = grafo9.cab;
        int[] intArray44 = new int[] { (byte) 100, 1 };
        grafo9.cab = intArray44;
        grafo4.prox = intArray44;
        grafo1.peso = intArray44;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(aresta7);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 1]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        int int10 = grafo3.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo3.cab = intArray26;
        grafo1.cab = intArray26;
        int[] intArray31 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo.Aresta aresta36 = grafo1.retiraAresta(10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta36);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        boolean boolean10 = grafo1.listaAdjVazia((int) 'a');
        boolean boolean13 = grafo1.existeAresta(0, (int) 'a');
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, (int) (byte) 10);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        boolean boolean9 = grafo7.listaAdjVazia((int) (byte) 0);
        boolean boolean11 = grafo7.listaAdjVazia((int) (short) 100);
        grafo7.insereAresta((int) 'a', (-1), 35);
        ds.Grafo.Aresta aresta17 = grafo7.proxAdj(0);
        ds.Grafo.Aresta aresta20 = grafo7.retiraAresta((int) (short) 1, 100);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta(1, (int) (byte) -1);
        int int29 = grafo22.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo31.peso = intArray37;
        int[] intArray39 = grafo31.peso;
        ds.Grafo.Aresta aresta41 = grafo31.proxAdj(1);
        boolean boolean44 = grafo31.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        int[] intArray52 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo46.peso = intArray52;
        grafo31.cab = intArray52;
        grafo22.peso = intArray52;
        grafo7.prox = intArray52;
        grafo2.peso = intArray52;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(100, 100);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        boolean boolean12 = grafo1.existeAresta(0, (int) (short) 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta((int) (short) 0, 35, (int) '#');
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        int[] intArray36 = grafo28.peso;
        grafo10.prox = intArray36;
        grafo8.cab = intArray36;
        int[] intArray39 = grafo8.cab;
        int[] intArray40 = grafo8.cab;
        int[] intArray43 = new int[] { (byte) 100, 1 };
        grafo8.cab = intArray43;
        grafo4.prox = intArray43;
        grafo1.prox = intArray43;
        ds.Grafo.Aresta aresta48 = grafo1.proxAdj((int) (byte) 1);
        int int49 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo1.primeiroListaAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 1]");
        org.junit.Assert.assertNotNull(aresta48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo17.peso = intArray23;
        int[] intArray25 = grafo17.peso;
        grafo17.imprime();
        boolean boolean29 = grafo17.existeAresta(35, 0);
        int[] intArray30 = grafo17.peso;
        grafo15.peso = intArray30;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        boolean boolean35 = grafo33.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo37.peso = intArray43;
        grafo33.cab = intArray43;
        grafo33.imprime();
        int[] intArray47 = grafo33.cab;
        grafo33.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        int[] intArray56 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo50.peso = intArray56;
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta62 = grafo59.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta65 = grafo59.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo67 = new ds.Grafo((int) (byte) 10);
        int[] intArray73 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo67.peso = intArray73;
        grafo59.prox = intArray73;
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 10);
        int[] intArray83 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo77.peso = intArray83;
        int[] intArray85 = grafo77.peso;
        grafo59.prox = intArray85;
        grafo50.prox = intArray85;
        grafo33.prox = intArray85;
        grafo15.cab = intArray85;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta62);
        org.junit.Assert.assertNull(aresta65);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 1);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        grafo6.cab = intArray14;
        grafo1.cab = intArray14;
        int[] intArray18 = grafo1.cab;
        java.lang.Class<?> wildcardClass19 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        int int10 = grafo3.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo3.cab = intArray26;
        grafo1.cab = intArray26;
        int[] intArray31 = grafo1.cab;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo34 = grafo33.grafoTransposto();
        ds.Grafo grafo35 = grafo33.grafoTransposto();
        ds.Grafo grafo36 = grafo33.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo36.cab = intArray44;
        grafo1.peso = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta50 = grafo1.retiraAresta((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[5, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) 'a', 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo17.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo35.peso = intArray41;
        int[] intArray43 = grafo35.peso;
        grafo17.prox = intArray43;
        grafo15.cab = intArray43;
        int[] intArray46 = grafo15.cab;
        int[] intArray47 = grafo15.cab;
        ds.Grafo grafo48 = grafo15.grafoTransposto();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) ' ', 35);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta58 = grafo55.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta61 = grafo55.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        grafo55.prox = intArray69;
        grafo50.peso = intArray69;
        grafo15.prox = intArray69;
        grafo6.prox = intArray69;
        grafo1.prox = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.insereAresta(100, 97, 35);
        java.lang.Class<?> wildcardClass12 = grafo7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) 'a', 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        boolean boolean10 = grafo1.existeAresta(10, (int) '#');
        boolean boolean13 = grafo1.existeAresta((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia(0);
        grafo1.insereAresta((int) (short) 1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        int int11 = grafo10.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        int int10 = grafo3.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo3.cab = intArray26;
        grafo1.cab = intArray26;
        int[] intArray31 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(35, 0);
        int[] intArray14 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) 'a', (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        boolean boolean12 = grafo1.existeAresta(100, 10);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) '4', (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        int int6 = grafo2.numVertices();
        grafo2.insereAresta((int) (byte) 1, (int) (short) 100, (int) ' ');
        boolean boolean12 = grafo2.listaAdjVazia(52);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta22 = grafo16.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray30 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo24.peso = intArray30;
        grafo16.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo34.peso = intArray40;
        int[] intArray42 = grafo34.peso;
        grafo16.prox = intArray42;
        grafo14.cab = intArray42;
        int[] intArray45 = grafo14.cab;
        int[] intArray46 = grafo14.cab;
        int[] intArray49 = new int[] { (byte) 100, 1 };
        grafo14.cab = intArray49;
        grafo2.prox = intArray49;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 1]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo(0);
        boolean boolean4 = grafo1.existeAresta(1, (int) (short) 10);
        grafo1.insereAresta((int) (short) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 32, (int) (short) 100);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 1, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        grafo1.cab = intArray24;
        ds.Grafo.Aresta aresta29 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        boolean boolean14 = grafo1.existeAresta(32, (int) (byte) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        boolean boolean18 = grafo16.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta21 = grafo16.retiraAresta(100, (int) '#');
        grafo16.imprime();
        boolean boolean24 = grafo16.listaAdjVazia(0);
        ds.Grafo grafo25 = grafo16.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta33 = grafo27.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta35 = grafo27.proxAdj(0);
        ds.Grafo grafo36 = grafo27.grafoTransposto();
        grafo36.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo41 = grafo36.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        int[] intArray49 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo43.peso = intArray49;
        int[] intArray51 = grafo43.peso;
        grafo43.imprime();
        boolean boolean55 = grafo43.existeAresta(35, 0);
        int[] intArray56 = grafo43.peso;
        grafo41.peso = intArray56;
        grafo25.prox = intArray56;
        grafo1.cab = intArray56;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNull(aresta33);
        org.junit.Assert.assertNull(aresta35);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.existeAresta(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) ' ', (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        boolean boolean11 = grafo1.existeAresta((int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) (short) 0);
        int int11 = aresta10.v2();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        int[] intArray10 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo4.peso = intArray10;
        int[] intArray12 = grafo4.peso;
        ds.Grafo.Aresta aresta14 = grafo4.proxAdj(1);
        boolean boolean17 = grafo4.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo4.cab = intArray25;
        grafo1.peso = intArray25;
        int int29 = grafo1.numVertices();
        boolean boolean32 = grafo1.existeAresta((int) ' ', (int) (byte) -1);
        int int33 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 1, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int) (byte) 0);
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(100, 1);
        boolean boolean11 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        int[] intArray48 = new int[] { (byte) 100, 1 };
        grafo13.cab = intArray48;
        grafo1.peso = intArray48;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 1]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta42 = grafo1.retiraAresta(0, 0);
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(aresta42);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        int[] intArray11 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo5.peso = intArray11;
        grafo1.cab = intArray11;
        grafo1.imprime();
        int[] intArray15 = grafo1.cab;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) ' ', 35);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        grafo22.prox = intArray36;
        grafo17.peso = intArray36;
        int[] intArray40 = grafo17.peso;
        grafo1.peso = intArray40;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        int int10 = grafo3.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo3.cab = intArray26;
        grafo1.cab = intArray26;
        boolean boolean32 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        grafo6.cab = intArray14;
        grafo1.cab = intArray14;
        grafo1.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) 'a');
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta28 = grafo22.retiraAresta(1, (int) (byte) -1);
        int int29 = grafo22.numVertices();
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta34 = grafo31.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta37 = grafo31.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo39.peso = intArray45;
        grafo31.prox = intArray45;
        grafo22.cab = intArray45;
        grafo20.cab = intArray45;
        int[] intArray50 = grafo20.cab;
        grafo1.peso = intArray50;
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(aresta34);
        org.junit.Assert.assertNull(aresta37);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        grafo1.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta27 = grafo21.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo29.peso = intArray35;
        grafo21.prox = intArray35;
        ds.Grafo grafo39 = new ds.Grafo((int) (byte) 10);
        int[] intArray45 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo39.peso = intArray45;
        int[] intArray47 = grafo39.peso;
        grafo21.prox = intArray47;
        grafo19.cab = intArray47;
        int[] intArray50 = grafo19.cab;
        int[] intArray51 = grafo19.cab;
        int[] intArray54 = new int[] { (byte) 100, 1 };
        grafo19.cab = intArray54;
        grafo1.prox = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 1]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
        boolean boolean10 = grafo1.existeAresta((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) ' ', 35);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo36.peso = intArray55;
        grafo1.prox = intArray55;
        int int60 = grafo1.numVertices();
        ds.Grafo grafo62 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray70 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo64.peso = intArray70;
        int[] intArray72 = grafo64.peso;
        ds.Grafo.Aresta aresta74 = grafo64.proxAdj(1);
        boolean boolean77 = grafo64.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo79 = new ds.Grafo((int) (byte) 10);
        int[] intArray85 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo79.peso = intArray85;
        grafo64.cab = intArray85;
        grafo62.prox = intArray85;
        grafo1.peso = intArray85;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta15 = grafo6.retiraAresta(0, 35);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo18 = grafo17.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta(1, (int) (byte) 0);
        boolean boolean23 = grafo18.listaAdjVazia((int) '4');
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta37 = grafo34.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta40 = grafo34.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo42.peso = intArray48;
        grafo34.prox = intArray48;
        ds.Grafo grafo52 = new ds.Grafo((int) (byte) 10);
        int[] intArray58 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo52.peso = intArray58;
        int[] intArray60 = grafo52.peso;
        grafo34.prox = intArray60;
        grafo25.prox = intArray60;
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        int[] intArray70 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo64.peso = intArray70;
        int[] intArray72 = grafo64.peso;
        ds.Grafo.Aresta aresta74 = grafo64.proxAdj(1);
        boolean boolean77 = grafo64.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo79 = new ds.Grafo((int) (byte) 10);
        int[] intArray85 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo79.peso = intArray85;
        grafo64.cab = intArray85;
        grafo25.peso = intArray85;
        grafo18.prox = intArray85;
        grafo6.peso = intArray85;
        grafo1.cab = intArray85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta((int) ' ', (int) (byte) 10, (int) 'a');
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo17.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo35.peso = intArray41;
        int[] intArray43 = grafo35.peso;
        grafo17.prox = intArray43;
        grafo8.prox = intArray43;
        grafo2.peso = intArray43;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 35);
        ds.Grafo grafo8 = new ds.Grafo(0);
        int int9 = grafo8.numVertices();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo16.cab = intArray44;
        int[] intArray47 = grafo16.cab;
        int[] intArray48 = grafo16.cab;
        int[] intArray51 = new int[] { (byte) 100, 1 };
        grafo16.cab = intArray51;
        grafo11.prox = intArray51;
        grafo8.peso = intArray51;
        grafo1.cab = intArray51;
        boolean boolean58 = grafo1.existeAresta(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(100, 1);
        boolean boolean11 = grafo1.listaAdjVazia(0);
        boolean boolean13 = grafo1.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        int int42 = grafo5.numVertices();
        int[] intArray43 = grafo5.cab;
        grafo1.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 10);
        boolean boolean48 = grafo46.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta51 = grafo46.retiraAresta(100, (int) '#');
        grafo46.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo55 = grafo54.grafoTransposto();
        ds.Grafo grafo56 = grafo54.grafoTransposto();
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta63 = grafo60.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta66 = grafo60.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        grafo60.prox = intArray74;
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 10);
        int[] intArray84 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo78.peso = intArray84;
        int[] intArray86 = grafo78.peso;
        grafo60.prox = intArray86;
        grafo58.cab = intArray86;
        int[] intArray89 = grafo58.cab;
        int[] intArray90 = grafo58.cab;
        int[] intArray93 = new int[] { (byte) 100, 1 };
        grafo58.cab = intArray93;
        grafo54.prox = intArray93;
        grafo46.cab = intArray93;
        grafo1.cab = intArray93;
        boolean boolean99 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        grafo1.prox = intArray15;
        ds.Grafo grafo19 = new ds.Grafo((int) 'a');
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta27 = grafo21.retiraAresta(1, (int) (byte) -1);
        int int28 = grafo21.numVertices();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta33 = grafo30.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta36 = grafo30.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo30.prox = intArray44;
        grafo21.cab = intArray44;
        grafo19.cab = intArray44;
        grafo1.peso = intArray44;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 10);
        int[] intArray57 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo51.peso = intArray57;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta63 = grafo60.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta66 = grafo60.retiraAresta(1, (int) (byte) -1);
        int int67 = grafo60.numVertices();
        ds.Grafo grafo69 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta72 = grafo69.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta75 = grafo69.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 10);
        int[] intArray83 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo77.peso = intArray83;
        grafo69.prox = intArray83;
        grafo60.cab = intArray83;
        grafo51.peso = intArray83;
        grafo1.prox = intArray83;
        int int89 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(aresta33);
        org.junit.Assert.assertNull(aresta36);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNull(aresta66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(aresta72);
        org.junit.Assert.assertNull(aresta75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        int int6 = grafo2.numVertices();
        grafo2.insereAresta((int) (byte) 1, (int) (short) 100, (int) ' ');
        boolean boolean12 = grafo2.listaAdjVazia(52);
        ds.Grafo grafo14 = new ds.Grafo(0);
        int int15 = grafo14.numVertices();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo17.prox = intArray31;
        grafo14.cab = intArray31;
        grafo2.cab = intArray31;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        int[] intArray39 = grafo1.cab;
        boolean boolean42 = grafo1.existeAresta((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass43 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int[] intArray4 = null;
        grafo1.cab = intArray4;
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray18 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo12.peso = intArray18;
        grafo10.cab = intArray18;
        grafo1.cab = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        int int5 = aresta4.v2();
        int int6 = aresta4.peso();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        int[] intArray19 = grafo11.peso;
        grafo9.prox = intArray19;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        int int35 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass36 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta(52, 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        grafo1.cab = intArray24;
        boolean boolean30 = grafo1.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta33 = grafo1.retiraAresta((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[5, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, (int) (byte) 10);
        boolean boolean8 = grafo2.existeAresta(100, (int) '#');
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        grafo9.insereAresta((int) (byte) 10, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) ' ', (int) (short) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        grafo1.imprime();
        ds.Grafo.Aresta aresta35 = grafo1.retiraAresta(97, (int) ' ');
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta35);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        boolean boolean36 = grafo1.existeAresta(35, (int) (byte) 0);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        grafo1.insereAresta((int) (byte) 10, 0, (int) (byte) 100);
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) ' ', (int) (byte) 0);
        int int12 = aresta11.peso();
        java.lang.Class<?> wildcardClass13 = aresta11.getClass();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        boolean boolean6 = grafo4.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        grafo4.cab = intArray14;
        int[] intArray17 = grafo4.cab;
        grafo1.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo22.peso = intArray28;
        int[] intArray30 = grafo22.peso;
        ds.Grafo.Aresta aresta32 = grafo22.proxAdj(1);
        boolean boolean35 = grafo22.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo37 = new ds.Grafo((int) (byte) 10);
        int[] intArray43 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo37.peso = intArray43;
        grafo22.cab = intArray43;
        grafo20.prox = intArray43;
        int[] intArray47 = grafo20.prox;
        grafo1.cab = intArray47;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) '#', (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        grafo1.prox = intArray40;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray50 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo44.peso = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta59 = grafo53.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        int[] intArray67 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo61.peso = intArray67;
        grafo53.prox = intArray67;
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo71.peso = intArray77;
        int[] intArray79 = grafo71.peso;
        grafo53.prox = intArray79;
        grafo44.prox = intArray79;
        grafo1.prox = intArray79;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta85 = grafo1.retiraAresta((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta56);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo13.peso = intArray19;
        grafo5.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        int[] intArray31 = grafo23.peso;
        grafo5.prox = intArray31;
        grafo3.cab = intArray31;
        int[] intArray34 = grafo3.cab;
        int[] intArray35 = null;
        grafo3.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo3.peso = intArray44;
        grafo1.cab = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta50 = grafo1.retiraAresta((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        grafo1.peso = intArray17;
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        int int6 = grafo5.numVertices();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        int[] intArray48 = new int[] { (byte) 100, 1 };
        grafo13.cab = intArray48;
        grafo8.prox = intArray48;
        grafo5.peso = intArray48;
        grafo1.peso = intArray48;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 1]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(100, (int) '4', (int) (byte) -1);
        grafo1.insereAresta(1, (int) ' ', (int) (byte) 1);
        ds.Grafo grafo11 = new ds.Grafo(0);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo16.cab = intArray24;
        grafo11.cab = intArray24;
        grafo1.prox = intArray24;
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) ' ', 35);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo7.peso = intArray26;
        int[] intArray30 = grafo7.peso;
        grafo1.peso = intArray30;
        ds.Grafo grafo32 = grafo1.grafoTransposto();
        int int33 = grafo32.numVertices();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo13.peso = intArray19;
        grafo5.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        int[] intArray31 = grafo23.peso;
        grafo5.prox = intArray31;
        grafo3.cab = intArray31;
        int[] intArray34 = grafo3.cab;
        int[] intArray35 = null;
        grafo3.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo3.peso = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        int[] intArray79 = grafo48.cab;
        int[] intArray80 = grafo48.cab;
        int[] intArray83 = new int[] { (byte) 100, 1 };
        grafo48.cab = intArray83;
        grafo3.cab = intArray83;
        grafo1.peso = intArray83;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta88 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 1]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(aresta4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo(100);
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        int[] intArray16 = grafo8.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta26 = grafo20.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        grafo20.prox = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        int[] intArray46 = grafo38.peso;
        grafo20.prox = intArray46;
        grafo18.cab = intArray46;
        int[] intArray49 = grafo18.cab;
        int[] intArray50 = grafo18.cab;
        grafo8.cab = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta58 = grafo55.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta61 = grafo55.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        grafo55.prox = intArray69;
        ds.Grafo grafo73 = new ds.Grafo((int) (byte) 10);
        int[] intArray79 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo73.peso = intArray79;
        int[] intArray81 = grafo73.peso;
        grafo55.prox = intArray81;
        grafo53.cab = intArray81;
        grafo8.prox = intArray81;
        grafo6.prox = intArray81;
        grafo4.prox = intArray81;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNull(aresta38);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 1);
        boolean boolean10 = grafo7.existeAresta((int) (short) 1, 1);
        grafo7.imprime();
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) ' ', 35);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        grafo13.peso = intArray32;
        int[] intArray36 = grafo13.peso;
        grafo7.peso = intArray36;
        ds.Grafo grafo38 = grafo7.grafoTransposto();
        grafo7.imprime();
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        ds.Grafo grafo59 = new ds.Grafo((int) 'a');
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta64 = grafo61.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta67 = grafo61.retiraAresta(1, (int) (byte) -1);
        int int68 = grafo61.numVertices();
        ds.Grafo grafo70 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta73 = grafo70.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta76 = grafo70.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 10);
        int[] intArray84 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo78.peso = intArray84;
        grafo70.prox = intArray84;
        grafo61.cab = intArray84;
        grafo59.cab = intArray84;
        grafo41.peso = intArray84;
        grafo7.peso = intArray84;
        grafo1.peso = intArray84;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo38);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta64);
        org.junit.Assert.assertNull(aresta67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(aresta73);
        org.junit.Assert.assertNull(aresta76);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        int[] intArray9 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo3.peso = intArray9;
        int[] intArray11 = grafo3.peso;
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj(1);
        boolean boolean16 = grafo3.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo3.cab = intArray24;
        grafo1.prox = intArray24;
        int[] intArray28 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = grafo1.listaAdjVazia((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 1, (-1));
        grafo1.insereAresta(52, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = grafo1.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        boolean boolean11 = grafo1.existeAresta((int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 52, (int) (byte) 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia(100);
        boolean boolean8 = grafo1.existeAresta(97, 100);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta29 = grafo26.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta32 = grafo26.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo34.peso = intArray40;
        grafo26.prox = intArray40;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray50 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo44.peso = intArray50;
        int[] intArray52 = grafo44.peso;
        grafo26.prox = intArray52;
        grafo24.cab = intArray52;
        int[] intArray55 = grafo24.cab;
        int[] intArray56 = grafo24.cab;
        ds.Grafo grafo57 = grafo24.grafoTransposto();
        ds.Grafo grafo59 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta62 = grafo59.retiraAresta((int) ' ', 35);
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta67 = grafo64.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta70 = grafo64.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 10);
        int[] intArray78 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo72.peso = intArray78;
        grafo64.prox = intArray78;
        grafo59.peso = intArray78;
        grafo24.prox = intArray78;
        grafo15.prox = intArray78;
        grafo10.peso = intArray78;
        grafo1.peso = intArray78;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNull(aresta32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNull(aresta62);
        org.junit.Assert.assertNotNull(aresta67);
        org.junit.Assert.assertNull(aresta70);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) ' ', (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta23 = grafo17.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo17.prox = intArray31;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        int[] intArray41 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo35.peso = intArray41;
        int[] intArray43 = grafo35.peso;
        grafo17.prox = intArray43;
        grafo15.cab = intArray43;
        int[] intArray46 = grafo15.cab;
        int[] intArray47 = grafo15.cab;
        ds.Grafo grafo48 = grafo15.grafoTransposto();
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) ' ', 35);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta58 = grafo55.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta61 = grafo55.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        grafo55.prox = intArray69;
        grafo50.peso = intArray69;
        grafo15.prox = intArray69;
        grafo6.prox = intArray69;
        grafo1.prox = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = grafo1.existeAresta((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo48);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNull(aresta61);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo10.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo grafo19 = grafo10.grafoTransposto();
        java.lang.Class<?> wildcardClass20 = grafo10.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        boolean boolean10 = grafo1.existeAresta(10, (int) '#');
        ds.Grafo.Aresta aresta13 = grafo1.retiraAresta(1, (int) (byte) 10);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        int int8 = grafo1.numVertices();
        boolean boolean10 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        int int19 = grafo12.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta24 = grafo21.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta27 = grafo21.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo29.peso = intArray35;
        grafo21.prox = intArray35;
        grafo12.cab = intArray35;
        boolean boolean41 = grafo12.existeAresta((int) (byte) 100, 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta48 = grafo45.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta51 = grafo45.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        int[] intArray59 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo53.peso = intArray59;
        grafo45.prox = intArray59;
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        int[] intArray69 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo63.peso = intArray69;
        int[] intArray71 = grafo63.peso;
        grafo45.prox = intArray71;
        grafo43.cab = intArray71;
        int[] intArray74 = grafo43.cab;
        grafo12.peso = intArray74;
        grafo1.prox = intArray74;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNull(aresta27);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(aresta48);
        org.junit.Assert.assertNull(aresta51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        int[] intArray36 = grafo28.peso;
        grafo10.prox = intArray36;
        grafo8.cab = intArray36;
        int[] intArray39 = grafo8.cab;
        int[] intArray40 = grafo8.cab;
        int[] intArray43 = new int[] { (byte) 100, 1 };
        grafo8.cab = intArray43;
        grafo4.prox = intArray43;
        grafo1.prox = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta48 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 1]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) -1, 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        int int7 = grafo2.numVertices();
        grafo2.insereAresta((int) '4', (int) (short) 100, 35);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        boolean boolean7 = grafo2.listaAdjVazia((int) '4');
        int int8 = grafo2.numVertices();
        boolean boolean11 = grafo2.existeAresta(10, 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 35);
        ds.Grafo grafo8 = new ds.Grafo(0);
        int int9 = grafo8.numVertices();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo16.cab = intArray44;
        int[] intArray47 = grafo16.cab;
        int[] intArray48 = grafo16.cab;
        int[] intArray51 = new int[] { (byte) 100, 1 };
        grafo16.cab = intArray51;
        grafo11.prox = intArray51;
        grafo8.peso = intArray51;
        grafo1.cab = intArray51;
        boolean boolean58 = grafo1.existeAresta((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        int int15 = grafo10.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        grafo1.insereAresta((int) 'a', (-1), 35);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        boolean boolean14 = grafo1.existeAresta(32, (int) (byte) 100);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 10, (int) '#');
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo(97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        int[] intArray16 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo10.peso = intArray16;
        int[] intArray18 = grafo10.peso;
        ds.Grafo.Aresta aresta20 = grafo10.proxAdj(1);
        boolean boolean23 = grafo10.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        grafo10.cab = intArray31;
        grafo1.peso = intArray31;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta38 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo(97);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta39 = grafo36.retiraAresta((int) ' ', 35);
        ds.Grafo grafo41 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta44 = grafo41.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta47 = grafo41.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo49 = new ds.Grafo((int) (byte) 10);
        int[] intArray55 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo49.peso = intArray55;
        grafo41.prox = intArray55;
        grafo36.peso = intArray55;
        grafo1.prox = intArray55;
        int int60 = grafo1.numVertices();
        int[] intArray61 = grafo1.cab;
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNull(aresta47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo10.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo.Aresta aresta21 = grafo10.retiraAresta((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(aresta21);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 35);
        ds.Grafo grafo8 = new ds.Grafo(0);
        int int9 = grafo8.numVertices();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo16.cab = intArray44;
        int[] intArray47 = grafo16.cab;
        int[] intArray48 = grafo16.cab;
        int[] intArray51 = new int[] { (byte) 100, 1 };
        grafo16.cab = intArray51;
        grafo11.prox = intArray51;
        grafo8.peso = intArray51;
        grafo1.cab = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta57 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 1]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) ' ', 35);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo7.peso = intArray26;
        int[] intArray30 = grafo7.peso;
        grafo1.peso = intArray30;
        java.lang.Class<?> wildcardClass32 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo5 = new ds.Grafo(0);
        int int6 = grafo5.numVertices();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        ds.Grafo grafo33 = new ds.Grafo((int) (byte) 10);
        int[] intArray39 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo33.peso = intArray39;
        int[] intArray41 = grafo33.peso;
        grafo15.prox = intArray41;
        grafo13.cab = intArray41;
        int[] intArray44 = grafo13.cab;
        int[] intArray45 = grafo13.cab;
        int[] intArray48 = new int[] { (byte) 100, 1 };
        grafo13.cab = intArray48;
        grafo8.prox = intArray48;
        grafo5.peso = intArray48;
        grafo1.peso = intArray48;
        ds.Grafo grafo53 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 1]");
        org.junit.Assert.assertNotNull(grafo53);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        grafo2.imprime();
        int int7 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo2.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '4', (int) (short) 1, (int) (short) -1);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        int[] intArray39 = grafo1.cab;
        boolean boolean41 = grafo1.listaAdjVazia((int) (byte) 1);
        boolean boolean44 = grafo1.existeAresta((int) (short) 1, 35);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta47 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        int int5 = aresta4.v1();
        int int6 = aresta4.v2();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta11 = grafo5.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        int[] intArray19 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo13.peso = intArray19;
        grafo5.prox = intArray19;
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        int[] intArray31 = grafo23.peso;
        grafo5.prox = intArray31;
        grafo3.cab = intArray31;
        int[] intArray34 = grafo3.cab;
        int[] intArray35 = null;
        grafo3.cab = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        grafo3.peso = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta53 = grafo50.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta56 = grafo50.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo58 = new ds.Grafo((int) (byte) 10);
        int[] intArray64 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo58.peso = intArray64;
        grafo50.prox = intArray64;
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 10);
        int[] intArray74 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo68.peso = intArray74;
        int[] intArray76 = grafo68.peso;
        grafo50.prox = intArray76;
        grafo48.cab = intArray76;
        int[] intArray79 = grafo48.cab;
        int[] intArray80 = grafo48.cab;
        int[] intArray83 = new int[] { (byte) 100, 1 };
        grafo48.cab = intArray83;
        grafo3.cab = intArray83;
        grafo1.peso = intArray83;
        ds.Grafo grafo87 = grafo1.grafoTransposto();
        int int88 = grafo87.numVertices();
        boolean boolean91 = grafo87.existeAresta((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNull(aresta56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 1]");
        org.junit.Assert.assertNotNull(grafo87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(10);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) ' ', (int) (byte) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 97, 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 10);
        int[] intArray23 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo17.peso = intArray23;
        int[] intArray25 = grafo17.peso;
        grafo17.imprime();
        boolean boolean29 = grafo17.existeAresta(35, 0);
        int[] intArray30 = grafo17.peso;
        grafo15.peso = intArray30;
        boolean boolean33 = grafo15.listaAdjVazia(10);
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta38 = grafo35.retiraAresta((int) 'a', (int) (byte) 0);
        boolean boolean41 = grafo35.existeAresta((int) (byte) 10, (int) (short) 1);
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 10);
        boolean boolean45 = grafo43.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        int[] intArray53 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo47.peso = intArray53;
        grafo43.cab = intArray53;
        grafo35.prox = intArray53;
        grafo15.prox = intArray53;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) (short) 100);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 97, 52);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        boolean boolean12 = grafo1.existeAresta(0, (int) (short) 0);
        ds.Grafo grafo14 = new ds.Grafo(0);
        int int15 = grafo14.numVertices();
        int int16 = grafo14.numVertices();
        ds.Grafo.Aresta aresta19 = grafo14.retiraAresta((int) (byte) 1, (int) (byte) 1);
        ds.Grafo grafo20 = grafo14.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta30 = grafo24.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo32.peso = intArray38;
        grafo24.prox = intArray38;
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 10);
        int[] intArray48 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo42.peso = intArray48;
        int[] intArray50 = grafo42.peso;
        grafo24.prox = intArray50;
        grafo22.cab = intArray50;
        int[] intArray53 = grafo22.cab;
        int[] intArray54 = grafo22.cab;
        int[] intArray57 = new int[] { (byte) 100, 1 };
        grafo22.cab = intArray57;
        int int59 = grafo22.numVertices();
        int[] intArray60 = grafo22.cab;
        grafo14.cab = intArray60;
        grafo1.prox = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNull(aresta30);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10, 1]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) -1, 52);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        grafo1.prox = intArray15;
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
        int int20 = aresta19.v1();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        grafo1.cab = intArray24;
        ds.Grafo grafo29 = new ds.Grafo((int) (byte) 10);
        int[] intArray35 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo29.peso = intArray35;
        int[] intArray37 = grafo29.peso;
        grafo1.cab = intArray37;
        ds.Grafo grafo40 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta43 = grafo40.retiraAresta((int) '#', (int) (byte) 0);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta53 = grafo47.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray61 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo55.peso = intArray61;
        grafo47.prox = intArray61;
        ds.Grafo grafo65 = new ds.Grafo((int) (byte) 10);
        int[] intArray71 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo65.peso = intArray71;
        int[] intArray73 = grafo65.peso;
        grafo47.prox = intArray73;
        grafo45.cab = intArray73;
        int[] intArray76 = grafo45.cab;
        int[] intArray77 = null;
        grafo45.cab = intArray77;
        ds.Grafo grafo80 = new ds.Grafo((int) (byte) 10);
        int[] intArray86 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo80.peso = intArray86;
        grafo45.peso = intArray86;
        grafo40.peso = intArray86;
        grafo1.cab = intArray86;
        int[] intArray91 = grafo1.cab;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta43);
        org.junit.Assert.assertNotNull(aresta50);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) 'a');
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        int int13 = grafo6.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta21 = grafo15.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 10);
        int[] intArray29 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo23.peso = intArray29;
        grafo15.prox = intArray29;
        grafo6.cab = intArray29;
        grafo4.cab = intArray29;
        int[] intArray34 = grafo4.cab;
        grafo2.prox = intArray34;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        grafo1.imprime();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) ' ', 35);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta17 = grafo11.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 10);
        int[] intArray25 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo19.peso = intArray25;
        grafo11.prox = intArray25;
        grafo6.peso = intArray25;
        int[] intArray29 = grafo6.peso;
        grafo1.cab = intArray29;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(1, (int) (byte) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta22 = grafo16.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 10);
        int[] intArray30 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo24.peso = intArray30;
        grafo16.prox = intArray30;
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 10);
        int[] intArray40 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo34.peso = intArray40;
        int[] intArray42 = grafo34.peso;
        grafo16.prox = intArray42;
        grafo14.cab = intArray42;
        int[] intArray45 = grafo14.cab;
        grafo1.cab = intArray45;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '4', 35);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '4', (int) (short) 1, (int) (short) -1);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 100, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (-1), (-1));
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(1, (int) (byte) 0);
        boolean boolean7 = grafo2.listaAdjVazia((int) '4');
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(0, 52);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        boolean boolean11 = grafo1.listaAdjVazia(97);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean5 = grafo1.listaAdjVazia((int) (short) 100);
        int int6 = grafo1.numVertices();
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 97, 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) (short) 100, (-1), (int) (byte) 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta20 = grafo14.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo22 = new ds.Grafo((int) (byte) 10);
        int[] intArray28 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo22.peso = intArray28;
        grafo14.prox = intArray28;
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 10);
        int[] intArray38 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo32.peso = intArray38;
        int[] intArray40 = grafo32.peso;
        grafo14.prox = intArray40;
        grafo12.cab = intArray40;
        int[] intArray43 = grafo12.cab;
        int[] intArray44 = grafo12.cab;
        int[] intArray47 = new int[] { (byte) 100, 1 };
        grafo12.cab = intArray47;
        int int49 = grafo12.numVertices();
        int[] intArray50 = grafo12.cab;
        ds.Grafo grafo52 = new ds.Grafo((int) 'a');
        ds.Grafo grafo54 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta57 = grafo54.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta60 = grafo54.retiraAresta(1, (int) (byte) -1);
        int int61 = grafo54.numVertices();
        ds.Grafo grafo63 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta66 = grafo63.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta69 = grafo63.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo71.peso = intArray77;
        grafo63.prox = intArray77;
        grafo54.cab = intArray77;
        grafo52.cab = intArray77;
        int[] intArray82 = grafo52.cab;
        grafo12.peso = intArray82;
        grafo10.cab = intArray82;
        grafo4.cab = intArray82;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 1]");
        org.junit.Assert.assertNotNull(aresta57);
        org.junit.Assert.assertNull(aresta60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(aresta66);
        org.junit.Assert.assertNull(aresta69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = null;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        grafo1.peso = intArray42;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        int[] intArray77 = grafo46.cab;
        int[] intArray78 = grafo46.cab;
        int[] intArray81 = new int[] { (byte) 100, 1 };
        grafo46.cab = intArray81;
        grafo1.cab = intArray81;
        ds.Grafo.Aresta aresta86 = grafo1.retiraAresta((int) ' ', (int) '#');
        ds.Grafo grafo87 = grafo1.grafoTransposto();
        boolean boolean90 = grafo87.existeAresta(1, (int) '4');
        boolean boolean92 = grafo87.listaAdjVazia((int) 'a');
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 1]");
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNotNull(grafo87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) ' ', 35);
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        int[] intArray20 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo14.peso = intArray20;
        grafo6.prox = intArray20;
        grafo1.peso = intArray20;
        int[] intArray24 = grafo1.peso;
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 10);
        int[] intArray36 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo30.peso = intArray36;
        int[] intArray38 = grafo30.peso;
        ds.Grafo.Aresta aresta40 = grafo30.proxAdj(1);
        boolean boolean43 = grafo30.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 10);
        int[] intArray51 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo45.peso = intArray51;
        grafo30.cab = intArray51;
        grafo28.prox = intArray51;
        grafo1.cab = intArray51;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(52, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) '#');
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj(0);
        ds.Grafo grafo21 = grafo12.grafoTransposto();
        grafo21.insereAresta(10, (int) (short) 10, (int) ' ');
        ds.Grafo grafo26 = grafo21.grafoTransposto();
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        int[] intArray36 = grafo28.peso;
        grafo28.imprime();
        boolean boolean40 = grafo28.existeAresta(35, 0);
        int[] intArray41 = grafo28.peso;
        grafo26.peso = intArray41;
        grafo1.peso = intArray41;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(grafo26);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 0, (int) (short) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 0, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        int int10 = grafo3.numVertices();
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta18 = grafo12.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        int[] intArray26 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo20.peso = intArray26;
        grafo12.prox = intArray26;
        grafo3.cab = intArray26;
        grafo1.cab = intArray26;
        int[] intArray31 = grafo1.cab;
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        int[] intArray14 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo8.peso = intArray14;
        grafo6.cab = intArray14;
        grafo1.cab = intArray14;
        int[] intArray18 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 35, 97);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta((int) (short) 0, 35, (int) '#');
        grafo1.insereAresta((int) (short) 100, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.insereAresta((int) '#', (int) ' ', (int) '4');
        ds.Grafo grafo9 = grafo4.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 10, 35);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        grafo1.insereAresta(100, (int) '4', (int) (byte) -1);
        grafo1.insereAresta(1, (int) ' ', (int) (byte) 1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(1, (int) ' ', (int) '4');
        boolean boolean8 = grafo1.listaAdjVazia((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (-1), (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (byte) 1, 97);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo16.cab = intArray44;
        int[] intArray47 = grafo16.cab;
        int[] intArray48 = grafo16.cab;
        int[] intArray51 = new int[] { (byte) 100, 1 };
        grafo16.cab = intArray51;
        grafo11.prox = intArray51;
        grafo1.prox = intArray51;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 1]");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        grafo4.cab = intArray12;
        grafo4.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        int int5 = aresta4.v2();
        int int6 = aresta4.v2();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        int[] intArray39 = grafo1.cab;
        boolean boolean41 = grafo1.listaAdjVazia((int) (byte) 1);
        int[] intArray42 = grafo1.cab;
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 1]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = null;
        grafo1.cab = intArray33;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        grafo1.peso = intArray42;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta51 = grafo48.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta54 = grafo48.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo56 = new ds.Grafo((int) (byte) 10);
        int[] intArray62 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo56.peso = intArray62;
        grafo48.prox = intArray62;
        ds.Grafo grafo66 = new ds.Grafo((int) (byte) 10);
        int[] intArray72 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo66.peso = intArray72;
        int[] intArray74 = grafo66.peso;
        grafo48.prox = intArray74;
        grafo46.cab = intArray74;
        int[] intArray77 = grafo46.cab;
        int[] intArray78 = grafo46.cab;
        int[] intArray81 = new int[] { (byte) 100, 1 };
        grafo46.cab = intArray81;
        grafo1.cab = intArray81;
        ds.Grafo.Aresta aresta86 = grafo1.retiraAresta((int) ' ', (int) '#');
        ds.Grafo grafo87 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta51);
        org.junit.Assert.assertNull(aresta54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[100, 1]");
        org.junit.Assert.assertNull(aresta86);
        org.junit.Assert.assertNotNull(grafo87);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        ds.Grafo grafo10 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta16 = grafo10.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        int[] intArray24 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo18.peso = intArray24;
        grafo10.prox = intArray24;
        grafo1.cab = intArray24;
        int[] intArray28 = null;
        grafo1.prox = intArray28;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        ds.Grafo grafo35 = grafo34.grafoTransposto();
        boolean boolean38 = grafo35.existeAresta(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo35.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        grafo4.cab = intArray12;
        ds.Grafo.Aresta aresta17 = grafo4.retiraAresta((int) (byte) 10, 32);
        grafo4.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        ds.Grafo grafo34 = grafo1.grafoTransposto();
        int int35 = grafo1.numVertices();
        ds.Grafo grafo36 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(grafo36);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.insereAresta((int) 'a', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        boolean boolean8 = grafo6.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta11 = grafo6.retiraAresta(100, (int) '#');
        grafo6.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        ds.Grafo grafo16 = grafo14.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta26 = grafo20.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 10);
        int[] intArray34 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo28.peso = intArray34;
        grafo20.prox = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 10);
        int[] intArray44 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo38.peso = intArray44;
        int[] intArray46 = grafo38.peso;
        grafo20.prox = intArray46;
        grafo18.cab = intArray46;
        int[] intArray49 = grafo18.cab;
        int[] intArray50 = grafo18.cab;
        int[] intArray53 = new int[] { (byte) 100, 1 };
        grafo18.cab = intArray53;
        grafo14.prox = intArray53;
        grafo6.cab = intArray53;
        int[] intArray57 = grafo6.cab;
        grafo1.peso = intArray57;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[100, 1]");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta9 = grafo3.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 10);
        int[] intArray17 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo11.peso = intArray17;
        grafo3.prox = intArray17;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        int[] intArray29 = grafo21.peso;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        int[] intArray32 = grafo1.cab;
        int[] intArray33 = grafo1.cab;
        int[] intArray36 = new int[] { (byte) 100, 1 };
        grafo1.cab = intArray36;
        int int38 = grafo1.numVertices();
        grafo1.imprime();
        int[] intArray40 = null;
        grafo1.prox = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Grafo grafo1 = new ds.Grafo(97);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 10);
        grafo5.imprime();
        ds.Grafo grafo8 = new ds.Grafo((int) (byte) 10);
        boolean boolean10 = grafo8.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo12 = new ds.Grafo((int) (byte) 10);
        int[] intArray18 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo12.peso = intArray18;
        grafo8.cab = intArray18;
        int[] intArray21 = grafo8.cab;
        grafo5.peso = intArray21;
        grafo1.cab = intArray21;
        int[] intArray24 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) -1, (int) '4');
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int[] intArray7 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo1.peso = intArray7;
        int[] intArray9 = grafo1.peso;
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(35, 0);
        int[] intArray14 = grafo1.peso;
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (byte) 100, 32);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        int int19 = grafo1.numVertices();
        boolean boolean21 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        grafo1.insereAresta((int) (byte) 10, (int) (short) 0, (-1));
        boolean boolean10 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
        grafo1.imprime();
        grafo1.insereAresta(1, 32, (int) 'a');
        boolean boolean16 = grafo1.listaAdjVazia(52);
        int int17 = grafo1.numVertices();
        int int18 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 1);
        boolean boolean7 = grafo1.existeAresta(35, (int) 'a');
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 10);
        int[] intArray15 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo9.peso = intArray15;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta24 = grafo18.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 10);
        int[] intArray32 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo26.peso = intArray32;
        grafo18.prox = intArray32;
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 10);
        int[] intArray42 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo36.peso = intArray42;
        int[] intArray44 = grafo36.peso;
        grafo18.prox = intArray44;
        grafo9.prox = intArray44;
        grafo1.peso = intArray44;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(1, (int) (byte) -1);
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo13 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 10);
        int[] intArray27 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo21.peso = intArray27;
        grafo13.prox = intArray27;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 10);
        int[] intArray37 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo31.peso = intArray37;
        int[] intArray39 = grafo31.peso;
        grafo13.prox = intArray39;
        grafo11.cab = intArray39;
        int[] intArray42 = grafo11.cab;
        int[] intArray43 = grafo11.cab;
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta50 = grafo47.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta53 = grafo47.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 10);
        int[] intArray61 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo55.peso = intArray61;
        grafo47.prox = intArray61;
        ds.Grafo grafo65 = new ds.Grafo((int) (byte) 10);
        int[] intArray71 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo65.peso = intArray71;
        int[] intArray73 = grafo65.peso;
        grafo47.prox = intArray73;
        grafo45.cab = intArray73;
        int[] intArray76 = grafo45.cab;
        grafo11.prox = intArray76;
        grafo1.prox = intArray76;
        int[] intArray79 = grafo1.prox;
        org.junit.Assert.assertNotNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta50);
        org.junit.Assert.assertNull(aresta53);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (-1), (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 10);
        int[] intArray12 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo6.peso = intArray12;
        grafo4.cab = intArray12;
        boolean boolean16 = grafo4.listaAdjVazia((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = grafo4.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 10);
        int[] intArray21 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo15.peso = intArray21;
        grafo7.prox = intArray21;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 10);
        int[] intArray31 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo25.peso = intArray31;
        int[] intArray33 = grafo25.peso;
        grafo7.prox = intArray33;
        grafo5.cab = intArray33;
        int[] intArray36 = grafo5.cab;
        int[] intArray37 = grafo5.cab;
        int[] intArray40 = new int[] { (byte) 100, 1 };
        grafo5.cab = intArray40;
        grafo1.prox = intArray40;
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 10);
        int[] intArray50 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo44.peso = intArray50;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 10);
        ds.Grafo.Aresta aresta56 = grafo53.retiraAresta((int) (byte) 10, 0);
        ds.Grafo.Aresta aresta59 = grafo53.retiraAresta(1, (int) (byte) -1);
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 10);
        int[] intArray67 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo61.peso = intArray67;
        grafo53.prox = intArray67;
        ds.Grafo grafo71 = new ds.Grafo((int) (byte) 10);
        int[] intArray77 = new int[] { (short) 100, 35, (short) 0, (byte) -1, (short) 0 };
        grafo71.peso = intArray77;
        int[] intArray79 = grafo71.peso;
        grafo53.prox = intArray79;
        grafo44.prox = intArray79;
        grafo1.prox = intArray79;
        int[] intArray83 = grafo1.prox;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(aresta56);
        org.junit.Assert.assertNull(aresta59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[100, 35, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 35, 0, -1, 0]");
    }
}

