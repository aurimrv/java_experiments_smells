package ds.seed5838;

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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo6.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int int9 = aresta8.v2();
        int int10 = aresta8.v1();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo6.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta40 = grafo6.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = grafo1.existeAresta((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        java.lang.Class<?> wildcardClass45 = intArray41.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo23.primeiroListaAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 0, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        java.lang.Class<?> wildcardClass39 = intArray36.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo6.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        boolean boolean15 = grafo1.listaAdjVazia((int) '4');
        java.lang.Class<?> wildcardClass16 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) '4', (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        grafo73.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo78 = grafo73.grafoTransposto();
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 0);
        grafo80.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta87 = grafo80.retiraAresta((int) (byte) 100, 0);
        int[] intArray91 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo80.peso = intArray91;
        grafo78.peso = intArray91;
        grafo6.cab = intArray91;
        ds.Grafo.Aresta aresta97 = grafo6.retiraAresta((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 0, 10]");
        org.junit.Assert.assertNull(aresta97);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        grafo10.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        grafo17.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta24 = grafo17.retiraAresta((int) (byte) 100, 0);
        int[] intArray28 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo17.peso = intArray28;
        grafo15.peso = intArray28;
        grafo1.prox = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo1.retiraAresta((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 10]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        boolean boolean64 = grafo1.existeAresta((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        grafo1.insereAresta(100, 1, 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta74 = grafo6.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta74 = grafo6.retiraAresta((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        grafo1.insereAresta((int) ' ', (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 100, 0]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (short) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        grafo4.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo9 = grafo4.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        grafo11.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta18 = grafo11.retiraAresta((int) (byte) 100, 0);
        int[] intArray22 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo11.peso = intArray22;
        grafo9.peso = intArray22;
        grafo9.imprime();
        grafo9.imprime();
        ds.Grafo grafo28 = new ds.Grafo((int) (short) 0);
        grafo28.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta35 = grafo28.retiraAresta((int) (byte) 100, 0);
        int[] intArray39 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo28.peso = intArray39;
        grafo9.cab = intArray39;
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        grafo43.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta50 = grafo43.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 0);
        grafo52.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo57 = grafo52.grafoTransposto();
        ds.Grafo grafo59 = new ds.Grafo((int) (short) 0);
        grafo59.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta66 = grafo59.retiraAresta((int) (byte) 100, 0);
        int[] intArray70 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo59.peso = intArray70;
        grafo57.peso = intArray70;
        grafo43.prox = intArray70;
        grafo9.peso = intArray70;
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 0);
        grafo76.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo81 = grafo76.grafoTransposto();
        ds.Grafo grafo83 = new ds.Grafo((int) (short) 0);
        grafo83.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta90 = grafo83.retiraAresta((int) (byte) 100, 0);
        int[] intArray94 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo83.peso = intArray94;
        grafo81.peso = intArray94;
        grafo9.cab = intArray94;
        grafo1.cab = intArray94;
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta50);
        org.junit.Assert.assertNotNull(grafo57);
        org.junit.Assert.assertNotNull(aresta66);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo81);
        org.junit.Assert.assertNotNull(aresta90);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[100, 0, 10]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        grafo23.insereAresta((int) (short) 0, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = grafo23.existeAresta((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        boolean boolean73 = grafo6.listaAdjVazia((int) (short) 10);
        int int74 = grafo6.numVertices();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        int int24 = grafo23.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        boolean boolean29 = grafo26.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo36 = grafo31.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta45 = grafo38.retiraAresta((int) (byte) 100, 0);
        int[] intArray49 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo38.peso = intArray49;
        grafo36.peso = intArray49;
        grafo36.imprime();
        grafo36.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        grafo55.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta62 = grafo55.retiraAresta((int) (byte) 100, 0);
        int[] intArray66 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo55.peso = intArray66;
        grafo36.cab = intArray66;
        grafo26.prox = intArray66;
        ds.Grafo grafo71 = new ds.Grafo((int) (short) 0);
        grafo71.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta78 = grafo71.retiraAresta((int) (byte) 100, 0);
        int[] intArray83 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo71.peso = intArray83;
        grafo26.cab = intArray83;
        grafo23.prox = intArray83;
        java.lang.Class<?> wildcardClass87 = grafo23.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta62);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta78);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        grafo16.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        grafo32.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta39 = grafo32.retiraAresta((int) (byte) 100, 0);
        int[] intArray43 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo32.peso = intArray43;
        grafo30.peso = intArray43;
        grafo16.prox = intArray43;
        grafo1.peso = intArray43;
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo54.imprime();
        grafo54.imprime();
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        grafo73.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta80 = grafo73.retiraAresta((int) (byte) 100, 0);
        int[] intArray84 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo73.peso = intArray84;
        grafo54.cab = intArray84;
        grafo1.peso = intArray84;
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta80);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[100, 0, 10]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) ' ', (int) (short) 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) '#');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        grafo73.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo78 = grafo73.grafoTransposto();
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 0);
        grafo80.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta87 = grafo80.retiraAresta((int) (byte) 100, 0);
        int[] intArray91 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo80.peso = intArray91;
        grafo78.peso = intArray91;
        grafo6.cab = intArray91;
        ds.Grafo.Aresta aresta97 = grafo6.retiraAresta((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 0, 10]");
        org.junit.Assert.assertNull(aresta97);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        grafo10.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        grafo17.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta24 = grafo17.retiraAresta((int) (byte) 100, 0);
        int[] intArray28 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo17.peso = intArray28;
        grafo15.peso = intArray28;
        grafo1.prox = intArray28;
        boolean boolean34 = grafo1.existeAresta((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 0);
        grafo7.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        grafo14.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int) (byte) 100, 0);
        int[] intArray25 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo14.peso = intArray25;
        grafo12.peso = intArray25;
        grafo12.imprime();
        ds.Grafo grafo29 = grafo12.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        boolean boolean34 = grafo31.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        grafo36.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo41 = grafo36.grafoTransposto();
        ds.Grafo grafo43 = new ds.Grafo((int) (short) 0);
        grafo43.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta50 = grafo43.retiraAresta((int) (byte) 100, 0);
        int[] intArray54 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo43.peso = intArray54;
        grafo41.peso = intArray54;
        grafo41.imprime();
        grafo41.imprime();
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        grafo60.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta67 = grafo60.retiraAresta((int) (byte) 100, 0);
        int[] intArray71 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo60.peso = intArray71;
        grafo41.cab = intArray71;
        grafo31.prox = intArray71;
        ds.Grafo grafo76 = new ds.Grafo((int) (short) 0);
        grafo76.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta83 = grafo76.retiraAresta((int) (byte) 100, 0);
        int[] intArray88 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo76.peso = intArray88;
        grafo31.cab = intArray88;
        grafo12.cab = intArray88;
        grafo1.prox = intArray88;
        int[] intArray93 = grafo1.prox;
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(grafo41);
        org.junit.Assert.assertNotNull(aresta50);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta67);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta83);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[0, 1, 100, 0]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.cab = intArray82;
        java.lang.Class<?> wildcardClass86 = intArray82.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 1, (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) -1, 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        boolean boolean73 = grafo6.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta75 = grafo6.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        grafo73.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo78 = grafo73.grafoTransposto();
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 0);
        grafo80.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta87 = grafo80.retiraAresta((int) (byte) 100, 0);
        int[] intArray91 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo80.peso = intArray91;
        grafo78.peso = intArray91;
        grafo6.cab = intArray91;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta96 = grafo6.primeiroListaAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 0, 10]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        boolean boolean73 = grafo6.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = grafo6.existeAresta((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo24 = grafo6.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(0, (int) (short) -1);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo62 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta64 = grafo62.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(grafo62);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        grafo16.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        grafo32.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta39 = grafo32.retiraAresta((int) (byte) 100, 0);
        int[] intArray43 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo32.peso = intArray43;
        grafo30.peso = intArray43;
        grafo16.prox = intArray43;
        grafo1.peso = intArray43;
        int[] intArray48 = grafo1.peso;
        ds.Grafo grafo49 = grafo1.grafoTransposto();
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 0);
        grafo51.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta58 = grafo51.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo60 = new ds.Grafo((int) (short) 0);
        grafo60.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo65 = grafo60.grafoTransposto();
        ds.Grafo grafo67 = new ds.Grafo((int) (short) 0);
        grafo67.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta74 = grafo67.retiraAresta((int) (byte) 100, 0);
        int[] intArray78 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo67.peso = intArray78;
        grafo65.peso = intArray78;
        grafo51.prox = intArray78;
        grafo49.cab = intArray78;
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNotNull(aresta58);
        org.junit.Assert.assertNotNull(grafo65);
        org.junit.Assert.assertNotNull(aresta74);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 0, 10]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo23.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        int[] intArray39 = grafo6.peso;
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((-1), (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 10]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta31 = grafo24.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo24.peso = intArray36;
        grafo6.prox = intArray36;
        grafo6.insereAresta(35, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta45 = grafo6.retiraAresta((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 100, 0]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass9 = aresta8.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) (byte) 0, 32);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) '4', (int) (short) 100);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 10);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) 'a', (int) (byte) 10);
        grafo1.insereAresta(100, 35, (int) (short) 100);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        int int24 = grafo23.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        boolean boolean29 = grafo26.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo36 = grafo31.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta45 = grafo38.retiraAresta((int) (byte) 100, 0);
        int[] intArray49 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo38.peso = intArray49;
        grafo36.peso = intArray49;
        grafo36.imprime();
        grafo36.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        grafo55.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta62 = grafo55.retiraAresta((int) (byte) 100, 0);
        int[] intArray66 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo55.peso = intArray66;
        grafo36.cab = intArray66;
        grafo26.prox = intArray66;
        ds.Grafo grafo71 = new ds.Grafo((int) (short) 0);
        grafo71.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta78 = grafo71.retiraAresta((int) (byte) 100, 0);
        int[] intArray83 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo71.peso = intArray83;
        grafo26.cab = intArray83;
        grafo23.prox = intArray83;
        boolean boolean88 = grafo23.listaAdjVazia((int) (byte) 1);
        grafo23.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta62);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta78);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        grafo3.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        grafo10.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (byte) 100, 0);
        int[] intArray21 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo10.peso = intArray21;
        grafo8.peso = intArray21;
        grafo8.imprime();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        grafo26.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo31 = grafo26.grafoTransposto();
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        grafo33.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta40 = grafo33.retiraAresta((int) (byte) 100, 0);
        int[] intArray44 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo33.peso = intArray44;
        grafo31.peso = intArray44;
        grafo31.imprime();
        grafo31.imprime();
        ds.Grafo grafo50 = new ds.Grafo((int) (short) 0);
        grafo50.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta57 = grafo50.retiraAresta((int) (byte) 100, 0);
        int[] intArray61 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo50.peso = intArray61;
        grafo31.cab = intArray61;
        grafo8.prox = intArray61;
        grafo1.prox = intArray61;
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo31);
        org.junit.Assert.assertNotNull(aresta40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta57);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 0, 10]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = grafo1.existeAresta((int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        grafo4.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta11 = grafo4.retiraAresta((int) (byte) 100, 0);
        int[] intArray15 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo4.peso = intArray15;
        grafo2.cab = intArray15;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, 10]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        int int24 = grafo23.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo23.insereAresta((-1), (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo6.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (-1), (int) (byte) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.peso = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta89 = grafo6.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        boolean boolean7 = grafo4.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo9 = new ds.Grafo((int) (short) 0);
        grafo9.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo14 = grafo9.grafoTransposto();
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        grafo16.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) (byte) 100, 0);
        int[] intArray27 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo16.peso = intArray27;
        grafo14.peso = intArray27;
        grafo14.imprime();
        grafo14.imprime();
        ds.Grafo grafo33 = new ds.Grafo((int) (short) 0);
        grafo33.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta40 = grafo33.retiraAresta((int) (byte) 100, 0);
        int[] intArray44 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo33.peso = intArray44;
        grafo14.cab = intArray44;
        grafo4.prox = intArray44;
        grafo2.peso = intArray44;
        java.lang.Class<?> wildcardClass49 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        java.lang.Class<?> wildcardClass9 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        grafo61.insereAresta(0, (int) (byte) 1, 32);
        ds.Grafo grafo66 = grafo61.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta68 = grafo66.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(grafo66);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo51 = grafo46.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        grafo53.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta60 = grafo53.retiraAresta((int) (byte) 100, 0);
        int[] intArray64 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo53.peso = intArray64;
        grafo51.peso = intArray64;
        grafo51.imprime();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 0);
        grafo69.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta76 = grafo69.retiraAresta((int) (byte) 100, 0);
        int[] intArray81 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo69.peso = intArray81;
        grafo51.prox = intArray81;
        grafo1.prox = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta86 = grafo1.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta76);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 1, 100, 0]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        int int45 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta47 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        int[] intArray39 = grafo6.peso;
        java.lang.Class<?> wildcardClass40 = intArray39.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) ' ', (int) (short) 10);
        boolean boolean12 = grafo6.existeAresta((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo29 = grafo24.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta38 = grafo31.retiraAresta((int) (byte) 100, 0);
        int[] intArray42 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo31.peso = intArray42;
        grafo29.peso = intArray42;
        grafo29.imprime();
        grafo29.imprime();
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 0);
        grafo48.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta55 = grafo48.retiraAresta((int) (byte) 100, 0);
        int[] intArray59 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo48.peso = intArray59;
        grafo29.cab = intArray59;
        grafo6.prox = intArray59;
        int int63 = grafo6.numVertices();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta55);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.peso = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia((int) (short) 10);
        grafo6.insereAresta((int) (byte) 1, (int) (short) 100, 10);
        int[] intArray92 = grafo6.peso;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[10, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[10, 1, 100, 0]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, (int) 'a');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (byte) -1);
        boolean boolean19 = grafo1.existeAresta((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (short) -1, (int) (byte) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta31 = grafo24.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo24.peso = intArray36;
        grafo6.prox = intArray36;
        grafo6.insereAresta(35, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta44 = grafo6.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 100, 0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo6.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo(0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo1.imprime();
        int[] intArray10 = new int[] { (byte) -1, 0, 1 };
        grafo1.prox = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 1]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo15 = new ds.Grafo((int) (short) 0);
        grafo15.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo20 = grafo15.grafoTransposto();
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        grafo22.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta29 = grafo22.retiraAresta((int) (byte) 100, 0);
        int[] intArray33 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo22.peso = intArray33;
        grafo20.peso = intArray33;
        grafo6.prox = intArray33;
        grafo1.peso = intArray33;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 0, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        int[] intArray39 = grafo6.peso;
        grafo6.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 0, 10]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.existeAresta((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        grafo3.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo3.retiraAresta((int) (byte) 100, 0);
        int[] intArray15 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo3.peso = intArray15;
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        boolean boolean21 = grafo18.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        grafo23.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo28 = grafo23.grafoTransposto();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo28.peso = intArray41;
        grafo28.imprime();
        grafo28.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        grafo47.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta54 = grafo47.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo47.peso = intArray58;
        grafo28.cab = intArray58;
        grafo18.prox = intArray58;
        grafo3.peso = intArray58;
        grafo1.cab = intArray58;
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(grafo28);
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta54);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100, 0, 10]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        int int17 = grafo1.numVertices();
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        boolean boolean7 = grafo1.listaAdjVazia(10);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta31 = grafo24.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo24.peso = intArray36;
        grafo6.prox = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        boolean boolean43 = grafo40.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        grafo45.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo50 = grafo45.grafoTransposto();
        ds.Grafo grafo52 = new ds.Grafo((int) (short) 0);
        grafo52.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta59 = grafo52.retiraAresta((int) (byte) 100, 0);
        int[] intArray63 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo52.peso = intArray63;
        grafo50.peso = intArray63;
        grafo50.imprime();
        grafo50.imprime();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 0);
        grafo69.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta76 = grafo69.retiraAresta((int) (byte) 100, 0);
        int[] intArray80 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo69.peso = intArray80;
        grafo50.cab = intArray80;
        grafo40.prox = intArray80;
        grafo6.prox = intArray80;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(grafo50);
        org.junit.Assert.assertNotNull(aresta59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta76);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 0, 10]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass17 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo14 = new ds.Grafo((int) (short) 0);
        grafo14.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int) (byte) 100, 0);
        int[] intArray26 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo14.peso = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 0);
        grafo29.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta36 = grafo29.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo43 = grafo38.grafoTransposto();
        ds.Grafo grafo45 = new ds.Grafo((int) (short) 0);
        grafo45.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta52 = grafo45.retiraAresta((int) (byte) 100, 0);
        int[] intArray56 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo45.peso = intArray56;
        grafo43.peso = intArray56;
        grafo29.prox = intArray56;
        grafo14.peso = intArray56;
        int[] intArray61 = grafo14.peso;
        grafo8.cab = intArray61;
        grafo6.peso = intArray61;
        boolean boolean66 = grafo6.existeAresta((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta36);
        org.junit.Assert.assertNotNull(grafo43);
        org.junit.Assert.assertNotNull(aresta52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo29 = grafo24.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta38 = grafo31.retiraAresta((int) (byte) 100, 0);
        int[] intArray42 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo31.peso = intArray42;
        grafo29.peso = intArray42;
        grafo29.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        grafo47.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo52 = grafo47.grafoTransposto();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo52.peso = intArray65;
        grafo52.imprime();
        grafo52.imprime();
        ds.Grafo grafo71 = new ds.Grafo((int) (short) 0);
        grafo71.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta78 = grafo71.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo71.peso = intArray82;
        grafo52.cab = intArray82;
        grafo29.prox = intArray82;
        grafo6.cab = intArray82;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta78);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 0, 10]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        boolean boolean80 = grafo78.listaAdjVazia((int) (short) 100);
        boolean boolean83 = grafo78.existeAresta(35, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta85 = grafo78.primeiroListaAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo7 = new ds.Grafo((int) (short) 0);
        grafo7.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta14 = grafo7.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo7.peso = intArray19;
        ds.Grafo grafo22 = new ds.Grafo((int) (short) 0);
        grafo22.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta29 = grafo22.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo36 = grafo31.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta45 = grafo38.retiraAresta((int) (byte) 100, 0);
        int[] intArray49 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo38.peso = intArray49;
        grafo36.peso = intArray49;
        grafo22.prox = intArray49;
        grafo7.peso = intArray49;
        int[] intArray54 = grafo7.peso;
        grafo1.cab = intArray54;
        java.lang.Class<?> wildcardClass56 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        grafo16.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        grafo32.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta39 = grafo32.retiraAresta((int) (byte) 100, 0);
        int[] intArray43 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo32.peso = intArray43;
        grafo30.peso = intArray43;
        grafo16.prox = intArray43;
        grafo1.peso = intArray43;
        grafo1.imprime();
        boolean boolean51 = grafo1.existeAresta((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass52 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo51 = grafo46.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        grafo53.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta60 = grafo53.retiraAresta((int) (byte) 100, 0);
        int[] intArray64 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo53.peso = intArray64;
        grafo51.peso = intArray64;
        grafo51.imprime();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 0);
        grafo69.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta76 = grafo69.retiraAresta((int) (byte) 100, 0);
        int[] intArray81 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo69.peso = intArray81;
        grafo51.prox = intArray81;
        grafo1.peso = intArray81;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta76);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 1, 100, 0]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        grafo61.insereAresta(0, (int) (byte) 1, 32);
        ds.Grafo grafo67 = new ds.Grafo((int) ' ');
        grafo67.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo67.imprime();
        int[] intArray76 = new int[] { (byte) -1, 0, 1 };
        grafo67.prox = intArray76;
        grafo61.cab = intArray76;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 0, 1]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        boolean boolean24 = grafo6.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = grafo6.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 32, (int) (byte) 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo.Aresta aresta26 = grafo6.retiraAresta(100, (int) (short) 10);
        ds.Grafo.Aresta aresta29 = grafo6.retiraAresta((int) (byte) 100, 0);
        int int30 = aresta29.peso();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNotNull(aresta29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (short) 0);
        grafo16.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta23 = grafo16.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo30 = grafo25.grafoTransposto();
        ds.Grafo grafo32 = new ds.Grafo((int) (short) 0);
        grafo32.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta39 = grafo32.retiraAresta((int) (byte) 100, 0);
        int[] intArray43 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo32.peso = intArray43;
        grafo30.peso = intArray43;
        grafo16.prox = intArray43;
        grafo1.peso = intArray43;
        int[] intArray48 = grafo1.peso;
        ds.Grafo grafo49 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta52 = grafo49.retiraAresta((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertNotNull(grafo30);
        org.junit.Assert.assertNotNull(aresta39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo49);
        org.junit.Assert.assertNull(aresta52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo51 = grafo46.grafoTransposto();
        ds.Grafo grafo53 = new ds.Grafo((int) (short) 0);
        grafo53.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta60 = grafo53.retiraAresta((int) (byte) 100, 0);
        int[] intArray64 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo53.peso = intArray64;
        grafo51.peso = intArray64;
        grafo51.imprime();
        ds.Grafo grafo69 = new ds.Grafo((int) (short) 0);
        grafo69.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta76 = grafo69.retiraAresta((int) (byte) 100, 0);
        int[] intArray81 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo69.peso = intArray81;
        grafo51.prox = intArray81;
        grafo1.prox = intArray81;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta86 = grafo1.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo51);
        org.junit.Assert.assertNotNull(aresta60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta76);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 1, 100, 0]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.cab = intArray82;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta87 = grafo6.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo.Aresta aresta26 = grafo6.retiraAresta(100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo6.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNull(aresta26);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        boolean boolean80 = grafo78.listaAdjVazia((int) (short) 100);
        java.lang.Class<?> wildcardClass81 = grafo78.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        int[] intArray73 = grafo6.peso;
        grafo6.imprime();
        ds.Grafo grafo75 = grafo6.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo75);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (short) 100, (int) 'a');
        grafo6.insereAresta(32, 0, (-1));
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        int[] intArray78 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 1, 100, 0]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        boolean boolean18 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean21 = grafo1.existeAresta(0, (int) '#');
        ds.Grafo grafo23 = new ds.Grafo((int) (short) 0);
        grafo23.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta30 = grafo23.retiraAresta((int) (byte) 100, 0);
        int[] intArray35 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo23.peso = intArray35;
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta45 = grafo38.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo47 = new ds.Grafo((int) (short) 0);
        grafo47.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo52 = grafo47.grafoTransposto();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo52.peso = intArray65;
        grafo38.prox = intArray65;
        grafo23.peso = intArray65;
        int[] intArray70 = grafo23.peso;
        grafo1.peso = intArray70;
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(aresta30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(grafo52);
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[100, 0, 10]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        grafo4.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo9 = grafo4.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        grafo11.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta18 = grafo11.retiraAresta((int) (byte) 100, 0);
        int[] intArray22 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo11.peso = intArray22;
        grafo9.peso = intArray22;
        grafo9.insereAresta(0, (int) (byte) -1, (int) 'a');
        int[] intArray29 = grafo9.peso;
        grafo2.peso = intArray29;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 0, 10]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        boolean boolean81 = grafo78.existeAresta((int) (byte) 1, 0);
        ds.Grafo grafo82 = grafo78.grafoTransposto();
        boolean boolean85 = grafo78.existeAresta(100, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta87 = grafo78.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(grafo82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) '4', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        grafo11.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo16 = grafo11.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        grafo18.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta25 = grafo18.retiraAresta((int) (byte) 100, 0);
        int[] intArray29 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo18.peso = intArray29;
        grafo16.peso = intArray29;
        grafo1.prox = intArray29;
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 10]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.cab = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia(35);
        boolean boolean90 = grafo6.existeAresta((int) '#', (int) (byte) 10);
        ds.Grafo.Aresta aresta93 = grafo6.retiraAresta((int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(aresta93);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, 1);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 100, (int) '4', (int) '4');
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        grafo11.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta18 = grafo11.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        grafo20.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo25 = grafo20.grafoTransposto();
        ds.Grafo grafo27 = new ds.Grafo((int) (short) 0);
        grafo27.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta34 = grafo27.retiraAresta((int) (byte) 100, 0);
        int[] intArray38 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo27.peso = intArray38;
        grafo25.peso = intArray38;
        grafo11.prox = intArray38;
        grafo1.cab = intArray38;
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNotNull(aresta34);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 0, 10]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        int int17 = grafo1.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        grafo19.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo24 = grafo19.grafoTransposto();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        grafo26.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta33 = grafo26.retiraAresta((int) (byte) 100, 0);
        int[] intArray37 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo26.peso = intArray37;
        grafo24.peso = intArray37;
        grafo24.insereAresta(0, (int) (byte) -1, (int) 'a');
        int[] intArray44 = grafo24.peso;
        grafo1.cab = intArray44;
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[97, 0, 10]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        int int24 = grafo23.numVertices();
        ds.Grafo grafo26 = new ds.Grafo((int) (short) 0);
        boolean boolean29 = grafo26.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo36 = grafo31.grafoTransposto();
        ds.Grafo grafo38 = new ds.Grafo((int) (short) 0);
        grafo38.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta45 = grafo38.retiraAresta((int) (byte) 100, 0);
        int[] intArray49 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo38.peso = intArray49;
        grafo36.peso = intArray49;
        grafo36.imprime();
        grafo36.imprime();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        grafo55.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta62 = grafo55.retiraAresta((int) (byte) 100, 0);
        int[] intArray66 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo55.peso = intArray66;
        grafo36.cab = intArray66;
        grafo26.prox = intArray66;
        ds.Grafo grafo71 = new ds.Grafo((int) (short) 0);
        grafo71.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta78 = grafo71.retiraAresta((int) (byte) 100, 0);
        int[] intArray83 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo71.peso = intArray83;
        grafo26.cab = intArray83;
        grafo23.prox = intArray83;
        boolean boolean88 = grafo23.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta90 = grafo23.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(grafo36);
        org.junit.Assert.assertNotNull(aresta45);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta62);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta78);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo1.peso = intArray12;
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (byte) -1);
        int int17 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        boolean boolean25 = grafo6.listaAdjVazia(1);
        boolean boolean28 = grafo6.existeAresta((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass29 = grafo6.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 10);
        boolean boolean12 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo6.retiraAresta((int) (short) 1, (int) '#');
        ds.Grafo.Aresta aresta29 = grafo6.retiraAresta((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertNull(aresta29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        int[] intArray73 = grafo6.peso;
        boolean boolean75 = grafo6.listaAdjVazia(35);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) -1, (int) ' ');
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 1, 35);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) 'a', 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.peso = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia((int) (short) 10);
        boolean boolean90 = grafo6.existeAresta(0, (-1));
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        boolean boolean18 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean20 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) '4', 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 10, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) 'a', (int) (byte) 10);
        grafo1.insereAresta(100, 35, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        boolean boolean25 = grafo6.listaAdjVazia(1);
        grafo6.imprime();
        grafo6.insereAresta((int) (short) 0, (int) (short) 10, 0);
        int int31 = grafo6.numVertices();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        grafo6.imprime();
        int[] intArray74 = null;
        grafo6.prox = intArray74;
        int[] intArray76 = grafo6.prox;
        int int77 = grafo6.numVertices();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        ds.Grafo grafo73 = new ds.Grafo((int) (short) 0);
        grafo73.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo78 = grafo73.grafoTransposto();
        ds.Grafo grafo80 = new ds.Grafo((int) (short) 0);
        grafo80.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta87 = grafo80.retiraAresta((int) (byte) 100, 0);
        int[] intArray91 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo80.peso = intArray91;
        grafo78.peso = intArray91;
        grafo6.cab = intArray91;
        grafo6.imprime();
        boolean boolean98 = grafo6.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertNotNull(aresta87);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.cab = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia(35);
        grafo6.insereAresta((int) (byte) 1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.insereAresta(0, (int) (byte) -1, (int) 'a');
        int[] intArray26 = grafo6.peso;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = grafo6.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 0, 10]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        int[] intArray13 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo1.peso = intArray13;
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) -1, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        grafo6.imprime();
        int[] intArray74 = null;
        grafo6.prox = intArray74;
        int[] intArray76 = grafo6.prox;
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta(1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNull(intArray76);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.peso = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia((int) (short) 10);
        grafo6.insereAresta((int) (byte) 1, (int) (short) 100, 10);
        ds.Grafo grafo92 = grafo6.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[10, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(grafo92);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        boolean boolean9 = grafo6.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo11 = new ds.Grafo((int) (short) 0);
        grafo11.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo16 = grafo11.grafoTransposto();
        ds.Grafo grafo18 = new ds.Grafo((int) (short) 0);
        grafo18.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta25 = grafo18.retiraAresta((int) (byte) 100, 0);
        int[] intArray29 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo18.peso = intArray29;
        grafo16.peso = intArray29;
        grafo16.imprime();
        grafo16.imprime();
        ds.Grafo grafo35 = new ds.Grafo((int) (short) 0);
        grafo35.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta42 = grafo35.retiraAresta((int) (byte) 100, 0);
        int[] intArray46 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo35.peso = intArray46;
        grafo16.cab = intArray46;
        grafo6.prox = intArray46;
        ds.Grafo grafo51 = new ds.Grafo((int) (short) 0);
        grafo51.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo56 = grafo51.grafoTransposto();
        ds.Grafo grafo58 = new ds.Grafo((int) (short) 0);
        grafo58.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta65 = grafo58.retiraAresta((int) (byte) 100, 0);
        int[] intArray69 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo58.peso = intArray69;
        grafo56.peso = intArray69;
        grafo56.imprime();
        ds.Grafo grafo74 = new ds.Grafo((int) (short) 0);
        grafo74.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta81 = grafo74.retiraAresta((int) (byte) 100, 0);
        int[] intArray86 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo74.peso = intArray86;
        grafo56.prox = intArray86;
        grafo6.prox = intArray86;
        grafo1.cab = intArray86;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta42);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo56);
        org.junit.Assert.assertNotNull(aresta65);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta81);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 1, 100, 0]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 0, (int) (byte) 0, 0);
        int int83 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        boolean boolean25 = grafo6.listaAdjVazia(1);
        grafo6.imprime();
        grafo6.insereAresta((int) (short) 0, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo6.primeiroListaAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.insereAresta(0, (int) (byte) -1, (int) 'a');
        boolean boolean28 = grafo6.existeAresta((int) 'a', 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        grafo6.imprime();
        int[] intArray74 = null;
        grafo6.prox = intArray74;
        int[] intArray76 = grafo6.prox;
        int[] intArray77 = grafo6.prox;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertNull(intArray77);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) (short) 0);
        grafo5.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((int) (byte) 100, 0);
        int[] intArray17 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo5.peso = intArray17;
        ds.Grafo grafo20 = new ds.Grafo((int) (short) 0);
        grafo20.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta27 = grafo20.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo29 = new ds.Grafo((int) (short) 0);
        grafo29.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo34 = grafo29.grafoTransposto();
        ds.Grafo grafo36 = new ds.Grafo((int) (short) 0);
        grafo36.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta43 = grafo36.retiraAresta((int) (byte) 100, 0);
        int[] intArray47 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo36.peso = intArray47;
        grafo34.peso = intArray47;
        grafo20.prox = intArray47;
        grafo5.peso = intArray47;
        int[] intArray52 = grafo5.peso;
        ds.Grafo grafo53 = grafo5.grafoTransposto();
        ds.Grafo grafo55 = new ds.Grafo((int) (short) 0);
        grafo55.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo60 = grafo55.grafoTransposto();
        ds.Grafo grafo62 = new ds.Grafo((int) (short) 0);
        grafo62.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta69 = grafo62.retiraAresta((int) (byte) 100, 0);
        int[] intArray73 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo62.peso = intArray73;
        grafo60.peso = intArray73;
        grafo60.imprime();
        grafo60.imprime();
        ds.Grafo grafo79 = new ds.Grafo((int) (short) 0);
        grafo79.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta86 = grafo79.retiraAresta((int) (byte) 100, 0);
        int[] intArray90 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo79.peso = intArray90;
        grafo60.cab = intArray90;
        int[] intArray93 = grafo60.peso;
        grafo5.cab = intArray93;
        grafo1.peso = intArray93;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(aresta27);
        org.junit.Assert.assertNotNull(grafo34);
        org.junit.Assert.assertNotNull(aresta43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo53);
        org.junit.Assert.assertNotNull(grafo60);
        org.junit.Assert.assertNotNull(aresta69);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta86);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[100, 0, 10]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        boolean boolean73 = grafo6.listaAdjVazia((int) (short) 10);
        boolean boolean76 = grafo6.existeAresta((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.insereAresta(0, (int) (byte) -1, (int) 'a');
        int[] intArray26 = grafo6.peso;
        ds.Grafo grafo27 = grafo6.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 0, 10]");
        org.junit.Assert.assertNotNull(grafo27);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        ds.Grafo grafo78 = grafo1.grafoTransposto();
        boolean boolean81 = grafo78.existeAresta((int) (byte) 1, 0);
        ds.Grafo grafo82 = grafo78.grafoTransposto();
        grafo82.insereAresta(32, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta88 = grafo82.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(grafo82);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        boolean boolean7 = grafo1.listaAdjVazia(10);
        grafo1.imprime();
        int int9 = grafo1.numVertices();
        boolean boolean12 = grafo1.existeAresta((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.insereAresta(0, 10, (int) (short) 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        int int45 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta47 = grafo1.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        grafo6.imprime();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        grafo25.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
        int[] intArray36 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo25.peso = intArray36;
        grafo6.cab = intArray36;
        ds.Grafo grafo40 = new ds.Grafo((int) (short) 0);
        grafo40.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta47 = grafo40.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo49 = new ds.Grafo((int) (short) 0);
        grafo49.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo54 = grafo49.grafoTransposto();
        ds.Grafo grafo56 = new ds.Grafo((int) (short) 0);
        grafo56.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta63 = grafo56.retiraAresta((int) (byte) 100, 0);
        int[] intArray67 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo56.peso = intArray67;
        grafo54.peso = intArray67;
        grafo40.prox = intArray67;
        grafo6.peso = intArray67;
        int[] intArray72 = grafo6.cab;
        int[] intArray73 = grafo6.peso;
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta76 = grafo6.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta47);
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(aresta63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, 0, 10]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo grafo3 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) ' ');
        grafo6.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo6.imprime();
        int[] intArray15 = new int[] { (byte) -1, 0, 1 };
        grafo6.prox = intArray15;
        grafo3.peso = intArray15;
        grafo1.peso = intArray15;
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 0, 1]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        ds.Grafo grafo25 = new ds.Grafo((int) (short) 0);
        boolean boolean28 = grafo25.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo35 = grafo30.grafoTransposto();
        ds.Grafo grafo37 = new ds.Grafo((int) (short) 0);
        grafo37.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta44 = grafo37.retiraAresta((int) (byte) 100, 0);
        int[] intArray48 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo37.peso = intArray48;
        grafo35.peso = intArray48;
        grafo35.imprime();
        grafo35.imprime();
        ds.Grafo grafo54 = new ds.Grafo((int) (short) 0);
        grafo54.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta61 = grafo54.retiraAresta((int) (byte) 100, 0);
        int[] intArray65 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo54.peso = intArray65;
        grafo35.cab = intArray65;
        grafo25.prox = intArray65;
        ds.Grafo grafo70 = new ds.Grafo((int) (short) 0);
        grafo70.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta77 = grafo70.retiraAresta((int) (byte) 100, 0);
        int[] intArray82 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo70.peso = intArray82;
        grafo25.cab = intArray82;
        grafo6.cab = intArray82;
        boolean boolean87 = grafo6.listaAdjVazia(35);
        boolean boolean90 = grafo6.existeAresta((int) '#', (int) (byte) 10);
        int[] intArray91 = grafo6.cab;
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo35);
        org.junit.Assert.assertNotNull(aresta44);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta61);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta77);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 1, 100, 0]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        boolean boolean4 = grafo1.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo6 = new ds.Grafo((int) (short) 0);
        grafo6.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        ds.Grafo grafo13 = new ds.Grafo((int) (short) 0);
        grafo13.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int) (byte) 100, 0);
        int[] intArray24 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo13.peso = intArray24;
        grafo11.peso = intArray24;
        grafo11.imprime();
        grafo11.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (short) 0);
        grafo30.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta37 = grafo30.retiraAresta((int) (byte) 100, 0);
        int[] intArray41 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo30.peso = intArray41;
        grafo11.cab = intArray41;
        grafo1.prox = intArray41;
        ds.Grafo grafo46 = new ds.Grafo((int) (short) 0);
        grafo46.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta53 = grafo46.retiraAresta((int) (byte) 100, 0);
        int[] intArray58 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo46.peso = intArray58;
        grafo1.cab = intArray58;
        ds.Grafo grafo61 = grafo1.grafoTransposto();
        ds.Grafo grafo63 = new ds.Grafo((int) (short) 0);
        grafo63.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta70 = grafo63.retiraAresta((int) (byte) 100, 0);
        int[] intArray75 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo63.peso = intArray75;
        grafo1.cab = intArray75;
        int int78 = grafo1.numVertices();
        ds.Grafo grafo79 = grafo1.grafoTransposto();
        ds.Grafo grafo80 = grafo79.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta37);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(grafo61);
        org.junit.Assert.assertNotNull(aresta70);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(grafo79);
        org.junit.Assert.assertNotNull(grafo80);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = new ds.Grafo((int) (short) 0);
        grafo4.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta11 = grafo4.retiraAresta((int) (byte) 100, 0);
        int[] intArray16 = new int[] { (byte) 0, (byte) 1, (byte) 100, (short) 0 };
        grafo4.peso = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (short) 0);
        boolean boolean22 = grafo19.existeAresta((int) (short) 100, 1);
        ds.Grafo grafo24 = new ds.Grafo((int) (short) 0);
        grafo24.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo29 = grafo24.grafoTransposto();
        ds.Grafo grafo31 = new ds.Grafo((int) (short) 0);
        grafo31.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta38 = grafo31.retiraAresta((int) (byte) 100, 0);
        int[] intArray42 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo31.peso = intArray42;
        grafo29.peso = intArray42;
        grafo29.imprime();
        grafo29.imprime();
        ds.Grafo grafo48 = new ds.Grafo((int) (short) 0);
        grafo48.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta55 = grafo48.retiraAresta((int) (byte) 100, 0);
        int[] intArray59 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo48.peso = intArray59;
        grafo29.cab = intArray59;
        grafo19.prox = intArray59;
        grafo4.peso = intArray59;
        grafo1.peso = intArray59;
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertNotNull(aresta38);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(aresta55);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100, 0, 10]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 100, 0);
        ds.Grafo grafo10 = new ds.Grafo((int) (short) 0);
        grafo10.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo15 = grafo10.grafoTransposto();
        ds.Grafo grafo17 = new ds.Grafo((int) (short) 0);
        grafo17.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta24 = grafo17.retiraAresta((int) (byte) 100, 0);
        int[] intArray28 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo17.peso = intArray28;
        grafo15.peso = intArray28;
        grafo1.prox = intArray28;
        boolean boolean33 = grafo1.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        grafo1.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = new ds.Grafo((int) (short) 0);
        grafo8.insereAresta((int) (short) 0, 0, (int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo8.retiraAresta((int) (byte) 100, 0);
        int[] intArray19 = new int[] { (short) 100, (byte) 0, (short) 10 };
        grafo8.peso = intArray19;
        grafo6.peso = intArray19;
        grafo6.imprime();
        ds.Grafo grafo23 = grafo6.grafoTransposto();
        boolean boolean25 = grafo6.listaAdjVazia(1);
        boolean boolean28 = grafo6.existeAresta((int) (short) 1, (int) 'a');
        grafo6.insereAresta(10, (int) (byte) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta34 = grafo6.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 0, 10]");
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 0, 0);
    }
}

